package lang.string.builder;

public class LoopBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//현재 밀리세컨드
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            result.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = "+(endTime - startTime)+"ms ");
    }
}
