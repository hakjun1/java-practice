package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() {//인터페이스를 구현하면서 구현체를 new로 생성
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar" + paramVar);// 매개변수도 지역변수의 한 종류
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };//닫아줘야한다

        printer.print();
        System.out.println("printer.class = "+ printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
