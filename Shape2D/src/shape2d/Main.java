package shape2d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Shape2D persegiPanjang = new Segitiga();
            System.out.println(persegiPanjang.keliling(2, 4));

            Segitiga segitiga = new Segitiga();
            System.out.println(segitiga.luas(6, 6));

//            Scanner scn = new Scanner(System.in);
//            int angka = scn.nextInt();
//            System.out.println("Angka: " + angka);

//            if (angka > 10) {
//                throw new UnsupportedOperationException("Angka lebih dari 10.");
//            }
            Lingkaran lingkaran = new Lingkaran();
            System.out.println(lingkaran.keliling(8));
            System.out.println(lingkaran.keliling2(8));

            segitiga.print();

            Segitiga test = new Segitiga();

            LimasSegitigaSamaSisi limas = new LimasSegitigaSamaSisi();
            System.out.println(limas.luas(8, 7, 4));
            System.out.println(limas.volume(9, 3));
            
        } catch (Exception e) {
            System.out.println("Input tidak sesuai");
        }

    }

}
