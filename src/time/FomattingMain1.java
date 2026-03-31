package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FomattingMain1 {

    public static void main(String[] args) {
        //포멧팅: 날짜를 문자로

        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);//년월일 제데로 출력하고 싶다.
//        System.out.println(date.getYear()+"년"+...);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(formatter);
        System.out.println("날짜와 시간 포멧팅 "  + formattedDate);

        //파싱 : 문자를 날짜로
        String input = "2030년 01월 01일";//"yyyy년 MM월 dd일"
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간 "+parsedDate);
    }
}
