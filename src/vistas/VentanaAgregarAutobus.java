package vistas;

import modelo.Acceso;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Administrador;
import modelo.Asiento;
import modelo.Autobus;

public class VentanaAgregarAutobus extends javax.swing.JFrame {

    public VentanaAgregarAutobus() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoAPP.png")).getImage());
        setLocationRelativeTo(null);
        altaBtn.setEnabled(false);
        consultarVentas_btn2.setEnabled(false);
        cerrarSesion_btn2.setEnabled(false);
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
        jLabel6 = new javax.swing.JLabel();
        consultarVentas_btn2 = new javax.swing.JToggleButton();
        cerrarSesion_btn2 = new javax.swing.JToggleButton();
        altaBtn = new javax.swing.JToggleButton();
        numeroLabel = new javax.swing.JLabel();
        numeroTxt = new javax.swing.JTextField();
        origenLabel = new javax.swing.JLabel();
        origenTxt = new javax.swing.JTextField();
        destinoLabel = new javax.swing.JLabel();
        destinoTxt = new javax.swing.JTextField();
        precioLabel = new javax.swing.JLabel();
        precioTxt = new javax.swing.JTextField();
        fechaLabel = new javax.swing.JLabel();
        horarioLabel = new javax.swing.JLabel();
        regresarBtn = new javax.swing.JButton();
        agregarBtn = new javax.swing.JButton();
        fechaTxt = new com.toedter.calendar.JDateChooser();
        horarioTxt = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Venta de Boletos");

        jPanel3.setBackground(new java.awt.Color(242, 235, 244));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("LOGO");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        consultarVentas_btn2.setBackground(new java.awt.Color(236, 145, 117));
        consultarVentas_btn2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        consultarVentas_btn2.setText("CONSULTAR VENTAS");
        jPanel3.add(consultarVentas_btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 420, 80));

        cerrarSesion_btn2.setBackground(new java.awt.Color(236, 145, 117));
        cerrarSesion_btn2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        cerrarSesion_btn2.setText("CERRAR SESIÓN");
        cerrarSesion_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesion_btn2ActionPerformed(evt);
            }
        });
        jPanel3.add(cerrarSesion_btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 420, 80));

        altaBtn.setBackground(new java.awt.Color(236, 145, 117));
        altaBtn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        altaBtn.setText("DAR DE ALTA A PERSONAL");
        altaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaBtnActionPerformed(evt);
            }
        });
        jPanel3.add(altaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 440, 80));

        numeroLabel.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        numeroLabel.setText("NÚMERO DE AUTOBUS:");
        jPanel3.add(numeroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        numeroTxt.setBackground(new java.awt.Color(236, 145, 117));
        numeroTxt.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jPanel3.add(numeroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 260, 50));

        origenLabel.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        origenLabel.setText("ORIGEN:");
        jPanel3.add(origenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        origenTxt.setBackground(new java.awt.Color(236, 145, 117));
        origenTxt.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jPanel3.add(origenTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 260, 50));

        destinoLabel.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        destinoLabel.setText("DESTINO:");
        jPanel3.add(destinoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        destinoTxt.setBackground(new java.awt.Color(236, 145, 117));
        destinoTxt.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jPanel3.add(destinoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 260, 50));

        precioLabel.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        precioLabel.setText("PRECIO:");
        jPanel3.add(precioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        precioTxt.setBackground(new java.awt.Color(236, 145, 117));
        precioTxt.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jPanel3.add(precioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 260, 50));

        fechaLabel.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        fechaLabel.setText("FECHA:");
        jPanel3.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        horarioLabel.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        horarioLabel.setText("HORARIO:");
        jPanel3.add(horarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        regresarBtn.setBackground(new java.awt.Color(236, 145, 117));
        regresarBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        regresarBtn.setText("REGRESAR");
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });
        jPanel3.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, 110, -1));

        agregarBtn.setBackground(new java.awt.Color(236, 145, 117));
        agregarBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        agregarBtn.setText("AGREGAR");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });
        jPanel3.add(agregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 670, 110, -1));

        fechaTxt.setBackground(new java.awt.Color(236, 145, 117));
        fechaTxt.setDateFormatString("dd-MM-yyyy");
        jPanel3.add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 260, 40));

        horarioTxt.setBackground(new java.awt.Color(236, 145, 117));
        try {
            horarioTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        horarioTxt.setToolTipText("00:00");
        jPanel3.add(horarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesion_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesion_btn2ActionPerformed
        Acceso acceso = new Acceso();
        if(acceso.cerrarSesion()){
            VentanaLogin ventanaLogin = new VentanaLogin();
            ventanaLogin.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cerrarSesion_btn2ActionPerformed

    private void altaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaBtnActionPerformed
        VentanaAltaPersonal alta = new VentanaAltaPersonal();
        alta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_altaBtnActionPerformed

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        VentanaAdministrador menu = new VentanaAdministrador();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        Autobus autobus = new Autobus();
        Administrador admin = new Administrador();
        Asiento asiento = new Asiento();
        if(numeroTxt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de autobus", "Campo vacío", JOptionPane.WARNING_MESSAGE);            
        }else if(origenTxt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el origen del autobus", "Campo vacío", JOptionPane.WARNING_MESSAGE);
        }else if(destinoTxt.getText().equals("")){    
            JOptionPane.showMessageDialog(this, "Debe ingresar el destino del autobus", "Campo vacío", JOptionPane.WARNING_MESSAGE);    
        }else if(precioTxt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un precio de viaje", "Campo vacío", JOptionPane.WARNING_MESSAGE);    
        }else if(fechaTxt.getDate().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar la fecha del viaje", "Campo vacío", JOptionPane.WARNING_MESSAGE);    
        }else if(horarioTxt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el horario del viaje", "Campo vacío", JOptionPane.WARNING_MESSAGE);    
        }else{
            int numeroAutobus = Integer.parseInt(numeroTxt.getText());
            autobus.setNumeroAutobus(numeroAutobus);
            autobus.setNombreOrigen(origenTxt.getText());
            autobus.setNombreDestino(destinoTxt.getText());        
            double precioViaje = Double.parseDouble(precioTxt.getText());        
            autobus.setPrecioViaje(precioViaje);        
            SimpleDateFormat conv;
            conv = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = conv.format(this.fechaTxt.getDate());
            autobus.setFechaViaje(fecha);
            if(validarHora(horarioTxt.getText())){
                autobus.setHorarioViaje(horarioTxt.getText() + ":00");
                if(admin.agregarAutobus(autobus)){                    
                    int numero= Integer.parseInt(numeroTxt.getText());
                    asiento.setNumeroAutobus(numero);                    
                    asiento.setEstado(1);
                    for(int i = 1; i < 37; i++){
                        asiento.setNumeroAsiento(i);
                        admin.asignarAsientos(asiento);
                    }                    
                    JOptionPane.showMessageDialog(this, "Datos ingresados correctamente", "Autobus añadido", JOptionPane.INFORMATION_MESSAGE);  
                    numeroTxt.setText("");
                    origenTxt.setText("");
                    destinoTxt.setText("");
                    precioTxt.setText("");              
                    horarioTxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(this, "Hubo un error al agregar el autobus, verifique los datos y vuelva a intentarlo", "Error al agregar", JOptionPane.ERROR_MESSAGE);  
                }              
            }else{
                JOptionPane.showMessageDialog(this, "La hora es incorrecta", "Error en la hora", JOptionPane.ERROR_MESSAGE);
            }         
        }
    }//GEN-LAST:event_agregarBtnActionPerformed

    public boolean validarHora(String hora) {
        boolean b;
        char[] a = hora.toString().toCharArray();
        String[] c = hora.split(":");
        if ((a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ') || (a[3] == ' ') || (a[4] == ' ') || (getInteger(c[0]) > 24) || (getInteger(c[1]) > 59)) {
            b=false;
        }else{
            b=true;
        }
        return b;
    }
    
    public int getInteger(String valor){
        int integer = Integer.parseInt(valor);
        return integer;
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
            java.util.logging.Logger.getLogger(VentanaAgregarAutobus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarAutobus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarAutobus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarAutobus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarAutobus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JToggleButton altaBtn;
    private javax.swing.JToggleButton cerrarSesion_btn2;
    private javax.swing.JToggleButton consultarVentas_btn2;
    private javax.swing.JLabel destinoLabel;
    private javax.swing.JTextField destinoTxt;
    private javax.swing.JLabel fechaLabel;
    private com.toedter.calendar.JDateChooser fechaTxt;
    private javax.swing.JLabel horarioLabel;
    private javax.swing.JFormattedTextField horarioTxt;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroTxt;
    private javax.swing.JLabel origenLabel;
    private javax.swing.JTextField origenTxt;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JTextField precioTxt;
    private javax.swing.JButton regresarBtn;
    // End of variables declaration//GEN-END:variables
}
