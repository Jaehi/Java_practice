package Abc;

public class ComputerTest {
    public static void main(String[] args) {
//        Computer computer = new Computer(); 오류
        Desktop desktop = new Desktop();
//        Notebook notebook = new Notebook(); 오류
            Notebook notebook = new MyNotebook();


        desktop.display();
        notebook.display();
    }
}
