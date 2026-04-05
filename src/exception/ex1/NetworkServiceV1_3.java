package exception.ex1;


public class NetworkServiceV1_3 { //제어한다.,흐름관리

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);//추가

        String connectResult = client.connect();//반환값을 받는다.
        if (isError(connectResult)) {
            System.out.println("[네트워크오류발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드" + sendResult);
            }
        }
            client.disconnect();//return이 없기떄문에 무조건 호출된다.
//1_2, 1_3 정상흐름과 예외흐름이 섞여있다. client.connet()다음에 에러처리다음에 정상흐름 다음에 에러처리
//반환값을 받고 뭔가 하는 순간 정상흐름과 예외흐름이 섞여버리게된다.
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

}
