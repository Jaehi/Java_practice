package Object;

class Book{
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }
}

public class ToStringEx {

    public static void main(String[] args) {
        Book book = new Book("팦푸","풒팦");
        System.out.println(book);

        String str = new String("푸팦");
        System.out.println(str);
    }

}
