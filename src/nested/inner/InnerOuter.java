package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {//static가 안붙음 인스턴스 맴버가 된다.
            //자기 자신에 접근
            System.out.println(innerInstanceValue);

            //외부클래스의 인스턴스 맴버에 접근가능, private에도 접근 가능
            System.out.println(outInstanceValue);

            //외부클래스의 클래스 맴버에 접근 가능, private에도 접근 가능
            System.out.println(outClassValue);

        }
    }

}
