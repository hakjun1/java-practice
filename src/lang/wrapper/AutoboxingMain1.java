package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);//박싱

        //Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();//언박싱

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);




    }
}
