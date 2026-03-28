package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        while (index>=0) {//못찾으면 -1을 반환한다.
            index = str.indexOf(key, index + 1);
            System.out.println("index = " + index);//while문의 특성상 마지막 루프를 실행한다
            count++;//마지막이 index = -1로 끝나고 카운트가 된다.
        }
        System.out.println("count =" + count);
    }
}
