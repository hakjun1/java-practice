package nested.nested.ex1;

public class Network {

    public void sendMessage(String text) {
        NetWorkMessage netWorkMessage = new NetWorkMessage(text);
        netWorkMessage.print();
    }
}
