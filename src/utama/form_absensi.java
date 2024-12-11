package utama;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.Timer;
import java.sql.*;

public class form_absensi extends javax.swing.JFrame{
    
    private final javax.swing.Timer timer;
    private Connection connection;
    private Map<String, String[]> database = new HashMap<>();
    
    public form_absensi() {
        initComponents();
        
        updateDateTime();
        
        // Memanggil method koneksi ke database
        koneksi_to_db.setupDatabaseConnection();
        
        timer = new Timer(1000, (ActionEvent e) -> {
            updateTime();
        });
        timer.start();
        
        uid_tf.addActionListener((ActionEvent e) -> {
            String uid = uid_tf.getText();
            getDataMhs(uid);
        });
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        uid_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        matkul_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jam_lbl = new javax.swing.JLabel();
        tgl_lbl = new javax.swing.JLabel();
        clear_btn = new javax.swing.JButton();
        simpan_btn = new javax.swing.JButton();
        nim_tf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        status_cb = new javax.swing.JComboBox<>();
        login_btn1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo Jurusanl.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 67, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Absensi Mahasiswa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jurusan Teknik Elektro");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uid_tf.setBackground(new java.awt.Color(255, 255, 204));
        uid_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        uid_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uid_tfActionPerformed(evt);
            }
        });
        jPanel2.add(uid_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nama");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, -1));

        nama_tf.setBackground(new java.awt.Color(255, 255, 204));
        nama_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nama_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_tfActionPerformed(evt);
            }
        });
        nama_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nama_tfKeyPressed(evt);
            }
        });
        jPanel2.add(nama_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("NIM");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 188, -1));

        matkul_tf.setEditable(false);
        matkul_tf.setBackground(new java.awt.Color(255, 255, 204));
        matkul_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        matkul_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matkul_tfActionPerformed(evt);
            }
        });
        jPanel2.add(matkul_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 188, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Status");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 50, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Jam");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tanggal");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, -1));

        jam_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jam_lbl.setText("00:00:00");
        jPanel2.add(jam_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 100, -1));

        tgl_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tgl_lbl.setText("01-01-2000");
        jPanel2.add(tgl_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 100, -1));

        clear_btn.setBackground(new java.awt.Color(255, 255, 204));
        clear_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear_btn.setText("Hapus");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        jPanel2.add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 80, -1));

        simpan_btn.setBackground(new java.awt.Color(255, 255, 204));
        simpan_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        simpan_btn.setText("Simpan");
        simpan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_btnActionPerformed(evt);
            }
        });
        jPanel2.add(simpan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        nim_tf.setBackground(new java.awt.Color(255, 255, 204));
        nim_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nim_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nim_tfActionPerformed(evt);
            }
        });
        nim_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nim_tfKeyPressed(evt);
            }
        });
        jPanel2.add(nim_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 188, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Mata Kuliah");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 188, -1));

        status_cb.setBackground(new java.awt.Color(255, 255, 204));
        status_cb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        status_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hadir", "Izin", "Sakit", "Alpa" }));
        jPanel2.add(status_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 110, -1));

        login_btn1.setBackground(new java.awt.Color(255, 255, 204));
        login_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_btn1.setText("Login");
        login_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(login_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 600, 200));

        jLabel10.setText(".");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 20, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uid_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uid_tfActionPerformed
    }//GEN-LAST:event_uid_tfActionPerformed

    private void getDataMhs(String uid) {
        Connection connection = koneksi_to_db.getConnection();
        if (connection != null) {
            String sql = "SELECT * FROM data_mahasiswa WHERE uid = ? OR nama = ? OR nim = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Ambil input dari text field
                String inputNama = nama_tf.getText().trim();
                String inputNim = nim_tf.getText().trim();

                // Isi parameter
                statement.setString(1, uid.isEmpty() ? "" : uid);
                statement.setString(2, inputNama.isEmpty() ? "" : inputNama);
                statement.setString(3, inputNim.isEmpty() ? "" : inputNim);

                ResultSet rs = statement.executeQuery();
                if (rs.next()) {
                    // Isi text field dengan data dari database
                    uid = rs.getString("uid");
                    uid_tf.setText(uid);
                    nama_tf.setText(rs.getString("nama"));
                    nim_tf.setText(rs.getString("nim"));

                    // Perbarui label matkul dan lainnya
                    updateLabelMatkul();
                } else {
                    JOptionPane.showMessageDialog(null, "Data mahasiswa tidak ditemukan.");
                    clearFields();
                }
            } catch (SQLException e) {
                System.out.println("Gagal mengambil data mahasiswa!");
                e.printStackTrace();
            }
        } else {
            System.out.println("Koneksi belum diinisialisasi");
        }
    }

    private void simpanDataAbsensi(String uid, String nim, String nama, String matkul, String tgl, String jam, String status){
        Connection connection = koneksi_to_db.getConnection();
        if(connection != null) {
            String query = "INSERT INTO data_absensi (uid, nim, nama, matkul, jam, tgl, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)){
                statement.setString(1, uid);
                statement.setString(2, nim);
                statement.setString(3, nama);
                statement.setString(4, matkul);
                statement.setString(5, jam);
                statement.setString(6, tgl);
                statement.setString(7, status);
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Berhasil disimpan!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal disimpan!");
                e.printStackTrace();
            }
        }
    }
    
    private void updateDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        tgl_lbl.setText(dateFormat.format(new Date()));
        updateTime(); // Memperbarui waktu saat aplikasi dimulai
    }
    
    private void updateTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        jam_lbl.setText(timeFormat.format(new Date())); // Memperbarui label jam
    }
    
    private String getHariSekarang() {
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE"); // Format hari (contoh: Senin, Selasa)
        return dayFormat.format(new Date()); // Mengembalikan nama hari sekarang
    }

    private String getJamSekarang() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); // Format waktu (contoh: 07:00:00)
        return timeFormat.format(new Date()); // Mengembalikan waktu sekarang
    }
    
    private void updateLabelMatkul() {
        Connection connection = koneksi_to_db.getConnection();
        if (connection != null) {
            String hari = getHariSekarang(); // Dapatkan hari sekarang
            String jam = getJamSekarang();   // Dapatkan jam sekarang
            String sql = "SELECT matkul FROM mata_kuliah WHERE hari = ? AND ? BETWEEN jam_mulai AND jam_selesai"; // Query SQL dengan filter
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, hari); // Set parameter hari
                statement.setString(2, jam);  // Set parameter jam
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        matkul_tf.setText(resultSet.getString("matkul")); // Set teks label
                    } else {
                        matkul_tf.setText("Tidak ada mata kuliah"); // Jika tidak ditemukan
                    }
                }
            } catch (SQLException e) {
                System.out.println("Gagal mengambil mata kuliah!");
                e.printStackTrace();
            }
        } else {
            System.out.println("Koneksi belum diinisialisasi");
        }
    }

    private void clearFields() {
        uid_tf.setText("");
        nama_tf.setText("");
        matkul_tf.setText("");
        nim_tf.setText("");
        status_cb.setSelectedIndex(0);
    }
    
    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        clearFields();
    }//GEN-LAST:event_clear_btnActionPerformed

    private void simpan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_btnActionPerformed
        String uid = uid_tf.getText().trim();
        String nama = nama_tf.getText().trim();
        String nim = nim_tf.getText().trim();
        String status = (String) status_cb.getSelectedItem();
        String jam = jam_lbl.getText();
        String tgl = tgl_lbl.getText();
        String matkul = matkul_tf.getText().trim();
        
        simpanDataAbsensi(uid, nim, nama, matkul, tgl, jam, status);
    }//GEN-LAST:event_simpan_btnActionPerformed

    private void matkul_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matkul_tfActionPerformed
    }//GEN-LAST:event_matkul_tfActionPerformed

    private void nim_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nim_tfActionPerformed
    }//GEN-LAST:event_nim_tfActionPerformed

    private void nama_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_tfActionPerformed
    }//GEN-LAST:event_nama_tfActionPerformed

    private void nim_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nim_tfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String uid = ""; // UID tidak relevan untuk pencarian ini
            getDataMhs(uid); // Panggil metode untuk mengambil data
        }
    }//GEN-LAST:event_nim_tfKeyPressed

    private void nama_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nama_tfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String uid = ""; // UID tidak relevan untuk pencarian ini
            getDataMhs(uid); // Panggil metode untuk mengambil data
        }
    }//GEN-LAST:event_nama_tfKeyPressed

    private void login_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btn1ActionPerformed
        new utama.pilih_role().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_login_btn1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(form_absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_absensi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jam_lbl;
    private javax.swing.JButton login_btn1;
    private javax.swing.JTextField matkul_tf;
    private javax.swing.JTextField nama_tf;
    private javax.swing.JTextField nim_tf;
    private javax.swing.JButton simpan_btn;
    private javax.swing.JComboBox<String> status_cb;
    private javax.swing.JLabel tgl_lbl;
    private javax.swing.JTextField uid_tf;
    // End of variables declaration//GEN-END:variables
}
