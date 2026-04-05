package exception.ex1;


public class NetworkServiceV1_1 { //제어한다.,흐름관리

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);//추가

        client.connect();//서버 연결
        client.send(data);//메세지 전송
        client.disconnect();//연결해제
    }

}
