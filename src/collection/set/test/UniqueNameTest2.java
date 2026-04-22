package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNameTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));//add한 순서대로

/*
        List<Integer> list = Arrays.asList(); ...문법 들어오는값을 배열로 바꾸어준다
        List<Integer> list2 = List.of();
*/

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
