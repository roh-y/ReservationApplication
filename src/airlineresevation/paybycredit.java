
package airlineresevation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class paybycredit extends javax.swing.JInternalFrame {

 
    public paybycredit() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CREDIT CARD PAYMENT");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Credit Card No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 179, -1));

        jLabel2.setText("CVV CODE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel3.setText("Expiry Year");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel4.setText("Card Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 179, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 179, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT CARD TYPE", "VISA", "MASTER CARD", "MAESTRO" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 179, -1));

        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 129, 49));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlineresevation/images/No title(43).jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 370, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
            {
                Connection myconnection;
                String path="jdbc:mysql://localhost/";
                String place="airlinedatabase";
                myconnection=DriverManager.getConnection(path+place, "root", "");
                
                try
                {
                    String q="insert into paybycredit values(?,?,?,?)";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jTextField1.getText());
                    mystatement.setString(2, jTextField2.getText());
                     mystatement.setString(3, jTextField3.getText());
                      mystatement.setString(4, jComboBox1.getSelectedItem().toString());
                
                 
                    mystatement.executeUpdate();
                   
                         JOptionPane.showMessageDialog(rootPane, "PAYMENT SUCCESSFUL", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
//                         jTextField1.setText("");
//                     jTextField2.setText("");
//                      jTextField3.setText("");
//                     jComboBox1.setSelectedIndex(0);
                         this.dispose();
                         Payment_Det obj=new Payment_Det();
                         obj.dispose();
                           JOptionPane.showMessageDialog(rootPane, "Ticket Booked...Have a Nice Day", "Booking Status", JOptionPane.INFORMATION_MESSAGE);
                   
                   
                  
                   
                  
                    
                   
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    myconnection.close();
                }
            }
        catch(Exception e)
        {
         e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Error in connection" +e.getMessage());
    }                                
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
