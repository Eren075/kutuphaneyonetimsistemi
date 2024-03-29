/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kutuphane.DataBase;

import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author meren
 */
public class kullanıcıkitaplar extends javax.swing.JFrame {
private KitapManager kitapManager;
    /**
     * Creates new form adminpaneli
     */
    public kullanıcıkitaplar() {
        initComponents();
        this.setResizable(false);
        kitapManager = new KitapManager();
        loadKitapListToTable();
        KullanıcıManager kullanıcıManager = new KullanıcıManager();
        String loggedInUsername = kullanıcıManager.getLoggedInUsername();
        kullanıcıadı.setText(loggedInUsername);
    }
    
    private void loadKitapListToTable() {
        try {
            // Kitap listesini al
            DefaultListModel<Kitap> kitapListModel = kitapManager.getDataBooks();


            // DefaultTableModel oluştur
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Kitap Adı");
            tableModel.addColumn("Yazar Adı");
            tableModel.addColumn("Türü");
            tableModel.addColumn("Sayfa Sayısı");
            

            // Kitap listesini DefaultTableModel'e ekle
            for (int i = 0; i < kitapListModel.getSize(); i++) {
                Kitap kitap = kitapListModel.get(i);
                Object[] row = {kitap.getKitapadi(), kitap.getYazar(), kitap.getSayfasayisi(), kitap.getKategori()};
                tableModel.addRow(row);
            }

            // JTable'a DefaultTableModel'i ekle
            kitaplartablosu.setModel(tableModel);
        } catch (SQLException e) {
            e.printStackTrace();
            // Hata durumunda gerekli işlemler yapılabilir
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

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        aramakutusu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        kitaplartablosu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        kitaplar = new javax.swing.JButton();
        çıkışyap = new javax.swing.JButton();
        anasayfa = new javax.swing.JButton();
        kitapiadeet = new javax.swing.JButton();
        kitaplarım = new javax.swing.JButton();
        kitapödünçal = new javax.swing.JButton();
        kütüphanebilgileri = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        kullanıcıadı = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel9.setText("Arama Kutusu");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 50));

        aramakutusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aramakutusuActionPerformed(evt);
            }
        });
        jPanel2.add(aramakutusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 340, 40));

        kitaplartablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap Adı", "Yazar Adı", "Türü", "Sayfa Sayısı"
            }
        ));
        jScrollPane1.setViewportView(kitaplartablosu);
        if (kitaplartablosu.getColumnModel().getColumnCount() > 0) {
            kitaplartablosu.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 560, 400));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton1.setText("Kitap Değerlendirmeleri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, 40));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kullanıcı Adı");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/yeni.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 80, 70));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        kitaplar.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        kitaplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/kitap.png"))); // NOI18N
        kitaplar.setText("Kitaplar");
        kitaplar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kitaplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitaplarActionPerformed(evt);
            }
        });
        jPanel1.add(kitaplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 310, 70));

        çıkışyap.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        çıkışyap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/çıkışyap.png"))); // NOI18N
        çıkışyap.setText("Çıkış Yap");
        çıkışyap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        çıkışyap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çıkışyapActionPerformed(evt);
            }
        });
        jPanel1.add(çıkışyap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 310, 80));

        anasayfa.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        anasayfa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/anasayfa.png"))); // NOI18N
        anasayfa.setText("Anasayfa");
        anasayfa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        anasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anasayfaActionPerformed(evt);
            }
        });
        jPanel1.add(anasayfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 70));

        kitapiadeet.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        kitapiadeet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/ödünçal.png"))); // NOI18N
        kitapiadeet.setText("Kitap İade Et");
        kitapiadeet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kitapiadeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapiadeetActionPerformed(evt);
            }
        });
        jPanel1.add(kitapiadeet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 320, 70));

        kitaplarım.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        kitaplarım.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/kitaplarım.png"))); // NOI18N
        kitaplarım.setText("Kitaplarım");
        kitaplarım.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kitaplarım.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitaplarımActionPerformed(evt);
            }
        });
        jPanel1.add(kitaplarım, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 320, 70));

        kitapödünçal.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        kitapödünçal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/ödünç al.jpg"))); // NOI18N
        kitapödünçal.setText("Kitap Ödünç Al");
        kitapödünçal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kitapödünçal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapödünçalActionPerformed(evt);
            }
        });
        jPanel1.add(kitapödünçal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 320, 70));

        kütüphanebilgileri.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        kütüphanebilgileri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/kütüphane.png"))); // NOI18N
        kütüphanebilgileri.setText("Kütüphane Bilgileri");
        kütüphanebilgileri.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kütüphanebilgileri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kütüphanebilgileriActionPerformed(evt);
            }
        });
        jPanel1.add(kütüphanebilgileri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 310, 70));

        jScrollPane2.setViewportView(kullanıcıadı);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aramakutusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aramakutusuActionPerformed
        String searchKeyword = aramakutusu.getText();
        KitapManager kitapManager = new KitapManager();

    
        DefaultListModel<Kitap> kitapListModel = kitapManager.searchBooks(searchKeyword);

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Kitap Adı");
        tableModel.addColumn("Yazar Adı");
        tableModel.addColumn("Türü");
        tableModel.addColumn("Sayfa Sayısı");
        
        
        

        for (int i = 0; i < kitapListModel.getSize(); i++) {
            Kitap kitap = kitapListModel.get(i);
            Object[] row = {kitap.getKitapadi(), kitap.getYazar(), kitap.getSayfasayisi(), kitap.getKategori()};
            tableModel.addRow(row);
        }

        kitaplartablosu.setModel(tableModel);
    }//GEN-LAST:event_aramakutusuActionPerformed

    private void kitaplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitaplarActionPerformed
       
    }//GEN-LAST:event_kitaplarActionPerformed

    private void çıkışyapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_çıkışyapActionPerformed
         KullanıcıManager kullanıcıManager = new KullanıcıManager();
        kullanıcıManager.removeUserFromLoginTable();
        System.exit(0);
    }//GEN-LAST:event_çıkışyapActionPerformed

    private void anasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anasayfaActionPerformed
        kullanıcıanasayfa anasayfa = new kullanıcıanasayfa();
        anasayfa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_anasayfaActionPerformed

    private void kitapiadeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapiadeetActionPerformed
        kullanıcıkitapiadeet iade = new kullanıcıkitapiadeet();
        iade.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kitapiadeetActionPerformed

    private void kitaplarımActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitaplarımActionPerformed
        kullanıcıkitaplarım kitaplarım = new kullanıcıkitaplarım();
        kitaplarım.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kitaplarımActionPerformed

    private void kitapödünçalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapödünçalActionPerformed
        kullanıcıkitapödünçal odunc = new kullanıcıkitapödünçal();
        odunc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kitapödünçalActionPerformed

    private void kütüphanebilgileriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kütüphanebilgileriActionPerformed
        kullanıcıkütüphanebilgileri kütüphane = new kullanıcıkütüphanebilgileri();
        kütüphane.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kütüphanebilgileriActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kullanıcıkitapdegerlendirme degerlendirme = new kullanıcıkitapdegerlendirme();
        degerlendirme.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(kullanıcıkitaplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kullanıcıkitaplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kullanıcıkitaplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kullanıcıkitaplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanıcıkitaplar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anasayfa;
    private javax.swing.JTextField aramakutusu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kitapiadeet;
    private javax.swing.JButton kitaplar;
    private javax.swing.JTable kitaplartablosu;
    private javax.swing.JButton kitaplarım;
    private javax.swing.JButton kitapödünçal;
    private javax.swing.JTextPane kullanıcıadı;
    private javax.swing.JButton kütüphanebilgileri;
    private javax.swing.JButton çıkışyap;
    // End of variables declaration//GEN-END:variables
}
