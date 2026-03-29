package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int intStr1 = Integer.parseInt(str1);
        int intStr2 = Integer.parseInt(str2);
//        System.out.println("두 수의 합: "+(intStr1+intStr2));
        int sum = intStr1 + intStr2;
        System.out.println("sum = " + sum);

    }
}
