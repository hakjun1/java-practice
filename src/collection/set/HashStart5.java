package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99, 9}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains("+searchValue+") = "+contains);
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];//o(1)
        if (!bucket.contains(value)) {//o(n)
            bucket.add(value);
        }
    }
    //hashcode와 equals를 둘다 동시에 구현해야한다.
    //대부분은 String와 equals는 구현되어있다. 하지만 직접 구현하는객체가 문제가 된다.
    //새로 재정의한 객체를 넣었는데 검색이 안되는경우 hashCode와 equals가 재정의 되었는지 확인한다

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
