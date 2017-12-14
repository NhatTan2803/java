/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boderbai5;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class Boderbai5 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public Boderbai5 (String title) {
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new java.awt.BorderLayout());
        
        JPanel pnNorth = new JPanel();  
        pnNorth.setBackground(Color.red);
        pnBorder.add(pnNorth, java.awt.BorderLayout.NORTH);
        ///////
        JPanel pnSouth = new JPanel();
             pnSouth.setBackground(Color.YELLOW);
             pnBorder.add(pnSouth, java.awt.BorderLayout.SOUTH);
        /////////
        JPanel pnWest = new JPanel();
                pnWest.setBackground(Color.BLUE);
                    pnBorder.add(pnWest, java.awt.BorderLayout.WEST);
        /////////
        JPanel pnEast = new JPanel();
                pnEast.setBackground(Color.GREEN);
                        pnBorder.add(pnEast, java.awt.BorderLayout.EAST);

        /////////
        JPanel pnCenter = new JPanel();
            pnCenter.setBackground(Color.PINK);
                pnBorder.add(pnCenter, java.awt.BorderLayout.CENTER);
        //////////
            pnNorth.setBackground(Color.ORANGE);
      
        Container con = getContentPane();
        con.add(pnBorder);
    }
   public static void main(String[] args) {
       Boderbai5 myUI = new Boderbai5("demo borderLayOut");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }
}
