package lang.immuateable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMydate data1 = new ImmutableMydate(2024, 1, 1);
        ImmutableMydate data2 = data1;
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

        System.out.println("2025 -> data1");
        data1 = data1.withYear(2025);//x002 ,무조건 반환값을 받아야한다.
        //불러냈으면 받야아한다. 아니면 gc가 처리해버린다.
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

    }
}
