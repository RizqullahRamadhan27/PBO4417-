/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class formberatbadan extends javax.swing.JFrame {

    /**
     * Creates new form formberatbadan
     */
    String tNim;
    String tNama;        
    Float tinggi ;
    Float tinggi2 ;
    Float berat ;
    public formberatbadan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LNim = new javax.swing.JLabel();
        LNama = new javax.swing.JLabel();
        LBerat = new javax.swing.JLabel();
        LTinggi = new javax.swing.JLabel();
        Nim = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Berat = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        Hitung = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        Hasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LNim.setText("Nim              :");

        LNama.setText(" Nama           :");

        LBerat.setText("Berat(Kg)     :");

        LTinggi.setText("Tinggi(M)      :");

        Nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NimActionPerformed(evt);
            }
        });

        Berat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeratActionPerformed(evt);
            }
        });

        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        Hasil.setText("Hitung");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hasil)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Hitung)
                        .addGap(91, 91, 91)
                        .addComponent(Kembali))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LTinggi)
                            .addComponent(LBerat)
                            .addComponent(LNama)
                            .addComponent(LNim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nim, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(Nama)
                            .addComponent(Berat)
                            .addComponent(Tinggi))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNim)
                    .addComponent(Nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNama)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBerat)
                    .addComponent(Berat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LTinggi)
                    .addComponent(Tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hitung)
                    .addComponent(Kembali))
                .addGap(31, 31, 31)
                .addComponent(Hasil)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeratActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        Menu f1 = new Menu();
        f1.setVisible(true);
        dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void NimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NimActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        String tNim = Nim.getText();
        String tNama = Nama.getText();
        
        berat = Float.parseFloat(Berat.getText());
        tinggi = Float.parseFloat(Tinggi.getText());
        tinggi2 = tinggi * tinggi;
        Float hasil = berat / tinggi2;
        
        if (hasil > 25.0){
        Hasil.setText(Nim.getText()+", "+Nama.getText() +", "+ "Berat Badan Anda Tidak Ideal");
        }
        else if (hasil < 18.5){
        Hasil.setText(Nim.getText()+", "+Nama.getText() +", "+ "Berat Badan Anda Tidak Ideal");
        }
        else {
        Hasil.setText(Nim.getText()+", "+Nama.getText() +", "+ "Berat Badan Anda Sudah Ideal");
        
        }
    
    }//GEN-LAST:event_HitungActionPerformed

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
            java.util.logging.Logger.getLogger(formberatbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formberatbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formberatbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formberatbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formberatbadan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JLabel Hasil;
    private javax.swing.JButton Hitung;
    private javax.swing.JButton Kembali;
    private javax.swing.JLabel LBerat;
    private javax.swing.JLabel LNama;
    private javax.swing.JLabel LNim;
    private javax.swing.JLabel LTinggi;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nim;
    private javax.swing.JTextField Tinggi;
    // End of variables declaration//GEN-END:variables
}
