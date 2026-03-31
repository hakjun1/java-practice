package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();//x001
        InnerOuter.Inner inner = outer.new Inner();//x001.new Inner ,x001내에다가 x002를 만들어
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
