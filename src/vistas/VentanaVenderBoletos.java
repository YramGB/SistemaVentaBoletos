package vistas;

import javax.swing.ImageIcon;
import modelo.Acceso;
import modelo.Boleto;

public class VentanaVenderBoletos extends javax.swing.JFrame {

    public VentanaVenderBoletos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoAPP.png")).getImage());
        venderBoleto_btn.setEnabled(false);
        setLocationRelativeTo(null);
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
        jLabel4 = new javax.swing.JLabel();
        consultarVentas_btn = new javax.swing.JToggleButton();
        cerrarSesion_btn = new javax.swing.JToggleButton();
        venderBoleto_btn = new javax.swing.JToggleButton();
        cancelarBoletoBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        venderBoletoBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Venta de Boletos");

        jPanel1.setBackground(new java.awt.Color(242, 235, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("LOGO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        consultarVentas_btn.setBackground(new java.awt.Color(236, 145, 117));
        consultarVentas_btn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        consultarVentas_btn.setText("CONSULTAR VENTAS");
        consultarVentas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarVentas_btnActionPerformed(evt);
            }
        });
        jPanel1.add(consultarVentas_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 420, 80));

        cerrarSesion_btn.setBackground(new java.awt.Color(236, 145, 117));
        cerrarSesion_btn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        cerrarSesion_btn.setText("CERRAR SESIÓN");
        cerrarSesion_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesion_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cerrarSesion_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 80));

        venderBoleto_btn.setBackground(new java.awt.Color(236, 145, 117));
        venderBoleto_btn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        venderBoleto_btn.setText("VENDER BOLETO");
        venderBoleto_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderBoleto_btnActionPerformed(evt);
            }
        });
        jPanel1.add(venderBoleto_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 440, 80));

        cancelarBoletoBtn.setBackground(new java.awt.Color(236, 145, 117));
        cancelarBoletoBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        cancelarBoletoBtn.setText("CANCELAR BOLETO");
        cancelarBoletoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBoletoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarBoletoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 620, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boletos.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boletos.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        venderBoletoBtn1.setBackground(new java.awt.Color(236, 145, 117));
        venderBoletoBtn1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        venderBoletoBtn1.setText("VENDER BOLETO");
        venderBoletoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderBoletoBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(venderBoletoBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesion_btnActionPerformed
        Acceso acceso = new Acceso();
        if(acceso.cerrarSesion()){
            VentanaLogin ventanaLogin = new VentanaLogin();
            ventanaLogin.setVisible(true);
            this.setVisible(false);  
        }
                
    }//GEN-LAST:event_cerrarSesion_btnActionPerformed

    private void venderBoleto_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderBoleto_btnActionPerformed

    }//GEN-LAST:event_venderBoleto_btnActionPerformed

    private void venderBoletoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderBoletoBtn1ActionPerformed
        Boleto boleto = new Boleto();
        if(boleto.iniciarNuevoBoleto()){
            VentanaOrigenDestino ventanaOrigen = new VentanaOrigenDestino();
            ventanaOrigen.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_venderBoletoBtn1ActionPerformed

    private void cancelarBoletoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBoletoBtnActionPerformed
        VentanaCancelarBoleto cancelarBoleto = new VentanaCancelarBoleto();
        cancelarBoleto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarBoletoBtnActionPerformed

    private void consultarVentas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarVentas_btnActionPerformed
        VentanaConsultarVentas consultarVentas = new VentanaConsultarVentas();
        consultarVentas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consultarVentas_btnActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaVenderBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVenderBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVenderBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVenderBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVenderBoletos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBoletoBtn;
    private javax.swing.JToggleButton cerrarSesion_btn;
    private javax.swing.JToggleButton consultarVentas_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton venderBoletoBtn1;
    private javax.swing.JToggleButton venderBoleto_btn;
    // End of variables declaration//GEN-END:variables
}