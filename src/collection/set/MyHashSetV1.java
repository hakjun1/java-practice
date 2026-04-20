package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;//작으면 해시충돌많이남

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;
    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {//직접 세팅
        this.capacity = capacity;
        initBuckets();

    }

    private void initBuckets() {//중복을 메서드 추출을 한다
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];//o(1)
        if (bucket.contains(value)) {//o(1) -> o(n)최악의경우 하지만 대부분 데이터는 하나
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value));//컨트롤 p , index위치를 지우지 않게 조심
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
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    private int hashIndex(int value) {
        return value % capacity;
    }
}
