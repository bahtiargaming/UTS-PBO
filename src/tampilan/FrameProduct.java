/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import kelas.category;
import kelas.product;

public class FrameProduct extends javax.swing.JFrame {

    public FrameProduct() {
        initComponents();
        loadTable();
        reset();
        comboBox();
    }

    void loadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID PRODUK");
        model.addColumn("PRODUK");
        model.addColumn("DESKRIPSI");
        model.addColumn("HARGA");
        model.addColumn("KATEGORI");

        try {
            product pro = new product();
            ResultSet data = pro.tampilProduk();

            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("ID"),
                    data.getString("Nama"),
                    data.getString("Deskripsi"),
                    data.getString("Harga"),
                    data.getString("Kategori"),});

            }

        } catch (SQLException sQLException) {

        }

        tProduk.setModel(model);
    }

    void reset() {
        autoID();
        tID.setEditable(true);
        tDesk.setText(null);
        tHarga.setText(null);
        cKategori.setSelectedItem(null);
        tNama.setText(null);
    }

    void comboBox() {

        try {
            category cat = new category();
            ResultSet data = cat.tampilComBox();

            while (data.next()) {
                String isi = data.getString("category_name");
                cKategori.addItem(isi);
            }

        } catch (SQLException ex) {

        }

    }

    void autoID() {

        try {
            product pro = new product();
            ResultSet id = pro.autoID();

            if (id.next()) {
                int auto = id.getInt("ID") + 1;
                tID.setText(String.valueOf(auto));
            } else {
                tID.setText("1");
            }

        } catch (SQLException sQLException) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        tID = new javax.swing.JTextField();
        tHarga = new javax.swing.JTextField();
        cKategori = new javax.swing.JComboBox<>();
        bTambah = new javax.swing.JButton();
        bHapuss = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProduk = new javax.swing.JTable();
        bUbah = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tDesk = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID");

        jLabel2.setText("Nama");

        jLabel3.setText("Deskripsi");

        jLabel4.setText("Harga");

        jLabel5.setText("Kategori");

        tNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaActionPerformed(evt);
            }
        });

        cKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cKategoriActionPerformed(evt);
            }
        });

        bTambah.setText("TAMBAH");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bHapuss.setText("HAPUS");
        bHapuss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapussActionPerformed(evt);
            }
        });

        tProduk.setModel(new javax.swing.table.DefaultTableModel(
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
        tProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tProduk);

        bUbah.setText("UBAH");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("PRODUCT");

        tDesk.setColumns(20);
        tDesk.setRows(5);
        tDesk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(bTambah)
                                    .addGap(35, 35, 35)
                                    .addComponent(bUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bHapuss))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tHarga)
                                        .addComponent(cKategori, 0, 238, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tDesk)))
                                    .addGap(2, 2, 2)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel6)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(tDesk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bHapuss)
                    .addComponent(bUbah))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaActionPerformed

    private void cKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cKategoriActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        try {
            product pro = new product();
            category cat = new category();
            pro.setProduct_id(Integer.parseInt(tID.getText()));
            pro.setProduct_name(tNama.getText());
            pro.setProduct_desc(tDesk.getText());
            pro.setProduct_price(Integer.parseInt(tHarga.getText()));
            cat.setCategory_name(cKategori.getSelectedItem().toString());
            ResultSet data = cat.Konversi();

            if (data.next()) {
                String isi = data.getString("category_id");
                pro.setProduct_cat_id(Integer.parseInt(isi));
            }
            pro.tambahProduk();
        } catch (SQLException sQLException) {
        }
        loadTable();
        reset();

    }//GEN-LAST:event_bTambahActionPerformed

    private void bHapussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapussActionPerformed
        try {
            product pro = new product();
            pro.setProduct_id(Integer.parseInt(tID.getText()));
            pro.hapusProduk();
        } catch (SQLException sQLException) {
        }

        reset();
        loadTable();
    }//GEN-LAST:event_bHapussActionPerformed

    private void tProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProdukMouseClicked
        int baris = tProduk.rowAtPoint(evt.getPoint());
        String ID = tProduk.getValueAt(baris, 0).toString();
        String Nama = tProduk.getValueAt(baris, 1).toString();
        String Desc = tProduk.getValueAt(baris, 2).toString();
        String Harga = tProduk.getValueAt(baris, 3).toString();
        String Kategori = tProduk.getValueAt(baris, 4).toString();

        tID.setText(ID);
        tID.setEditable(false);
        tNama.setText(Nama);
        tHarga.setText(Harga);
        tDesk.setText(Desc);
        cKategori.setSelectedItem(Kategori);
    }//GEN-LAST:event_tProdukMouseClicked

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        try {
            product pro = new product();
            category cat = new category();
            pro.setProduct_id(Integer.parseInt(tID.getText()));
            pro.setProduct_name(tNama.getText());
            pro.setProduct_desc(tDesk.getText());
            pro.setProduct_price(Integer.parseInt(tHarga.getText()));
            cat.setCategory_name(cKategori.getSelectedItem().toString());
            ResultSet data = cat.Konversi();

            if (data.next()) {
                String isi = data.getString("category_id");
                pro.setProduct_cat_id(Integer.parseInt(isi));
            }
            pro.ubahProduk();
        } catch (SQLException sQLException) {       
        }
        loadTable();
        reset();

    }//GEN-LAST:event_bUbahActionPerformed

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
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapuss;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tDesk;
    private javax.swing.JTextField tHarga;
    private javax.swing.JTextField tID;
    private javax.swing.JTextField tNama;
    private javax.swing.JTable tProduk;
    // End of variables declaration//GEN-END:variables
}
