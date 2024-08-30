/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cgpa.generator;
import java.awt.Desktop;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author SCC
 */
public class DisplayEEE extends javax.swing.JFrame {

    /**
     * Creates new form Tab
     */
    public DisplayEEE() {
        initComponents();
        //setUndecorated(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cgpa/generator/aust logo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CGPA Generator");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to AUST");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 35));

        jComboBox1.setBackground(new java.awt.Color(204, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 1st year, 1st semester (1.1)", " 1st year, 2nd semester (1.2)", " 2nd year, 1st semester (2.1)", " 2nd year, 2nd semester (2.2)", " 3rd year, 1st semester (3.1)", " 3rd year, 2nd semester (3.2)", " 4th year, 1st semester (4.1)", " 4th year, 2nd semester (4.2)" }));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButton1.setText("EEE Dept. Website");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 120, -1));

        jButton2.setText("Back");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 40, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cgpa/generator/austBG.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 400));

        setSize(new java.awt.Dimension(605, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem() == " 1st year, 1st semester (1.1)" || jComboBox1.getSelectedItem() == " 2nd year, 1st semester (2.1)" || jComboBox1.getSelectedItem() == " 2nd year, 2nd semester (2.2)")
        {  
            this.setVisible(false);
            new DataInput2().setVisible(true);
            Credit.setTotal_credit(21.00);
            Credit.setDept("Dept. E.E.E., 1st year, 1st semester");
        }
        else if(jComboBox1.getSelectedItem() == " 1st year, 2nd semester (1.2)")
        {
            this.setVisible(false);
            new DataInput5().setVisible(true);
            Credit.setTotal_credit(19.5);
            Credit.setDept("Dept. E.E.E., 1st year, 2nd semester");
        }
        else if(jComboBox1.getSelectedItem() == " 2nd year, 1st semester (2.1)")
        {  
            this.setVisible(false);
            new DataInput2().setVisible(true);
            Credit.setTotal_credit(21.00);
            Credit.setDept("Dept. E.E.E., 2nd year, 1st semester");
        }
        else if(jComboBox1.getSelectedItem() == " 2nd year, 2nd semester (2.2)")
        {  
            this.setVisible(false);
            new DataInput2().setVisible(true);
            Credit.setTotal_credit(21.00);
            Credit.setDept("Dept. E.E.E., 2nd year, 2nd semester");
        }
        
        else if(jComboBox1.getSelectedItem() == " 3rd year, 1st semester (3.1)")
        {
            this.setVisible(false);
            new DataInput5().setVisible(true);
            Credit.setTotal_credit(19.5);
            Credit.setDept("Dept. E.E.E., 3rd year, 1st semester");
        }
        else if(jComboBox1.getSelectedItem() == " 3rd year, 2nd semester (3.2)")
        {
            this.setVisible(false);
            new DataInput5().setVisible(true);
            Credit.setTotal_credit(19.5);
            Credit.setDept("Dept. E.E.E., 3rd year, 2nd semester");
        }
        else if(jComboBox1.getSelectedItem() == " 4th year, 1st semester (4.1)")
        {
            new DataInput2().setVisible(true);
            this.setVisible(false);
            Credit.setTotal_credit(22.5);
            Credit.setDept("Dept. E.E.E., 4th year, 1st semester");
        }
        else if(jComboBox1.getSelectedItem() == " 4th year, 2nd semester (4.2)")
        {
            new DataInput5().setVisible(true);
            this.setVisible(false);
            Credit.setTotal_credit(21.00);
            Credit.setDept("Dept. E.E.E., 4th year, 2nd semester");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL("https://www.aust.edu/eee").toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Display2().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * @param args the command line arguments
     */ //private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisplayEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DisplayEEE().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
