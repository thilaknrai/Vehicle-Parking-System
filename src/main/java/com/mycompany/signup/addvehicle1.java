/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.signup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TEST
 */
public class addvehicle1 extends javax.swing.JFrame {

    /**
     * Creates new form addvehicle
     */
    public addvehicle1() {
        initComponents();
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
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        rSButtonHover9 = new rojeru_san.complementos.RSButtonHover();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rSButtonHover10 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover11 = new rojeru_san.complementos.RSButtonHover();
        rcno = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        plot = new javax.swing.JTextField();
        atime = new javax.swing.JTextField();
        rSButtonHover13 = new rojeru_san.complementos.RSButtonHover();
        jPanel1 = new javax.swing.JPanel();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover4 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover5 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover6 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover7 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 311, 36));

        age.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        age.setForeground(new java.awt.Color(102, 102, 102));
        age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        age.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageFocusLost(evt);
            }
        });
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 311, 36));

        rSButtonHover9.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 101, 204)));
        rSButtonHover9.setForeground(new java.awt.Color(0, 101, 204));
        rSButtonHover9.setText("Park");
        rSButtonHover9.setColorText(new java.awt.Color(0, 101, 204));
        rSButtonHover9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover9ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 111, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("RCNO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 50, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Full name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 70, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Plot Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 80, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Plot No");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 60, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Arrival Time");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 80, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Age");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 60, 30));

        rSButtonHover10.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 101, 204)));
        rSButtonHover10.setForeground(new java.awt.Color(0, 101, 204));
        rSButtonHover10.setText("Clear");
        rSButtonHover10.setColorText(new java.awt.Color(0, 101, 204));
        rSButtonHover10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover10ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 111, 32));

        rSButtonHover11.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 101, 204)));
        rSButtonHover11.setForeground(new java.awt.Color(0, 101, 204));
        rSButtonHover11.setText("Get Date");
        rSButtonHover11.setColorText(new java.awt.Color(0, 101, 204));
        rSButtonHover11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover11ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 80, 30));

        rcno.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        rcno.setForeground(new java.awt.Color(102, 102, 102));
        rcno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rcno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rcnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rcnoFocusLost(evt);
            }
        });
        rcno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcnoActionPerformed(evt);
            }
        });
        jPanel2.add(rcno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 311, 36));

        pname.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        pname.setForeground(new java.awt.Color(102, 102, 102));
        pname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnameFocusLost(evt);
            }
        });
        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        jPanel2.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 311, 36));

        plot.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        plot.setForeground(new java.awt.Color(102, 102, 102));
        plot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        plot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plotFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plotFocusLost(evt);
            }
        });
        plot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plotActionPerformed(evt);
            }
        });
        jPanel2.add(plot, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 311, 36));

        atime.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        atime.setForeground(new java.awt.Color(102, 102, 102));
        atime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        atime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                atimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                atimeFocusLost(evt);
            }
        });
        atime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atimeActionPerformed(evt);
            }
        });
        jPanel2.add(atime, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 210, 36));

        rSButtonHover13.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 101, 204)));
        rSButtonHover13.setForeground(new java.awt.Color(0, 101, 204));
        rSButtonHover13.setText("Back");
        rSButtonHover13.setColorText(new java.awt.Color(0, 101, 204));
        rSButtonHover13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover13ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 111, 32));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonHover3.setText("Logout");
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 70));

        rSButtonHover4.setText("Add Vehicle");
        rSButtonHover4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover4MouseClicked(evt);
            }
        });
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 70));

        rSButtonHover5.setText("View Vehicle");
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 70));

        rSButtonHover6.setText("View Space");
        rSButtonHover6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover6ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 70));

        rSButtonHover7.setText("Bill");
        rSButtonHover7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover7ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 70));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFocusLost

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void ageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFocusGained

    private void ageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFocusLost

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void rSButtonHover9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover9ActionPerformed
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DBMS", "root", "Rahul@2002");
            
            int age1;
            age1 = Integer.parseInt(age.getText());
            
            String plot_name=pname.getText();
            String rc_no=rcno.getText();

            Statement stm=con.createStatement();
            String sql="select total_space from park_space where space_name='"+plot_name+"'";

            ResultSet rs =stm.executeQuery(sql);

            if(rs.next()){
                String tspace=rs.getString("total_space");
                int t_s=Integer.parseInt(tspace);
                if(t_s>0)
                {
                    PreparedStatement pst3 = con.prepareStatement("insert into vehicle_details(`rc_no`, `full_name`, `plot`, `atime`, `plot_name`,`age`) values(?,?,?,?,?,?)");
                    PreparedStatement pst4 = con.prepareStatement("insert into all_vehicle(`rc_no`, `atime`,`name`) values(?,?,?)");
                    pst4.setString(1, rcno.getText());
                    pst4.setString(2, atime.getText());
                    pst4.setString(3, name.getText());

                    pst3.setString(1, rcno.getText());
                    pst3.setString(2, name.getText());

                    pst3.setString(3, plot.getText());

                    pst3.setString(4, atime.getText());
                    pst3.setString(5, pname.getText());
                    pst3.setInt(6, age1);

                    pst3.execute();
                    pst4.execute();

                    System.out.println("Record inserted successfully");
                    pst3.close();
                    pst4.close();

                    int t_aa=t_s-1;
                    String t_aaa=Integer.toString(t_aa);
                    System.out.println(t_aaa);
                    System.out.println(plot_name);

                    PreparedStatement pst1=con.prepareStatement("update park_space set total_space='"+t_aaa+"' where space_name=?");
                    pst1.setString(1,plot_name);
                    pst1.execute();
                    System.out.print("updated");
                    JOptionPane.showMessageDialog(this,"Vehicle Parked'"+plot_name+"'");

                    PreparedStatement pst5=con.prepareStatement("update all_vehicle set rate='"+40+"' where rc_no=?");
                    pst1.setString(1,rc_no);
                    pst1.execute();
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"There is no available space in'"+plot_name+"'");

                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid Plot Number");

            }

            con.close();
        }
        catch (SQLException e) {
             JOptionPane.showMessageDialog(this,e);
            System.err.print(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addvehicle1.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover9ActionPerformed

    private void rSButtonHover10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover10ActionPerformed
        rcno.setText("");
        name.setText("");
        plot.setText("");
        atime.setText("");
        pname.setText("");// TODO add your handling code here:
            // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover10ActionPerformed

    private void rSButtonHover11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover11ActionPerformed
  java.util.Date obj= new java.util.Date();
        String date= obj.toString();
        atime.setText(date);
        System.out.print(date);
        atime.setText(date);// TODO add your handling code here:
            // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover11ActionPerformed

    private void rcnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rcnoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_rcnoFocusGained

    private void rcnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rcnoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_rcnoFocusLost

    private void rcnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcnoActionPerformed

    private void pnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameFocusGained

    private void pnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameFocusLost

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void plotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plotFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plotFocusGained

    private void plotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plotFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plotFocusLost

    private void plotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plotActionPerformed

    private void atimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atimeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_atimeFocusGained

    private void atimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atimeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_atimeFocusLost

    private void atimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atimeActionPerformed

    private void rSButtonHover13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover13ActionPerformed
        dispose();
        home hpage = new home();
        hpage.show();         // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover13ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        dispose();
        log hvp= new log();
        hvp.show();  // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover4MouseClicked
        dispose();
        addspace hh=new addspace();
        hh.show();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover4MouseClicked

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        dispose();
        addvehicle1 hh=new addvehicle1();
        hh.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        dispose();
        vehicle_parked hvp= new vehicle_parked();
        hvp.show();    // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void rSButtonHover6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover6ActionPerformed
        dispose();
        showspace hvp= new showspace();
        hvp.show(); // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover6ActionPerformed

    private void rSButtonHover7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover7ActionPerformed
        dispose();
        bill1 hvp= new bill1();
        hvp.show();        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover7ActionPerformed

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
            java.util.logging.Logger.getLogger(addvehicle1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addvehicle1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addvehicle1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addvehicle1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addvehicle1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField atime;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField plot;
    private javax.swing.JTextField pname;
    private rojeru_san.complementos.RSButtonHover rSButtonHover10;
    private rojeru_san.complementos.RSButtonHover rSButtonHover11;
    private rojeru_san.complementos.RSButtonHover rSButtonHover13;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover4;
    private rojeru_san.complementos.RSButtonHover rSButtonHover5;
    private rojeru_san.complementos.RSButtonHover rSButtonHover6;
    private rojeru_san.complementos.RSButtonHover rSButtonHover7;
    private rojeru_san.complementos.RSButtonHover rSButtonHover9;
    private javax.swing.JTextField rcno;
    // End of variables declaration//GEN-END:variables
}