package enumeration.ref1;

public class ClassGrade {
        //인스턴스 3개
    public static final ClassGrade BASIC = new ClassGrade(10);//생성할때 페센트 지정
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    public ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
