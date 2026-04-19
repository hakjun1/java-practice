package collection.set;

import java.util.Arrays;

public class HashStart2 {
//index 번호와 배열의 값이 같다면
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[10];
        //inputArray = [null, 1, 2, null, null, 5, null, null, 8, null]
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}
