package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;//작으면 해시충돌많이남

    private LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;
    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {//직접 세팅
        this.capacity = capacity;
        initBuckets();

    }

    private void initBuckets() {//중복을 메서드 추출을 한다
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];//o(1)
        if (bucket.contains(value)) {//o(1) -> o(n)최악의경우 하지만 대부분 데이터는 하나
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue); //o(1)
        LinkedList<E> bucket = buckets[hashIndex]; //o(1)
        return bucket.contains(searchValue); // o(1) 최악의경우 이론적 o(n)
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);//컨트롤 p , index위치를 지우지 않게 조심
        /*값으로 지우려면 object, 숫자는 그냥 인덱스위치를 지운다
        *
        * */
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    private int hashIndex(E value) {//Object로 문자든 객체든 받는다
        //해시코드 호출(자바가 재정의했음)
        //음수가 안나오게 절대값
        return Math.abs(value.hashCode())% capacity;
        //Object에 hashCode가있음 그만큼 중요하다
        //물론 객체를 넣을때는 해시코드를 오버라이딩 해놔야한다. 아니면 참조값비교
    }
}
