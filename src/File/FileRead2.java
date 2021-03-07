package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {
    public static void main(String[] args) throws IOException {
        String filename = "Hi.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        while (true){
            String line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        br.close();

    }
}
