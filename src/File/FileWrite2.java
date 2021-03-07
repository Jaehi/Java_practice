package File;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite2 {
    public static void main(String[] args) throws IOException {
        String filename = "Hi.txt";
        FileWriter filewriter = new FileWriter(filename);
        for (int i = 10; i < 20; i++){
            String data = i + "번째 줄입니다 \n";
            filewriter.write(data);
        }
        filewriter.close();

        FileWriter fileWriter2 = new FileWriter(filename,true);
        for (int i = 0; i < 10; i++){
            String data = i + "번째 줄입니다 \n";
            fileWriter2.write(data);
        }
        fileWriter2.close();
    }
}
