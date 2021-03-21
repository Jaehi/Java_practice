package BookShelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("비밀의 화원");
        shelfQueue.enQueue("트리갭의 샘물");
        shelfQueue.enQueue("아더와 미니모이");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
