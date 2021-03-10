package Array;

import java.util.Scanner;

class Book{
    private String bookname;
    private String author;

    public Book(){

    }
    public Book(String bookname,String author){
        this.bookname = bookname;
        this.author = author;
    }


    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo(){
        System.out.println(this.bookname + "," + this.author);
    }


}

public class BookArray {

    public static void main(String[] args) {
        Book[] library = new Book[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < library.length; i++){
            library[i] = new Book(sc.nextLine(), sc.nextLine());
            library[i].showInfo();
        }
        for (int i = 0; i < library.length; i++){
            library[i].showInfo();
        }

    }

}
