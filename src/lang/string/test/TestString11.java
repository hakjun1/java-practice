package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";

//        StringBuilder reverse = new StringBuilder(str).reverse();
//        System.out.println("reverse = " + reverse);
        String reversed = new StringBuilder(str).reverse().toString();//이게 원칙
        System.out.println(reversed);
    }
}
