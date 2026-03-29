package lang.wrapper;

public class MyInteger {

    private final int value;//기본으로 0이 들어가게 된다.

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    //인스턴스에 소속된 메서드로 만들어 캡슐화
    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
//        return ""+value;
        return String.valueOf(value);
    }
}
