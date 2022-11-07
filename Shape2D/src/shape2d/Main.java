package shape2d;

public class Main {

    public static void main(String[] args) {
        Shape2D persegiPanjang = new Shape2D();
        System.out.println(persegiPanjang.keliling(2, 4));
        
        Segitiga segitiga = new Segitiga ();
        System.out.println(segitiga.luas(6, 6));
        
        Lingkaran lingkaran = new Lingkaran();
        System.out.println(lingkaran.keliling(8));
        System.out.println(lingkaran.keliling2(8));
        
    }

}
