
package airlineresevation;

import static airlineresevation.myvariables.password;
import static airlineresevation.myvariables.path;
import static airlineresevation.myvariables.place;
import static airlineresevation.myvariables.username;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Update_Cust extends javax.swing.JInternalFrame implements myvariables {

   
    File myfile;
    String pic = "";
    public Update_Cust() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("UPDATE CUSTOMER");
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

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 86, 51));

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 82, 51));

        jLabel7.setText("ADDRESS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("MALE");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jLabel2.setText("Customer_NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel5.setText("D_O_B");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jButton1.setText("SEARCH BY ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 120, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("FEMALE");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 192, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 192, -1));

        jLabel3.setText("Father_NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 192, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 186, -1));

        jLabel1.setText("Customer_ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 186, -1));

        jButton4.setText("SEARCH BY NAME");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel6.setText("                                SEARCH BY NAME LIST");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 604, 36));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER ID", "NAME", "FATHER'S NAME", "GENDER", "DOB", "ADDRESS"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 660, 290));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 110, 120));

        jButton5.setText("Change Image");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlineresevation/images/No title(47).jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 250, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try
            {
                Connection myconnection;
            
                myconnection=DriverManager.getConnection(path+place,username, password);
                
                try
                {
                    String q="select * from custdetail where custid=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jTextField1.getText());
                    ResultSet myresult=mystatement.executeQuery();
                     if(myresult.next())
                    {
                      jLabel8.setIcon(new ImageIcon(ImageIO.read(new File(myresult.getString("images")))));
                       jTextField2.setText(myresult.getString("custname"));
                         jTextField3.setText(myresult.getString("fname"));
                       
                          jDateChooser1.setDate(myresult.getDate("dob"));
                          jTextArea1.setText(myresult.getString("address"));
                           if(myresult.getString("gender").equals("Male"))
                   {
                      jRadioButton1.setSelected(true);
                   }
                   else 
                   {
                      jRadioButton2.setSelected(true);
                   }
                   
                    }
                  else
                     {
                         JOptionPane.showMessageDialog(rootPane, "Wrong Customer ID/No Records", "Error",JOptionPane.ERROR_MESSAGE);
                         jTextArea1.setText("");
                         jTextField1.setText("");
                         jTextField2.setText("");
                         jTextField3.setText("");
                         buttonGroup1.clearSelection();
                         jLabel8.setText("");
                         jDateChooser1.setDate(null);
                     }
                
                        
                    jScrollPane2.setVisible(false);
                    getContentPane().validate();
                    
                    
                  
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String filename="";
                
        if(myfile!=null){
         filename = "images\\"+new Date().getTime() + "_" + myfile.getName();//Date.getTime() added for unique file name.
        int i;
        FileInputStream rd = null;
        FileOutputStream outs = null;
        try {

            rd = new FileInputStream(myfile);
            outs = new FileOutputStream(filename);//writing the new file in 'Images' folder, in the project

            byte[] b = new byte[2048];
            while ((i = rd.read(b)) > 0) {
                outs.write(b, 0, i);

            }
            JOptionPane.showMessageDialog(rootPane, "File saved");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
        } finally {
            try {
                rd.close();
                outs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "error in closing file" + e.getMessage());
            }
        }
        }else
        {
            filename="images\\default.JPG";
        
        }

        try
            {
                Connection myconnection;
            
                myconnection=DriverManager.getConnection(path+place,username, password);
                
                try
                {
                    String q="update custdetail set custname=?,fname=?,gender=?,dob=?,address=?,images=? where custid=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jTextField2.getText());
                       mystatement.setString(2,jTextField3.getText());
                   if(jRadioButton1.isSelected())
                   {
                        mystatement.setString(3, "Male");
                   }
                   else if(jRadioButton2.isSelected())
                   {
                        mystatement.setString(3, "Female");
                   }
                   SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                  String dob=myformat.format(jDateChooser1.getDate());
                   mystatement.setString(4,dob);
                   mystatement.setString(5,jTextArea1.getText());
                   mystatement.setString(6,filename);
                   mystatement.setString(7,jTextField1.getText());
                 mystatement.executeUpdate();
                  JOptionPane.showMessageDialog(rootPane, "Update Successful", "Success",JOptionPane.INFORMATION_MESSAGE);
                  
                   try
                {
                    String p="select * from custdetail where custname=?";
                    PreparedStatement mystatement1=myconnection.prepareStatement(p);
                 mystatement1.setString(1,jTextField2.getText());
                    ResultSet myresult=mystatement1.executeQuery();
                     DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
                     mymodel.setNumRows(0);
                      
                     if(myresult.next())
                    {
                        jScrollPane2.setVisible(true);
                      getContentPane().validate();
                        do
                        {
                            String custid=myresult.getString("custid");
                            String custname=myresult.getString("custname");
                            String address=myresult.getString("address");
                            String dob1=myresult.getString("dob");
                            String fname=myresult.getString("fname");
                            String gender=myresult.getString("gender");
                            mymodel.addRow(new Object[]{custid,custname,fname,gender,dob1,address});
                            
                            
                            
                        }
                        while(myresult.next());
                           
                    }
                  else
                     {
                           jScrollPane2.setVisible(false);
                      getContentPane().validate();
                      
                         JOptionPane.showMessageDialog(rootPane, "Wrong Customer Name/No Records", "Error",JOptionPane.ERROR_MESSAGE);
                         
                     }
                
                
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
//                  jTextField1.setText("");
//                    jTextField2.setText("");
//                          jTextField3.setText("");
//                          buttonGroup1.clearSelection();
//                          jDateChooser1.setDate(null);
//                          jTextArea1.setText("");
//                          jTextField1.setText("");
                 
           
               
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      try
            {
                Connection myconnection;
              
                myconnection=DriverManager.getConnection(path+place, username,password);
                
                try
                {
                    String q="delete from custdetail where custid=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jTextField1.getText());
                  
              int a=  JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete?", "Deletion", JOptionPane.YES_NO_OPTION);
               
                if(a==JOptionPane.YES_OPTION)
                {
                    mystatement.executeUpdate();
                     JOptionPane.showMessageDialog(rootPane, "Deleted Successfully", "Customer details Deletion", JOptionPane.INFORMATION_MESSAGE);
                       jTextField2.setText("");
                          jTextField3.setText("");
                          buttonGroup1.clearSelection();
                          jDateChooser1.setDate(null);
                          jTextArea1.setText("");
                          jTextField1.setText("");
                 try
                {
                    String p="select * from custdetail where custname=?";
                    PreparedStatement mystatement1=myconnection.prepareStatement(p);
                 mystatement1.setString(1,jTextField2.getText());
                    ResultSet myresult=mystatement1.executeQuery();
                     DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
                     mymodel.setNumRows(0);
                      
                     if(myresult.next())
                    {
                        jScrollPane2.setVisible(true);
                      getContentPane().validate();
                        do
                        {
                            String custid=myresult.getString("custid");
                            String custname=myresult.getString("custname");
                            String address=myresult.getString("address");
                            String dob1=myresult.getString("dob");
                            String fname=myresult.getString("fname");
                            String gender=myresult.getString("gender");
                            mymodel.removeRow(myresult.getInt(custname));
                            
                        }
                        while(myresult.next());
                           
                    }
                  else
                     {
                           jScrollPane2.setVisible(true);
                      getContentPane().validate();
                         JOptionPane.showMessageDialog(rootPane, "No Records", "Error",JOptionPane.ERROR_MESSAGE);
                     }
                
                
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
                          
                     
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place,username, password);

            try
            {
                if(!jTextField2.getText().equals(""))
                {
                String q="select * from custdetail where custname like ?";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                mystatement.setString(1,jTextField2.getText()+ "%");
                ResultSet myresult=mystatement.executeQuery();
                      DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
                      mymodel.setNumRows(0);
                if(myresult.next())
                {

              jScrollPane2.setVisible(true);
              getContentPane().validate();
                    do
                    {
                        String custid=myresult.getString("custid");
                        String custname=myresult.getString("custname");
                        String address=myresult.getString("address");
                        String dob=myresult.getString("dob");
                        String fname=myresult.getString("fname");
                        String gender=myresult.getString("gender");
                        mymodel.addRow(new Object[]{custid,custname,fname,gender,dob,address});

                    }
                    while(myresult.next());

                }
                }
                else
                {
                    jScrollPane2.setVisible(false);
                    getContentPane().validate();
                    JOptionPane.showMessageDialog(rootPane, "Wrong Customer ID/No Records", "Error",JOptionPane.ERROR_MESSAGE);
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int column=0;
        int row=jTable1.getSelectedRow();

        String custid=jTable1.getValueAt(row, column).toString();
        try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place,username, password);

            try
            {
                String q="select * from custdetail where custid=?";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                mystatement.setString(1,custid);
                ResultSet myresult=mystatement.executeQuery();
                if(myresult.next())
                {
                     jLabel8.setIcon(new ImageIcon(ImageIO.read(new File(myresult.getString("images")))));
                    jTextField1.setText(myresult.getString("custid"));
                    jTextField2.setText(myresult.getString("custname"));
                    jTextField3.setText(myresult.getString("fname"));
                    if(myresult.getString("gender").equals("Male"))
                    {
                        jRadioButton1.setSelected(true);
                    }
                    else
                    {
                        
                        jRadioButton2.setSelected(true);
                    }

                    jDateChooser1.setDate(myresult.getDate("dob"));
                    jTextArea1.setText(myresult.getString("address"));
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

    }//GEN-LAST:event_jTable1MouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       jScrollPane2.setVisible(false);
       getContentPane().validate();
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        fc = new JFileChooser();

        fc.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                int pos = f.getName().lastIndexOf('.');
                if (pos == -1) {
                    return false;
                } else {
                    String extention = f.getName().substring(pos + 1);//saving the extension
                    String str[] = {"gif", "png", "jpg", "jpeg"};//allowed extentions
                    for (String allwd : str) {

                        if (extention.equalsIgnoreCase(allwd)) {
                            return true;
                        }
                    }
                    return false;
                }

            }

            @Override
            public String getDescription() {

                return "";
            }
        });
        int result = fc.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            myfile = fc.getSelectedFile();

            try {
                jLabel8.setIcon(new ImageIcon(ImageIO.read(myfile)));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Error");
                e.printStackTrace();
            }
        }
                                  
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
