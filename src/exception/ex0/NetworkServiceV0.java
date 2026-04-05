package exception.ex0;

public class NetworkServiceV0 { //제어한다.,흐름관리

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);
        //이제 메세지를 보낼려면
        client.connect();//서버 연결
        client.send(data);//메세지 전송
        client.disconnect();//연결해제
    }

}
