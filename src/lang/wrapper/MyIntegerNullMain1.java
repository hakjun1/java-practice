package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1),new MyInteger(0),new MyInteger(1)};
        System.out.println(findValue(intArr,-1 )); //toString
        System.out.println(findValue(intArr,-0 ));
        System.out.println(findValue(intArr,-1 ));
        System.out.println(findValue(intArr,100 )); //
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;//toString을 재정의했기때문에 객체의 주소값이 나오지않는다.
            }
        }
        return null;
    }
}
