package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int count) {
        cartMap.put(product, count);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        System.out.println(cartMap);
    }

    public void minus(Product product, int count) {
    }




    //코드작성
}
