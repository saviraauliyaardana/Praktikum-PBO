package shape2d;

public abstract class Shape2D extends Shape{

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
