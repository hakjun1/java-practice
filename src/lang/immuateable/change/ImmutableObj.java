package lang.immuateable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;//value = 이렇게하면안됨
        return new ImmutableObj(30);//새로 생성해서 넣는다.
    }//

    public int getValue() {
        return value;
    }


}
