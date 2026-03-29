package lang.wrapper;

public class MyIntegerMethodMain1 {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5);//자기자신이 메서드를 제공
        int i2 = myInteger.compareTo(10);//myInteger의 값이 뭔지모르겠으나
        int i3 = myInteger.compareTo(20);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
