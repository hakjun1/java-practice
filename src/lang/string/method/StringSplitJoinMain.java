package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split() //첫번째
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

//        String joinStr = "";
//        for (String s : splitStr) {
//            joinStr += s + "-";
//        }
//
        String joinStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if (i != splitStr.length - 1) {
                joinStr += "-";
            }
        }

        System.out.println("joinStr = " + joinStr);

        //join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = "+joinedStr);

        //문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = "+result);

    }
    //split로 분해후 join이나 fori,iter들을 활용해야한다.
    //join으로 편리해짐 - 배열에있는 문자열을 조립
}
