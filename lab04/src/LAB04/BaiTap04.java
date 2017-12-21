
package LAB04;

import java.awt.Color;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;


public class BaiTap04 extends javax.swing.JFrame {


    public BaiTap04() {
        initComponents();
    }    
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnToDenChan = new javax.swing.JButton();
        btnToDenLe = new javax.swing.JButton();
        btnToDenNT = new javax.swing.JButton();
        btnBoToDen = new javax.swing.JButton();
        btnXoaToDen = new javax.swing.JButton();
        btnTong = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNhap = new javax.swing.JButton();
        txtNhap = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Thao tac tren JList ");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnToDenChan.setText("Tô đen số chẵn");
        btnToDenChan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToDenChanActionPerformed(evt);
            }
        });

        btnToDenLe.setText("Tô đen số lẻ");
        btnToDenLe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToDenLeActionPerformed(evt);
            }
        });

        btnToDenNT.setText("Tô đen số nguyên tố");
        btnToDenNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToDenNTActionPerformed(evt);
            }
        });

        btnBoToDen.setText("Bỏ tô đen");
        btnBoToDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoToDenActionPerformed(evt);
            }
        });

        btnXoaToDen.setText("Xóa ô tô đen");
        btnXoaToDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaToDenActionPerformed(evt);
            }
        });

        btnTong.setText("Tổng các số trong list");
        btnTong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTongMouseClicked(evt);
            }
        });
        btnTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnToDenChan)
                    .addComponent(btnToDenLe)
                    .addComponent(btnToDenNT)
                    .addComponent(btnBoToDen)
                    .addComponent(btnXoaToDen)
                    .addComponent(btnTong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnToDenChan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnToDenLe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnToDenNT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBoToDen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaToDen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTong)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNhap.setText("Nhập");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        txtNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNhapActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Cho nhập số âm");

        jList1.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhap)
                    .addComponent(txtNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        // Button nhap
        int a = -1;
        try
        {
            a = Integer.parseInt(txtNhap.getText());
            if (!jCheckBox1.isSelected() && (a < 0) )
            {
                JOptionPane.showMessageDialog(this, "Khong duoc nhap so am");
            }
            //Chon jList1 trong form design
            //Trong properties, an vao nut "..." cua dong model
            //Chon tab "Custome code" trong combobox
            //go them "new DefaultListModel()"
            DefaultListModel model = (DefaultListModel) jList1.getModel();
            model.addElement(a + "");
            jList1.setModel(model);
            txtNhap.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Nhap so nguyen a");
        }
    }//GEN-LAST:event_btnNhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // Button thoat
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTongActionPerformed
        // Button Tong gia tri JList
        int s = 0;
        for (int i = 0 ; i < jList1.getModel().getSize() ; i++ )
        {
            s += Integer.parseInt(jList1.getModel().getElementAt(i));
        }
        JOptionPane.showMessageDialog(this, s);
    }//GEN-LAST:event_btnTongActionPerformed

    private void btnToDenChanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToDenChanActionPerformed
        // Button to den so chan
        //Ctrl + A, select tat ca phan tu trong JList de them index vao ls[]
        int ls[]  = new int[100];
        int j = 0;
        for (int i = 0 ; i < jList1.getModel().getSize() ; i++ )
        {
            //Neu phan tu thu i trong jlist chia het cho 2
            if (Integer.parseInt(jList1.getModel().getElementAt(i)) % 2 == 0)
            {
                ls[j] = i;
                j++;
            }
        }
        int[] a = new int[j];
        for (int i = 0 ; i < j; i++)
        {
              a[i] = ls[i];
                jList1.setSelectedIndices(a);
        }
          
      
    }//GEN-LAST:event_btnToDenChanActionPerformed

    private void btnToDenLeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToDenLeActionPerformed
        // Button to den so le
        //Ctrl + A, select tat ca phan tu trong JList de them index vao ls[]

        int[] ls = new int[100];
        int j = 0;
        for (int i = 0 ; i < jList1.getModel().getSize() ; i++ )
        {
            //Neu phan tu thu i trong jlist KHONG chia het cho 2
            if (Integer.parseInt(jList1.getModel().getElementAt(i)) % 2 == 1)
            {
                ls[j] = i;
                j++;
            }
        }
        int[] a = new int[j];
          for (int i = 0 ; i < j; i++)
        {
              a[i] = ls[i];
                jList1.setSelectedIndices(a);
        }
    }//GEN-LAST:event_btnToDenLeActionPerformed

    //Kiem tra so nguyen to
    private boolean ktnt(int a)
    {
        int dem = 0;
        if(a ==1)
            return false;
        if (a < 1) return false;
        if (a == 1 || a == 2) return true;
        for (int i = 2 ; i < a ; i ++)
        {
            if ( a % i == 0)
                dem++;
        }        
        if (dem != 0)
            return false;
        return true;
    }
    
    private void btnToDenNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToDenNTActionPerformed
        // Button To den so nguyen to
        //Ctrl + A, select tat ca phan tu trong JList de them index vao ls[]
        int[] ls = new int[100];
        int j = 0;
        for (int i = 0 ; i < jList1.getModel().getSize() ; i++ )
        {
            //Neu phan tu thu i trong jlist la SNT
            if (ktnt(Integer.parseInt(jList1.getModel().getElementAt(i))))
            {
                ls[j] = i;
                j++;
            }
        }
        int[] a = new int[j];
        for (int i = 0 ; i < j; i++)
            a[i] = ls[i];
        jList1.setSelectedIndices(a);
    }//GEN-LAST:event_btnToDenNTActionPerformed

    private void btnBoToDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoToDenActionPerformed
        // Button bo to den
        jList1.clearSelection();
    }//GEN-LAST:event_btnBoToDenActionPerformed

    private void btnXoaToDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaToDenActionPerformed
        // Button xoa gia tri to den        
        DefaultListModel model = (DefaultListModel) jList1.getModel();

        if(this.jList1.getSelectedIndices().length > 0) 
        {
                int[] selectedIndices = jList1.getSelectedIndices();
                //Dem nguoc tu duoi len
                for (int i = selectedIndices.length-1; i >=0; i--) 
                {
                    model.removeElementAt(selectedIndices[i]);
                } 
        } 
    }//GEN-LAST:event_btnXoaToDenActionPerformed

    private void btnTongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTongMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTongMouseClicked

    private void txtNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNhapActionPerformed

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
            java.util.logging.Logger.getLogger(BaiTap04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTap04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTap04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTap04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTap04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoToDen;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnToDenChan;
    private javax.swing.JButton btnToDenLe;
    private javax.swing.JButton btnToDenNT;
    private javax.swing.JButton btnTong;
    private javax.swing.JButton btnXoaToDen;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNhap;
    // End of variables declaration//GEN-END:variables
}
