package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();//스택 트레이스 잘 확인하자
        System.out.println("정상 종료");
    }
}
