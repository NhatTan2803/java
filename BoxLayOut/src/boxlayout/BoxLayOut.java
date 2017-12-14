/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxlayout;

import java.awt.Color;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class BoxLayOut extends JFrame {

    private static final long serialVersionUID = 1L;
    public BoxLayOut(String title)
    {
        setTitle(title);
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
        pnBox.setBackground(Color.RED);
        JButton btn1 = new JButton("BoxLayout");
        JButton btn2 = new JButton("Add cac controll");
        JButton btn3 = new JButton("Tren 1 dong");
        JButton btn4 = new JButton("het cho chua");
        JButton btn5 = new JButton("tai xuong dong");
        pnBox.add(btn1);
        pnBox.add(btn2);
        pnBox.add(btn3);
        pnBox.add(btn4);
        pnBox.add(btn5);
        Container con = getContentPane();
        con.add(pnBox);
    }
            /**
             * @param args the command line arguments
             */

    public static void main(String[] args) {
        BoxLayOut myUI = new BoxLayOut("demo BoxLayout");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }

}
