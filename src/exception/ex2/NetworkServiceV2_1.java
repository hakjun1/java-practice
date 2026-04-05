package exception.ex2;



public class NetworkServiceV2_1 { //제어한다.,흐름관리

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//추가

        client.connect();//서버 연결
        client.send(data);//메세지 전송
        client.disconnect();//연결해제
    }

}
