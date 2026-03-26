package lang.immuateable.address;

public class RefMain2 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;//참조값대입은 막을 수 없다.
        System.out.println("a: "+a);
        System.out.println("b: "+b);

//        b.setValue("부산");//b의값을 부산으로 변경해야함
        b = new ImmutableAddress("부산");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
