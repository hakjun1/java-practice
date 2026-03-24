package lang.object;

public class Child extends Parent{
    //object를 상속받지 않음 명시적으로 parent를 상속
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
