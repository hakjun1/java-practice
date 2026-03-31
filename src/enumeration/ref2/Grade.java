package enumeration.ref2;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30); //grade가 퍼센트 정보를 가지는걸로 리펙토링

    private final int discountPercent;

    Grade(int discountPercent) {//private 생략
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }


}
