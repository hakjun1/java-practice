package lang.object.toStirng;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        System.out.println(string);

        System.out.println(object);
        //println에 toString이 담겨있다.
        //그리니 println그냥하면됨 메서드 오버라이딩으로 다양한 변수형 출력
    }
}
