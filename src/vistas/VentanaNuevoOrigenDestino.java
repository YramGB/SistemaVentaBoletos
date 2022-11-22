package vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Autobus;
import modelo.Boleto;
import modelo.Conexion;

public class VentanaNuevoOrigenDestino extends javax.swing.JFrame {
    
    public VentanaNuevoOrigenDestino(Boleto boleto) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoAPP.png")).getImage());
        setLocationRelativeTo(null);
        añadirBoletos();
        venderBoleto_btn.setEnabled(false);        
        cerrarSesion_btn.setEnabled(false);
        consultarVentas_btn.setEnabled(false);
        
        String precioAnterior = String.valueOf(boleto.getPrecioFinal());
        setPrecioAnterior.setText(precioAnterior);
        
        DefaultTableCellRenderer alineacion = new DefaultTableCellRenderer();
        alineacion.setHorizontalAlignment(SwingConstants.CENTER);        
        for(int i = 0; i < tablaBoletos.getColumnCount(); i++){
            tablaBoletos.getColumnModel().getColumn(i).setCellRenderer(alineacion);            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        origenTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        destinoTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cerrarSesion_btn = new javax.swing.JToggleButton();
        venderBoleto_btn = new javax.swing.JToggleButton();
        consultarVentas_btn = new javax.swing.JToggleButton();
        continuarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBoletos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        fechaDt = new com.toedter.calendar.JDateChooser();
        regresarBtn1 = new javax.swing.JButton();
        buscarDatosBtn = new javax.swing.JButton();
        setPrecioAnterior = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Venta de Boletos");

        jPanel1.setBackground(new java.awt.Color(242, 235, 244));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("LOGO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setText("SELECCIONAR ORIGEN:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        origenTxt.setBackground(new java.awt.Color(236, 145, 117));
        origenTxt.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jPanel1.add(origenTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 260, 40));

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel6.setText("SELECCIONAR DESTINO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, -1, -1));

        destinoTxt.setBackground(new java.awt.Color(236, 145, 117));
        destinoTxt.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jPanel1.add(destinoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 230, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boletos.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

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

        consultarVentas_btn.setBackground(new java.awt.Color(236, 145, 117));
        consultarVentas_btn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        consultarVentas_btn.setText("CONSULTAR VENTAS");
        jPanel1.add(consultarVentas_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 420, 80));

        continuarBtn.setBackground(new java.awt.Color(236, 145, 117));
        continuarBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        continuarBtn.setText("CONTINUAR");
        continuarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(continuarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 580, -1, -1));

        tablaBoletos.setBackground(new java.awt.Color(242, 235, 244));
        tablaBoletos.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        tablaBoletos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaBoletos.setMaximumSize(null);
        tablaBoletos.setMinimumSize(new java.awt.Dimension(0, 20));
        tablaBoletos.setRowHeight(25);
        tablaBoletos.setSelectionBackground(new java.awt.Color(236, 145, 117));
        tablaBoletos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaBoletos.setShowGrid(true);
        jScrollPane2.setViewportView(tablaBoletos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 680, 280));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setText("SELECCIONAR FECHA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, 40));

        fechaDt.setBackground(new java.awt.Color(236, 145, 117));
        fechaDt.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(fechaDt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 260, 40));

        regresarBtn1.setBackground(new java.awt.Color(236, 145, 117));
        regresarBtn1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        regresarBtn1.setText("REGRESAR");
        regresarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(regresarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, -1, -1));

        buscarDatosBtn.setBackground(new java.awt.Color(236, 145, 117));
        buscarDatosBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        buscarDatosBtn.setText("BUSCAR");
        buscarDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDatosBtnActionPerformed(evt);
            }
        });
        jPanel1.add(buscarDatosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 130, 40));

        setPrecioAnterior.setText("0.0");
        jPanel1.add(setPrecioAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesion_btnActionPerformed
        VentanaLogin ventanaLogin = new VentanaLogin();
        ventanaLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cerrarSesion_btnActionPerformed

    private void venderBoleto_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderBoleto_btnActionPerformed

    }//GEN-LAST:event_venderBoleto_btnActionPerformed

    private void continuarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBtnActionPerformed
        Autobus autobus = new Autobus();
        Boleto boleto = new Boleto();
        Double precioAnterior = Double.parseDouble(setPrecioAnterior.getText());
        boleto.setPrecioFinal(precioAnterior);
        
        boolean continuar = false;
        int fila = tablaBoletos.getSelectedRow();
        try{

            if(fila == -1){
                JOptionPane.showMessageDialog(this, "No se ha seleccionado un boleto", "Boleto no seleccionado", JOptionPane.WARNING_MESSAGE);
            }else{
                String numAutobus = tablaBoletos.getValueAt(fila, 0).toString();
                String origen = tablaBoletos.getValueAt(fila, 1).toString();
                String destino = tablaBoletos.getValueAt(fila, 2).toString();
                String precio = tablaBoletos.getValueAt(fila, 3).toString();
                String fecha = tablaBoletos.getValueAt(fila, 4).toString();
                String horario = tablaBoletos.getValueAt(fila, 5).toString();

                int autobusInt = Integer.parseInt(numAutobus);
                autobus.setNumeroAutobus(autobusInt);
                autobus.setNombreOrigen(origen);
                autobus.setNombreDestino(destino);
                double precioD = Double.parseDouble(precio);
                autobus.setPrecioViaje(precioD);
                autobus.setHorarioViaje(horario);
                autobus.setFechaViaje(fecha);
                continuar = true;
                if(continuar == true){
                    VentanaAsiento ventanaAsiento = new VentanaAsiento(autobus, boleto);
                    ventanaAsiento.setVisible(true);
                    this.setVisible(false);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se ha seleccionado un boleto", "Boleto no seleccionado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_continuarBtnActionPerformed

    private void regresarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtn1ActionPerformed
        VentanaVenderBoletos ventanaBoletos = new VentanaVenderBoletos();
        ventanaBoletos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarBtn1ActionPerformed

    private void buscarDatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDatosBtnActionPerformed
        Boleto boleto = new Boleto();
        if(!(origenTxt.getText().isEmpty()) && !(destinoTxt.getText().isEmpty())){
            try{
                SimpleDateFormat conv;
                conv = new SimpleDateFormat("yyyy-MM-dd");
                String fecha = conv.format(this.fechaDt.getDate());
                if(!(fecha.isEmpty())){
                    boleto.seleccionarOrigen(tablaBoletos, origenTxt.getText());
                    boleto.seleccionarDestino(tablaBoletos, origenTxt.getText(), destinoTxt.getText());
                    boleto.seleccionarFecha(tablaBoletos, origenTxt.getText(), destinoTxt.getText(), fecha);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha", "Campo incompleto", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe elegir el origen y el destino del viaje", "Campo Incompleto", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buscarDatosBtnActionPerformed

    public void añadirBoletos(){
        DefaultTableModel tablaAutobuses = new DefaultTableModel();
        tablaAutobuses.addColumn("No Autobus");
        tablaAutobuses.addColumn("Origen");
        tablaAutobuses.addColumn("Destino");
        tablaAutobuses.addColumn("Precio");
        tablaAutobuses.addColumn("Fecha");
        tablaAutobuses.addColumn("Hora");
        tablaBoletos.setModel(tablaAutobuses);
        
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String []datos = new String[6];
        
        String sql = "SELECT * FROM autobus";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                tablaAutobuses.addRow(datos);
            }
            tablaBoletos.setModel(tablaAutobuses);
            
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            
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
            java.util.logging.Logger.getLogger(VentanaNuevoOrigenDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaNuevoOrigenDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaNuevoOrigenDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaNuevoOrigenDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VentanaNuevoOrigenDestino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarDatosBtn;
    private javax.swing.JToggleButton cerrarSesion_btn;
    private javax.swing.JToggleButton consultarVentas_btn;
    private javax.swing.JButton continuarBtn;
    private javax.swing.JTextField destinoTxt;
    private com.toedter.calendar.JDateChooser fechaDt;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField origenTxt;
    private javax.swing.JButton regresarBtn1;
    private javax.swing.JLabel setPrecioAnterior;
    private javax.swing.JTable tablaBoletos;
    private javax.swing.JToggleButton venderBoleto_btn;
    // End of variables declaration//GEN-END:variables
}
