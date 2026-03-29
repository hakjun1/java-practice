package lang.math;

import java.util.Random;

public class RanDomMain {

    public static void main(String[] args) {
//        Random random = new Random();

        //씨드값
        Random random = new Random(1);//seed가 같으면 random의 결과가 같다.
        //시스템의 나노초같은걸 가져오는거 --시드를 안주면

        int randomInt = random.nextInt();
        System.out.println("randomint = " + randomInt);

        double randomDouble = random.nextDouble();//0.0~1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10);//0~9까지 출력
        System.out.println("randomRange1 = " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;//1~10까지 출력
        System.out.println("randomRange2 = " + randomRange2);

    }
}
