package coba;

public class Aves extends Hewan {

    String jenis_hewan;
    boolean isFly = true;

    public Aves() {
        super(null);
    }

    
    public void setJenis_hewan(String jenis_hewan) {
        this.jenis_hewan = jenis_hewan;
    }

    public void setisFly(boolean isFly) {
        this.isFly = isFly;
    }

    @Override
    public void Indentitas() {
        System.out.println("ini adalah hewan " + nama_hewan);
        System.out.println("hewan ini berkaki " + jumlah_kaki);
        System.out.println("hewan ini termasuk " + jenis_makanan);
        System.out.println("habitat hewan ini di " + habitat);
        System.out.println("jenis hewan ini adalah " + jenis_hewan);
        System.out.println("apakah hewan ini bisa terbang? " + isFly);
    }
}
