package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx22{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputNum = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요(종료 0)");
        while (true) {
            int e = sc.nextInt();
            inputNum.add(e);//0이 입력되는 실수
            if (e == 0) {
                break;
            }
            //여기다 sc를 받야아한다
        }
        System.out.println(inputNum.getLast());
        inputNum.removeLast();
        System.out.println("출력");
        for (Integer integer : inputNum) {
            System.out.print(integer);
            if (integer!= inputNum.getLast()) {
            System.out.print(", ");
            }
        }
    }
}
