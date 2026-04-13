package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        //마지막에추가 o(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //첫 번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0,"d"); // o(1)
        System.out.println(list);

        System.out.println("첫번째 항목에 삭제");
        list.remove(0);//o(1)
        System.out.println(list);

        //중간 항목에 추가,삭제
        System.out.println("중간 항목에 추가");
        list.add(1, "e");//o(n)
        System.out.println(list);

        System.out.println("중간 항목에 삭제");
        list.remove(1);//o(n)
        System.out.println(list);
    }
}
