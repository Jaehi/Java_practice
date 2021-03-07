package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead1 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        String filename = "Hi.txt";
        FileInputStream fis = new FileInputStream(filename);
        fis.read(b);
        System.out.println(new String(b));
        fis.close();
    }
}
