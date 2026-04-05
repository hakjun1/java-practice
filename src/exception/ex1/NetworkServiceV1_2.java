package exception.ex1;


public class NetworkServiceV1_2 { //제어한다.,흐름관리

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);//추가

        String connectResult = client.connect();//반환값을 받는다.
        //결과가 성공이 아니다 -> 오류다. , 오류다 컨트롤알트엠으로 리펙토링
        if (isError(connectResult)) {
            System.out.println("[네트워크오류발생] 오류 코드: "+connectResult);
            return;//메서드를 빠져나간다(중지)
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드" + sendResult);
            return;
        }
        client.disconnect();//연결해제
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

}
