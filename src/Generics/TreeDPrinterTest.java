package Generics;

import java.util.ArrayList;

public class TreeDPrinterTest {
    public static void main(String[] args) {
        TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
        printer.setMaterial(new Powder());
        Powder powder = printer.getMaterial();
        System.out.println(powder.toString());

        TreeDPrinter<Plastic> printer1 = new TreeDPrinter<Plastic>();
        printer1.setMaterial(new Plastic());
        Plastic plastic = printer1.getMaterial();
        System.out.println(plastic.toString());

//        TreeDPrinter<Water> printer2 = new TreeDPrinter<Water>();
//        printer2.setMaterial(new Water());
//        Water water = printer2.getMaterial();
//        System.out.println(water.toString());
        printer.printing();
        printer1.printing();

        ArrayList list = new ArrayList();
    }
}
