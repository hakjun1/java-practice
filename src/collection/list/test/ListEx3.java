package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;//오토 언박싱 integer.intValue();
        }
        System.out.println("정수 합계 : " + sum);
        System.out.println("정수 평균 : " + (double)sum/list.size());
    }
}
