package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter{
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar"+paramVar);// 매개변수도 지역변수의 한 종류
                System.out.println("outInstanceVar="+outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();//코드블럭 안에서만
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
