/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package induk;
import java.awt.HeadlessException;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
public class pengembalian extends javax.swing.JFrame {
 String id = Login.getKdUserLogin();
 private static final long serialVersionUID = 1L;
 public String pilihtanggal,converttanggal,converttanggal1,date,date1;
 String ambiltanggal;
 JasperReport JasRep;
 JasperPrint JasPri;
 Map param = new HashMap();
 JasperDesign JasDes;
 koneksi1 koneksi = new koneksi1();
 public Statement st;
 public Statement st2;
 public Statement st3,st4;
 public ResultSet rs;
 public ResultSet rs2;
  public ResultSet rs3;

 String sql;
    /**
     * Creates new form peminjaman
     */
 
 //nama saaz
    public pengembalian() {
        
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tanggal();
        tanggal1();
        isikdpengembalian();
        tanggalkembali();
        JasperReport JasRep;
        JasperPrint JasPri;
        Map param = new HashMap();
        JasperDesign JasDes;
        isitable();
        tbtanggal.setVisible(false);
        txttempo.setVisible(false);
        txttanggalpinjam.setVisible(false);
        txttanggalkembali.setVisible(false);
        jatuhtempo.setVisible(false);
        txtjumlah.setVisible(false);
        kdpengembalian.setEnabled(false);
        user.setText(id);
        user.setVisible(false);
        keterangan.setVisible(false);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tbtanggal = new javax.swing.JTextField();
        txttempo = new javax.swing.JTextField();
        tglkembali = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelpinjam = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        kdpengembalian = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtkdanggota = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtkdbuku = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtkdpeminjaman = new javax.swing.JTextField();
        tglpinjam = new com.toedter.calendar.JDateChooser();
        keterangan = new javax.swing.JTextField();
        txttanggalpinjam = new javax.swing.JTextField();
        txttanggalkembali = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btncari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jatuhtempo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnamabuku = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtjumlah = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        txtanamaanggota = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        hari = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtdenda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 159, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PENGEMBALIAN BUKU");

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
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37))))
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

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Tanggal Kembali");

        tglkembali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tglkembali.setDateFormatString("dd MMMM yyyy");
        tglkembali.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tglkembali.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglkembaliPropertyChange(evt);
            }
        });

        tabelpinjam.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelpinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpinjamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelpinjam);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kode Pengembalian");

        kdpengembalian.setEditable(false);
        kdpengembalian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kdpengembalian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Kode Anggota");

        txtkdanggota.setEditable(false);
        txtkdanggota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdanggota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tanggal Pinjam");

        txtkdbuku.setEditable(false);
        txtkdbuku.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdbuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Kode buku");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Denda  ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("kode Peminjaman");

        txtkdpeminjaman.setEditable(false);
        txtkdpeminjaman.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdpeminjaman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tglpinjam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tglpinjam.setDateFormatString("dd MMMM yyyy");
        tglpinjam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tglpinjam.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglpinjamPropertyChange(evt);
            }
        });

        keterangan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        keterangan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txttanggalkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttanggalkembaliActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Keranjang Pengembalian");

        btncari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cari.png"))); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtcari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Data Peminjaman");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nama Buku");

        txtnamabuku.setEditable(false);
        txtnamabuku.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnamabuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton2.setBackground(new java.awt.Color(0, 159, 80));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Kembalikan buku");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Buku Hilang ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bunceran.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bunceran.png"))); // NOI18N

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/print.png"))); // NOI18N
        jButton6.setText("Cetak");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtanamaanggota.setEditable(false);
        txtanamaanggota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtanamaanggota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Nama Anggota");

        hari.setEditable(false);
        hari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hariActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Keterlambatan");

        txtdenda.setEditable(false);
        txtdenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kdpengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(txtkdpeminjaman))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txttempo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20)
                            .addComponent(jLabel16))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtanamaanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkdanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkdbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tglkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttanggalkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(tglpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txttanggalpinjam)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jatuhtempo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtnamabuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hari, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdenda, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel11)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btncari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(102, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kdpengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkdpeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkdanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanamaanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkdbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnamabuku, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txttanggalpinjam)
                                .addComponent(jatuhtempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tglpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel5)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tglkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttanggalkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hari, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tbtanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtdenda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new menu_utama().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void tglkembaliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglkembaliPropertyChange
      try {
            if(tglkembali.getDate() != null){
                String pattern = "yyyy-MM-dd";
                 SimpleDateFormat format = new SimpleDateFormat(pattern);
                 converttanggal1 = String.valueOf(format.format(tglkembali.getDate()));
                 //mulai = String.valueOf(format.format(tbtanggal.getDate()));
                // mulai1.setText(mulai);
                // dari = Integer.parseInt(mulai1.getText().substring(8, 10));
                   SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
                    ambiltanggal = FormatTanggal.format(tglkembali.getDate());
     
            }
        
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_tglkembaliPropertyChange

    private void tabelpinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpinjamMouseClicked
        int baris = tabelpinjam.getSelectedRow();

        String kd_peminjaman = tabelpinjam.getValueAt(baris,1).toString();
        txtkdpeminjaman.setText(kd_peminjaman);
        String kd_anggota = tabelpinjam.getValueAt(baris,2).toString();
        txtkdanggota.setText(kd_anggota);
        String nama_anggota = tabelpinjam.getValueAt(baris,3).toString();
        txtanamaanggota.setText(nama_anggota);
        String kd_buku = tabelpinjam.getValueAt(baris,4).toString();
        txtkdbuku.setText(kd_buku);
        String nama_buku = tabelpinjam.getValueAt(baris,5).toString();
        txtnamabuku.setText(nama_buku);
        String tgl_pinjam = tabelpinjam.getValueAt(baris,6).toString();
        tbtanggal.setText(tgl_pinjam);
        String tgl = tabelpinjam.getValueAt(baris,6).toString();
        txttanggalpinjam.setText(tgl);
        String jatuh_tempo = tabelpinjam.getValueAt(baris,7).toString();
        jatuhtempo.setText(jatuh_tempo);
        tanggalterima();
        hitung_denda();
    }//GEN-LAST:event_tabelpinjamMouseClicked

    private void tglpinjamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglpinjamPropertyChange
       try {  
            if(tglpinjam.getDate() != null){
                String pattern = "yyyy-MM-dd";
                 SimpleDateFormat format = new SimpleDateFormat(pattern);
                 pilihtanggal = String.valueOf(format.format(tglpinjam.getDate()));
                   SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd-MMMMM-yyyy");
                   ambiltanggal = FormatTanggal.format(tglpinjam.getDate());
            }
        
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_tglpinjamPropertyChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String kode_buku = jTable1.getValueAt(baris,0).toString();
        txtkdbuku.setText(kode_buku);
        String nama_buku = jTable1.getValueAt(baris,1).toString();
        txtnamabuku.setText(nama_buku);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
       DefaultTableModel model = new DefaultTableModel();
       model.addColumn("No");
        model.addColumn("Kode Peminjaman");
        model.addColumn("Kode Anggota");
        model.addColumn("Nama Anggota");
        model.addColumn("Kode Buku");
        model.addColumn("Nama Buku");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Jatuh Tempo");
        try {
            int no=1;
            String sql = "SELECT kd_peminjaman, kd_anggota, nama_anggota,kd_buku, nama_buku, tgl_pinjam, jatuh_tempo from peminjaman WHERE ket != 'Sudah kembali' && kd_peminjaman like '%" + txtcari.getText() + "%'" +
            "or  nama_anggota like '%" + txtcari.getText() + " '";
    
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
            }
            tabelpinjam.setModel(model);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tambahpengembalian();

    }//GEN-LAST:event_jButton2ActionPerformed

       public Boolean kosong(){
        return (txtkdanggota.getText().equals("") || txtanamaanggota.getText().equals("") || txtkdpeminjaman.getText().equals("") || txtnamabuku.getText().equals("")|| txtkdbuku.getText().equals("")|| txttanggalpinjam.getText().equals(""));
    }
       
public void tambahpengembalian(){  
     if(kosong()){
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data !","Kesalahan", JOptionPane.ERROR_MESSAGE);
        }else{
         try{
        String sql = "INSERT INTO pengembalian_dan_denda VALUES('"+ kdpengembalian.getText() +"','"+ txtkdpeminjaman.getText() +"','"+ txtkdanggota.getText() +"','"+ txtanamaanggota.getText() +"','"+ txtkdbuku.getText() +"','"+ txtnamabuku.getText() +"','"+ txttanggalkembali.getText() +"','"+ txtdenda.getText() +"','"+ keterangan.getText() +"','1','1','"+user.getText()+"')";
        String sql2 = "UPDATE peminjaman SET ket='Sudah kembali' WHERE kd_anggota = '"+txtkdanggota.getText()+"'AND kd_buku ='"+txtkdbuku.getText()+"'";
        java.sql.Connection conn=(Connection)config.configDB();
        st = conn.prepareStatement(sql);
        st3 = conn.prepareStatement(sql2);
        st.executeUpdate(sql);
        st3.executeUpdate(sql2);
        JOptionPane.showMessageDialog(null,"Berhasil");
        isitable();
        tampiltmp();
 
              } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}
}
    
    
    
    
    
    
    
    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int hilang = 150000;
         txtdenda.setText(String.valueOf(hilang));
         keterangan.setText(String.valueOf("Hilang"));
         try {
            String sql1 = "INSERT INTO pengembalian_dan_denda VALUES('"+ kdpengembalian.getText() +"','"+ txtkdpeminjaman.getText() +"','"+ txtkdanggota.getText() +"','"+ txtanamaanggota.getText() +"','"+ txtkdbuku.getText() +"','"+ txtnamabuku.getText() +"','"+ txttanggalkembali.getText() +"','"+ txtdenda.getText() +"','Hilang','0','1','"+user.getText()+"')";
            String sql3 = "UPDATE peminjaman SET ket='Sudah Kembali' WHERE kd_peminjaman='"+ txtkdpeminjaman.getText() +"' AND kd_buku ='"+txtkdbuku.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            st = conn.prepareStatement(sql1);
            st3 = conn.prepareStatement(sql3);
            st.executeUpdate(sql1);
            st3.executeUpdate(sql3);
              JOptionPane.showMessageDialog(null, "Buku hilang dikenakan denda sebesar Rp.'"+ hilang +"'");
            tampiltmp();
            isitable();
        } catch (Exception e) {
             e.printStackTrace();
             JOptionPane.showMessageDialog(this, "Terjadi Kesalahan");
        }
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        print();
        clear();
    isikdpengembalian();
    kosongkankeranjang();
    tampiltmp();
    isitable();  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txttanggalkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttanggalkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttanggalkembaliActionPerformed

    private void hariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hariActionPerformed

    
    
    public void kosongkankeranjang(){
        txtkdbuku.setText(null);
        txtnamabuku.setText(null);
        txtjumlah.setText(null);
    }
    private void clear (){
        txtkdpeminjaman.setText(null);
        txtkdanggota.setText(null);
        txtanamaanggota.setText(null);
        txtkdbuku.setText(null);  
        txtdenda.setText(null);
        keterangan.setText(null);
        tglpinjam.setDate(null);
        hari.setText(null);
}

 
  public void tanggalterima(){
    try {
    converttanggal = tbtanggal.getText();
    java.util.Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(converttanggal);
    tglpinjam.setDate(date2);
}   catch (Exception e) {
    System.out.println(e);
}
}
    
    
    public void tanggalkembali(){
    try {
    date = txttempo.getText();
    Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
    tglkembali.setDate(date2);
}   catch (Exception e) {
    System.out.println(e);
} 
}
 
private void tanggal(){
Date ys=new Date();
SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
tbtanggal.setText(s.format(ys));
txttempo.setText(s.format(ys));
}


private void tanggal1(){
Date ys=new Date();
SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
txttanggalkembali.setText(s.format(ys));

}

    public void isikdpengembalian()
    {
        try {
        Connection con = conek.getkoneksi();
        Statement stt = con.createStatement();
        String sql = "select * from pengembalian_dan_denda order by kd_pengembalian desc";      
        ResultSet rs = stt.executeQuery(sql);                                
        
       if(rs.next()){
            String kodepengembalian = rs.getString("kd_pengembalian").substring(2);
                String AN = "" + (Integer.parseInt(kodepengembalian) + 1);
                String Nol = "";
                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}

              kdpengembalian.setText("PN" + Nol + AN);
            } else {
               kdpengembalian.setText("PN0001");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    


   
    private void isitable(){
       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Peminjaman");
        model.addColumn("Kode Anggota");
        model.addColumn("Nama Anggota");
        model.addColumn("Kode Buku");
        model.addColumn("Nama Buku");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Jatuh Tempo");
   
        try {
            int no=1;
            String sql = "SELECT kd_peminjaman, kd_anggota, nama_anggota,kd_buku, nama_buku, tgl_pinjam, jatuh_tempo from peminjaman WHERE ket != 'Sudah kembali'  ORDER BY DATE(tgl_pinjam)";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
      model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
            }
            tabelpinjam.setModel(model);
        } catch (SQLException e) {
        }
   }
    

   public void hitung_denda(){
        try {
            int bayar_denda = 2000;
            String total;
            DateFormat tgl = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal1 = txttanggalpinjam.getText();
            Date tglp = (Date)tgl.parse(tanggal1);
            String tanggal2 = txttanggalkembali.getText();
            Date tglk = (Date)tgl.parse(tanggal2);
            long dnd = Math.abs(tglp.getTime()-tglk.getTime());
            long telat = (TimeUnit.MILLISECONDS.toDays(dnd));
            if(telat >7){
                keterangan.setText("Telat");
                txtdenda.setText(String.valueOf((telat-7)*bayar_denda));
                 hari.setText(String.valueOf((telat-7 + " Hari")));
            }else{
                keterangan.setText("Tidak telat");
                txtdenda.setText(String.valueOf(telat*0));
                hari.setText(String.valueOf(( " 0 Hari")));
            }

        } catch (ParseException ex) {
            Logger.getLogger(pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   


public void status(){
    try{
        String sql1 = "UPDATE anggota set status='Tidak pinjam' WHERE kd_anggota='"+ txtkdanggota.getText() +"'";
        String sql2 = "UPDATE pengembalian_dan_denda SET ket='Sudah kembali' WHERE kd_buku='"+ txtkdbuku.getText() +"'";
        java.sql.Connection conn=(Connection)config.configDB();
        st = conn.prepareStatement(sql);
        st2 = conn.prepareStatement(sql1);
        st3 = conn.prepareStatement(sql2);
        st.executeUpdate(sql);
        st2.executeUpdate(sql1);
        JOptionPane.showMessageDialog(null,"Berhasil");
    }catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}
    

    public void tampiltmp(){
    try{
        Object[] baris = {"Kd_buku", "Nama_Buku", "Jumlah", };
        DefaultTableModel tabmode2 = new DefaultTableModel(null, baris);
        String sql = "select * from pengembalian_dan_denda INNER JOIN buku ON pengembalian_dan_denda.kd_buku = buku.kd_buku where pengembalian_dan_denda.kd_pengembalian='"+kdpengembalian.getText()+"'";      
        java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                String id = res.getString("Kd_buku");
                String tgl = res.getString("Nama_Buku");
                String ttl = res.getString("Jumlah");                
                String[] row = {id, tgl,  ttl};
                tabmode2.addRow(row);
            }
           
            jTable1.setModel(tabmode2);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    public void print (){
    try {
        File Report = new File ("src/Laporan/pengembalian.jrxml");
        JasDes = JRXmlLoader.load(Report);
        //param.clear();
        InputStream IMGInputStream = this.getClass().getResourceAsStream("pelita.png");
        param.put("logo", IMGInputStream);
       
        param.put("pengembalian_dan_denda_kd_pengembalian",(kdpengembalian.getText()));
        param.put("pengembalian_dan_denda_kd_anggota",(txtkdanggota.getText()));
        JasRep = JasperCompileManager.compileReport(JasDes);
        JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.conn);
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
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JTextField hari;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jatuhtempo;
    private javax.swing.JTextField kdpengembalian;
    private javax.swing.JTextField keterangan;
    private javax.swing.JTable tabelpinjam;
    private javax.swing.JTextField tbtanggal;
    private com.toedter.calendar.JDateChooser tglkembali;
    private com.toedter.calendar.JDateChooser tglpinjam;
    private javax.swing.JTextField txtanamaanggota;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtdenda;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkdanggota;
    private javax.swing.JTextField txtkdbuku;
    private javax.swing.JTextField txtkdpeminjaman;
    private javax.swing.JTextField txtnamabuku;
    private javax.swing.JTextField txttanggalkembali;
    private javax.swing.JTextField txttanggalpinjam;
    private javax.swing.JTextField txttempo;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
