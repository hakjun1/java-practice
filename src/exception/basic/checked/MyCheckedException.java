package exception.basic.checked;

/**
 *  Exception을 상속받은 예외는 체크 예외가 된다.
 */
//체크예외는 개발자가 명시적으로 처리해야한다.(잡거나,던지거나) 부모타입으로 던져도된다.
public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message);//예외 메세지 보관(부모에)
    }
}
