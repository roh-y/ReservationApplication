

package airlineresevation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class changepwd extends javax.swing.JInternalFrame implements myvariables{

  
    public changepwd() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();

        setClosable(true);

        jLabel1.setText("Old Password");

        jLabel2.setText("New Password");

        jLabel3.setText("Retype New Password");

        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 139, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(95, 95, 95)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(90, 90, 90)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(52, 52, 52)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(jButton1)))
                    .addGap(0, 140, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 121, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50)
                    .addComponent(jButton1)
                    .addGap(0, 122, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place, username, password);

            try
            {
                String q="select * from newuser where pwd=?";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                mystatement.setString(1,jPasswordField1.getText());

                ResultSet myresult=mystatement.executeQuery();
                if(myresult.next())
                {
                    myglobalclass.pwd=jPasswordField1.getText();
                    if(myglobalclass.pwd.equals(myresult.getString("pwd")))
                    {
                        String p="update newuser set pwd=?";

                        PreparedStatement mystatement1=myconnection.prepareStatement(p);
                        mystatement1.setString(1,jPasswordField2.getText());
                        if(jPasswordField2.getText().equals(jPasswordField3.getText()))
                        {
                            mystatement1.executeUpdate();
                            JOptionPane.showMessageDialog(rootPane, "password changed", "Success",JOptionPane.INFORMATION_MESSAGE);
                            jPasswordField1.setText("");
                            jPasswordField2.setText("");
                            jPasswordField3.setText("");

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane, "Password isn't retyped correctly", "Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Old Password isn't correct", "Error",JOptionPane.ERROR_MESSAGE);
                }

                //                    else
                //                    {
                    //
                    //
                    //                             String q2="select * from employeetable where username=? and password=?";
                    //                              PreparedStatement mystatement1=myconnection.prepareStatement(q2);
                    //                          mystatement1.setString(1,jTextField1.getText());
                    //                         mystatement1.setString(2,jPasswordField1.getText());
                    //                           ResultSet myresult1=mystatement1.executeQuery();
                    //                         if(myresult1.next())
                    //                         {
                        //                             myglobalclass.uname=jTextField1.getText();
                        //                          parentframe2 obj=new parentframe2();
                        //                             obj.setExtendedState(MAXIMIZED_BOTH);
                        //                          this.dispose();
                        //                            obj.setVisible(true);
                        //                            }
                    //                             else
                    //                             {
                        //                             JOptionPane.showMessageDialog(rootPane, "Wrong username/passsword", "Error",JOptionPane.ERROR_MESSAGE);
                        //                             }
                    //                    }
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
