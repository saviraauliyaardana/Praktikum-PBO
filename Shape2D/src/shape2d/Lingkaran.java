package shape2d;


public class Lingkaran extends Shape2D{
    final double PI = 3.14 ;
    double keliling2 (double r){
        return 2*Math.PI*r;
    }
    double keliling (double r){
        return 2*PI*r;
    }
}
