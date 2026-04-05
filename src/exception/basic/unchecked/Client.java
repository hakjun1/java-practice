package exception.basic.unchecked;

public class Client {
    public void call() {//throws MyUn... 해도된다. 컴파일러는 없는취급 하지만 보기좋을수도
        throw new MyUncheckedException("ex");
        //컴파일러가 알아서 나감
    }
}
