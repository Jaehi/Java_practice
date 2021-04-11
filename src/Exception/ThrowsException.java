package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String filename,String classname) throws FileNotFoundException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        Class c = Class.forName(classname);
        return c;
    }
    public static void main(String[] args) {
        ThrowsException throwsException = new ThrowsException();
        try {
            throwsException.loadClass("b.txt","java.lang.String");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("end");
    }
}
