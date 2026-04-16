package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> list = new ArrayList<>();
    //생성자롤 통한 주입은 선택이다, 효용이 없다면 다형성을 굳이 안쓴다
    public void addItem(Item item) {//di = List<Item> item
        list.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        /*int sum =0;
        for (Item item : list) {
            System.out.println("상품명: " + item.getName() + " 합계: " + item.getTotalPrice());
            sum += item.getTotalPrice();
        }*/
        /*
        * 위의 코드가 내가만든코드다
        * 하지만 강의에서는 선호하지 않는코드라고 한다.
        * 이유는 출력과 계산이 명확히 구분되지 않기때문
        * 성능은 아주조금 손해보고 유지보수성이 좋다진다.
        * 그러면 메서드로 뽑기 좋아진다
        * */
        for (Item item : list) {
            System.out.println("상품명: " + item.getName() +
                    " 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합 : "+ calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : list) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
