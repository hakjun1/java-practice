package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
//많이쓰는기능이다
        int extIndex = str.indexOf(ext);
        System.out.println(extIndex);

        String filename = str.substring(0, extIndex);
        System.out.println("filename = " + filename);
        String extName = str.substring(extIndex);//여기서부터 끝까지 찾아와
        System.out.println("extName = " + extName);
    }
}
