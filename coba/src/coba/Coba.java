package coba;

public class Coba {

    public Coba() {
        System.out.println("saya");
    }

    public Coba(String nama) {
        System.out.println("saya " + nama);
    }

    public static void main(String[] args) {
        Coba coba = new Coba("Rani");
        Hewan hewan = new Hewan("Katak");
        hewan.setJumlah_kaki(4);
        hewan.setJenis_makanan("karnivora");
        hewan.setHabitat("amfibi");
        hewan.Indentitas();
        System.out.println(hewan.getHabitat());
        Aves ayam = new Aves();
        ayam.setHabitat("Darat");
        ayam.setJenis_hewan("Unggas");
        ayam.setJenis_makanan("Omnivora");
        ayam.Indentitas();

    }

}
