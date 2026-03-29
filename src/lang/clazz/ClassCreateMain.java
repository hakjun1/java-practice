package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
//        Class helloCalss = Class.forName("lang.clazz.Hello"); //사용자의 입력을 문자로 받아서할수있다.

        Hello hello =(Hello) helloClass.getDeclaredConstructor().newInstance();//생성자를 얻어서 객체를 생성한다
        String result = hello.hello();
        System.out.println("result = " + result);
        System.out.println("hello = " + hello);

    }
}
