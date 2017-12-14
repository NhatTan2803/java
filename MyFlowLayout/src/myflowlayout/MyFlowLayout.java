/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myflowlayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class MyFlowLayout extends JFrame {

    private static final long serialVersionUID = 1L;
    public MyFlowLayout(String title)
    {
        setTitle(title);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.PINK);
        JButton btn1 = new JButton("FlowlayOut");
        JButton btn2 = new JButton("Add cac controll");
        JButton btn3 = new JButton("Tren 1 dong");
        JButton btn4 = new JButton("het cho chua");
        JButton btn5 = new JButton("tai xuong dong");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con = getContentPane();
        con.add(pnFlow);
    }
            /**
             * @param args the command line arguments
             */

    public static void main(String[] args) {
        MyFlowLayout myUI = new MyFlowLayout("demo flowLayOut");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }

}
