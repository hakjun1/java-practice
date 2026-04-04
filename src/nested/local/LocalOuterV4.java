package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {//지역변수
        int localVar = 1;//지역변수 = 스택 프레임 종료시 제거된다.
//        localVar = 2; 캡쳐되상은 final이어야한다. (규칙)

        class LocalPrinter implements Printer{
            int value = 0;


            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다..
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar"+paramVar);// 매개변수도 지역변수의 한 종류
                System.out.println("outInstanceVar="+outInstanceVar);

            }
        }
        Printer printer = new LocalPrinter();//코드블럭 안에서만
        //만약 localVar의 값을 캡쳐이후에 변경한다면? 다시 캡쳐해야하나?
//        localVar = 10; 동기화 문제가 발생된다
        //int x = localVar 이런식으로 복사해서 사용하자(필요하다면)
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV1 = new LocalOuterV4();
        Printer printer = localOuterV1.process(2);//메서드종료(리턴했음)다사라짐
        //printer.print를 process의 스택프레임이 사라진 이후에 실행
        printer.print();

        System.out.println("필드확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
