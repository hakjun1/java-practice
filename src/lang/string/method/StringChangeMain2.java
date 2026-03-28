package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "        Java Programming    ";

        System.out.println("소문자로 변환 " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환 " + strWithSpaces.toUpperCase());

        System.out.println("공백제거(trim): " + strWithSpaces.trim());//단순 스페이스바 공백제거
        System.out.println("공백제거(strip): " + strWithSpaces.strip());//유니코드 공백포함 제거
        System.out.println("앞 공백제거(stripLeading): " + strWithSpaces.stripLeading());//유니코드 공백포함 제거
        System.out.println("뒤 공백제거(stripTrailing): " + strWithSpaces.stripTrailing());//유니코드 공백포함 제거


    }
}
