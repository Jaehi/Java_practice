package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ArrayListest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);


        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());

//        for (String s : list){
//            System.out.println(s);
//        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
