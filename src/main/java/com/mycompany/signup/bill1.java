/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.signup;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author TEST
 */
public class bill1 extends javax.swing.JFrame {

    /**
     * Creates new form bill
     */
    public bill1() {
        initComponents();
        addphs(tickno);
        addphs(rcno1);

    }
public void addphs(JTextField textField)
{
    Font font=textField.getFont();
    font=font.deriveFont(Font.ITALIC);
    textField.setFont(font);
    textField.setForeground(Color.gray);
}

public void removephs(JTextField textField)
{
    Font font=textField.getFont();
    font=font.deriveFont(Font.PLAIN|Font.BOLD);
    textField.setFont(font);
    textField.setForeground(Color.black);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rcno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        atime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        tickno = new javax.swing.JTextField();
        rcno1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        plot = new javax.swing.JTextField();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        rSButtonHover4 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover5 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover6 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover7 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover8 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rcno.setEditable(false);
        rcno.setBackground(new java.awt.Color(255, 255, 255));
        rcno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rcno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(rcno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 155, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Arrival Time");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 130, -1));

        atime.setEditable(false);
        atime.setBackground(new java.awt.Color(255, 255, 255));
        atime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        atime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(atime, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 155, -1));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 420, 314));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Plot Name ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 110, -1));

        pname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 155, -1));

        tickno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tickno.setText("Search by Ticke No");
        tickno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tickno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ticknoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ticknoFocusLost(evt);
            }
        });
        tickno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticknoActionPerformed(evt);
            }
        });
        jPanel1.add(tickno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        rcno1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rcno1.setText("Search by RC_NO");
        rcno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rcno1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rcno1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rcno1FocusLost(evt);
            }
        });
        jPanel1.add(rcno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 150, -1));

        jLabel8.setText("OR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("RCNO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Plot No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Full name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 155, -1));

        plot.setEditable(false);
        plot.setBackground(new java.awt.Color(255, 255, 255));
        plot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        plot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(plot, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 155, -1));

        rSButtonHover1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 101, 204)));
        rSButtonHover1.setForeground(new java.awt.Color(0, 101, 204));
        rSButtonHover1.setText("Print Bill");
        rSButtonHover1.setColorText(new java.awt.Color(0, 101, 204));
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 111, 32));

        rSButtonHover2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 101, 204)));
        rSButtonHover2.setForeground(new java.awt.Color(0, 101, 204));
        rSButtonHover2.setText("Generate Bill");
        rSButtonHover2.setColorText(new java.awt.Color(0, 101, 204));
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 111, 32));

        rSButtonHover3.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 101, 204)));
        rSButtonHover3.setForeground(new java.awt.Color(0, 101, 204));
        rSButtonHover3.setText("Back");
        rSButtonHover3.setColorText(new java.awt.Color(0, 101, 204));
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 111, 32));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonHover4.setText("Logout");
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 70));

        rSButtonHover5.setText("Add Vehicle");
        rSButtonHover5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover5MouseClicked(evt);
            }
        });
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 70));

        rSButtonHover6.setText("View Vehicle");
        rSButtonHover6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover6ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 70));

        rSButtonHover7.setText("View Space");
        rSButtonHover7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover7ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 70));

        rSButtonHover8.setText("Bill");
        rSButtonHover8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover8ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DBMS", "root", "Rahul@2002");
            String ticknum=tickno.getText();
            if("Search by Ticke No".equals(ticknum))
                ticknum="11";
            int id;
            id = Integer.parseInt(ticknum);
             String rc_no1=rcno1.getText();
            Statement stm=con.createStatement();
            String sql = "SELECT `rc_no`,`full_name`,`plot`,`atime`,`plot_name` FROM `vehicle_details` where ticket_no='"+id+"' or rc_no='"+rc_no1+"'";

            ResultSet rs =stm.executeQuery(sql);
            if(rs.next()==false)
            {
                JOptionPane.showMessageDialog(this,"Sorry Record Not Found");
                rcno.setText("");
                name.setText("");
                plot.setText("");
                atime.setText("");
                pname.setText("");

                
            }
            else{
                rcno.setText(rs.getString("rc_no"));
                name.setText(rs.getString("full_name"));
                plot.setText(rs.getString("plot"));
                atime.setText(rs.getString("atime"));
                pname.setText(rs.getString("plot_name"));

                
 
                
            }
            
            
            con.close();
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.print("ERROR OCCURED" + e);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ticknoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ticknoFocusGained
if(tickno.getText().equals("Search by Ticke No"))   
{
  tickno.setText(null);
  tickno.requestFocus();
  removephs(tickno);
}
    }//GEN-LAST:event_ticknoFocusGained

    private void rcno1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rcno1FocusGained
       if(rcno1.getText().equals("Search by RC_NO"))   
{
  rcno1.setText(null);
  rcno1.requestFocus();
  removephs(rcno1);
} // TODO add your handling code here:
    }//GEN-LAST:event_rcno1FocusGained

    private void rcno1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rcno1FocusLost
if(rcno1.getText().length()==0){
addphs(rcno1);
rcno1.setText("Search by RC_NO");
}// TODO add your handling code here:
    }//GEN-LAST:event_rcno1FocusLost

    private void ticknoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ticknoFocusLost
if(tickno.getText().length()==0)
{
    addphs(tickno);
    tickno.setText("Search by Ticke No");
}// TODO add your handling code here:
    }//GEN-LAST:event_ticknoFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
this.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void ticknoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticknoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticknoActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
               try{
            area.print();        // TODO add your handling code here:

        }catch(PrinterException e)
        {

        }
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
 try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DBMS", "root", "Rahul@2002");
       String ticknum=tickno.getText();
       String rc_no=rcno1.getText();
       String rc_no1=rcno.getText();
       if("Search by Ticke No".equals(ticknum))
                ticknum="11";
       if("Search by RC_NO".equals(rc_no))
                rc_no="11";
       
            int id;
            id = Integer.parseInt(ticknum);
             PreparedStatement pst1=con.prepareStatement("delete from vehicle_details where ticket_no=? OR rc_no=?");
             pst1.setInt(1,id);
             pst1.setString(2,rc_no);

             pst1.execute();

           //  Statement stm2=con.createStatement();
           ResultSet rs;
             String pnm=pname.getText();
            PreparedStatement pst3=con.prepareStatement("SELECT total_space FROM `park_space` where space_name=?");
            pst3.setString(1,pnm);
           rs = pst3.executeQuery();
           // String sql2 = "SELECT total_space FROM `park_space` where ticket_no='"+pnm+"'";
             
            //ResultSet rs2 =stm2.executeQuery(sql2);
            //if(rs2.next()==true)
            //{
            while(rs.next())
            {            //String rc_no22=rcno1.getText();
              String t_s=rs.getString("total_space");
               int t_ss=Integer.parseInt(t_s);
               int t_sss=t_ss+1;
               System.out.println(t_sss);
             PreparedStatement pst2=con.prepareStatement("update park_space set total_space='"+t_sss+"' where space_name=?");
             pst2.setString(1,pnm);
             pst2.execute();
             System.out.print("updated");
          
           
              
             
             PreparedStatement pst5=con.prepareStatement("update all_vehicle set rate='"+40+"' where rc_no=?");
             pst5.setString(1,rc_no1);
             pst5.execute();
             
             Date obj= new Date();
             String date= obj.toString();
             PreparedStatement pst6=con.prepareStatement("update all_vehicle set dtime='"+date+"' where rc_no=?");
             pst6.setString(1,rc_no1);
             pst6.execute();
             
             
//            Statement stm=con.createStatement();
//            int a=40;
//             
//            String Query="";
//             //stm.setString(1,rc_no2);
//            
//             
//           
//             PreparedStatement pst6=con.prepareStatement("update all_vehicle set dtime='"+date+"' where rc_no=?");
//             pst6.setString(1,rc_no2);
//             pst6.execute();
//              stm.executeQuery(Query);
//             pst2.execute();
//             System.out.println("date and rate updated");
             //}
            }
}
catch(ClassNotFoundException | NumberFormatException | SQLException e){}
        
area.setText("*************************************************************\n");
area.setText(area.getText()+"*                               PARKING TICKET                      *\n");
area.setText(area.getText()+"**************************************************************");
Date obj= new Date();
String date= obj.toString();
area.setText(area.getText()+"\n\nDriver Name="   +name.getText()+"\n");
area.setText(area.getText()+"----------------------------------------\n");
area.setText(area.getText()+"Vehicle RC NO="  +rcno.getText()+"\n");
area.setText(area.getText()+"----------------------------------------\n");
area.setText(area.getText()+"Plot NO="  +plot.getText()+"\n");
area.setText(area.getText()+"----------------------------------------\n");
area.setText(area.getText()+"Arrival Time="  +atime.getText()+"\n");
area.setText(area.getText()+"----------------------------------------\n");
area.setText(area.getText()+"Dispature Time="  +date+"\n");
area.setText(area.getText()+"----------------------------------------\n");
area.setText(area.getText()+"Amount ="  +40+"\n");
area.setText(area.getText()+"----------------------------------------\n");

    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
      dispose();
        home hh=new home();
        hh.show();    // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover5MouseClicked
        dispose();
        addspace hh=new addspace();
        hh.show();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5MouseClicked

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        dispose();
        addvehicle1 hh=new addvehicle1();
        hh.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void rSButtonHover6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover6ActionPerformed
        dispose();
        vehicle_parked hh=new vehicle_parked();
        hh.show(); // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover6ActionPerformed

    private void rSButtonHover7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover7ActionPerformed
        dispose();
        showspace hh=new showspace();
        hh.show();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover7ActionPerformed

    private void rSButtonHover8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover8ActionPerformed
        dispose();
        bill1 hh=new bill1();
        hh.show(); // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover8ActionPerformed

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        dispose();
        log hh=new log();
        hh.show(); // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

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
            java.util.logging.Logger.getLogger(bill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new bill1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JTextField atime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField plot;
    private javax.swing.JTextField pname;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover4;
    private rojeru_san.complementos.RSButtonHover rSButtonHover5;
    private rojeru_san.complementos.RSButtonHover rSButtonHover6;
    private rojeru_san.complementos.RSButtonHover rSButtonHover7;
    private rojeru_san.complementos.RSButtonHover rSButtonHover8;
    private javax.swing.JTextField rcno;
    private javax.swing.JTextField rcno1;
    private javax.swing.JTextField tickno;
    // End of variables declaration//GEN-END:variables
}
