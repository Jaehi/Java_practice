import java.io.*;

public class Practice {
    public static void main(String[] args) throws IOException {
        String filename = "practice.txt";
        FileWriter fw = new FileWriter(filename);
        fw.write("인생이란 무엇인가");
        fw.close();

        BufferedReader fr = new BufferedReader(new FileReader(filename));
        System.out.println(fr.readLine());
        fr.close();
    }
}
