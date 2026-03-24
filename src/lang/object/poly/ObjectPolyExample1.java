package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound 컴파일 오류, 객체에맞는 다운캐스팅 필요

        if (obj instanceof Dog dog) {//자동으로 다운캐스팅 dog
            dog.sound();//dog.타입으로 바뀐다는뜻
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
