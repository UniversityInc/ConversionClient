
package conversionclient.interfaces;

import com.ws.conversion.ConversionWS;
import com.ws.conversion.ConversionWS_Service;

public class Accueil extends javax.swing.JFrame {

    public Accueil() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Conversion");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromDZD = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        devise = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        montant = new javax.swing.JTextField();
        convert = new javax.swing.JButton();
        resultat = new javax.swing.JTextField();
        toDZD = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        devise1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        montant1 = new javax.swing.JTextField();
        convert1 = new javax.swing.JButton();
        resultat1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 0));

        fromDZD.setBorder(javax.swing.BorderFactory.createTitledBorder("Convert From DZD"));

        jLabel1.setText("Devise : ");

        devise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "eur", "usd" }));

        jLabel2.setText("Montant : ");

        montant.setMinimumSize(new java.awt.Dimension(100, 26));
        montant.setPreferredSize(new java.awt.Dimension(100, 26));

        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        resultat.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        resultat.setForeground(new java.awt.Color(2, 3, 1));
        resultat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        resultat.setMinimumSize(new java.awt.Dimension(400, 100));
        resultat.setPreferredSize(new java.awt.Dimension(400, 100));

        javax.swing.GroupLayout fromDZDLayout = new javax.swing.GroupLayout(fromDZD);
        fromDZD.setLayout(fromDZDLayout);
        fromDZDLayout.setHorizontalGroup(
            fromDZDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromDZDLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(fromDZDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fromDZDLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(devise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(convert)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        fromDZDLayout.setVerticalGroup(
            fromDZDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromDZDLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(fromDZDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(devise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(fromDZD);

        toDZD.setBorder(javax.swing.BorderFactory.createTitledBorder("Convert To DZD"));

        jLabel3.setText("Devise : ");

        devise1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "eur", "usd" }));

        jLabel4.setText("Montant : ");

        montant1.setMinimumSize(new java.awt.Dimension(100, 26));
        montant1.setPreferredSize(new java.awt.Dimension(100, 26));

        convert1.setText("Convert");
        convert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convert1ActionPerformed(evt);
            }
        });

        resultat1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        resultat1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        resultat1.setMinimumSize(new java.awt.Dimension(400, 100));
        resultat1.setPreferredSize(new java.awt.Dimension(400, 100));

        javax.swing.GroupLayout toDZDLayout = new javax.swing.GroupLayout(toDZD);
        toDZD.setLayout(toDZDLayout);
        toDZDLayout.setHorizontalGroup(
            toDZDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toDZDLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(toDZDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(toDZDLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(devise1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(montant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(convert1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        toDZDLayout.setVerticalGroup(
            toDZDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toDZDLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(toDZDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(devise1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(montant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convert1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(toDZD);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
        // TODO add your handling code here:
        String vdevise = (String) devise.getSelectedItem();
        String vmontant = montant.getText();
        float fmontant = Float.valueOf(vmontant);
        
        ConversionWS_Service service = new ConversionWS_Service();
        final ConversionWS proxy = service.getConversionWSPort();
        float fresultat = proxy.fromDZD(fmontant, vdevise);
        String sresultat = String.valueOf(fresultat);
        resultat.setText(sresultat);
    }//GEN-LAST:event_convertActionPerformed

    private void convert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convert1ActionPerformed
        // TODO add your handling code here:
        String vdevise = (String) devise1.getSelectedItem();
        String vmontant = montant1.getText();
        float fmontant = Float.valueOf(vmontant);
        
        ConversionWS_Service service = new ConversionWS_Service();
        final ConversionWS proxy = service.getConversionWSPort();
        float fresultat = proxy.toDZD(fmontant, vdevise);
        String sresultat = String.valueOf(fresultat);
        resultat1.setText(sresultat);
    }//GEN-LAST:event_convert1ActionPerformed

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convert;
    private javax.swing.JButton convert1;
    private javax.swing.JComboBox<String> devise;
    private javax.swing.JComboBox<String> devise1;
    private javax.swing.JPanel fromDZD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField montant;
    private javax.swing.JTextField montant1;
    private javax.swing.JTextField resultat;
    private javax.swing.JTextField resultat1;
    private javax.swing.JPanel toDZD;
    // End of variables declaration//GEN-END:variables
}
