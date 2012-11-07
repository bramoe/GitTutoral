package Main.input;

/**
 * Created with IntelliJ IDEA.
 * User: bramoepoetra
 * Date: 7/12/12
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MessageDialog extends JFrame {
    private JButton tombol, btn2, btn3, btn4, btn5;
    public MessageDialog() {
        super ("Event Handling");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        tombol = new JButton ("Message Dialog");
        tombol.addActionListener(
        new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                JOptionPane.showMessageDialog (null,"Message Dialog");
            }
        }
        );
        container.add(tombol);

        btn2 = new JButton ("Warning Message");
        btn2.addActionListener(
        new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Warning Message","Peringatan",

                        JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
            }
        }
        );
        container.add(btn2);

        btn3 = new JButton ("Question Message");

        btn3.addActionListener(
        new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Question Message","Pertanyaan",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            }
        }
        );
        container.add(btn3);
        btn4 = new JButton ("Information Message");
        btn4.addActionListener(
        new ActionListener() {
            public void actionPerformed (ActionEvent e) {

                JOptionPane.showConfirmDialog(null, "Information Message","Informasi",
                        JOptionPane.NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }

        }

        );

        container.add(btn4);

        btn5 = new JButton ("Input Dialog");

        btn5.addActionListener(

        new ActionListener() {

            public void actionPerformed (ActionEvent e) {

                String a = JOptionPane.showInputDialog("Input Nama : ");

                JOptionPane.showMessageDialog(null, a);

            }
        }

        );

        container.add(btn5);

        setSize (200,300);

        setLocationRelativeTo(null);
        setVisible (true);

    }

    public static void main (String arg[]) {

        MessageDialog test = new MessageDialog();

        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
