package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {
        //시간을 dt로 만든다.
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR = "+dt.get(ChronoField.YEAR));//조회를 할껀데 크로노 필드 enum을 넣으면된다.
        System.out.println("MONTH_OF_YEAR = "+dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH = "+dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY = "+dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR = "+dt.get(ChronoField.MINUTE_OF_HOUR));

        System.out.println("YEAR = "+dt.getYear());//조회를 할껀데 크로노 필드 enum을 넣으면된다.
        System.out.println("MONTH_OF_YEAR = "+dt.getMonthValue());
        System.out.println("DAY_OF_MONTH = "+dt.getDayOfMonth());
        System.out.println("HOUR_OF_DAY = "+dt.getHour());
        //이런식으로 축약가능

        //하지만 없는것도 있음
        System.out.println("dt.get(ChronoField.MINUTE_OF_DAY) = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("dt.get(ChronoField.SECOND_OF_DAY) = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
