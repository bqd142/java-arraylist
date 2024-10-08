/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guitable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class GUIdssv extends javax.swing.JFrame {

    ArrayList<SV> dssv = new ArrayList<SV>();
    DefaultTableModel model = new DefaultTableModel();
    public GUIdssv() {
        initComponents();
        model.addColumn("MSV");
        model.addColumn("Hoten");
        model.addColumn("GPA");
    }
    
    public void clickTable() {
        int Row = txttable.getSelectedRow();
        String msv = (String.valueOf(txttable.getValueAt(Row, 0)));
        String ten = (String.valueOf(txttable.getValueAt(Row, 1)));
        String gpa = (String.valueOf(txttable.getValueAt(Row, 2)));
        txtmsv.setText(msv); txtname.setText(ten); txtgpa.setText(gpa);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmsv = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtgpa = new javax.swing.JTextField();
        txtadd = new javax.swing.JButton();
        txtsee = new javax.swing.JButton();
        txtdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttable = new javax.swing.JTable();
        txtsua = new javax.swing.JButton();
        txtgpa75 = new javax.swing.JButton();
        txtgpadesc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Mã Sinh Viên");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("GPA");

        txtmsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmsvActionPerformed(evt);
            }
        });

        txtadd.setText("Thêm");
        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });

        txtsee.setText("Xem");
        txtsee.setToolTipText("");
        txtsee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtseeActionPerformed(evt);
            }
        });

        txtdelete.setText("Xóa");
        txtdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeleteActionPerformed(evt);
            }
        });

        txttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        txttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txttable);

        txtsua.setText("Sửa");
        txtsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsuaActionPerformed(evt);
            }
        });

        txtgpa75.setText("GPA > 7.5");
        txtgpa75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgpa75ActionPerformed(evt);
            }
        });

        txtgpadesc.setText("GPA_desc");
        txtgpadesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgpadescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmsv)
                            .addComponent(txtname)
                            .addComponent(txtgpa, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtsee, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtsua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(txtgpa75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtgpadesc)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmsv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsua, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgpa75)
                    .addComponent(txtgpadesc))
                .addGap(208, 208, 208))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmsvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmsvActionPerformed

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
        SV ob = new SV(txtmsv.getText(),txtname.getText(),Float.parseFloat(txtgpa.getText()));
        dssv.add(ob);
        txtmsv.setText("");
        txtname.setText("");
        txtgpa.setText("");
    }//GEN-LAST:event_txtaddActionPerformed

    private void txtseeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtseeActionPerformed
        model.setRowCount(0);
        for(SV ob:dssv){
            String msv=ob.getMSV();
            String name=ob.getHoten();
            float gpa = ob.getGPA();
            model.addRow(new Object[]{msv,name,String.valueOf(gpa))};
        }
        txttable.setModel(model);
    }//GEN-LAST:event_txtseeActionPerformed

    private void txtdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeleteActionPerformed
        for(SV ob : dssv){
            if(ob.getMSV().equalsIgnoreCase(txtmsv.getText()))
                dssv.remove(ob);
        }
    }//GEN-LAST:event_txtdeleteActionPerformed

    private void txttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttableMouseClicked
        clickTable();
    }//GEN-LAST:event_txttableMouseClicked

    private void txtsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsuaActionPerformed
        int SL_row = txttable.getSelectedRow();
        dssv.remove(SL_row);
        SV ob = new SV(txtmsv.getText(),txtname.getText(),Float.parseFloat(txtgpa.getText()));
        dssv.add(SL_row, ob);
        txtmsv.setText("");
        txtname.setText("");
        txtgpa.setText("");
    }//GEN-LAST:event_txtsuaActionPerformed

    private void txtgpa75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgpa75ActionPerformed
        model.setRowCount(0);
        for(SV ob:dssv){
            String msv=ob.getMSV();
            String name=ob.getHoten();
            float gpa = ob.getGPA();
            if(gpa >7.5){
                Vector vt = new Vector();
                vt.add(msv); vt.add(name);vt.add(gpa);
                model.addRow(vt);
            }
            
        }
        txttable.setModel(model);
    }//GEN-LAST:event_txtgpa75ActionPerformed

    private void txtgpadescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgpadescActionPerformed
        ArrayList<SV> desc = new ArrayList<SV>();
        desc.addAll(dssv);
        desc.sort(Comparator.comparing(SV::getGPA).reversed());
        model.setRowCount(0);
        for(SV ob:desc){
            String msv=ob.getMSV();
            String name=ob.getHoten();
            float gpa = ob.getGPA();
            Vector vt = new Vector();
            vt.add(msv); vt.add(name);vt.add(gpa);
            model.addRow(vt);
        }
        txttable.setModel(model);
    }//GEN-LAST:event_txtgpadescActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIdssv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtadd;
    private javax.swing.JButton txtdelete;
    private javax.swing.JTextField txtgpa;
    private javax.swing.JButton txtgpa75;
    private javax.swing.JButton txtgpadesc;
    private javax.swing.JTextField txtmsv;
    private javax.swing.JTextField txtname;
    private javax.swing.JButton txtsee;
    private javax.swing.JButton txtsua;
    private javax.swing.JTable txttable;
    // End of variables declaration//GEN-END:variables
}
