package generic.test.ex3.unit;

public class UnitPrinter {


    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();// setter로 꺼내줌
        System.out.println("이름: "+unit.getName()+", HP: "+unit.getHp());
//        unit.showInfo();
    }
//
//    public static void printV2(Shuttle<? extends Shuttle> unit) {
//
//    }

    public static void printV2(Shuttle<? extends BioUnit> t2) {
        BioUnit bioUnit = t2.out();
        System.out.println("이름: "+bioUnit.getName()+", HP: "+bioUnit.getHp());

    }
}
