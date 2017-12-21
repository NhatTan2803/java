
package LAB04;

//import NotePadDemo.notePad;
import java.awt.Color;
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class BaiTap05 extends javax.swing.JFrame {


    public BaiTap05() {
        initComponents();
    }

    String filename = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuOpen = new javax.swing.JMenuItem();
        jMenuExit = new javax.swing.JMenuItem();
        jMenuSetting = new javax.swing.JMenu();
        jCheckBoxMenu = new javax.swing.JCheckBoxMenuItem();
        jMenuColor = new javax.swing.JMenu();
        jRadioButtonMenuRed = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuBlue = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Confirm Exit");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenuFile.setText("File");

        jMenuOpen.setText("Open");
        jMenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOpenActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuOpen);

        jMenuExit.setText("Exit");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuExit);

        jMenuBar1.add(jMenuFile);

        jMenuSetting.setText("Setting");

        jCheckBoxMenu.setText("Comfirm Exit");
        jCheckBoxMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuActionPerformed(evt);
            }
        });
        jMenuSetting.add(jCheckBoxMenu);

        jMenuColor.setText("Color");

        jRadioButtonMenuRed.setText("Red");
        jRadioButtonMenuRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuRedActionPerformed(evt);
            }
        });
        jMenuColor.add(jRadioButtonMenuRed);

        jRadioButtonMenuBlue.setText("Blue");
        jRadioButtonMenuBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuBlueActionPerformed(evt);
            }
        });
        jMenuColor.add(jRadioButtonMenuBlue);

        jMenuSetting.add(jMenuColor);

        jMenuBar1.add(jMenuSetting);

        jMenu3.setText("Help");

        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        // Menu Item exit
        if (jCheckBox1.isSelected())
        {
            int yes = JOptionPane.showConfirmDialog(this, "Thoat ?", "Confirm exit", JOptionPane.YES_NO_OPTION);
            if (yes == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        }
        else
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuExitActionPerformed

    private void jCheckBoxMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuActionPerformed
        // Menu confirm exit
        if (jCheckBoxMenu.isSelected())
            jCheckBox1.setSelected(true);
        else 
            jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jCheckBoxMenuActionPerformed

    private void jMenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOpenActionPerformed
        // Menu Open
        //Tao hop thoai chon file
        FileDialog f = new FileDialog(BaiTap05.this, "Open file", FileDialog.LOAD);
        f.setVisible(true);
        
        //Kiem tra neu chon duoc file thi lay duong dan
        if (f.getFile() != null)
        {
            filename = f.getDirectory() + f.getFile();
            setTitle(filename);
        }
        
        //Doc du lieu tu file vao jTextArea
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            
            String line = null;
            
            while((line = reader.readLine()) != null)
            {
                sb.append(line + "\n");
                jTextArea1.setText(sb.toString());
            }
            reader.close();
        } catch (Exception e){
            System.out.println("File not found");
        }
    }//GEN-LAST:event_jMenuOpenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Button Save
        //Tao hop thoai save file
        FileDialog f = new FileDialog(BaiTap05.this, "Save file", FileDialog.SAVE);
        f.setVisible(true);
        
        if (f.getFile() != null)
        {
            filename = f.getDirectory() + f.getFile();
            setTitle(filename);
        }
        
        try {
            //Luu dinh dang txt
            FileWriter writer = new FileWriter(filename + ".txt");
            writer.write(jTextArea1.getText());
            setTitle(filename);
            writer.close();
        } catch (Exception e){
            System.out.println("File not found");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButtonMenuRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuRedActionPerformed
        // Menu Red
        if (jRadioButtonMenuRed.isSelected())
        {
            jTextArea1.setForeground(Color.red);
            jRadioButtonMenuBlue.setSelected(false);
        }
        else
            jTextArea1.setForeground(Color.black);
    }//GEN-LAST:event_jRadioButtonMenuRedActionPerformed

    private void jRadioButtonMenuBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuBlueActionPerformed
        // Menu blue
        if (jRadioButtonMenuBlue.isSelected())
        {
            jTextArea1.setForeground(Color.blue);
            jRadioButtonMenuRed.setSelected(false);
        }
        else
            jTextArea1.setForeground(Color.black);
    }//GEN-LAST:event_jRadioButtonMenuBlueActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Menu About
        JOptionPane.showMessageDialog(this, "Xin chào, mình là Lâm Minh Lợi! 14DTHC05");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BaiTap05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTap05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTap05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTap05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTap05().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenu;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuColor;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuOpen;
    private javax.swing.JMenu jMenuSetting;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuBlue;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuRed;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
