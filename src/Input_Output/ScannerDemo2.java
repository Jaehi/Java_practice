package Input_Output;

import java.util.Scanner;
import java.io.*;

public class ScannerDemo2 {
    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt() * 100);
            }
            sc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
        }
    }
}
