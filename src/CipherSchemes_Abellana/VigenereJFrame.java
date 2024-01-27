/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CipherSchemes_Abellana;

/**
 *
 * @author avigracx
 */
import static CipherSchemes_Abellana.Programming_Practice2_CipherSchemes_Abellana.decryptVigenereCipher;
import static CipherSchemes_Abellana.Programming_Practice2_CipherSchemes_Abellana.encryptCaesarCipher;
import static CipherSchemes_Abellana.Programming_Practice2_CipherSchemes_Abellana.encryptVigenereCipher;
import java.util.Scanner;
public class VigenereJFrame extends javax.swing.JFrame {
    Scanner in = new Scanner (System.in);
    private String input, keyword;
    
    /**
     * Creates new form VigenereJFrame
     */
    public VigenereJFrame() {
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
        BackOpt = new javax.swing.JButton();
        ClearOpt = new javax.swing.JButton();
        DecryptOpt = new javax.swing.JButton();
        EncryptOpt = new javax.swing.JButton();
        PlainMessageField = new javax.swing.JTextField();
        KeywordField = new javax.swing.JTextField();
        ResultField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackOpt.setToolTipText("");
        BackOpt.setBorderPainted(false);
        BackOpt.setContentAreaFilled(false);
        BackOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackOptActionPerformed(evt);
            }
        });
        jPanel1.add(BackOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 523, 130, 30));

        ClearOpt.setBorderPainted(false);
        ClearOpt.setContentAreaFilled(false);
        ClearOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearOptActionPerformed(evt);
            }
        });
        jPanel1.add(ClearOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 90, 30));

        DecryptOpt.setBorderPainted(false);
        DecryptOpt.setContentAreaFilled(false);
        DecryptOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptOptActionPerformed(evt);
            }
        });
        jPanel1.add(DecryptOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 120, 30));

        EncryptOpt.setBorderPainted(false);
        EncryptOpt.setContentAreaFilled(false);
        EncryptOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptOptActionPerformed(evt);
            }
        });
        jPanel1.add(EncryptOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, 30));

        PlainMessageField.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        PlainMessageField.setBorder(null);
        PlainMessageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlainMessageFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PlainMessageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 480, 20));

        KeywordField.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        KeywordField.setBorder(null);
        KeywordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeywordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(KeywordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 480, 20));

        ResultField.setEditable(false);
        ResultField.setBackground(new java.awt.Color(255, 255, 255));
        ResultField.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        ResultField.setBorder(null);
        ResultField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultFieldActionPerformed(evt);
            }
        });
        jPanel1.add(ResultField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 480, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CipherSchemes_Abellana/VIGENERE CIPHER.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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

    private void PlainMessageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlainMessageFieldActionPerformed
        input = PlainMessageField.getText().toUpperCase(); 
    }//GEN-LAST:event_PlainMessageFieldActionPerformed

    private void KeywordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeywordFieldActionPerformed
       keyword = KeywordField.getText().toUpperCase(); 
    }//GEN-LAST:event_KeywordFieldActionPerformed

    private void ResultFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultFieldActionPerformed
        String encryptedMessage = encryptCaesarCipher(input, keyword);
        ResultField.setText(encryptedMessage); 
    }//GEN-LAST:event_ResultFieldActionPerformed

    private void EncryptOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptOptActionPerformed
        input = PlainMessageField.getText().toUpperCase(); 
        keyword =KeywordField.getText().toUpperCase(); 
        
        String encryptedMessage = encryptVigenereCipher(input, keyword);

        // Display the encrypted message
        ResultField.setText(encryptedMessage); 
    }//GEN-LAST:event_EncryptOptActionPerformed

    private void DecryptOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptOptActionPerformed
        input = PlainMessageField.getText().toUpperCase(); 
        keyword =KeywordField.getText().toUpperCase(); 
        
        String decryptedMessage = decryptVigenereCipher(input, keyword);

        // Display the encrypted message
        ResultField.setText(decryptedMessage); 
    }//GEN-LAST:event_DecryptOptActionPerformed

    private void ClearOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearOptActionPerformed
        PlainMessageField.setText("");
        KeywordField.setText(""); 
        ResultField.setText(""); 
    }//GEN-LAST:event_ClearOptActionPerformed

    private void BackOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackOptActionPerformed
        MainJFrame MainFrame = new MainJFrame();
        MainFrame.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_BackOptActionPerformed

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
            java.util.logging.Logger.getLogger(VigenereJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VigenereJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VigenereJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VigenereJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VigenereJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackOpt;
    private javax.swing.JButton ClearOpt;
    private javax.swing.JButton DecryptOpt;
    private javax.swing.JButton EncryptOpt;
    private javax.swing.JTextField KeywordField;
    private javax.swing.JTextField PlainMessageField;
    private javax.swing.JTextField ResultField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private String encryptCaesarCipher(String input, String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}