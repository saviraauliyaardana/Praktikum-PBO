package shape2d;

public class Shape2D {

    double panjang;
    double tinggi;
    double lebar;

    double luas (double panjang,double lebar) {
        return panjang*lebar;
    }
    double keliling (double panjang,double lebar){
        return 2*(panjang+lebar);
    }
}
