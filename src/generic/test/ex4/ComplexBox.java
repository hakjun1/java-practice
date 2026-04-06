package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {//상한이 없다. 실무는 이름이 같지않게 해라
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: "+t.getClass().getName());
        return t;
    }
}
