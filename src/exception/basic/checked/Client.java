package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{//던질꺼야
        //문제 상황
        throw new MyCheckedException("ex");//예외발생 예외도 객체이므로 new
    }
    /**
     * 현대 개발에서는 대부분 체크예외를 거의 쓰지 않는다..ㅠ
     */
}
