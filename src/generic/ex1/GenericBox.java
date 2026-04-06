package generic.ex1;

public class GenericBox<T> {
    //T를 타입 매개변수라고 한다
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
