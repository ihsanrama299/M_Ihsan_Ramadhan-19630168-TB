package aplikasigudang;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import java.io.File;

import net.sf.jasperreports.engine.JasperCompileManager; 
import net.sf.jasperreports.engine.JasperFillManager; 
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery; 
import net.sf.jasperreports.engine.design.JasperDesign; 
import net.sf.jasperreports.engine.xml.JRXmlLoader; 
import net.sf.jasperreports.view.JasperViewer;

import frame.*;

public class ConfigDB {
    
    public static String loginUsername = "";
    public static String loginPassword = "";
    public static boolean isLoggedIn = false;
    
    private static final String dbUrl = "jdbc:mysql://localhost:3306/dbgudang";
    private static final String dbUser = "root";
    private static final String dbPass = "";
    
    public Connection koneksiDatabase;
    
    public ConfigDB(){}
    
    public static Connection getKoneksiDB() throws SQLException {        
        try {
            Driver driverku = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driverku);
        }
        
        catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return DriverManager.getConnection(dbUrl, dbUser, dbPass);        
    }
            
    public static boolean login(String username, String password) throws SQLException {            
        String sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
            
        boolean loggedin = false;    
            
        Statement perintah = getKoneksiDB().createStatement();
        ResultSet dataset = perintah.executeQuery(sql);
        dataset.last();
        int baris = dataset.getRow();
            
        if(baris != 0){                
            loginUsername = dataset.getString("username");
            loginPassword = dataset.getString("password");
            isLoggedIn = true;
            
            new Menu().setVisible(true);
                
            loggedin = true;
        } else {
            JOptionPane.showMessageDialog(null, "Username atau Password Salah, Silahkan Masukan Kembali", "Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }
            
        return loggedin;            
    }
        
    public static void logout(JFrame context){
        loginUsername = "";
        loginPassword = "";
        isLoggedIn = false;
        context.dispose();
        new Menu().setVisible(true);
        System.out.println("Berhasil Logout");
    }
    
    public static boolean duplikasiPrimaryKey(String tabel, String primary, String isi) {        
        boolean hasil = false;
        
        try {
            String SQLCari = "SELECT * FROM "+tabel+" WHERE "+primary+" = '"+isi+"'";
            Statement perintah = getKoneksiDB().createStatement();
            ResultSet dataset = perintah.executeQuery(SQLCari);
            
            if (dataset.next()) {
                hasil = true;
            } else {
                hasil = false;
            }
            
            perintah.close();
            dataset.close();
            getKoneksiDB().close();
        }
        
        catch(Exception e) {
            System.out.println(e.toString());
        }
        
        return hasil;        
    }
    
    public static String getFieldArray(String[] Fieldnya) {        
        String hasil = "";
        int deteksi = Fieldnya.length-1;
        
        try {
            
            for (int i = 0; i < Fieldnya.length; i++) {               
                if(i == deteksi) {
                    hasil = hasil + Fieldnya[i];
                } else {
                    hasil = hasil + Fieldnya[i] + ",";
                }                
            }            
        } catch (Exception e) {            
            System.out.println(e.toString());            
        }
        
        return "(" + hasil + ")";        
    }
    
    
    public static String getValueArray(String[] Valuenya) {        
        String hasil = "";
        int deteksi = Valuenya.length-1;
        
        try {            
            for (int i = 0; i < Valuenya.length; i++) {            
                if (i == deteksi) {
                    hasil = hasil + "'" + Valuenya[i] + "'";
                } else {
                    hasil = hasil + "'" + Valuenya[i] + "'" + ",";
                }            
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    
        return "(" + hasil + ")";        
    }
    
    public static String getEditFieldValueArray(String[] Fieldnya, String[] Valuenya) {        
        String hasil = "";
        int deteksi = Fieldnya.length-1;
        
        try {            
            for (int i = 0; i < Fieldnya.length; i++) {
                
                if (i == deteksi) {
                    hasil = hasil +Fieldnya[i]+"="+"'"+Valuenya[i]+"'";
                } else {
                    hasil = hasil + Fieldnya[i]+"='"+Valuenya[i]+"',";
                }                
            }            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return hasil;        
    }
    
    public static void simpan(String tabelnya, String[] fieldnya, String[] valuenya) {        
        try {
            
            String sqlSave = "INSERT INTO " + tabelnya + " " + getFieldArray(fieldnya) + " VALUES" + getValueArray(valuenya);
            Statement perintah = getKoneksiDB().createStatement();
            perintah.executeUpdate(sqlSave);
            perintah.close();
            getKoneksiDB().close();
            System.out.println(sqlSave);
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }        
    }
    
    public static void hapus(String tabelnya, String primary, String value) {        
        try {
            
            String SQLDelete = "DELETE FROM " + tabelnya + " WHERE " + primary + " = '" + value + "'";
            Statement perintah = getKoneksiDB().createStatement();
            perintah.executeUpdate(SQLDelete);
            perintah.close();
            getKoneksiDB().close();
            System.out.println(primary+" = "+value+" Berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }        
    }
    
    public static void ubah(String tabelnya, String primary, String isi, String[] fieldnya, String[] valuenya) {        
        try {
            
            String SQLEdit = "UPDATE " + tabelnya + " SET " + getEditFieldValueArray(fieldnya, valuenya) + " WHERE " + primary + " = '" + isi +"'";
            Statement perintah = getKoneksiDB().createStatement();
            perintah.executeUpdate(SQLEdit);
            perintah.close();
            getKoneksiDB().close();
            System.out.println(primary + " = " + isi + " Berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }        
    }
    
    public static String selectSQL(String sql, String namaKolom) {        
        String kolom = "";
        try {                        
            Statement perintah = getKoneksiDB().createStatement();

            ResultSet dataset = perintah.executeQuery(sql);
            dataset.last();
            
            kolom = dataset.getString(namaKolom);
            
            perintah.close();
            getKoneksiDB().close();            
        } catch (Exception e) {
            System.out.println(e.toString());
        }        
        return kolom;
    }
    
    public static void operasiKolomTabel(String tabelnya, String primary, String isi, String fieldnya, int valuenya, String operator) {        
        try {
            
            String SQLEdit = "UPDATE " + tabelnya + " SET " + fieldnya + " = " + fieldnya + " " + operator + " " + valuenya + " WHERE " + primary + " = '" + isi +"'";
            Statement perintah = getKoneksiDB().createStatement();
            perintah.executeUpdate(SQLEdit);
            perintah.close();
            getKoneksiDB().close();
            System.out.println(SQLEdit);
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }        
    }
    
    public static void setJudulTabel(JTable Tabelnya, String[] Kolomnya) {        
        try {            
            DefaultTableModel modelnya = new DefaultTableModel();
            Tabelnya.setModel(modelnya);
            
            for (int i = 0; i < Kolomnya.length; i++) {                
                modelnya.addColumn(Kolomnya[i]);                
            }            
        } catch (Exception e) {            
            System.out.println(e.toString());            
        }        
    }
    
    public static void setLebarKolomTabel(JTable Tabelnya, int[] Kolomnya) {        
        try {            
            TableColumn kolom = new TableColumn();
            Tabelnya.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            
            for (int i = 0; i < Kolomnya.length; i++) {                
                kolom = Tabelnya.getColumnModel().getColumn(i);
                kolom.setPreferredWidth(Kolomnya[i]);                
            }
            
        } catch (Exception e) {            
            System.out.println(e.toString());            
        }        
    }
    
    public static Object[][] dataTabel(String sql, int jumlahKolom) {            
        Object[][] data = null;
            
        try {                
            Statement perintah = getKoneksiDB().createStatement();
            ResultSet dataset = perintah.executeQuery(sql);
            dataset.last();
            int baris = dataset.getRow();
            dataset.beforeFirst();                                
              
            int j = 0;
                
            data = new Object[baris][jumlahKolom];
                               
            while (dataset.next()) {
                    
                for (int i = 0; i < jumlahKolom; i++) {                        
                    data[j][i] = dataset.getString(i+1);                       
                }                    
                j++;                    
            }                
        } catch (Exception e) {                
            System.out.println(e.toString());                
        }
            
        return data;            
    }
        
    public static void tampilTabel(JTable tabelnya, String[] judul, String sql) {            
        try {                
            String[] title = judul;
            int jum = judul.length;
            tabelnya.setModel(new DefaultTableModel(dataTabel(sql, jum), title));                
        } catch (Exception e) {                
            System.out.println(e.toString());                
        }            
    }
        
    public static void setTabel(JTable tabelnya, String[] kolomnya, int[] lebarKolom, String sql){
        setJudulTabel(tabelnya, kolomnya);
        tampilTabel(tabelnya, kolomnya, sql);
        setLebarKolomTabel(tabelnya, lebarKolom);
    }
        
    public static void tampilLaporan(String laporanFile, String sql){
        try {
            File file = new File(laporanFile);
            JasperDesign jasDes = JRXmlLoader.load(file);

            JRDesignQuery sqlQuery = new JRDesignQuery();
            sqlQuery.setText(sql);
            jasDes.setQuery(sqlQuery);

            JasperReport JR = JasperCompileManager.compileReport(jasDes);
            JasperPrint JP = JasperFillManager.fillReport(JR,null,getKoneksiDB()); 
            JasperViewer.viewReport(JP, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.toString()); 
        }
    }

    public static void populateComboBox(JComboBox comboBox, String sql, String namaKolom) throws SQLException {
            Statement perintah = getKoneksiDB().createStatement();
            ResultSet dataset = perintah.executeQuery(sql);
            
            while(dataset.next()){
                String data = dataset.getString(namaKolom);
                comboBox.addItem(data);
            }
    }

}
