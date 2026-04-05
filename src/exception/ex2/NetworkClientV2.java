package exception.ex2;

public class NetworkClientV2 {

    private final String address;//접근할 주소
    public boolean connectError;//true시 연결실패, 기본값 false
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;//접속할 외부서버 주소
    }

    public void connect() throws NetworkClientExceptionV2 {
        //전송실패
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결실패");
//        중간에 다른 예외가 발생했다고 가정
//        throw new RuntimeException("ex");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        //전송실패
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송: " + data);
//        throw new RuntimeException("ex");

        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {//contain = 포함하면
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
