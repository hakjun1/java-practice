package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        //모든 ENUM반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));//toString해야 이름이나옴
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal=" + value.ordinal());
            //ordinal 가급적 쓰지말자, 상수의 위치가 변경되면 전체가 변경된다.
        }

        //잘못된 변환 , 잘못된 문자면 IllegalArgumentException
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);//주어진 이름과 일치하는 ENUM상수를 반환
        System.out.println("gold = "+gold);//toString 오버라이딩 되있어서 그랗다.+ 할수있다.


    }

}
