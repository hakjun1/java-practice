package generic.test.ex3.unit;

public class Shuttle<T extends BioUnit> {
    private T value;

    public void in(T unit) {
        this.value = unit;
    }

    public T out() {
        return value;
    }

    public void showInfo() {
        System.out.println("이름: "+value.getName()+", HP: "+value.getHp());
    }
}
