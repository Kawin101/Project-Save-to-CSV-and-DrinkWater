/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//asdasdasdasdas
package program.drink.water;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static program.drink.water.Login.iconTitle1;

/**
 *
 * @author PG
 */
public class In_Login extends javax.swing.JFrame {

    /**
     * Creates new form In_Login
     */
    public In_Login() {
        initComponents();
        
         // setDefaultFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Program Drink Water by : Kawinphop Chomnikorn 633410142-5");
        setLocationRelativeTo(null); //set this JFrame Center 
        
        // setIconJFrame
        iconTitle1 = new ImageIcon("D:\\Programing\\Java\\oopfinalproject63-Kawin101\\src\\program\\drink\\water\\Photo\\Kingmeme.jpg");
        setIconImage(iconTitle1.getImage());
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
        name_button = new javax.swing.JButton();
        drink_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Welcome to Program Kawinphop!");

        name_button.setBackground(new java.awt.Color(192, 212, 76));
        name_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name_button.setForeground(new java.awt.Color(0, 0, 255));
        name_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program/drink/water/Photo/facekawin101.jpg"))); // NOI18N
        name_button.setText("Name!");
        name_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_buttonActionPerformed(evt);
            }
        });

        drink_button.setBackground(new java.awt.Color(53, 229, 255));
        drink_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        drink_button.setForeground(new java.awt.Color(102, 0, 102));
        drink_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program/drink/water/Photo/Drink small.jpg"))); // NOI18N
        drink_button.setText("Drink Water!");
        drink_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink_buttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Please choose choice Name or Drink Water.");

        exit_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit_button.setText("Exit");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(name_button)
                        .addGap(44, 44, 44)
                        .addComponent(drink_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel2)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit_button)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_button)
                    .addComponent(drink_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit_button)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_buttonActionPerformed
       // Close window before
        this.dispose();
        // Create obj class Login
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_name_buttonActionPerformed

    private void drink_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink_buttonActionPerformed
        // Close window before
        this.dispose();
        // Create obj class Drink_Water
        Drink_Water DW = new Drink_Water();
        DW.setVisible(true);
    }//GEN-LAST:event_drink_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
    //ExitButton
        System.exit(0);
        
    }//GEN-LAST:event_exit_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(In_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(In_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(In_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(In_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new In_Login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drink_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton name_button;
    // End of variables declaration//GEN-END:variables
}
