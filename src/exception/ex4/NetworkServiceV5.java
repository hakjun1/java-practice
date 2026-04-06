package exception.ex4;

public class NetworkServiceV5 { //제어한다.,흐름관리

    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);//client 스코프 좁아짐(디버깅하기좋아짐)
            client.connect();
            client.send(data);
        } catch (Exception e) {//try 나가는순간 AutoClosealbe가 먼저 실행된다.(최대한빨리 자원 반납)
            System.out.println("예외확인 " + e.getMessage());
            throw e;//sout찍고 다시 던져
        }

    }

}
