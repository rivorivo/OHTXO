/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Käyttöliittymä;

import Ristinolla.Logiikka;
import Ristinolla.Tekoaly;
import javax.swing.JOptionPane;

/**
 *
 * @author rivorivo
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    private final Logiikka peli;
    private final Tekoaly AI;
    String[] pelilauta = new String[8];
    private boolean aiOn;

    public UI() {
        this.peli = new Logiikka(pelilauta);
        peli.uusiPeli();
        this.AI = new Tekoaly(peli);
        initComponents();
        voitotBar.setText("Voitot X: " + peli.getVoitotRisti() + " Voitot 0: " + peli.getVoitotNolla() + " Tasapelit: " + peli.getTasapelit());
        aiOn = false;
    }

    /**
     * graafisen pelilaudan ja painikkeiden alustaminen
     *
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jOptionPane1 = new javax.swing.JOptionPane();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        voitotBar = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(254, 254, 254));
        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 60)); // NOI18N
        jButton1.setForeground(new java.awt.Color(46, 41, 41));
        jButton1.setIconTextGap(0);
        jButton1.setSize(100, 100);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(254, 254, 254));
        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 60)); // NOI18N
        jButton2.setForeground(new java.awt.Color(46, 41, 41));
        jButton2.setIconTextGap(0);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(254, 254, 254));
        jButton3.setFont(new java.awt.Font("Ubuntu", 0, 60)); // NOI18N
        jButton3.setForeground(new java.awt.Color(46, 41, 41));
        jButton3.setIconTextGap(0);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(254, 254, 254));
        jButton4.setFont(new java.awt.Font("Ubuntu", 0, 60)); // NOI18N
        jButton4.setForeground(new java.awt.Color(46, 41, 41));
        jButton4.setIconTextGap(0);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(254, 254, 254));
        jButton5.setFont(new java.awt.Font("Ubuntu", 0, 60)); // NOI18N
        jButton5.setForeground(new java.awt.Color(46, 41, 41));
        jButton5.setIconTextGap(0);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(254, 254, 254));
        jButton6.setFont(new java.awt.Font("Ubuntu", 0, 60)); // NOI18N
        jButton6.setForeground(new java.awt.Color(46, 41, 41));
        jButton6.setIconTextGap(0);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(254, 254, 254));
        jButton7.setFont(new java.awt.Font("Ubuntu", 0, 60)); // NOI18N
        jButton7.setForeground(new java.awt.Color(46, 41, 41));
        jButton7.setIconTextGap(0);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(254, 254, 254));
        jButton8.setFont(new java.awt.Font("Ubuntu", 0, 60)); // NOI18N
        jButton8.setForeground(new java.awt.Color(46, 41, 41));
        jButton8.setIconTextGap(0);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(254, 254, 254));
        jButton9.setFont(new java.awt.Font("Ubuntu", 0, 60)); // NOI18N
        jButton9.setForeground(new java.awt.Color(46, 41, 41));
        jButton9.setIconTextGap(0);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        voitotBar.setText("Voitot X: Voitot 0: Tasapelit:");

        jToggleButton1.setText("Ai on pois");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton10.setText("Uusi peli");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voitotBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addGap(0, 0, 0)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voitotBar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * jButtonien toimintojen määritys siirtojen tekemistä varten
     *
     * @param evt
     */

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(peli.getVuoro());
        jButton6.setEnabled(false);
        jButtonKlikkaus(5);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(peli.getVuoro());
        jButton7.setEnabled(false);
        jButtonKlikkaus(6);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(peli.getVuoro());
        jButton8.setEnabled(false);
        jButtonKlikkaus(7);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(peli.getVuoro());
        jButton9.setEnabled(false);
        jButtonKlikkaus(8);

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(peli.getVuoro());
        jButton1.setEnabled(false);
        jButtonKlikkaus(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(peli.getVuoro());
        jButton2.setEnabled(false);
        jButtonKlikkaus(1);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(peli.getVuoro());
        jButton3.setEnabled(false);
        jButtonKlikkaus(2);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(peli.getVuoro());
        jButton4.setEnabled(false);
        jButtonKlikkaus(3);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(peli.getVuoro());
        jButton5.setEnabled(false);
        jButtonKlikkaus(4);

    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * jToggleButton laittaa AI:n päälle ja pois ja ilmoittaa siitä. Ai tekee
     * siirron, jos laittaa päälle 0:n vuorolla.
     *
     * @param evt
     */

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if (aiOn == false) {
            aiOn = true;
            jToggleButton1.setText("AI on päällä");
            JOptionPane.showMessageDialog(rootPane, "AI ohjaa 0:a");
            aiKlikkaus();
        } else {
            aiOn = false;
            jToggleButton1.setText("AI on pois");
            JOptionPane.showMessageDialog(rootPane, "AI pois päältä");
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed
    /**
     * aloittaa uuden pelin
     *
     * @param evt
     */
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        uusiPeli();
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * toimii main-luokkana
     *
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    /**
     * käskee logiikkaluokan siirtoa ja loppumisen tarkistusta. Jos peli loppu,
     * ilmoittaa voittajan viesti-ikkunassa. Jos peli jatkuu ja AI on päällä,
     * kutsuu aiKlikkaus-metodia.
     *
     * @param ruutu
     */
    private void jButtonKlikkaus(int ruutu) {
        peli.teeSiirto(ruutu);
        peli.loppumisenTarkistus();
        if (peli.onkoLoppu()) {
            if (peli.getVoittaja().equals("tasapeli")) {
                JOptionPane.showMessageDialog(rootPane, "Tasapeli");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Peli loppu, voittaja: " + peli.getVoittaja());
            }
            uusiPeli();
        } else if (aiOn == true) {
            aiKlikkaus();
        }
    }

    /**
     * Jos vuoro on "0", asettaa merkin sopivaan paikkaan.
     */
    private void aiKlikkaus() {
        if (peli.getVuoro().equals("0")) {
            int ruutu = AI.hyokkaysSiirto();

            if (ruutu == 0) {
                jButton1.setText(peli.getVuoro());
                jButton1.setEnabled(false);
            } else if (ruutu == 1) {
                jButton2.setText(peli.getVuoro());
                jButton2.setEnabled(false);
            } else if (ruutu == 2) {
                jButton3.setText(peli.getVuoro());
                jButton3.setEnabled(false);
            } else if (ruutu == 3) {
                jButton4.setText(peli.getVuoro());
                jButton4.setEnabled(false);
            } else if (ruutu == 4) {
                jButton5.setText(peli.getVuoro());
                jButton5.setEnabled(false);
            } else if (ruutu == 5) {
                jButton6.setText(peli.getVuoro());
                jButton6.setEnabled(false);
            } else if (ruutu == 6) {
                jButton7.setText(peli.getVuoro());
                jButton7.setEnabled(false);
            } else if (ruutu == 7) {
                jButton8.setText(peli.getVuoro());
                jButton8.setEnabled(false);
            } else if (ruutu == 8) {
                jButton9.setText(peli.getVuoro());
                jButton9.setEnabled(false);
            }

            jButtonKlikkaus(ruutu);
        }
    }
    /*
     *aloittaa uuden pelin ja päivittää voitot
     *
     */

    private void uusiPeli() {
        peli.uusiPeli();
        paivitaVoitot();
        nollaaPelilauta();
    }

    /**
     * Päivittää voittojen määrän käyttöliittymän ikkunan alalaitaan.
     */
    private void paivitaVoitot() {
        voitotBar.setText("Voitot X: " + peli.getVoitotRisti() + " Voitot 0: " + peli.getVoitotNolla() + " Tasapelit: " + peli.getTasapelit());
    }

    /**
     * nollaa pelilaudan nappulat.
     */
    private void nollaaPelilauta() {

        jButton1.setText(null);
        jButton1.setEnabled(true);
        jButton2.setText(null);
        jButton2.setEnabled(true);
        jButton3.setText(null);
        jButton3.setEnabled(true);
        jButton4.setText(null);
        jButton4.setEnabled(true);
        jButton5.setText(null);
        jButton5.setEnabled(true);
        jButton6.setText(null);
        jButton6.setEnabled(true);
        jButton7.setText(null);
        jButton7.setEnabled(true);
        jButton8.setText(null);
        jButton8.setEnabled(true);
        jButton9.setText(null);
        jButton9.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel voitotBar;
    // End of variables declaration//GEN-END:variables

}
