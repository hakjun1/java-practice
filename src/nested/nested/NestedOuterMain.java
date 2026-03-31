package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();//outer와 아무 관련없음
        nested.print();


        System.out.println("nestedClass = " + nested.getClass());
    }
}
