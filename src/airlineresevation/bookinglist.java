

package airlineresevation;

import static airlineresevation.myvariables.password;
import static airlineresevation.myvariables.path;
import static airlineresevation.myvariables.place;
import static airlineresevation.myvariables.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class bookinglist extends javax.swing.JInternalFrame implements myvariables {

    public bookinglist() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 86, 870, 416));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel1.setText("                  BOOKING LIST");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 35, 497, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
         try
            {
                Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place, username, password);
                
                try
                {
                    String q="select * from treser";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                  ResultSet myresult=mystatement.executeQuery();
                  
                  if(myresult.next())
                  {
                      DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
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
                      JOptionPane.showMessageDialog(rootPane, "No Bookings Available", "Null", JOptionPane.ERROR_MESSAGE);  
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
