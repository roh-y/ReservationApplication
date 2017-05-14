

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
import javax.swing.table.DefaultTableModel;


public class bookinglistbydate extends javax.swing.JInternalFrame implements myvariables {

 
    public bookinglistbydate() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TicketNo", "Cust ID", "Cust Name", "Address", "FlightID", "FlightName", "DateofJourney", "FlightCharges", "FlightClass", "Seats"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 870, 416));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel1.setText("                  BOOKING LIST");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 497, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 130, -1));

        jLabel2.setText("Date of Deaprture");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel3.setText("TO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        jLabel4.setText("Date of Deaprture");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 110, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 130, -1));

        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
         try
            {
                Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place, username, password);
                
                try
                {
                  jScrollPane1.setVisible(false);
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
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try
            {
                Connection myconnection;
            
                myconnection=DriverManager.getConnection(path+place,username, password);
                
                try
                {
                    String q="select * from treser where doj between ? and ?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                   String doj1=myformat.format(jDateChooser1.getDate());
                         String doj2=myformat.format(jDateChooser2.getDate());
                         mystatement.setString(1,doj1);
                          mystatement.setString(2,doj2);
            DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
            mymodel.setNumRows(0);
                    ResultSet myresult=mystatement.executeQuery();
                     if(myresult.next())
                    {
                           jScrollPane1.setVisible(true);
                     getContentPane().validate();
                      
                         do
                      {
                          String tno, custid,custname,address,flid,flightname,doj,fcharges,fclass,seats;
                          tno=myresult.getString("tno");
                          custid=myresult.getString("custid1");
                          custname=myresult.getString("custname1");
                          address=myresult.getString("address1");
                          flid=myresult.getString("flid");
                          flightname=myresult.getString("flightname");
                          doj=myresult.getString("doj");
                          fcharges=myresult.getString("flightcharges");
                          fclass=myresult.getString("flightclass");
                          seats=myresult.getString("seatno");
                          mymodel.addRow(new Object[]{tno,custid,custname,address,flid,flightname,doj,fcharges,fclass,seats});
                       }
                      while(myresult.next());
                    }
                  else
                     {
                         jScrollPane1.setVisible(false);
                     getContentPane().validate();
                        JOptionPane.showMessageDialog(rootPane, "No Records ", "Error",JOptionPane.ERROR_MESSAGE); 
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
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
