package File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite3 {
    public static void main(String[] args) throws IOException {
        String filename = "Hi.txt";
        PrintWriter printwriter = new PrintWriter(filename);
        for (int i = 20; i < 30; i++){
            String data = i + "번째 줄입니다";
            printwriter.println(data);
        }
        printwriter.close();

        PrintWriter printwriter2 = new PrintWriter(new FileWriter(filename,true));
        for (int i = 0; i < 11; i++){
            String data = i + "번째 줄입니다";
            printwriter2.println(data);
        }
        printwriter2.close();
    }
}
