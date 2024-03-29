/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CipherSchemes_Abellana;

import javax.swing.JOptionPane;

/**
 *
 * @author avigracx
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CipherSchemes_JFrame
     */
    public MainJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CaesarButton = new javax.swing.JButton();
        VigenereButton = new javax.swing.JButton();
        ExitMain = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CaesarButton.setBorder(null);
        CaesarButton.setBorderPainted(false);
        CaesarButton.setContentAreaFilled(false);
        CaesarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaesarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CaesarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 340, 70));

        VigenereButton.setToolTipText("");
        VigenereButton.setBorderPainted(false);
        VigenereButton.setContentAreaFilled(false);
        VigenereButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VigenereButtonActionPerformed(evt);
            }
        });
        jPanel1.add(VigenereButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 340, 70));

        ExitMain.setContentAreaFilled(false);
        ExitMain.setDefaultCapable(false);
        ExitMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMainActionPerformed(evt);
            }
        });
        jPanel1.add(ExitMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CipherSchemes_Abellana/CIPHER SCHEME.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CaesarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaesarButtonActionPerformed
        CaesarJFrame caesarFrame = new CaesarJFrame();
        caesarFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CaesarButtonActionPerformed

    private void VigenereButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VigenereButtonActionPerformed
        VigenereJFrame vigenereFrame = new VigenereJFrame();
        vigenereFrame.setVisible(true);
        this.dispose();                   
    }//GEN-LAST:event_VigenereButtonActionPerformed

    private void ExitMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMainActionPerformed
        int exitMain = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", 
                                                     "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (exitMain == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
    }//GEN-LAST:event_ExitMainActionPerformed

   
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CaesarButton;
    private javax.swing.JButton ExitMain;
    private javax.swing.JButton VigenereButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
