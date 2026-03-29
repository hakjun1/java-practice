package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);//-128~127 자주사용하는 숫자값 재사용,불변 캐싱
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("newInteger = " + newInteger);//newInteger.toString 오버라이딩하고있다.
        System.out.println("integerObj = " + integerObj);

        System.out.println("내부값읽기");
        int i = integerObj.intValue();
        System.out.println("i = " + i);
        long l = longObj.longValue();
        System.out.println("l = " + l);

        System.out.println("비교");
        System.out.println("==" + (newInteger == integerObj));//valueOf는 캐싱이라 이렇게하면 true가 나옴
        //자바가 미리만들어놨다는뜻

        System.out.println("==" + (newInteger.equals(integerObj)));
    }
}
