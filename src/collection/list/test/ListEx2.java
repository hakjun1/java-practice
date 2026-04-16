package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputNum = new ArrayList<>();
        int sum;
        System.out.println("n개의 정수를 입력하세요(종료 0)");
        while (true) {
            int e = sc.nextInt();
            inputNum.add(e);
            if (e == 0) {
                break;
            }
        }
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
