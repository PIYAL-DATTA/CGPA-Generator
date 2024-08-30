/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa.generator;

import static cgpa.generator.Credit.getTotal_credit;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

/**
 *
 * @author SCC
 */
public class CSE_3_1 extends javax.swing.JFrame {

    /**
     * Creates new form DataInput7
     */
    
    Connection con =  null;//connect.connectdb();
    PreparedStatement ps = null;
    ResultSet rs = null;
    String cgpa_s;
    double cgpa_d;
    
    public CSE_3_1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please enter your Subject score carefully");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel2.setText("NAME : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel3.setText("CSE 3103 : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel4.setText("HUM 3115 : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel5.setText("CSE 3101 : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel6.setText("CSE 3109 : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel7.setText("CSE 3117 : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel8.setText("CSE 3104 : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel9.setText("CSE 3110 : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 107, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 107, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 107, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 107, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 107, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 104, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 104, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 104, -1));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jLabel10.setText("CSE 3118 : ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 104, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CSE 3100 : ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 104, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cgpa/generator/BG1_1.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int Piyal = 1, Mushroof = 1;
     public double compare(double grade){
        if(grade >= 80)
            return 4.00;
        else if(grade >= 75)
            return 3.75;
        else if(grade >= 70)
            return 3.50;
        else if(grade >= 65)
            return 3.25;
        else if(grade >= 60)
            return 3.00;
        else if(grade >= 55)
            return 2.75;
        else if(grade >= 50)
            return 2.50;
        else if(grade >= 45)
            return 2.25;
        else if(grade >= 40)
            return 2.00;
        else if(grade < 0)
            return -1;
        else
        {
            return 0;
        }
    }
    public void cheak(String str){
       try {
                double num = Double.parseDouble(str);
                Piyal = 1;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(CSE_3_1.this, "Enter value / proper value", "ERROR", 0);
                Mushroof = 0;
            }
    }
    
    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        cheak(jTextField2.getText());
        cheak(jTextField3.getText());
        cheak(jTextField4.getText());
        cheak(jTextField5.getText());
        cheak(jTextField6.getText());
        cheak(jTextField7.getText());
        cheak(jTextField8.getText());
        cheak(jTextField9.getText());
        cheak(jTextField10.getText());

       
        if(Piyal != 0 && Mushroof != 0) {
        //For Subject

        String s1 = jTextField2.getText();
        double n1 = Double.parseDouble(s1);
        String s2 = jTextField3.getText();
        double n2 = Double.parseDouble(s2);
        String s3 = jTextField4.getText();
        double n3 = Double.parseDouble(s3);
        String s4 = jTextField5.getText();
        double n4 = Double.parseDouble(s4);
        String s5 = jTextField6.getText();
        double n5 = Double.parseDouble(s5);
        String s6 = jTextField7.getText();
        double n6 = Double.parseDouble(s6);
        String s7 = jTextField8.getText();
        double n7 = Double.parseDouble(s7);
        String s8 = jTextField9.getText();
        double n8 = Double.parseDouble(s8);
        String s9 = jTextField10.getText();
        double n9 = Double.parseDouble(s9);

        //For grade cheaking
        double g1 = compare(n1);
        double g2 = compare(n2);
        double g3 = compare(n3);
        double g4 = compare(n4);
        double g5 = compare(n5);
        double g6 = compare(n6);
        double g7 = compare(n7);
        double g8 = compare(n8);
        double g9 = compare(n9);

        //Fail cheaking
        if(g1 == 0 || g2 == 0 ||g3 == 0 || g4 == 0 || g5 == 0 || g6 == 0 || g7 == 0 || g8 == 0 || g9 == 0)
        {
            new Fail().setVisible(true);
            this.setVisible(false);
        }
        else if(n1 < 0 || n2 < 0 || n3 < 0 || n4 < 0 || n5 < 0 || n6 < 0 || n7 < 0 || n8 < 0 || n9 < 0)
            {
                JOptionPane.showMessageDialog(CSE_3_1.this, "Enter proper value", "ERROR", 0);
            }
        else if(n1 > 100 || n2 > 100 || n3 > 100 || n4 > 100 || n5 > 100 || n6 > 100 || n7 > 100 || n8 > 100 || n9 > 100)
            {
                JOptionPane.showMessageDialog(CSE_3_1.this, "Enter proper value", "ERROR", 0);
            }
           
        else
        {
        //Grade calculation
        double cgpa = (g1*3.00 + g2*3.00 + g3*3.00 + g4*3.00 + g5*3.00 + g6*1.5 + g7*0.75 + g8*0.75 + g9*0.75)/getTotal_credit();
        int cgpa_int = (int) (cgpa*1000);
        cgpa_d = (double) (cgpa_int/1000.00);
        if(cgpa_d > 4)
        {
            JOptionPane.showMessageDialog(CSE_3_1.this, "Enter proper value", "ERROR", 0);
        }
        else{
        //String cgpa_s;
        cgpa_s = String.valueOf(cgpa_d);
        this.setVisible(false);
        new DataOutput(cgpa_s).setVisible(true);
        //setVisible(false);
        }
        }
        }
        
        Piyal = 1; Mushroof = 1;
        if(cgpa_d > 0)
        {
        try {
            try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/CGPA_info", "piyal", "204204204");
                } catch (SQLException ex) {
            System.out.println("Coonect 1st");
            }
            
            String name = jTextField1.getText();

            String sql = "INSERT INTO PIYAL.STUDENTS_CGPA VALUES (?, ?, ?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, jTextField1.getText());
            ps.setString(2, cgpa_s);
            ps.setString(3, "Dept. C.S.E., 3rd year, 1st semester");
            
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(CSE_3_1.this, "Something wrong. Try Again", "ERROR", 0);
    }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        new Display2().setVisible(true);
        this.setVisible(false);
        Piyal = 1; Mushroof = 1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
        jTextField5.setText(" ");
        jTextField6.setText(" ");
        jTextField7.setText(" ");
        jTextField8.setText(" ");
        jTextField9.setText(" ");
        jTextField10.setText(" ");

        Piyal = 1; Mushroof = 1;
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CSE_3_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSE_3_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSE_3_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSE_3_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSE_3_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
