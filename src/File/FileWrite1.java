package File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite1 {
    public static void main(String[] args) throws IOException{
    String filename = "Hi.txt";
    FileOutputStream output = new FileOutputStream(filename);
    for (int i = 0; i < 10; i++){
        String data = i+"번째 줄입니다 \n";
        output.write(data.getBytes());
    }
    output.close();

    }
}