package collection.list;

public class BatchProcesserMain {

    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcesser processor = new BatchProcesser(list);
        processor.logic(1_000_000);

    }
}
