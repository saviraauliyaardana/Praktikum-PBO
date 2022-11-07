package shape2d;

public class Segitiga extends Shape2D {

    @Override
    double luas(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    double luas(int alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

}


