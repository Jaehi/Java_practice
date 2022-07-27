import java.io.*;
import java.util.*;

public class FileEx {

    public static void searchFile(String path,ArrayList<String> txt_file,String file_name) {
        File first_file = new File(path);
        File[] directory = first_file.listFiles();

        if(directory != null) {
            for(int i = 0; i < directory.length; i++) {

                File file = directory[i];

                if(file.isDirectory()) {

                    searchFile(file.getPath(),txt_file,file_name);

                }else {

                    if(file.getPath().contains(file_name) && file.getPath().contains(".txt") ) {

                        txt_file.add(file.getPath());
                    }
                }
            }
        }else {
            System.out.println("디렉토리에 뭐가 업소용 ");
        }
    }

    public static void main(String[] args) throws IOException{

        String BASE_PATH = "/Users/jungjaehi/Desktop";
        String content;
        ArrayList<String> txt_file = new ArrayList<String>();
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String file_name = reader.readLine();
            reader.close();
            searchFile(BASE_PATH,txt_file,file_name);

        }catch(Exception e) {
            System.out.println(e);

        }finally {
            try {
                if(reader != null) {
                    reader.close();
                }
            }catch(Exception e) {
                System.out.println(e);
            }
        }

        try {
            writer = new BufferedWriter(new OutputStreamWriter(System.out));
            if(txt_file.size() == 1) {

                writer.write("파일 경로 : " + txt_file.get(0));
                writer.newLine();
                reader = new BufferedReader(new FileReader(txt_file.get(0)));
                content = reader.readLine();
                writer.write("파일 내용 : " + content);
                reader.close();
            }else if(txt_file.size() > 1){

                for(int i = 0; i < txt_file.size(); i++) {

                    writer.write("파일 경로 - " + i +  " : " + txt_file.get(i));
                    writer.newLine();
                    reader = new BufferedReader(new FileReader(txt_file.get(i)));
                    writer.write("파일 내용 - " + i +  " : ");
                    while((content = reader.readLine()) != null) {
                        writer.write(" " + content);
                    }
                    writer.newLine();
                    reader.close();
                }
            }else {
                System.out.println("파일이 업소용 ");
            }
            writer.flush();
            writer.close();

        }catch(Exception e) {
            System.out.println(e);
        }finally {
            try {
                if(writer != null) {
                    writer.flush();
                    writer.close();
                }
                if(reader != null) {
                    reader.close();
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }


    }
}
