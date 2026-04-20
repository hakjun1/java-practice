package collection.set;

import collection.set.membger.Member;

public class MyHashSetV2Main2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());//해시코드 마이너스

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);
        /*
        * id를 기반으로 해시코드 재정의 -> 해시코드 탐색
        * */


        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);//contains에서 equals를 사용
        System.out.println("set.contains("+searchValue+") = "+result);
    }
}
