package lang.object;

//부모가 없으면 묵시적으로 object 클래스 상속
public class Parent{//extends Object

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
