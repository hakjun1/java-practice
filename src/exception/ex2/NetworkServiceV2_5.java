package exception.ex2;


public class NetworkServiceV2_5 { //제어한다.,흐름관리

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//추가

        //정상흐름과 예외흐름을 분리
        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지 " + e.getMessage());
        } finally {
            client.disconnect();//지금 구조로는 이걸 호출하는걸 보장하는것은 쉽지 않다. 대안이 필요하다
        }
        //try , finally 두개만 써도 됨
        //catch를 여러개써서 예외 여러개 써도됨

    }

}
