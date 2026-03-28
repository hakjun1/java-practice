package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a+b;//원칙상 안되지만 편의상 String에 대해서는 허용

        System.out.println(result1);
        System.out.println(result2);
    }
}
