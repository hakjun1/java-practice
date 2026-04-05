package exception.ex0;

public class NetworkClientV0 {

    private final String address;//접근할 주소

    public NetworkClientV0(String address) {
        this.address = address;//접속할 외부서버 주소
    }

    public String connect(){
        //연결 성공
        System.out.println(address+" 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }
}
