/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.RegionController;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Region;

/**
 *
 * @author JESSI
 */
public class RegionView extends javax.swing.JInternalFrame {

    private RegionController con;
    MainView view = new MainView();

    /**
     * Creates new form RegionView
     */
    public RegionView() {
        initComponents();
        con = new RegionController();
        load(con.binding());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegion = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        btnSave2 = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtsearchid = new javax.swing.JTextField();
        btnsearchid = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Form Region");

        tblRegion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRegion);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail Region"));

        jLabel1.setText("Id");

        jLabel2.setText("Name");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        btnSave2.setText("Insert");
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave2ActionPerformed(evt);
            }
        });

        btnback.setText("Back to HOME");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtName)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Update)
                        .addGap(24, 24, 24)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave2))
                    .addComponent(btnback, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(Update)
                    .addComponent(btnSave2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnback))
        );

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search ALL");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtsearchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchidActionPerformed(evt);
            }
        });

        btnsearchid.setText("Search ID");
        btnsearchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchidActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(txtsearchid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnsearchid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsearchid)
                            .addComponent(txtsearchid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(refresh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //save atau insert
    private void btnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave2ActionPerformed
        String id = txtId.getText();
        String name = txtName.getText();

        if (id.equalsIgnoreCase("") || name.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Tidak boleh ada data yang kosong!");
        } else if (checkint(id) == false) {
            JOptionPane.showMessageDialog(this, "Mohon masukkan id dengan angka integer");
            txtId.setText("");
            txtName.setText("");
        } else if ((checkid(id) == true) || (checkname(name) == true)) {
            String pesan = "Terjadi Kesalahan!";
            if (checkid(id) == true) {
                pesan += "\nCountry ID sudah ada di database";
            }
            if (checkname(name) == true) {
                pesan += "\nData dengan nama yang sama sudah ada di database";
            }

            JOptionPane.showMessageDialog(this, pesan + "\nMohon input data lagi");

        } else if (checkint(id) == true) {
            String message = "Anda yakin ingin Insert data dengan ID : " + id + " , Nama : " + name + " ?";
            int dialogResult = JOptionPane.showConfirmDialog(this, message, "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, con.insert(id, name), "Pemberitahuan", JOptionPane.ERROR_MESSAGE);
                load(con.binding());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan!");
        }

    }//GEN-LAST:event_btnSave2ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    //delete
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id = txtId.getText();
        if (id.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Data ID tidak boleh kosong! Hapus data hanya bisa menggunakan ID! \nSilahkan search dahulu untuk menemukan ID");
        } else if (checkint(id) == false) {
            JOptionPane.showMessageDialog(this, "Mohon masukkan id dengan angka integer");
            txtId.setText("");
            txtName.setText("");
        } else if (checkid(id) == false) {
            JOptionPane.showMessageDialog(this, "ID Data tidak ditemukan!\nMohon masukkan ID yang ada di Database");
        } else if (checkint(id) == true) {
            String message = "Anda yakin ingin menghapus data dengan ID " + id + " ?";
            int dialogResult = JOptionPane.showConfirmDialog(this, message, "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, con.delete(id), "Pemberitahuan", JOptionPane.ERROR_MESSAGE);
                load(con.binding());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    //update
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String id = txtId.getText();
        String name = txtName.getText();
        if (id.equalsIgnoreCase("") || name.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Tidak boleh ada data yang kosong!");
        } else if (checkint(id) == false) {
            JOptionPane.showMessageDialog(this, "Mohon masukkan id dengan angka integer");
            txtId.setText("");
            txtName.setText("");
        } else if ((checkid(id) == false) || (checkname(name) == true)) {
            String pesan = "Terjadi Kesalahan!";
            if (checkid(id) == false) {
                pesan += "\nRegion ID tidak ada di database";
            }
            if (checkname(name) == true) {
                pesan += "\nData dengan nama yang sama sudah ada di database";
            }
            JOptionPane.showMessageDialog(this, pesan + "\nMohon input data lagi");
        } else if (checkint(id) == true) {
            String message = "Anda yakin ingin update data ID : " + id + " , Nama : " + name + " ? ";
            int dialogResult = JOptionPane.showConfirmDialog(this, message, "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, con.update(id, name), "Pemberitahuan", JOptionPane.ERROR_MESSAGE);
                load(con.binding());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan!");
        }
    }//GEN-LAST:event_UpdateActionPerformed

    //search all
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        load(con.search(txtSearch.getText()));
    }//GEN-LAST:event_btnSearchActionPerformed

    //mouse event table
    private void tblRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegionMouseClicked
        int row = tblRegion.getSelectedRow();
        txtId.setText(tblRegion.getValueAt(row, 0).toString());
        txtName.setText(tblRegion.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblRegionMouseClicked

    private void txtsearchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchidActionPerformed

    //search by id
    private void btnsearchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchidActionPerformed
        if (checkint(txtsearchid.getText())) {
            load(con.getbyid(txtsearchid.getText()));
        } else {
            load(con.search("ayefgaweuweuqwneryqwqwyetrbqwyrcuwyq"));
        }
    }//GEN-LAST:event_btnsearchidActionPerformed
    //refresh dgn mengosongkan semua field
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        load(con.binding());
        txtId.setText("");
        txtName.setText("");
        txtSearch.setText("");
        txtsearchid.setText("");
    }//GEN-LAST:event_refreshActionPerformed

    //back to home
    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        this.setVisible(false);
        MainView view = new MainView();

    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave2;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsearchid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refresh;
    private javax.swing.JTable tblRegion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtsearchid;
    // End of variables declaration//GEN-END:variables

    //load data table
    private void load(List<Region> regions) {
        String header[] = {"ID", "NAME"};
        String[][] data = new String[regions.size()][2];
        for (int i = 0; i < data.length; i++) {
            data[i][0] = String.valueOf(regions.get(i).getId());
            data[i][1] = regions.get(i).getName();
        }
        DefaultTableModel defaultTableModel = new DefaultTableModel(data, header);
        tblRegion.setModel(defaultTableModel);
    }

    //check apakah suatu string merupakan integer
    private static boolean checkint(String angka) {
        if (Pattern.matches(("[+-]?[0-9]+"), angka)) {
            return true;
        } else {
            return false;
        }
    }

    //check apakah ada id yang sama di database
    private boolean checkid(String id) {
        List<Region> regions = con.binding();
        int p = 0;
        for (int i = 0; i < regions.size(); i++) {
            // cek id tsb ada atau tidak di database (jika ada counter ke p=1 artinya ada)
            if (id.equalsIgnoreCase(String.valueOf(regions.get(i).getId()))) {
                p = 1;
            }
        }

        if (p == 1) {
            return true;
        } else {
            return false;
        }

    }

    //check apakah ada nama yang sama di database
    private boolean checkname(String name) {
        List<Region> regions = con.binding();
        int p = 0;
        for (int i = 0; i < regions.size(); i++) {
            //cek ada nama yg sama atau tidak di database (jika ada counter c=1)
            if (name.toLowerCase().equalsIgnoreCase(regions.get(i).getName().toLowerCase())) {
                p = 1;
            }
        }
        if (p == 1) {
            return true;
        } else {
            return false;
        }
    }

}
