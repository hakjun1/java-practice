package nested.test.ex1;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        //tips 정답은 없다 이렇게하는 스타일 김영한 스타일
        //검증 로직을 다 처리하고
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다");
            return;
        }
        //정상 로직을 처리
        books[bookCount++] = new Book(title, author);

/// ////////////////////////////////////////////////////////////////
//        if (bookCount < books.length) {
//            books[bookCount++] = new Book(title, author);
//            //bookCount++; 일단 두줄만들고 합친다 이렇게하는방법이 안헷갈릴수도 있따.
//        } else {
//            System.out.println("도서관 저장 공간이 부족합니다");
//        }
/// /////////////////////////////////////////////////////////////////
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        //iter쓰면 배열에 저장되지않은거 출력될 위험이 있따.
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            System.out.println("도서제목: "+book.title+", 저자: "+book.author);
            //내부는 private여도 접근 가능, 위에것도 합칠수 있다.
        }
    }
    //외부에서못쓰게 library인스턴스 관련을 써야한다면 static가 아니어야한다.
    //그게 아닐꺼같으면 정적으로 만들어야 한다
    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }//밖에서쓰면 클래스 따로 빼야한다. Book
    }
}
