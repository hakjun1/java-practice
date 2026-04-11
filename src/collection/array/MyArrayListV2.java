package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {//자료구조 예제 점진적 구현

    private static final int DEFAULT_CAPACITY = 5;//기본 수용량(용량)

    private Object[] elementData;//모든 데이터를 담는 Object
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];//수용량 이때생성
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }

        elementData[size] = e;//초기 0번째에 값을 입력하고 1증가시킨다.
        size++; //첫번째 항복에 넣고 증가시킨다 점점 증가
    }

    //코드추가
    private void grow() {
        int oldCapacity = elementData.length; // 기존 배열의 크기
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);//참조를 바꿔버림
        //inline활용

/*
        Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
        elementData = newArr;//참조를 바꿔버림
*/

    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);//가져와서
        elementData[index] = element;//새로 들어온항목 넣어주고
        return oldValue;//교체하지만 예전값 반환
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;//인덱스 번호를 찾음
            }
        }
        return -1;//없으면 -1
    }

    public String toString() {
//        [1,2,3,null,null]//size = 3
//        [1,2,3]//size = 3
        return Arrays.toString(Arrays.copyOf(elementData,size))+//이 배열에서 size크기 만큼 카피
                " size="+size+", capacity="+elementData.length;


    }



}
