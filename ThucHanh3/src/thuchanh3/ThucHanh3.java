/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh3;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class ThucHanh3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("hello world");
        myFrame.setSize(300,150);
        myFrame.setVisible(true);
        JLabel lbName = new JLabel();
        lbName.setText("chào các bạn");
        myFrame.add(lbName);
    }
    
}
