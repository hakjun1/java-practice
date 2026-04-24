package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);
        //편하게 만든다. 대신 map안의 값을 수정할 수 없다. (불변)

        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {//key를 반환
            if (map2.containsKey(key)) {//map2의 키가 같은걸 찾는다
                result.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(result);
    }

}
