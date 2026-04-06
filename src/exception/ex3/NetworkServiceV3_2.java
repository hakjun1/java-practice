package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 { //제어한다.,흐름관리

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);//추가

        //정상흐름과 예외흐름을 분리
        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {//중요한 오류
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {//나머지 퉁쳐서
            System.out.println("[네트워크 오류] 메시지:" + e.getMessage());
        } catch (Exception e) {//진짜모름
            System.out.println("[알수 없는 오류] 메시지" + e.getMessage());
        } finally {
            client.disconnect();//지금 구조로는 이걸 호출하는걸 보장하는것은 쉽지 않다. 대안이 필요하다
        }
        //try , finally 두개만 써도 됨
        //catch를 여러개써서 예외 여러개 써도됨

    }

}
