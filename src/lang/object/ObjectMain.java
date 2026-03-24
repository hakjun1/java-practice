package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString는 Object의 메서드
        String string = child.toString();
        System.out.println(string);
        //toString는 객체에대한 정보

    }
}
