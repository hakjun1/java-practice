package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String address;//접근할 주소
    public boolean connectError;//true시 연결실패, 기본값 false
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;//접속할 외부서버 주소
    }

    public void connect(){
        //전송실패
        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data){
        //전송실패
        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송: " + data);

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
