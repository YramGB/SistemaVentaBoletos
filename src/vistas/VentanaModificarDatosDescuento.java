package vistas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Acceso;
import modelo.Administrador;
import modelo.Descuento;

public class VentanaModificarDatosDescuento extends javax.swing.JFrame {

    public VentanaModificarDatosDescuento(Descuento descuento) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoAPP.png")).getImage());
        tipoDescuentoTxt.setText(descuento.getTipoDescuento());
        String porcentaje = String.valueOf(descuento.getPorcentajeDescuento());
        porcentajeDescuentoTxt.setText(porcentaje);
        altaBtn.setEnabled(false);
        consultarVentas_btn.setEnabled(false);
        cerrarSesion_btn.setEnabled(false);
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        consultarVentas_btn = new javax.swing.JToggleButton();
        cerrarSesion_btn = new javax.swing.JToggleButton();
        altaBtn = new javax.swing.JToggleButton();
        tipoDescuentoLabel = new javax.swing.JLabel();
        porcentajeDescuentoTxt = new javax.swing.JTextField();
        porcentajeLabel = new javax.swing.JLabel();
        regresarBtn = new javax.swing.JButton();
        modificarBtn = new javax.swing.JButton();
        tipoDescuentoTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Venta de Boletos");

        jPanel6.setBackground(new java.awt.Color(242, 235, 244));
        jPanel6.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("LOGO");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        consultarVentas_btn.setBackground(new java.awt.Color(236, 145, 117));
        consultarVentas_btn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        consultarVentas_btn.setText("CONSULTAR VENTAS");
        jPanel6.add(consultarVentas_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 420, 80));

        cerrarSesion_btn.setBackground(new java.awt.Color(236, 145, 117));
        cerrarSesion_btn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        cerrarSesion_btn.setText("CERRAR SESI??N");
        cerrarSesion_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesion_btnActionPerformed(evt);
            }
        });
        jPanel6.add(cerrarSesion_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 80));

        altaBtn.setBackground(new java.awt.Color(236, 145, 117));
        altaBtn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        altaBtn.setText("DAR DE ALTA A PERSONAL");
        altaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaBtnActionPerformed(evt);
            }
        });
        jPanel6.add(altaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 440, 80));

        tipoDescuentoLabel.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        tipoDescuentoLabel.setText("TIPO DE DESCUENTO:");
        jPanel6.add(tipoDescuentoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        porcentajeDescuentoTxt.setBackground(new java.awt.Color(236, 145, 117));
        porcentajeDescuentoTxt.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        porcentajeDescuentoTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel6.add(porcentajeDescuentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 200, 50));

        porcentajeLabel.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        porcentajeLabel.setText("PORCENTAJE DE DESCUENTO:");
        jPanel6.add(porcentajeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        regresarBtn.setBackground(new java.awt.Color(236, 145, 117));
        regresarBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        regresarBtn.setText("REGRESAR");
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });
        jPanel6.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 110, -1));

        modificarBtn.setBackground(new java.awt.Color(236, 145, 117));
        modificarBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        modificarBtn.setText("MODIFICAR");
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });
        jPanel6.add(modificarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 110, -1));

        tipoDescuentoTxt.setEditable(false);
        tipoDescuentoTxt.setBackground(new java.awt.Color(236, 145, 117));
        tipoDescuentoTxt.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jPanel6.add(tipoDescuentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 240, 50));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel1.setText("%");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void altaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaBtnActionPerformed
        VentanaAltaPersonal alta = new VentanaAltaPersonal();
        alta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_altaBtnActionPerformed

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        VentanaModificarDescuento menu = new VentanaModificarDescuento();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        Administrador admin = new Administrador();
        Descuento descuento = new Descuento();
        descuento.setTipoDescuento(tipoDescuentoTxt.getText());
        int porcentaje = Integer.parseInt(porcentajeDescuentoTxt.getText());
        descuento.setPorcentajeDescuento(porcentaje);
        if(admin.modificarDescuento(descuento)){
            JOptionPane.showMessageDialog(this, "El descuento se ha guardado con ??xito", "Descuento guardado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "No se ha podido modificar el descuento, intente nuevamente", "Error de datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_modificarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaModificarDatosDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarDatosDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarDatosDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarDatosDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VentanaEditarDatosDescuento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton altaBtn;
    private javax.swing.JToggleButton cerrarSesion_btn;
    private javax.swing.JToggleButton consultarVentas_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JTextField porcentajeDescuentoTxt;
    private javax.swing.JLabel porcentajeLabel;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JLabel tipoDescuentoLabel;
    private javax.swing.JTextField tipoDescuentoTxt;
    // End of variables declaration//GEN-END:variables

}
