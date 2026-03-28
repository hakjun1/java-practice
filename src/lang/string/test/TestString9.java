package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] strings = email.split("@");

        String idPart = strings[0];
        String domainPart = strings[1];
        System.out.println("idPart = " + idPart);
        System.out.println("domainPart = " + domainPart);

    }
}
