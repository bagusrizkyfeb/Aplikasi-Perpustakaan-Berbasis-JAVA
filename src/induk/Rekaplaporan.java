/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package induk;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import koneksi.conek;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Bagus Rizky
 */
public class Rekaplaporan extends javax.swing.JFrame {
    String id = Login.getKdUserLogin();
    private static final long serialVersionUID = 1L;
    public String pilihtanggal,converttanggal,date;
    String pinjam;
    koneksi1 koneksi = new koneksi1();
    JasperReport JasRep;
    JasperPrint JasPri;
    Map param = new HashMap(2);
    Map hash = new HashMap(2);
    Map dash = new HashMap(3);
    JasperDesign JasDes;

    /**
     * Creates new form kunjungan
     */
    public Rekaplaporan() {
      initComponents();
      this.setExtendedState(JFrame.MAXIMIZED_BOTH);
      tanggal();
      user.setText(id);
      user.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        txtkunjungan = new javax.swing.JTextField();
        tanggalsatu = new com.toedter.calendar.JDateChooser();
        tanggaldua = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        sortir = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 159, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REKAP LAPORAN PERPUSTAKAAN");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/utama.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pelita.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu Utama");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode kunjungan", "Kode Anggota", "Nama", "Kelas", "Tanggal", "Jam"
            }
        ));
        tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel1);

        txtkunjungan.setText("jTextField1");

        tanggalsatu.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalsatuPropertyChange(evt);
            }
        });

        tanggaldua.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalduaPropertyChange(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Cetak");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        sortir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PIlih Data", "Rekap Kunjungan", "Rekap Data Buku", "Rekap Peminjaman", "Rekap Pengembalian dan Denda", "Rekap Anggota", " " }));
        sortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("s.d");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(864, 864, 864)
                        .addComponent(txtkunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sortir, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(tanggalsatu, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tanggaldua, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sortir)
                            .addComponent(tanggalsatu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tanggaldua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(txtkunjungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new menu_utama().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked


   private void tabelkunjungan(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode kunjungan");
        model.addColumn("Kode Anggota");
        model.addColumn("Nama");
        model.addColumn("Kelas");
        model.addColumn("Tanggal");
        model.addColumn("Waktu");
     
        try {
            int no=1;
            String sql = "select * from kunjungan";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            tabel1.setModel(model);
        } catch (SQLException e) {
        }
        }
  
   
     private void tabelbuku(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Buku");
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("penerbit");
        model.addColumn("Tahun Terbit");
        model.addColumn("Stok");
     
        try {
            int no=1;
            String sql = "select * from buku";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
      model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
           tabel1.setModel(model);
        } catch (SQLException e) {
        }
        }
     
     
        private void tabelpeminjaman(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode peminjaman");
        model.addColumn("Kode Anggota");
        model.addColumn("Nama Anggota");
        model.addColumn("Kelas");
        model.addColumn("Kode Buku");
        model.addColumn("Nama Buku");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Jatuh Tempo");
        model.addColumn("Jumlah");
         model.addColumn("Status");
        try {
            int no=1;
            String sql = "select * from peminjaman";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
      model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)});
            }
           tabel1.setModel(model);
        } catch (SQLException e) {
        }
        }
        
        private void tabelpengembalian(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Pengembalian");
        model.addColumn("Kode Peminjaman");
        model.addColumn("Kode Anggota");
        model.addColumn("Nama Anggota");
        model.addColumn("Kode Buku");
        model.addColumn("Nama Buku");
        model.addColumn("Tanggal Kembali");
        model.addColumn("Denda");
        model.addColumn("Keterangan");
 
        try {
            int no=1;
            String sql = "select * from pengembalian_dan_denda";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
      model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9)});
            }
           tabel1.setModel(model);
        } catch (SQLException e) {
        }
        }
   
         private void tabelanggota(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Anggota");
        model.addColumn("NISN");
         model.addColumn("Nama");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Kelas");
        model.addColumn("No.Hp");
        model.addColumn("Alamat");
        try {
            int no=1;
            String sql = "select * from anggota";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
            model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)});
            }
          tabel1.setModel(model);
        } catch (SQLException e) {
        }
        }
        
   
    
    private void tanggalsatuPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalsatuPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalsatuPropertyChange

    private void tanggalduaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalduaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalduaPropertyChange

    
    //print laporan
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       try {
            if(sortir.getSelectedItem().toString().equals("Rekap Kunjungan")){
                laporankunjungan();
                
            }else if(sortir.getSelectedItem().toString().equals("Rekap Data Buku")){
                laporanbuku();
            }else if(sortir.getSelectedItem().toString().equals("Rekap Peminjaman")){
                laporanpeminjaman();
            }
            else if(sortir.getSelectedItem().toString().equals("Rekap Pengembalian dan Denda")){
                laporanpengembalian();
            }else if(sortir.getSelectedItem().toString().equals("Rekap Anggota")){
                laporananggota();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabel1MouseClicked

    
    
    //menmapilkan data di tabel
    private void sortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortirActionPerformed
     try {
            if(sortir.getSelectedItem().toString().equals("Rekap Kunjungan")){
                tabelkunjungan();
                 tanggalsatu.setEnabled(true);
                tanggaldua.setEnabled(true);
                
            }else if(sortir.getSelectedItem().toString().equals("Rekap Data Buku")){
                tabelbuku();
                tanggalsatu.setEnabled(false);
                tanggaldua.setEnabled(false);
            }else if(sortir.getSelectedItem().toString().equals("Rekap Peminjaman")){
                tabelpeminjaman();
                tanggalsatu.setEnabled(true);
                tanggaldua.setEnabled(true);
            }else if(sortir.getSelectedItem().toString().equals("Rekap Pengembalian dan Denda")){
                tabelpengembalian();
                tanggalsatu.setEnabled(true);
                tanggaldua.setEnabled(true);
            }
            else if(sortir.getSelectedItem().toString().equals("Rekap Anggota")){
                tabelanggota();
                tanggalsatu.setEnabled(false);
                tanggaldua.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan");
        }
    }//GEN-LAST:event_sortirActionPerformed

    
private void tanggal(){
Date ys=new Date();
SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
txtkunjungan.setText(s.format(ys));
}
    
    
   public void laporankunjungan (){
    try {
        String Response;
        //Response = JOptionPane.showInputDialog(null, "Masukan Bulan \n contoh : Bulan Januari maka tulis 1","Laporan Per - Bulan", JOptionPane.QUESTION_MESSAGE);;
        File Report = new File ("src/Laporan/kunjungan.jrxml");
        JasDes = JRXmlLoader.load(Report);
        //param.clear();
        InputStream IMGInputStream = this.getClass().getResourceAsStream("pelita.png");
        hash.put("logo", IMGInputStream);
        hash.put("satu",tanggalsatu.getDate());
        hash.put("dua",tanggaldua.getDate());
        JasRep = JasperCompileManager.compileReport(JasDes);
        JasPri = JasperFillManager.fillReport(JasRep, hash, koneksi.conn);
        JasperViewer.viewReport(JasPri,false);
   } catch (JRException e) {
       JOptionPane.showMessageDialog(this, "Silahkan Pilih Data");
        }
}
   
   
   public void laporanbuku(){
    try {
        String Response;
        //Response = JOptionPane.showInputDialog(null, "Masukan Bulan \n contoh : Bulan Januari maka tulis 1","Laporan Per - Bulan", JOptionPane.QUESTION_MESSAGE);;
        File Report = new File ("src/Laporan/rekap_buku.jrxml");
        JasDes = JRXmlLoader.load(Report);
        //param.clear();
        InputStream IMGInputStream = this.getClass().getResourceAsStream("pelita.png");
        hash.put("logo", IMGInputStream);
        JasRep = JasperCompileManager.compileReport(JasDes);
        JasPri = JasperFillManager.fillReport(JasRep, hash, koneksi.conn);
        JasperViewer.viewReport(JasPri,false);
   } catch (JRException e) {
       JOptionPane.showMessageDialog(this, "Silahkan Pilih Data");
        }
}
   
     public void laporanpeminjaman(){
    try {
        String Response;
        //Response = JOptionPane.showInputDialog(null, "Masukan Bulan \n contoh : Bulan Januari maka tulis 1","Laporan Per - Bulan", JOptionPane.QUESTION_MESSAGE);;
        File Report = new File ("src/Laporan/rekap_peminjaman.jrxml");
        JasDes = JRXmlLoader.load(Report);
        //param.clear();
        InputStream IMGInputStream = this.getClass().getResourceAsStream("pelita.png");
        hash.put("logo", IMGInputStream);
        hash.put("satu",tanggalsatu.getDate());
        hash.put("dua",tanggaldua.getDate());
        JasRep = JasperCompileManager.compileReport(JasDes);
        JasPri = JasperFillManager.fillReport(JasRep, hash, koneksi.conn);
        JasperViewer.viewReport(JasPri,false);
   } catch (JRException e) {
       JOptionPane.showMessageDialog(this, "Silahkan Pilih Data");
        }
}
     
       public void laporanpengembalian(){
    try {
        String Response;
        //Response = JOptionPane.showInputDialog(null, "Masukan Bulan \n contoh : Bulan Januari maka tulis 1","Laporan Per - Bulan", JOptionPane.QUESTION_MESSAGE);;
        File Report = new File ("src/Laporan/rekap_denda.jrxml");
        JasDes = JRXmlLoader.load(Report);
        //param.clear();
        InputStream IMGInputStream = this.getClass().getResourceAsStream("pelita.png");
        hash.put("logo", IMGInputStream);
        hash.put("satu",tanggalsatu.getDate());
        hash.put("dua",tanggaldua.getDate());
        JasRep = JasperCompileManager.compileReport(JasDes);
        JasPri = JasperFillManager.fillReport(JasRep, hash, koneksi.conn);
        JasperViewer.viewReport(JasPri,false);
   } catch (JRException e) {
       JOptionPane.showMessageDialog(this, "Silahkan Pilih Data");
        }
}

     
      public void laporananggota(){
    try {
        String Response;
        //Response = JOptionPane.showInputDialog(null, "Masukan Bulan \n contoh : Bulan Januari maka tulis 1","Laporan Per - Bulan", JOptionPane.QUESTION_MESSAGE);;
        File Report = new File ("src/Laporan/rekap_anggota.jrxml");
        JasDes = JRXmlLoader.load(Report);
        //param.clear();
        InputStream IMGInputStream = this.getClass().getResourceAsStream("pelita.png");
        hash.put("logo", IMGInputStream);
        JasRep = JasperCompileManager.compileReport(JasDes);
        JasPri = JasperFillManager.fillReport(JasRep, hash, koneksi.conn);
        JasperViewer.viewReport(JasPri,false);
   } catch (JRException e) {
       JOptionPane.showMessageDialog(this, "Silahkan Pilih Data");
        }
}
    

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
            java.util.logging.Logger.getLogger(Rekaplaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rekaplaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rekaplaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rekaplaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rekaplaporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox sortir;
    private javax.swing.JTable tabel1;
    private com.toedter.calendar.JDateChooser tanggaldua;
    private com.toedter.calendar.JDateChooser tanggalsatu;
    private javax.swing.JTextField txtkunjungan;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
