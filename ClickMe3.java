package Main.input;

/**
 * Created with IntelliJ IDEA.
 * User: bramoepoetra
 * Date: 7/12/12
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class ClickMe3 extends JFrame {

    private JButton tombol, btnExit;

    public ClickMe3() {

        super ("Event Handling");

        Container container = getContentPane();

        container.setLayout(new FlowLayout());

        ClickListener cl = new ClickListener ();

        tombol = new JButton ("Click Me!");

        tombol.addActionListener(cl);

        container.add(tombol);

        btnExit = new JButton ("Exit");

        btnExit.addActionListener(cl);

        container.add(btnExit);

        setSize (200,100);

        setVisible (true);

    }

    public static void main (String arg[]) {

        ClickMe3 test = new ClickMe3();

        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

            //inner class

    private class ClickListener implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            if (e.getSource() == tombol) {

                JOptionPane.showMessageDialog(null, "You click me again, guys !!!");
            } else if (e.getSource() == btnExit){

                if ( JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan keluar ?","Konfirmasi",

                        JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {

                    System.exit(0);

                }
            }
        }
    }
}

