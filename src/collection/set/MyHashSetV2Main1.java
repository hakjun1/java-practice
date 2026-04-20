package collection.set;

public class MyHashSetV2Main1 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);

        //new String("A")이라고 보면된다. 문자열은 스트링객체다
        System.out.println("A.hashCode() = " + "A".hashCode());
        System.out.println("B.hashCode() = " + "B".hashCode());
        System.out.println("AB.hashCode() = " + "AB".hashCode());
        System.out.println("SET.hashCode() = " + "SET".hashCode());//자바의 해시코드는 복잡한연산을한다(충돌방지)

        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains("+ searchValue+") = "+result);


    }
}
