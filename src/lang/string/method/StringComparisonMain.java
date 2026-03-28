package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java";
        String str2 = "hello, java";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: "+str1.equals(str2));
        System.out.println("str1 equals str2: "+str1.equalsIgnoreCase(str2));//대소문자 무시

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));//a와 b는 사전적으로 몇칸차이?
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));//a와 c는 사전적으로 몇칸 차이?

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

        System.out.println("str1 start with 'Hello': "+str1.startsWith("Hello"));
        System.out.println("str2 start with 'Hello': " + str2.endsWith("java"));//시작하는가에대한질문




    }
}
