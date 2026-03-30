package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = "+Grade.BASIC.getClass());
        System.out.println("class GOLD = "+Grade.GOLD.getClass());
        System.out.println("class DIAMOND = "+Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = "+ refValue(Grade.BASIC));//toString 오버라이딩 해놧음
        System.out.println("ref GOLD = "+ refValue(Grade.GOLD));//toString 오버라이딩 해놧음
        System.out.println("ref DIAMOND = "+ refValue(Grade.DIAMOND));//toString 오버라이딩 해놧음

    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));//16진수로 바꾸고 해쉬코드
    }

}
