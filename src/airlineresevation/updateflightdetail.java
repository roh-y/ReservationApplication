

package airlineresevation;

import static airlineresevation.myvariables.password;
import static airlineresevation.myvariables.path;
import static airlineresevation.myvariables.place;
import static airlineresevation.myvariables.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class updateflightdetail extends javax.swing.JInternalFrame implements myvariables{

    public updateflightdetail() {
        initComponents();
    }
 


        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Flight Details");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 290, 140, -1));

        jLabel8.setText("Destination");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 236, -1, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 337, 140, -1));

        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 120, 50));

        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 120, 50));

        jLabel9.setText("Arrival_TIME");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 293, -1, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 290, 168, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 177, 140, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 135, 140, -1));

        jLabel6.setText("Flight_CHARGES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 340, -1, -1));

        jLabel4.setText("Departure");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 293, -1, -1));

        jLabel3.setText("Source");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 236, -1, -1));

        jLabel1.setText("Flight_ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 138, -1, -1));

        jLabel2.setText("Flight_NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 180, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Source" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 233, 130, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Destination" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 233, 165, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 337, 178, 29));

        jLabel5.setText("DateOfDeparture");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 340, -1, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 100, 30));

        setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try
            {
                Connection myconnection;
              
                myconnection=DriverManager.getConnection(path+place, username,password);
                
                try
                {
                    String q="delete from flightdetail where flighid=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jTextField1.getText());
                  
                JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete?", "Deletion", JOptionPane.YES_NO_OPTION);
                int a=JOptionPane.YES_OPTION;
                if(a==JOptionPane.YES_OPTION)
                {
                    mystatement.executeUpdate();
                     JOptionPane.showMessageDialog(rootPane, "Deleted Successfully", "Customer details Deletion", JOptionPane.INFORMATION_MESSAGE);
                        jTextField2.setText("");
                        jTextField1.setText("");
                       jComboBox1.setSelectedIndex(0);
                       jComboBox2.setSelectedIndex(0);
                       jTextField4.setText("");
                       jTextField6.setText("");
                      
                       jTextField9.setText("");
                       jDateChooser1.setDate(null);
                     
                }
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       try
        {
              Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place, username, password);

            try
            {
                String q="select * from sourcetable";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                ResultSet myresult=mystatement.executeQuery();
                
                if(myresult.next())
                {
                    do
                    {
                        jComboBox1.addItem(myresult.getString("source"));
                    }
                    while(myresult.next());
                }
                 String p="select * from destination";
                PreparedStatement mystatement1=myconnection.prepareStatement(p);
                ResultSet myresult1=mystatement1.executeQuery();
                
                if(myresult1.next())
                {
                    do
                    {
                        jComboBox2.addItem(myresult1.getString("destination"));
                    }
                    while(myresult1.next());
                }
               
                  
                       
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
               
            
          
            
            
            
    }//GEN-LAST:event_formInternalFrameActivated

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try
            {
                Connection myconnection;
            
                myconnection=DriverManager.getConnection(path+place,username, password);
                
                try
                {
                    String q="select * from flightdetail where flighid=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jTextField1.getText());
                    ResultSet myresult=mystatement.executeQuery();
                     if(myresult.next())
                    {
                     
                       jTextField2.setText(myresult.getString("flightname"));
                      jComboBox1.setSelectedItem(myresult.getString("source"));
                      jComboBox2.setSelectedItem(myresult.getString("dest"));
                         jTextField4.setText(myresult.getString("dept"));
                           jTextField6.setText(myresult.getString("fligchrges"));
                        
                        jTextField9.setText(myresult.getString("arrtym"));
                           jDateChooser1.setDate(myresult.getDate("dod"));
                    }
                  else
                     {
                        JOptionPane.showMessageDialog(rootPane, "No Records because of wrong FlightId", "Error",JOptionPane.ERROR_MESSAGE); 
                     }       
                  
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      try
            {
                Connection myconnection;
            
                myconnection=DriverManager.getConnection(path+place,username, password);
                
                try
                {
                    String q="update flightdetail set flightname=?,source=?,dept=?,fligchrges=?,dest=?,arrtym=?,dod=? where flighid=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                   mystatement.setString(1, jTextField2.getText());
                    mystatement.setString(2,jComboBox1.getSelectedItem().toString());
                       mystatement.setString(3, jTextField4.getText());
                     mystatement.setString(4, jTextField6.getText());
                   mystatement.setString(5, jComboBox2.getSelectedItem().toString());
                       
                       mystatement.setString(6, jTextField9.getText());
                   SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                  String dod=myformat.format(jDateChooser1.getDate());
                   mystatement.setString(7,dod);
                 mystatement.setString(8,jTextField1.getText());
                 mystatement.executeUpdate();
                  JOptionPane.showMessageDialog(rootPane, "Update Successful", "Success",JOptionPane.INFORMATION_MESSAGE);
                  jTextField1.setText("");
                   jTextField2.setText("");
                       jComboBox1.setSelectedIndex(0);
                       jComboBox2.setSelectedIndex(0);
                       jTextField4.setText("");
                       jTextField6.setText("");
                      
                       jTextField9.setText("");
                       jDateChooser1.setDate(null);
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
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
