package coba;

public class Hewan {

    int jumlah_kaki;
    String jenis_makanan;
    String habitat;
    String nama_hewan;

    public Hewan(String nama_hewan) {
        this.nama_hewan = nama_hewan;
        System.out.println("ini adalah class hewan");
    }

    public void Indentitas() {
        System.out.println("ini adalah hewan " + nama_hewan);
        System.out.println("hewan ini berkaki " + jumlah_kaki);
        System.out.println("hewan ini termasuk " + jenis_makanan);
        System.out.println("habitat hewan ini di " + habitat);
    }

    public void setJumlah_kaki(int jumlah_kaki) {
        this.jumlah_kaki = jumlah_kaki;
    }

    public void setJenis_makanan(String jenis_makanan) {
        this.jenis_makanan = jenis_makanan;
    }

    public void setHabitat(String Habitat) {
        this.habitat = Habitat;
    }

    public String getHabitat() {
        return this.habitat;
    }
}
