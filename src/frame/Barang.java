/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;
import aplikasigudang.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Barang extends javax.swing.JFrame {
    private String[] judulKolom = {"kode_barang", "nama_barang", "kategori", "jumlah", "keterangan"};
    private int[] lebarKolom =    {      100,           200,        150,        50,        250};
    private String sql = "SELECT * FROM barang";

    /**
     * Creates new form Barang
     */
    public Barang() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ConfigDB.setTabel(tabelBarang, judulKolom, lebarKolom, sql);        
        
        if(ConfigDB.isLoggedIn == false){
            leftPanel.setVisible(false);
        }
        
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
        btnCetak = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKategori = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Barang");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        topPanel.setBackground(new java.awt.Color(14, 190, 190));
        topPanel.setPreferredSize(new java.awt.Dimension(849, 75));

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data Barang");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(286, 286, 286)
                .addComponent(btnCetak)
                .addGap(30, 30, 30))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnCetak))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        leftPanel.setBackground(new java.awt.Color(141, 223, 223));
        leftPanel.setPreferredSize(new java.awt.Dimension(350, 380));

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Kategori");

        jLabel4.setText("Jumlah");

        jLabel5.setText("Keterangan");

        btnSimpan.setText("Simpan");
        btnSimpan.setMaximumSize(new java.awt.Dimension(67, 25));
        btnSimpan.setMinimumSize(new java.awt.Dimension(67, 25));
        btnSimpan.setPreferredSize(new java.awt.Dimension(67, 25));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane2.setViewportView(txtKeterangan);

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

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnUbah)
                        .addGap(18, 18, 18)
                        .addComponent(btnBersih))
                    .addComponent(txtKode)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtKategori)
                    .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnBersih))
                .addContainerGap())
        );

        getContentPane().add(leftPanel, java.awt.BorderLayout.LINE_START);

        rightPanel.setBackground(new java.awt.Color(218, 244, 244));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Cari Kode/Nama");

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelBarang);

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rightPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(451, 451, 451))
            .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rightPanelLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(rightPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String kode = txtKode.getText();
        String nama = txtNama.getText();
        String kategori = txtKategori.getText();
        String jumlah = txtJumlah.getText();
        String keterangan = txtKeterangan.getText();

        String[] fieldnya = {"kode_barang", "nama_barang", "kategori", "jumlah", "keterangan"};
        String[] valuenya = {kode, nama, kategori, jumlah, keterangan};

        if (ConfigDB.duplikasiPrimaryKey("barang", "kode_barang", txtKode.getText())) {

            JOptionPane.showMessageDialog(null, "Kode barang sudah ada");

        } else {

            ConfigDB.simpan("barang", fieldnya, valuenya);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            ConfigDB.setJudulTabel(tabelBarang, judulKolom);
            ConfigDB.tampilTabel(tabelBarang, judulKolom, sql);
            ConfigDB.setLebarKolomTabel(tabelBarang, lebarKolom);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        ConfigDB.hapus("barang", "kode_barang", txtKode.getText());
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        ConfigDB.setJudulTabel(tabelBarang, judulKolom);
        ConfigDB.tampilTabel(tabelBarang, judulKolom, sql);
        ConfigDB.setLebarKolomTabel(tabelBarang, lebarKolom);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        String[] fieldnya = {"kode_barang", "nama_barang", "kategori", "jumlah", "keterangan"};
        String[] valuenya = {txtKode.getText(), txtNama.getText(), txtKategori.getText(), txtJumlah.getText(), txtKeterangan.getText()};

        ConfigDB.ubah("barang","kode_barang",txtKode.getText(), fieldnya, valuenya);
        JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        ConfigDB.setJudulTabel(tabelBarang, judulKolom);
        ConfigDB.tampilTabel(tabelBarang, judulKolom, sql);
        ConfigDB.setLebarKolomTabel(tabelBarang, lebarKolom);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        // TODO add your handling code here:
        txtKode.setText("");
        txtNama.setText("");
        txtKategori.setText("");
        txtJumlah.setText("");
        txtKeterangan.setText("");
    }//GEN-LAST:event_btnBersihActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        // TODO add your handling code here:
        int row = tabelBarang.getSelectedRow();
        txtKode.setText(tabelBarang.getModel().getValueAt(row, 0).toString());
        txtNama.setText(tabelBarang.getModel().getValueAt(row, 1).toString());
        txtKategori.setText(tabelBarang.getModel().getValueAt(row, 2).toString());
        txtJumlah.setText(tabelBarang.getModel().getValueAt(row, 3).toString());
        txtKeterangan.setText(tabelBarang.getModel().getValueAt(row, 4).toString());
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        // TODO add your handling code here:
        String sql ="SELECT*FROM barang WHERE kode_barang LIKE'%"+txtCari.getText()+"%' OR nama_barang LIKE '%"+txtCari.getText()+"%'";
        
        ConfigDB.setJudulTabel(tabelBarang, judulKolom);
        ConfigDB.tampilTabel(tabelBarang, judulKolom, sql);
        ConfigDB.setLebarKolomTabel(tabelBarang, lebarKolom);
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        ConfigDB.tampilLaporan("src/laporan/laporanBarang.jrxml","SELECT*FROM barang");
    }//GEN-LAST:event_btnCetakActionPerformed

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
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
