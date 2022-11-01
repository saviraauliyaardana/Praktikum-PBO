package pertemuan.pkg1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Pertemuan1 objectA = new Pertemuan1();
        Pertemuan1 objectB = new Pertemuan1();
        System.out.println("Object A: " + objectA.getBilangan());
        System.out.println("Object B: " + objectB.getBilangan());
        objectA.setBilangan(20);
        objectB.setBilangan(100);
        objectA.setJurusan("Informatika");
        objectB.setJurusan("Elektro");
        System.out.println("Object A: " + objectA.getBilangan());
        System.out.println("Object B: " + objectB.getBilangan());

    }
}
