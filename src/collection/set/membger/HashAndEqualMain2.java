package collection.set.membger;

import collection.set.MyHashSetV2;

public class HashAndEqualMain2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));//구현 안했기에 false

        //참조값 그대로 출력 hashCode 오버라이딩 하기전의 참조값
        System.out.println("System.ref(m1) = " + System.identityHashCode(m1));
        System.out.println("System.ref(m2) = " + System.identityHashCode(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);//hashCode를 id기반으로 구현했기에 같은 위치에 들어간다
        //equals는 참조값으로 비교한다 false가 나오고 같은위치에 중복이 들어간다

        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);//hashCode가 같지만 검색이 되지 않는다
        System.out.println("contains = " + contains);

    }
}
