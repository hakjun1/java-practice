package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //현재시간 ms밀리초
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //나노초
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경변수를 읽는다.
        System.out.println("getenv = "+System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("properties = "+System.getProperties());
        System.out.println("java version = "+System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];//복사를 하고싶으면 for문으로 하나하나 넣어야한다.
        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);//자바가 운영체제에 넘겨서...
        //배열출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0);//가급적이면 사용하면 안된다. 프로그램을 종료하기전에는 뒷정리를 해야한다.
        System.out.println("hello");

    }
}
