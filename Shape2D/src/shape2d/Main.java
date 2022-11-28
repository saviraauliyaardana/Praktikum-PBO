package shape2d;

//import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends JFrame{

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
            
            Main frame = new Main();
            frame.setBounds(10, 10, 1000, 500);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(Main.DISPOSE_ON_CLOSE);
            frame.setLayout(null);
            
            JTextField alas = new JTextField();
            alas.setBounds(5, 5, 100, 50);
            alas.setText("0");
            frame.add(alas);
            
            JButton hitung = new JButton("hitung");
            hitung.setBounds(115, 5, 100, 50);
            frame.add(hitung);
            
            hitung.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    System.out.println(alas.getText());
                }
            });
            
        } catch (Exception e) {
            System.out.println("Input tidak sesuai");
        }

    }

}
