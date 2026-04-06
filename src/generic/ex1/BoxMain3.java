package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();//생성 시점에 T의 타입이 결정
        integerBox.set(10);//컨트롤 p 들어갈수있는 정보
//        integerBox.set("100");//Integer타입만 허용 , 컴파일 오류
        Integer integer = integerBox.get();//캐스팅 x
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double v = doubleBox.get();
        System.out.println("v = " + v);

        //타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();

    }

}
