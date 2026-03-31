package nested.nested.ex1;

//Network객체 안에서만 사용
public class NetWorkMessage {

    private String content;//네트워크 메세지가있고 생성자로 뭔가 내용을 추가한다., 프린트한다

    public NetWorkMessage(String content) {
        this.content = content;
    }

    public void print(){
        System.out.println(content);
    }
}
