import java.util.Arrays;


public class Main {
    private Object[] elementData;
    private int size = 0;

    // 생성자를 통해 외부 배열을 받아오도록 수정
    public Main(Object[] initialArray) {
        this.elementData = initialArray;
        this.size = initialArray.length;
    }

    public Object get(int index) {
        return elementData[index];
    }

    Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public static void main(String[] args) {
        Object[] objArr = {1, 2, 3, 4, 5}; // 원본 데이터

        // 생성자에 배열을 넘겨주며 인스턴스 생성
        Main main = new Main(objArr);

        Object set = main.set(3, 100); // 3번 인덱스를 100으로 교체

        System.out.println("기존 값: " + set); // 4 출력
        System.out.println("변경 후 배열: " + Arrays.toString(objArr)); // [1, 2, 3, 100, 5] 출력
    }
}