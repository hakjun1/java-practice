package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘날짜 nowDate = " + nowDate);
        System.out.println("지정 날짜 ofDate = " + ofDate);

        //계산 (불변주의)
        ofDate = ofDate.plusDays(10); //불변이라 반환값 받아야 변한다. 새로운객체를 생성해서 반환
        System.out.println("지정날짜+10 d = " + ofDate);

    }
}
