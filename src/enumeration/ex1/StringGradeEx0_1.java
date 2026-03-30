package enumeration.ex1;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();//상수를적으면 실수로 오타를 막을수있다.
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: "+basic);
        System.out.println("GOLD 등급의 할인 금액: "+gold);
        System.out.println("DIAMOND  등급의 할인 금액: "+diamond);
    }
}
