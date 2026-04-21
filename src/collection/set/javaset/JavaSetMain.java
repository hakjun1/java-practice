package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {

        run(new HashSet<String>());//메서드에 있는데도 타입추론이 된다 신기!
        run(new LinkedHashSet<String>());
        run(new TreeSet<String>());
        /*
        * o(1)
        * o(1) 조금느린
        * o(log2)
        * */

    }

    private static void run(Set<String> set) {
        System.out.println("set = "+ set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();//순회 나중에 정리
        while (iterator.hasNext()) {//다음데이터가 있는지 확인
            System.out.print(iterator.next()+" ");//현재데이터를 반환하고 다음으로 이동
        }
        System.out.println();

    }


}
