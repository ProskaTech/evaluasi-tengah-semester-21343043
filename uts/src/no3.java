//Created by 21343043_Fadhil Nugraha Wikarya

import javax.swing.JOptionPane;

public class no3 {
    public static void main(String[] args) {
        String nilai = JOptionPane.showInputDialog("Masukkan angka");
        int angka = Integer.parseInt(nilai);

        if (angka >= 0) {
        String msg = "Angka bernilai positif";
        JOptionPane.showMessageDialog(null, msg);
        } 
        else {
        String msg = "Angka bernilai negatif";
        JOptionPane.showMessageDialog(null, msg);
        }
    }
}
