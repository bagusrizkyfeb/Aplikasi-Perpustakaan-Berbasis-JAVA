/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package induk;
//

import java.awt.HeadlessException;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
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
public class Peminjaman extends javax.swing.JFrame {
    String id = Login.getKdUserLogin();
    private static final long serialVersionUID = 1L;
    public String pilihtanggal,converttanggal,converttanggal1,date,date1;
    String ambiltanggal;
    JasperReport JasRep;
    JasperPrint JasPri;
    Map param = new HashMap();
    JasperDesign JasDes;
    koneksi1 koneksi = new koneksi1();
    public Statement st,st2,st3;   
    public ResultSet rs,rs2;
    String sql;
    conek xxx;
    private static int kuota;
    public static void setKuota_Anggota(int kuota){
        Peminjaman.kuota = kuota; 
       
    }
    public static int getKuota_Anggota(){
    return kuota;
    
    }
    
    
    
    
    public Peminjaman() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        isikdpeminjaman();
        tanggal();
        tanggalterima();
        jatuhtempo();
        JasperReport JasRep;
        JasperPrint JasPri;
        Map param = new HashMap();
        JasperDesign JasDes;
        isitable();
        txtpinjam.setVisible(false);
        txttempo.setVisible(false);
        txtjumlah.setVisible(false);
        user.setText(id);
       user.setVisible(false);
         xxx = new conek ();
        xxx.Class();



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
        jLabel1 = new javax.swing.JLabel();
        kdpeminjaman = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtkdanggota = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        txtnamaanggota = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtkelas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtkdbuku = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnamabuku = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtpinjam = new javax.swing.JTextField();
        txttempo = new javax.swing.JTextField();
        tbtanggal = new com.toedter.calendar.JDateChooser();
        jthtempo = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelbuku = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton3 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtjumlah = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        kuota_pinjam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 159, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PEMINJAMAN BUKU");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kode Peminjaman");

        kdpeminjaman.setEditable(false);
        kdpeminjaman.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kdpeminjaman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Kode Anggota");

        txtkdanggota.setEditable(false);
        txtkdanggota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdanggota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtkdanggota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkdanggotaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkdanggotaKeyTyped(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 153));
        jToggleButton1.setText("Pilih Data Anggota");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nama ");

        txtnamaanggota.setEditable(false);
        txtnamaanggota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnamaanggota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtnamaanggota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnamaanggotaKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Kelas");

        txtkelas.setEditable(false);
        txtkelas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkelas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Kode Buku");

        txtkdbuku.setEditable(false);
        txtkdbuku.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtkdbuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nama Buku");

        txtnamabuku.setEditable(false);
        txtnamabuku.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnamabuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Tanggal Peminjaman");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Jatuh Tempo");

        tbtanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tbtanggal.setDateFormatString("dd MMMM yyyy");
        tbtanggal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbtanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbtanggalPropertyChange(evt);
            }
        });

        jthtempo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jthtempo.setDateFormatString("dd MMMM yyyy");
        jthtempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jthtempo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jthtempoPropertyChange(evt);
            }
        });

        tabelbuku.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelbuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelbukuMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tabelbuku);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Keranjangan Peminjaman");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Data Buku");

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

        jToggleButton3.setBackground(new java.awt.Color(0, 159, 80));
        jToggleButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("Masukan Ke Keranjang");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/print.png"))); // NOI18N
        jButton2.setText("Cetak");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtcari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btncari.setBackground(new java.awt.Color(153, 153, 153));
        btncari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cari.png"))); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setText("*Tanggal Jatuh tempo adalah 7 hari dari peminjaman buku");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bunceran.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bunceran.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Sisa Kuota Peminjaman :");

        kuota_pinjam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbtanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtkdbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnamaanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnamabuku, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttempo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jthtempo, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(75, 75, 75)
                        .addComponent(txtkdanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kdpeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kuota_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcari, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(kdpeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19)))
                                .addContainerGap(56, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(kuota_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkdanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnamaanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkdbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnamabuku, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbtanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jthtempo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new menu_utama().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        dataanggota2 fDB = new dataanggota2();
        fDB.fAB = this;
        fDB.setVisible(true);
        fDB.setResizable(false); 
        

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void tbtanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbtanggalPropertyChange
        try {
            if(tbtanggal.getDate() != null){
                String pattern = "yyyy-MM-dd";
                 SimpleDateFormat format = new SimpleDateFormat(pattern);
                 converttanggal = String.valueOf(format.format(tbtanggal.getDate()));
                 //mulai = String.valueOf(format.format(tbtanggal.getDate()));
                // mulai1.setText(mulai);
                // dari = Integer.parseInt(mulai1.getText().substring(8, 10));
                   SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
                    ambiltanggal = FormatTanggal.format(tbtanggal.getDate());
            }
        
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_tbtanggalPropertyChange

    private void jthtempoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jthtempoPropertyChange
      try {
            if(jthtempo.getDate() != null){
                String pattern = "yyyy-MM-dd";
                 SimpleDateFormat format = new SimpleDateFormat(pattern);
                 converttanggal1 = String.valueOf(format.format(jthtempo.getDate()));
                 //mulai = String.valueOf(format.format(tbtanggal.getDate()));
                // mulai1.setText(mulai);
                // dari = Integer.parseInt(mulai1.getText().substring(8, 10));
                   SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
                    ambiltanggal = FormatTanggal.format(jthtempo.getDate());
     
            }
        
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jthtempoPropertyChange

    private void tabelbukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbukuMouseClicked
        int baris = tabelbuku.getSelectedRow();
        String stok = "0";
        if(stok.equals(tabelbuku.getValueAt(baris, 7))){
            JOptionPane.showMessageDialog(null, "Stok buku habis !","Kesalahan", JOptionPane.ERROR_MESSAGE);  
        }else{
        String kd_buku = tabelbuku.getValueAt(baris,1).toString();
        txtkdbuku.setText(kd_buku);
        
        String nama_buku =tabelbuku.getValueAt(baris,3).toString();
        txtnamabuku.setText(nama_buku);
        }
    }//GEN-LAST:event_tabelbukuMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String kode_buku = jTable1.getValueAt(baris,0).toString();
        txtkdbuku.setText(kode_buku);
        String nama_buku = jTable1.getValueAt(baris,1).toString();
        txtnamabuku.setText(nama_buku);
        String jumlah =jTable1.getValueAt(baris, 2).toString();
        txtjumlah.setText(jumlah);
    }//GEN-LAST:event_jTable1MouseClicked

    public void kosongkankeranjang(){
        txtkdbuku.setText(null);
        txtnamabuku.setText(null);
        txtjumlah.setText(null);
    }
    
    
    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
     tambahpinjam();
     bersih();
     itemTerpilih1();
     tutup();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

   private void kt(){
        try{ 
             String sql = "select jml_pinjam from anggota where kd_anggota ='"+txtkdanggota.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
               String tampil  = res.getString("jml_pinjam"); 
                this.kuota_pinjam.setText(tampil); 
            }
        }catch (Exception e){ 
            System.err.println(e); 
        }
   }
   
   

   
   
     
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    print();
    clear();
    isikdpeminjaman();
    kosongkankeranjang();
    tampiltmp();
    }//GEN-LAST:event_jButton2ActionPerformed


    
    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Buku");
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("penerbit");
        model.addColumn("Tahun Terbit");
        model.addColumn("Stok");

        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "Select * from buku where kd_buku like '%" + txtcari.getText() + "%'" +
            "or  nama_buku like '%" + txtcari.getText() + "%'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            tabelbuku.setModel(model);
        } catch (Exception e) {
        }
     
    }//GEN-LAST:event_btncariActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

      try {
            String sql ="delete from peminjaman where kd_peminjaman='"+kdpeminjaman.getText()+"'AND kd_buku='"+txtkdbuku.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            st = conn.prepareStatement(sql);
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       kosongkankeranjang();
       tampiltmp();
       isitable();
       itemTerpilih1();
       tutup();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabelbukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbukuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelbukuMouseEntered

    private void txtnamaanggotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaanggotaKeyReleased

    }//GEN-LAST:event_txtnamaanggotaKeyReleased

    private void txtkdanggotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdanggotaKeyReleased

    }//GEN-LAST:event_txtkdanggotaKeyReleased

    private void txtkdanggotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdanggotaKeyTyped

    }//GEN-LAST:event_txtkdanggotaKeyTyped

    private void clear (){
        kdpeminjaman.setText(null);
        txtkdanggota.setText(null);
        txtnamaanggota.setText(null);
        txtkelas.setText(null);
        txtkdbuku.setText(null);
        txtnamabuku.setText(null);   
}
    
    
    private void bersih (){
        txtkdbuku.setText(null);
        txtnamabuku.setText(null);   
}
  
    
     public void tutup(){
        int jmlh;
        jmlh=Integer.parseInt(kuota_pinjam.getText());
        if (!kuota_pinjam.getText().equals("")) {
        jmlh=Integer.parseInt(kuota_pinjam.getText());
        if (jmlh <1) {
            jToggleButton3.setEnabled(false);    
        }else {
            jToggleButton3.setEnabled(true);    
            
        }
    }
     }

    
    
    
    
  public void print (){
    try {
        File Report = new File ("src/Laporan/peminjaman.jrxml");
        JasDes = JRXmlLoader.load(Report);
        //param.clear();
        InputStream IMGInputStream = this.getClass().getResourceAsStream("pelita.png");
        param.put("logo", IMGInputStream);
        param.put("peminjaman_kd_peminjaman",(kdpeminjaman.getText()));
        JasRep = JasperCompileManager.compileReport(JasDes);
        JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.conn);
        JasperViewer.viewReport(JasPri,false);
   } catch (JRException e) {
       JOptionPane.showMessageDialog(this, "Silahkan Pilih Data");
        }
}
    
    
    public void tanggalterima(){
    try {
    date = txtpinjam.getText();
    Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
    tbtanggal.setDate(date2);
}   catch (Exception e) {
    System.out.println(e);
}
   
    }
    
    
    public void jatuhtempo(){
    try {
    date = txttempo.getText();
    Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
    jthtempo.setDate(date2);
}   catch (Exception e) {
    System.out.println(e);
}
   
    }
    
    
    
private void tanggal(){
Date ys=new Date();
SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy"); //membuat object s dari class SimpleDateFormat dengan format (dd-MM-yyyy)yaitu (tanggal-bulan-tahun).
txtpinjam.setText(s.format(ys));
Calendar cal = Calendar.getInstance();
cal.add(Calendar.DAY_OF_MONTH, 7);
txttempo.setText(s.format(cal.getTime()));

//menampilkan tanggal hari ini pada Txttanggal 
}
    public void itemTerpilih1(){
    dataanggota2 fDB = new dataanggota2();
    fDB.fAB = this;
    txtkdanggota.setText(kdanggota);
    txtnamaanggota.setText(namaanggota);
    txtkelas.setText(kelas);
    kt();
   
     }
     
    
public String   kdbuku,namabuku,kdanggota,namaanggota,kelas;
 public String getkdbuku() {
        return kdbuku;
    }

    public String getnamabuku() {
        return namabuku;
    }
    public String getkdanggota() {
        return kdanggota;
    }

    public String getnamaanggota() {
        return namaanggota;
    }
    public String getkelas() {
        return kelas;
    }
    
  
    public void isikdpeminjaman()
    {
        try {
        Connection con = conek.getkoneksi();
        Statement stt = con.createStatement();
        String sql = "select * from peminjaman order by kd_peminjaman desc";      
        ResultSet rs = stt.executeQuery(sql);                                
        
       if(rs.next()){
            String kodebuk = rs.getString("kd_peminjaman").substring(2);
                String AN = "" + (Integer.parseInt(kodebuk) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}

              kdpeminjaman.setText("PJ" + Nol + AN);
            } else {
               kdpeminjaman.setText("PJ0001");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     public Boolean kosong(){
        return (txtkdanggota.getText().equals("") || txtnamaanggota.getText().equals("") || txtkdbuku.getText().equals("") || txtnamabuku.getText().equals(""));
    }
    public void tambahpinjam(){ 
        if(kosong()){
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data !","Kesalahan", JOptionPane.ERROR_MESSAGE);
        }else{
       try {
            String sql = "INSERT INTO peminjaman VALUES('"+ kdpeminjaman.getText() +"','"+ txtkdanggota.getText() +"','"+ txtnamaanggota.getText() +"','"+ txtkelas.getText() +"', '"+ txtkdbuku.getText() +"','"+ txtnamabuku.getText() +"','"+ converttanggal +"','"+ converttanggal1 +"','1','Belum kembali','1','"+user.getText()+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            st = conn.prepareStatement(sql);
            st.executeUpdate(sql);
         tampiltmp();
         isitable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }   
        }
}


    
    public void tampiltmp(){
        try{
        Object[] baris = {"Kd_buku", "Nama_Buku", "Jumlah", };
        DefaultTableModel tabmode2 = new DefaultTableModel(null, baris);
        String sql = "select * from peminjaman INNER JOIN buku ON peminjaman.kd_buku = buku.kd_buku where peminjaman.kd_peminjaman='"+kdpeminjaman.getText()+"'";      
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
    
    
    private void empty(){
        txtkdbuku.setText(null);
        txtnamabuku.setText(null);
}
    
    
     private void isitable(){
       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode Buku");
        model.addColumn("Kategori");
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("penerbit");
        model.addColumn("Tahun Terbit");
        model.addColumn("Stok");
        model.addColumn("RAK");
     
        
        try {
            int no=1;
            String sql = "select * from buku";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
      model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)});
            }
            tabelbuku.setModel(model);
        } catch (SQLException e) {
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
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private com.toedter.calendar.JDateChooser jthtempo;
    private javax.swing.JTextField kdpeminjaman;
    private javax.swing.JLabel kuota_pinjam;
    private javax.swing.JTable tabelbuku;
    private com.toedter.calendar.JDateChooser tbtanggal;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkdanggota;
    private javax.swing.JTextField txtkdbuku;
    private javax.swing.JTextField txtkelas;
    private javax.swing.JTextField txtnamaanggota;
    private javax.swing.JTextField txtnamabuku;
    private javax.swing.JTextField txtpinjam;
    private javax.swing.JTextField txttempo;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
