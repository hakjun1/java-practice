package lang.immuateable.test;

public class MyDateMain {

    public static void main(String[] args) {
        Mydate data1 = new Mydate(2024, 1, 1);
        Mydate data2 = data1;
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

        System.out.println("2025 -> data1");
        data1.setYear(2025);
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

    }
}
