
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class AddMoney extends javax.swing.JFrame {

    /**
     * Creates new form AddMoney
     */
    CabBooking wb;
    public AddMoney(CabBooking w) {
    wb=w;
    initComponents();
    /*ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Wallet.png")));
    Image img1=myimage.getImage();
    Image img2=img1.getScaledInstance(jLabel3.getWidth(),jLabel3.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon i=new ImageIcon(img2);
    jLabel3.setIcon(i);
    */
    
    this.setLocationRelativeTo(null); //centre allignment
    }
    
    boolean check(String amt)
    {
        String amount = null;
        amount = amt;
        try    
        {
            Float.parseFloat(amount);
        }
        
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        confirm = new javax.swing.JButton();
        jLabelWallet = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add_amount = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        thousand = new javax.swing.JButton();
        threehundred = new javax.swing.JButton();
        fivehundred = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirm.setBackground(new java.awt.Color(34, 167, 240));
        confirm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel2.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 430, 160, 50));

        jLabelWallet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelWallet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWallet.setText("Return to Wallet");
        jLabelWallet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelWalletMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelWallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 230, 60));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setText("             Enter Amount to be Added : ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 620, 40));

        add_amount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(add_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 360, 40));

        jPanel3.setBackground(new java.awt.Color(96, 101, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(4, 660));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Desktop\\Images_OOP\\wallet2.png")); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 470, 610));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 620, 960));

        thousand.setBackground(new java.awt.Color(34, 167, 240));
        thousand.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        thousand.setForeground(new java.awt.Color(255, 255, 255));
        thousand.setText("Rs 1000");
        thousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thousandActionPerformed(evt);
            }
        });
        jPanel2.add(thousand, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 260, 160, 50));

        threehundred.setBackground(new java.awt.Color(34, 167, 240));
        threehundred.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        threehundred.setForeground(new java.awt.Color(255, 255, 255));
        threehundred.setText("Rs 300");
        threehundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threehundredActionPerformed(evt);
            }
        });
        jPanel2.add(threehundred, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 160, 50));

        fivehundred.setBackground(new java.awt.Color(34, 167, 240));
        fivehundred.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        fivehundred.setForeground(new java.awt.Color(255, 255, 255));
        fivehundred.setText("Rs 500");
        fivehundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivehundredActionPerformed(evt);
            }
        });
        jPanel2.add(fivehundred, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 160, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1650, 960));

        jPanel1.setBackground(new java.awt.Color(15, 36, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Money");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1548, 92));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed

        String amount = add_amount.getText();
        float finalamt=0;
        int response = 1;
        
        if(check(amount) && (Float.parseFloat(amount) < 100000)&&(Float.parseFloat(amount) > 0)){
        response= JOptionPane.showConfirmDialog(null,
                                 "Are you sure you want to add Rs " + amount, "Please select",
                                 JOptionPane.YES_NO_OPTION);}
        else
        {
            JOptionPane.showMessageDialog(null,"Amount entered should be a valid number and less than 100000 ");
        }
        if (response==0)
        {
        float amt = Float.parseFloat(amount);
        if(amt<=0)
        {
            JOptionPane.showMessageDialog(null, "Please Enter a valid Amount");
        }
        else
        {
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdetails","root","bits@123")) {
                PreparedStatement ps = conn.prepareStatement("select Balance from cdetails  where uName=?");
                ps.setString(1,wb.userName);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                finalamt = rs.getFloat(1);
                finalamt = amt + finalamt;
               
            }
            String str = ( "update cdetails set Balance ="+ finalamt +" where uName=?");
            ps=conn.prepareStatement(str);
            ps.setString(1,wb.userName);
            ps.execute();
            add_amount.setText("");
            
            }}
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        }
    }//GEN-LAST:event_confirmActionPerformed

    
    private void jLabelWalletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelWalletMouseClicked
        Wallet w = new Wallet(wb);
        w.setVisible(true);
        w.pack();
        w.setLocationRelativeTo(null);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelWalletMouseClicked

    private void thousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thousandActionPerformed
    add_amount.setText(Integer.toString(1000));       
    }//GEN-LAST:event_thousandActionPerformed

    private void threehundredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threehundredActionPerformed
    add_amount.setText(Integer.toString(300));       
    }//GEN-LAST:event_threehundredActionPerformed

    private void fivehundredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivehundredActionPerformed
    add_amount.setText(Integer.toString(500));       
    }//GEN-LAST:event_fivehundredActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       // //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(() -> {
      //      new AddMoney().setVisible(true);
        //});
    //}*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_amount;
    private javax.swing.JButton confirm;
    private javax.swing.JButton fivehundred;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelWallet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton thousand;
    private javax.swing.JButton threehundred;
    // End of variables declaration//GEN-END:variables
}
