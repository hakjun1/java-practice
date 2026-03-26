package lang.immuateable.address;

public class ImmutableAddress {

    private final String value;//불변 set이 빨간줄들어온다.

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
