/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import aplikasigudang.ConfigDB;
import static frame.BarangMasuk.cbBarang;
import static frame.BarangMasuk.cbSupplier;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class BarangKeluar extends javax.swing.JFrame {
    
    private String[] judulKolom = {"id_bk", "tanggal", "kode_barang", "nama_barang", "kode_gudang", "nama_gudang", "jumlah", "keterangan"};
    private int[] lebarKolom =    {  70,      100,          100,            200,          100,            200,        50,        250};
    private String sql =
    "SELECT barang_keluar.id_bk, barang_keluar.tanggal, barang.kode_barang, barang.nama_barang, gudang.kode_gudang, gudang.nama_gudang, barang_keluar.jumlah, barang_keluar.keterangan "
    + "FROM barang_keluar "
    + "INNER JOIN barang "
    + "ON barang_keluar.kode_barang = barang.kode_barang "
    + "INNER JOIN gudang "
    + "ON barang_keluar.kode_gudang = gudang.kode_gudang";

    /**
     * Creates new form BarangKeluar
     */
    public BarangKeluar() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        
        if(ConfigDB.isLoggedIn == false){
            leftPanel.setVisible(false);
        }
        
        dateFilter1.setEnabled(false);
        dateFilter2.setEnabled(false);
        
        txtKodeBarang.setVisible(false);
        txtKodeGudang.setVisible(false);

        
        ConfigDB.setTabel(tabelBarangKeluar, judulKolom, lebarKolom, sql);
        
        ConfigDB.populateComboBox(cbBarang, "SELECT nama_barang FROM barang", "nama_barang");
        ConfigDB.populateComboBox(cbGudang, "SELECT nama_gudang FROM gudang", "nama_gudang");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCetak = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dateTanggal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        cbBarang = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbGudang = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        txtKodeBarang = new javax.swing.JTextField();
        txtKodeGudang = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelBarangKeluar = new javax.swing.JTable();
        dateFilter2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        dateFilter1 = new com.toedter.calendar.JDateChooser();
        rbFilter = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transaksi Barang Keluar");

        topPanel.setBackground(new java.awt.Color(14, 190, 190));
        topPanel.setPreferredSize(new java.awt.Dimension(849, 75));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transaksi Barang Keluar");

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159)
                .addComponent(btnCetak)
                .addGap(29, 29, 29))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnCetak))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        leftPanel.setBackground(new java.awt.Color(141, 223, 223));
        leftPanel.setPreferredSize(new java.awt.Dimension(350, 380));

        jLabel3.setText("Tanggal");

        jLabel4.setText("Nama Barang");

        cbBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBarangActionPerformed(evt);
            }
        });

        jLabel5.setText("Nama Gudang");

        cbGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGudangActionPerformed(evt);
            }
        });

        jLabel7.setText("Jumlah");

        jLabel8.setText("Keterangan");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane2.setViewportView(txtKeterangan);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnBersih.setText("Bersih");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        txtKodeBarang.setText("barang");

        txtKodeGudang.setText("gudang");

        txtID.setEditable(false);

        jLabel2.setText("ID Barang Keluar");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btnUbah)
                        .addGap(18, 18, 18)
                        .addComponent(btnBersih))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateTanggal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtKodeGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbGudang, 0, 237, Short.MAX_VALUE)
                                .addComponent(cbBarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(dateTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtKodeGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnBersih))
                .addGap(41, 41, 41))
        );

        getContentPane().add(leftPanel, java.awt.BorderLayout.LINE_START);

        rightPanel.setBackground(new java.awt.Color(218, 244, 244));
        rightPanel.setPreferredSize(new java.awt.Dimension(670, 494));

        tabelBarangKeluar.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelBarangKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangKeluarMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelBarangKeluar);

        dateFilter2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateFilter2PropertyChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("-");

        dateFilter1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateFilter1PropertyChange(evt);
            }
        });

        rbFilter.setText("Filter tanggal:");
        rbFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(rbFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateFilter2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateFilter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateFilter2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbFilter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(rightPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBarangActionPerformed
        // TODO add your handling code here:
        String selected = cbBarang.getSelectedItem().toString();
        String sqlKode = "SELECT kode_barang FROM barang WHERE nama_barang = " + "'" + selected + "';";
        txtKodeBarang.setText(ConfigDB.selectSQL(sqlKode, "kode_barang"));
    }//GEN-LAST:event_cbBarangActionPerformed

    private void cbGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGudangActionPerformed
        // TODO add your handling code here:
        String selected = cbGudang.getSelectedItem().toString();
        String sqlKode = "SELECT kode_gudang FROM gudang WHERE nama_gudang = " + "'" + selected + "';";
        txtKodeGudang.setText(ConfigDB.selectSQL(sqlKode, "kode_gudang"));
    }//GEN-LAST:event_cbGudangActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String kodeBarang = txtKodeBarang.getText();
        String kodeGudang = txtKodeGudang.getText();
        java.sql.Date tanggal = new java.sql.Date(dateTanggal.getDate().getTime());
        String jumlah = txtJumlah.getText();
        String keterangan = txtKeterangan.getText();

        String[] fieldnya = {"tanggal", "kode_barang", "kode_gudang", "jumlah", "keterangan"};
        String[] valuenya = {tanggal.toString(), kodeBarang, kodeGudang, jumlah, keterangan};

        ConfigDB.simpan("barang_keluar", fieldnya, valuenya);
        ConfigDB.operasiKolomTabel("barang", "kode_barang", kodeBarang, "jumlah", Integer.parseInt(jumlah), "-");
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        ConfigDB.setTabel(tabelBarangKeluar, judulKolom, lebarKolom, sql);
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tabelBarangKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangKeluarMouseClicked
        // TODO add your handling code here:
        int row = tabelBarangKeluar.getSelectedRow();
        txtID.setText(tabelBarangKeluar.getModel().getValueAt(row, 0).toString());
        dateTanggal.setDate(Date.valueOf(tabelBarangKeluar.getModel().getValueAt(row, 1).toString()));
        cbBarang.setSelectedItem(tabelBarangKeluar.getModel().getValueAt(row, 3).toString());
        cbGudang.setSelectedItem(tabelBarangKeluar.getModel().getValueAt(row, 5).toString());
        txtJumlah.setText(tabelBarangKeluar.getModel().getValueAt(row, 6).toString());
        txtKeterangan.setText(tabelBarangKeluar.getModel().getValueAt(row, 7).toString());
        
    }//GEN-LAST:event_tabelBarangKeluarMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        ConfigDB.hapus("barang_keluar", "id_bk", txtID.getText());
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        ConfigDB.setTabel(tabelBarangKeluar, judulKolom, lebarKolom, sql);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
        java.sql.Date tanggal = new java.sql.Date(dateTanggal.getDate().getTime());
        String kodeBarang = txtKodeBarang.getText();
        String kodeGudang = txtKodeGudang.getText();
        String jumlah = txtJumlah.getText();
        String keterangan = txtKeterangan.getText();

        String[] fieldnya = {"tanggal", "kode_barang", "kode_gudang", "jumlah", "keterangan"};
        String[] valuenya = {tanggal.toString(), kodeBarang, kodeGudang, jumlah, keterangan};

        ConfigDB.ubah("barang_keluar", "id_bk", id, fieldnya, valuenya);
        JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        ConfigDB.setTabel(tabelBarangKeluar, judulKolom, lebarKolom, sql);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        dateTanggal.setDateFormatString("");
        cbBarang.setSelectedIndex(0);
        cbGudang.setSelectedIndex(0);
        txtJumlah.setText("");
        txtKeterangan.setText("");
    }//GEN-LAST:event_btnBersihActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        if(rbFilter.isSelected()) {
            java.sql.Date tanggal1 = new java.sql.Date(dateFilter1.getDate().getTime());
            java.sql.Date tanggal2 = new java.sql.Date(dateFilter2.getDate().getTime());
            
            String sqlBarangKeluarFilter =
            "SELECT barang_keluar.id_bk, barang_keluar.tanggal, barang.kode_barang, barang.nama_barang, gudang.kode_gudang, gudang.nama_gudang, barang_keluar.jumlah, barang_keluar.keterangan "
            + "FROM barang_keluar "
            + "INNER JOIN barang "
            + "ON barang_keluar.kode_barang = barang.kode_barang "
            + "INNER JOIN gudang "
            + "ON barang_keluar.kode_gudang = gudang.kode_gudang "
            + "WHERE barang_keluar.tanggal BETWEEN '" + tanggal1 + "' AND '" + tanggal2 + "'";
            
            ConfigDB.tampilLaporan("src/laporan/laporanBarangKeluar.jrxml", sqlBarangKeluarFilter);
        } else {
            String sqlBarangKeluar = "SELECT barang_keluar.id_bk, barang_keluar.tanggal, barang.kode_barang, barang.nama_barang, gudang.kode_gudang, gudang.nama_gudang, barang_keluar.jumlah, barang_keluar.keterangan FROM barang_keluar INNER JOIN barang ON barang_keluar.kode_barang = barang.kode_barang INNER JOIN gudang ON barang_keluar.kode_gudang = gudang.kode_gudang";
            ConfigDB.tampilLaporan("src/laporan/laporanBarangKeluar.jrxml", sqlBarangKeluar);
        }        
    }//GEN-LAST:event_btnCetakActionPerformed

    private void dateFilter2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateFilter2PropertyChange
        // TODO add your handling code here:
        if(dateFilter1.getDate()!=null && dateFilter2.getDate()!=null) {
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

            ConfigDB.setTabel(tabelBarangKeluar, judulKolom, lebarKolom, sqlFilter);
        }
    }//GEN-LAST:event_dateFilter2PropertyChange

    private void dateFilter1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateFilter1PropertyChange
        // TODO add your handling code here:
        if(dateFilter1.getDate()!=null && dateFilter2.getDate()!=null) {
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

            ConfigDB.setTabel(tabelBarangKeluar, judulKolom, lebarKolom, sqlFilter);
        }
    }//GEN-LAST:event_dateFilter1PropertyChange

    private void rbFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFilterActionPerformed
        // TODO add your handling code here:
        if(rbFilter.isSelected()) {
            dateFilter1.setEnabled(true);
            dateFilter2.setEnabled(true);
        } else {
            dateFilter1.setEnabled(false);
            dateFilter2.setEnabled(false);
            ConfigDB.setTabel(tabelBarangKeluar, judulKolom, lebarKolom, sql);
        }
    }//GEN-LAST:event_rbFilterActionPerformed

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
            java.util.logging.Logger.getLogger(BarangKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarangKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarangKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarangKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BarangKeluar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BarangKeluar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    public static javax.swing.JComboBox<String> cbBarang;
    public static javax.swing.JComboBox<String> cbGudang;
    private com.toedter.calendar.JDateChooser dateFilter1;
    private com.toedter.calendar.JDateChooser dateFilter2;
    private com.toedter.calendar.JDateChooser dateTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JRadioButton rbFilter;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTable tabelBarangKeluar;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtKodeGudang;
    // End of variables declaration//GEN-END:variables
}
