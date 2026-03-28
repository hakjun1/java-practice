package lang.string.method;

public class StringUtilsMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format메서드
        String format1 = String.format("num: %d, bool: %b, str:%s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        System.out.printf("숫자: %.2f\n",10.1234);//format는 변수에 담아준다. 그래서 많이쓴다.
        //목적은 db저장ㅇㅇ

        //matches 메서드 hello와 java와 wold중 하나가 들어오면 매칭 나중에이해
        String regex = "Hello, (Java!|World!)";
        System.out.println("'str'이 패턴과 일치하는가? "+str.matches(regex));
    }
}
