package Array;

import java.util.ArrayList;
import java.util.Scanner;

class Book2{
    private String bookname;
    private String author;


    public Book2(String bookname, String author){
        this.bookname = bookname;
        this.author = author;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo(){
        System.out.println(bookname+","+author);
    }
}


public class BookArrayList {
    public static void main(String[] args) {
        ArrayList<Book2> bookarray = new ArrayList<Book2>();
        Scanner sc = new Scanner(System.in);

        bookarray.add(new Book2(sc.next(),sc.next()));
        bookarray.add(new Book2(sc.next(),sc.next()));

        for (int i = 0; i < bookarray.size(); i++){
            Book2 book = bookarray.get(i);
            book.showBookInfo();
        }

    }
}
