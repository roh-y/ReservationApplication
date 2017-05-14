
package airlineresevation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



public class delemp extends javax.swing.JInternalFrame implements myvariables{

    
     

    public delemp() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Create Employee");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 80, 150, -1));

        jLabel1.setText("USERNAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 83, -1, -1));

        jButton1.setText("DELETE EMPLOYEE");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place, username, password);

            try
            {
                String q="delete from employeetable where username=?";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                mystatement.setString(1,jTextField1.getText());
              int a=  JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete?", "Deletion", JOptionPane.YES_NO_OPTION);
               
                if(a==JOptionPane.YES_OPTION)
                {
                    if(!jTextField1.getText().equals(""))
                    {
                    mystatement.executeUpdate();
                    
                          jTextField1.setText("");
                mystatement.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Employee Deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                    else
                    {
                          JOptionPane.showMessageDialog(rootPane, "Employee Doesnt Exists", "Sorry", JOptionPane.INFORMATION_MESSAGE);
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
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
