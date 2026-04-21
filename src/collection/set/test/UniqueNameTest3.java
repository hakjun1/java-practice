package collection.set.test;

import java.util.Set;
import java.util.TreeSet;

public class UniqueNameTest3 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new TreeSet<>();
        for (Integer s : inputArr) {
            set.add(s);
        }
        System.out.println(set);
    }
}
