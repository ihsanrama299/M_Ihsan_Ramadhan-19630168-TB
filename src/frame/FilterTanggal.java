/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import aplikasigudang.ConfigDB;

/**
 *
 * @author LENOVO
 */
public class FilterTanggal extends javax.swing.JFrame {
    public static String jenisLaporan = "";
    
    /**
     * Creates new form FilterTanggal
     */
    public FilterTanggal(String laporan) {
        initComponents();
        setLocationRelativeTo(null);
        
        jenisLaporan = laporan;
        
        dateFilter1.setEnabled(false);
        dateFilter2.setEnabled(false);
        
        rbSemua.setSelected(true);
        
        this.setTitle(laporan);
    }

    private FilterTanggal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbSemua = new javax.swing.JRadioButton();
        rbFilter = new javax.swing.JRadioButton();
        dateFilter1 = new com.toedter.calendar.JDateChooser();
        dateFilter2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCetak = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(rbSemua);
        rbSemua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbSemua.setText("Cetak Semua Record");
        rbSemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSemuaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFilter);
        rbFilter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbFilter.setText("Cetak Sesuai Filter Tanggal");
        rbFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFilterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Dari : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Sampai : ");

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFilter)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateFilter2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbSemua))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSemua)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFilter)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(dateFilter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBatal)
                            .addComponent(btnCetak))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFilterActionPerformed
        // TODO add your handling code here:
        if(rbFilter.isSelected()) {
            dateFilter1.setEnabled(true);
            dateFilter2.setEnabled(true);
        }
    }//GEN-LAST:event_rbFilterActionPerformed

    private void rbSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSemuaActionPerformed
        // TODO add your handling code here:
        if(rbSemua.isSelected()) {
            dateFilter1.setEnabled(false);
            dateFilter2.setEnabled(false);
        }
    }//GEN-LAST:event_rbSemuaActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        if(jenisLaporan == "Laporan Barang Masuk") {
            if(rbSemua.isSelected()) {
                String sqlBarangMasuk = "SELECT barang_masuk.id_bm, barang_masuk.tanggal, barang.kode_barang, barang.nama_barang, supplier.kode_supplier, supplier.nama_supplier, barang_masuk.jumlah, barang_masuk.keterangan FROM barang_masuk INNER JOIN barang ON barang_masuk.kode_barang = barang.kode_barang INNER JOIN supplier ON barang_masuk.kode_supplier = supplier.kode_supplier";
                ConfigDB.tampilLaporan("src/laporan/laporanBarangMasuk.jrxml", sqlBarangMasuk);
            } else if(rbFilter.isSelected()) {
                java.sql.Date tanggal1 = new java.sql.Date(dateFilter1.getDate().getTime());
                java.sql.Date tanggal2 = new java.sql.Date(dateFilter2.getDate().getTime());
            
                String sqlFilter =
                "SELECT barang_masuk.id_bm, barang_masuk.tanggal, barang.kode_barang, barang.nama_barang, supplier.kode_supplier, supplier.nama_supplier, barang_masuk.jumlah, barang_masuk.keterangan "
                + "FROM barang_masuk "
                + "INNER JOIN barang "
                + "ON barang_masuk.kode_barang = barang.kode_barang "
                + "INNER JOIN supplier "
                + "ON barang_masuk.kode_supplier = supplier.kode_supplier "
                + "WHERE barang_masuk.tanggal BETWEEN '" + tanggal1 + "' AND '" + tanggal2 +"'";
                
                ConfigDB.tampilLaporan("src/laporan/laporanBarangMasuk.jrxml", sqlFilter);                
            }
        } else if(jenisLaporan == "Laporan Barang Keluar") {
            if(rbSemua.isSelected()) {
                String sqlBarangKeluar = "SELECT barang_keluar.id_bk, barang_keluar.tanggal, barang.kode_barang, barang.nama_barang, gudang.kode_gudang, gudang.nama_gudang, barang_keluar.jumlah, barang_keluar.keterangan FROM barang_keluar INNER JOIN barang ON barang_keluar.kode_barang = barang.kode_barang INNER JOIN gudang ON barang_keluar.kode_gudang = gudang.kode_gudang";
                ConfigDB.tampilLaporan("src/laporan/laporanBarangKeluar.jrxml", sqlBarangKeluar);
            } else if(rbFilter.isSelected()) {
                java.sql.Date tanggal1 = new java.sql.Date(dateFilter1.getDate().getTime());
                java.sql.Date tanggal2 = new java.sql.Date(dateFilter2.getDate().getTime());

                String sqlFilter =
                "SELECT barang_keluar.id_bk, barang_keluar.tanggal, barang.kode_barang, barang.nama_barang, gudang.kode_gudang, gudang.nama_gudang, barang_keluar.jumlah, barang_keluar.keterangan "
                + "FROM barang_keluar "
                + "INNER JOIN barang "
                + "ON barang_keluar.kode_barang = barang.kode_barang "
                + "INNER JOIN gudang "
                + "ON barang_keluar.kode_gudang = gudang.kode_gudang "
                + "WHERE barang_keluar.tanggal BETWEEN '" + tanggal1 + "' AND '" + tanggal2 + "'";
                
                ConfigDB.tampilLaporan("src/laporan/laporanBarangKeluar.jrxml", sqlFilter);                
            }
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(FilterTanggal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilterTanggal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilterTanggal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilterTanggal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilterTanggal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCetak;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dateFilter1;
    private com.toedter.calendar.JDateChooser dateFilter2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rbFilter;
    private javax.swing.JRadioButton rbSemua;
    // End of variables declaration//GEN-END:variables
}