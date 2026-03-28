package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StirngBuilder ->String
        String string = sb.toString();//결과반환
        System.out.println("string = " + string);

        String st = "ddd";
        st = "dfsdfsdf";
        System.out.println(st);

        int st2 = 123;
        st2 = 456;
        System.out.println(st2);
    }
}
