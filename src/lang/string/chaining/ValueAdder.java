package lang.string.chaining;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this;//유의해서 보자
    }

    public int getValue() {
        return value;
    }
}
