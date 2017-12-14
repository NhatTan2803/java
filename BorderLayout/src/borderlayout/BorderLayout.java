/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borderlayout;

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
public class BorderLayout extends JFrame {

    /**
     * @param args the command line arguments
     */
    public BorderLayout(String title) {
        JPanel pnBorder = new JPanel();

        pnBorder.setLayout(new java.awt.BorderLayout());
        JPanel pnNorth = new JPanel();
        
        pnBorder.add(pnNorth, java.awt.BorderLayout.NORTH);
        JPanel pnSouth = new JPanel();
        
        pnBorder.add(pnSouth, java.awt.BorderLayout.SOUTH);
        JPanel pnWest = new JPanel();
        
        pnBorder.add(pnWest, java.awt.BorderLayout.WEST);
        JPanel pnEast = new JPanel();
        pnBorder.add(pnEast, java.awt.BorderLayout.EAST);

        JPanel pnCenter = new JPanel();
        pnBorder.add(pnCenter, java.awt.BorderLayout.CENTER);

        Container con = getContentPane();
        con.add(pnBorder);
    }


    public static void main(String[] args) {
       BorderLayout myUI = new BorderLayout("demo flowLayOut");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }

}
