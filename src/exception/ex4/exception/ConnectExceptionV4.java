package exception.ex4.exception;


public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

    private final String address;//어느 서버에 연결에 실패했는지

    public ConnectExceptionV4(String address, String message) {
        super(message);//컨트롤 알트 쉬프트 방향키
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
