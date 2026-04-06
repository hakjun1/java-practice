package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WhildcardEx.printGenericV1(dogBox);
        WhildcardEx.printWildcardV1(dogBox);

        WhildcardEx.printGenericV2(dogBox);
        WhildcardEx.printWildcardV2(dogBox);

        Dog dog = WhildcardEx.printAndReturnGeneric(dogBox);

        catBox.set(new Cat("냐옹이",200));
        Cat cat = WhildcardEx.printAndReturnGeneric(catBox);
        Animal animal = WhildcardEx.printAndReturnWildcard(dogBox);
        //와일드 카드는 반환값을 동적으로 설정할수없다. 캐스팅을 해야한다.

    }
}
