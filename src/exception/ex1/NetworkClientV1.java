package exception.ex1;

public class NetworkClientV1 {

    private final String address;//접근할 주소
    public boolean connectError;//true시 연결실패, 기본값 false
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;//접속할 외부서버 주소
    }

    public String connect(){
        //전송실패
        if (connectError) {
            System.out.println(address + " 서버 연결실패");
            return "connectError";
        }

        System.out.println(address+" 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        //전송실패
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송: " + data);
            return "sendError";
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
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
