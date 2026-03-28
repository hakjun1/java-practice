package lang.immuateable.change;

public class ImmuatableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(10);//받아서 출력해야한다

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());

    }
}
