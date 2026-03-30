package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP등급의 할인 금액 : " + vip);

        //오타
        int diamondd = discountService.discount("DIAMONDD", price);//문자는 다 받는다.
        System.out.println("DIAMONDD등급의 할인 금액 : " + diamondd);

        //소문자입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold등급의 할인 금액 = " + gold);


    }
}
