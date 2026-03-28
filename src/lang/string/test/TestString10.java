package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] arrs = fruits.split(",");

        for (String s : arrs) {
            System.out.println(s);
        }

        String joinedString = String.join("->", arrs);
        System.out.println("joinedString = " + joinedString);
    }
}
