package enumeration.ref3;


public class DiscountService {

    public int discount(Grade grade, int price) {
//        return price * grade.getDiscountPercent() /100; //계산로직을 Grade밖에서 돌린다.캡슐화가 부족함
        return grade.discount(price);// 계산로직조차 삭제
    }
}
