/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kutuphane.DataBase;

/**
 *
 * @author meren
 */
public class kullanıcısil extends javax.swing.JFrame {

    /**
     * Creates new form adminpaneli
     */
    public kullanıcısil() {
        initComponents();
        this.setResizable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanıcıadı = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        kitapayarları = new javax.swing.JButton();
        kitaplar = new javax.swing.JButton();
        kullanıcıayarları = new javax.swing.JButton();
        kütüphanebilgileri = new javax.swing.JButton();
        çıkışyap = new javax.swing.JButton();
        anasayfa = new javax.swing.JButton();
        ödünçalınankitaplar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kullanıcıadi = new javax.swing.JTextField();
        isim = new javax.swing.JTextField();
        sayfasayısı = new javax.swing.JTextField();
        Kullanıcısil = new javax.swing.JButton();
        soyisim = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kullanıcı Adı");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/yeni.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 80, 70));
        jPanel1.add(kullanıcıadı, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 110, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        kitapayarları.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        kitapayarları.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/ayar ikonu.png"))); // NOI18N
        kitapayarları.setText("Kitap Ayarları");
        kitapayarları.setAutoscrolls(true);
        kitapayarları.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kitapayarları.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapayarlarıActionPerformed(evt);
            }
        });
        jPanel1.add(kitapayarları, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 310, 70));

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

        kullanıcıayarları.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        kullanıcıayarları.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/kullanıcıikon.jpg"))); // NOI18N
        kullanıcıayarları.setText("Kullanıcı Ayarları");
        kullanıcıayarları.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullanıcıayarları.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanıcıayarlarıActionPerformed(evt);
            }
        });
        jPanel1.add(kullanıcıayarları, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 310, 70));

        kütüphanebilgileri.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        kütüphanebilgileri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/kütüphane.png"))); // NOI18N
        kütüphanebilgileri.setText("Kütüphane Bilgileri");
        kütüphanebilgileri.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kütüphanebilgileri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kütüphanebilgileriActionPerformed(evt);
            }
        });
        jPanel1.add(kütüphanebilgileri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 310, 70));

        çıkışyap.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        çıkışyap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/çıkışyap.png"))); // NOI18N
        çıkışyap.setText("Çıkış Yap");
        çıkışyap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        çıkışyap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çıkışyapActionPerformed(evt);
            }
        });
        jPanel1.add(çıkışyap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 310, 70));

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

        ödünçalınankitaplar.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        ödünçalınankitaplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kutuphane/DataBase/ödünçal.png"))); // NOI18N
        ödünçalınankitaplar.setText("Ödünç Alınan Kitaplar");
        ödünçalınankitaplar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ödünçalınankitaplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ödünçalınankitaplarActionPerformed(evt);
            }
        });
        jPanel1.add(ödünçalınankitaplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 320, 70));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kullanıcı Sil");
        jLabel6.setAutoscrolls(true);
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 140, 40));

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Kullanıcı Adı");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, 30));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("İsim");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 30));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Soy isim");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, 30));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Şifre");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, 30));

        kullanıcıadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanıcıadiActionPerformed(evt);
            }
        });
        jPanel2.add(kullanıcıadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 200, 40));

        isim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isimActionPerformed(evt);
            }
        });
        jPanel2.add(isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, 40));

        sayfasayısı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayfasayısıActionPerformed(evt);
            }
        });
        jPanel2.add(sayfasayısı, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 200, 40));

        Kullanıcısil.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Kullanıcısil.setText("Kullanıcı Sil");
        Kullanıcısil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KullanıcısilActionPerformed(evt);
            }
        });
        jPanel2.add(Kullanıcısil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 190, 70));

        soyisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyisimActionPerformed(evt);
            }
        });
        jPanel2.add(soyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kitapayarlarıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapayarlarıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kitapayarlarıActionPerformed

    private void kitaplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitaplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kitaplarActionPerformed

    private void kullanıcıayarlarıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanıcıayarlarıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanıcıayarlarıActionPerformed

    private void kütüphanebilgileriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kütüphanebilgileriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kütüphanebilgileriActionPerformed

    private void çıkışyapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_çıkışyapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_çıkışyapActionPerformed

    private void anasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anasayfaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anasayfaActionPerformed

    private void ödünçalınankitaplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ödünçalınankitaplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ödünçalınankitaplarActionPerformed

    private void kullanıcıadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanıcıadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanıcıadiActionPerformed

    private void isimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isimActionPerformed

    private void sayfasayısıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayfasayısıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sayfasayısıActionPerformed

    private void KullanıcısilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KullanıcısilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KullanıcısilActionPerformed

    private void soyisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyisimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soyisimActionPerformed

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
            java.util.logging.Logger.getLogger(kullanıcısil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kullanıcısil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kullanıcısil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kullanıcısil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanıcısil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kullanıcısil;
    private javax.swing.JButton anasayfa;
    private javax.swing.JTextField isim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton kitapayarları;
    private javax.swing.JButton kitaplar;
    private javax.swing.JTextField kullanıcıadi;
    private javax.swing.JTextField kullanıcıadı;
    private javax.swing.JButton kullanıcıayarları;
    private javax.swing.JButton kütüphanebilgileri;
    private javax.swing.JTextField sayfasayısı;
    private javax.swing.JTextField soyisim;
    private javax.swing.JButton çıkışyap;
    private javax.swing.JButton ödünçalınankitaplar;
    // End of variables declaration//GEN-END:variables
}
