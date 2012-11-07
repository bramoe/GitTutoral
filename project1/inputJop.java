package Main.input;

import javax.swing.JOptionPane;

public class inputJop {

    public static void main(String[] args) {

        int jumlah;

        int total = 0;

        jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang"));

        for (int i = 0; i < jumlah; i++) {

            total = total + Integer.parseInt(JOptionPane.showInputDialog("Barang ke " + (i + 1)));

        }

        JOptionPane.showMessageDialog(null, "Harga Total Pembelian adalah : " + total);

    }
}

