package collection.map.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        //배열이기 때문에 배열은 타입을 하나밖에 지정하지 못한다.

        //주어진 배열로부터 Map생성
        Map<String, Integer> productMap = new HashMap<>();


        for (String[] product : productArr) {//배열하나씩
            //key와 value를 뽑는다. 둘다 String타입을 반환한다.
            //inline variable로 합친다
            productMap.put(product[0], Integer.valueOf(product[1]));
        }
        for (String key : productMap.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + productMap.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = productMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("제품: " + key + ", 가격: " + value);

        }

        //keySet() 맵의 키들을 Set형태로 반환한다.
        //get(Object key) 지정된 키에 연결된 값을 반환한다.
        //문제는 entrySet으로 풀어도 상관없음

       /* System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key=" + key + ", value=" + value);
        }*/
    }

}
