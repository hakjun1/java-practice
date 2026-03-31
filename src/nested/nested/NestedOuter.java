package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested{
        private int nestedInstanceValue = 1;

        public void print() {
            //자신의 맴버에 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 맴버에 접근은 할 수 없다.
            //static은 메서드영역 인스턴스는 인스턴스 영역에 생긴다.
            //System.out.println(outInstanceValue);

            //바깥 클래스의 맴버에는 접근할 수 있다. private여도(이게차이)
            System.out.println(outClassValue);
        }
    }
}
