package lang.immuateable.test;

public class ImmutableMydate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMydate withYear(int newYear) {
        return new ImmutableMydate(newYear,month,day);//월일은 같다쓰고 년만 새로운 객체로 반환
    }//with 불변객체에서 새로운걸 반환하는 관례

    public ImmutableMydate withMonth(int newMonth) {
        return new ImmutableMydate(year,newMonth,day);//월일은 같다쓰고 년만 새로운 객체로 반환
    }

    public ImmutableMydate withDay(int newDay) {
        return new ImmutableMydate(year,month,newDay);
    }

    @Override
    public String toString() {
        return "year=" + year + ", month=" + month +
                ", day=" + day;
    }
}


