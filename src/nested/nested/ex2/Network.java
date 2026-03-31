package nested.nested.ex2;


public class Network {

    public void sendMessage(String text) {
        NetWorkMessage netWorkMessage = new NetWorkMessage(text);
        netWorkMessage.print();
    }
    private static class NetWorkMessage {

        private String content;//네트워크 메세지가있고 생성자로 뭔가 내용을 추가한다., 프린트한다

        public NetWorkMessage(String content) {
            this.content = content;
        }

        public void print(){
            System.out.println(content);
        }
    }

}
