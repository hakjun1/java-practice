package exception.ex2;



public class NetworkServiceV2_3 { //제어한다.,흐름관리

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//추가

        //정상흐름과 예외흐름을 분리
        try {
            client.connect();
            client.send(data);
            client.disconnect();//연결해제
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode()+", 메시지 "+e.getMessage());
        }
    }

}
