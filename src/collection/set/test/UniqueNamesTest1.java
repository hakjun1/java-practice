package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        /*여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
        30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다. 출력 순서는 관계없다.*/
        Integer[] inputArr = {30, 20, 20, 10, 10};

        System.out.println(inputArr);
        Set<Integer> inputSet = new HashSet<>();
        for (Integer s : inputArr) {
            inputSet.add(s);
        }
        for (Integer s : inputSet) {
            System.out.println(s);

        }


    }
}
