package vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Administrador;
import modelo.Conexion;
import modelo.Descuento;

public class VentanaEliminarDescuento extends javax.swing.JFrame {

    public VentanaEliminarDescuento() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoAPP.png")).getImage());
        setLocationRelativeTo(null);
        añadirDescuentos();
        altaBtn.setEnabled(false);
        consultarVentas_btn.setEnabled(false);
        cerrarSesion_btn.setEnabled(false);
        
        DefaultTableCellRenderer alineacion = new DefaultTableCellRenderer();
        alineacion.setHorizontalAlignment(SwingConstants.CENTER);        
        for(int i = 0; i < tablaDescuentos.getColumnCount(); i++){
            tablaDescuentos.getColumnModel().getColumn(i).setCellRenderer(alineacion);            
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
        cerrarSesion_btn = new javax.swing.JToggleButton();
        altaBtn = new javax.swing.JToggleButton();
        consultarVentas_btn = new javax.swing.JToggleButton();
        regresarBtn = new javax.swing.JButton();
        eliminarDatosBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDescuentos = new javax.swing.JTable();
        buscarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Venta de Boletos");

        jPanel1.setBackground(new java.awt.Color(242, 235, 244));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("LOGO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        cerrarSesion_btn.setBackground(new java.awt.Color(236, 145, 117));
        cerrarSesion_btn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        cerrarSesion_btn.setText("CERRAR SESIÓN");
        cerrarSesion_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesion_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cerrarSesion_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 80));

        altaBtn.setBackground(new java.awt.Color(236, 145, 117));
        altaBtn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        altaBtn.setText("DAR DE ALTA A PERSONAL");
        altaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(altaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 440, 80));

        consultarVentas_btn.setBackground(new java.awt.Color(236, 145, 117));
        consultarVentas_btn.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        consultarVentas_btn.setText("CONSULTAR VENTAS");
        jPanel1.add(consultarVentas_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 420, 80));

        regresarBtn.setBackground(new java.awt.Color(236, 145, 117));
        regresarBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        regresarBtn.setText("REGRESAR");
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, -1, -1));

        eliminarDatosBtn.setBackground(new java.awt.Color(236, 145, 117));
        eliminarDatosBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        eliminarDatosBtn.setText("ELIMINAR");
        eliminarDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDatosBtnActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarDatosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 130, 40));

        tablaDescuentos.setBackground(new java.awt.Color(242, 235, 244));
        tablaDescuentos.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        tablaDescuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaDescuentos.setRowHeight(25);
        tablaDescuentos.setSelectionBackground(new java.awt.Color(236, 145, 117));
        tablaDescuentos.setShowGrid(true);
        tablaDescuentos.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tablaDescuentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 370, 300));

        buscarLabel.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        buscarLabel.setText("SELECCIONE EL DESCUENTO QUE DESEE ELIMINAR:");
        jPanel1.add(buscarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, 40));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesion_btnActionPerformed
        VentanaLogin ventanaLogin = new VentanaLogin();
        ventanaLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cerrarSesion_btnActionPerformed

    private void altaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaBtnActionPerformed

    }//GEN-LAST:event_altaBtnActionPerformed

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        VentanaAdministrador admin = new VentanaAdministrador();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void eliminarDatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDatosBtnActionPerformed
        Administrador admin = new Administrador();
        Descuento descuento = new Descuento();
        boolean continuar = false;
        int fila = tablaDescuentos.getSelectedRow();
        try{

            if(fila == -1){
                JOptionPane.showMessageDialog(this, "No se ha seleccionado un descuento", "Descuento no seleccionado", JOptionPane.WARNING_MESSAGE);
            }else{

                String tipoDescuento = tablaDescuentos.getValueAt(fila, 0).toString();
                String porcentaje = tablaDescuentos.getValueAt(fila, 1).toString();

                descuento.setTipoDescuento(tipoDescuento);
                int porcentajeDescuento = Integer.parseInt(porcentaje);
                descuento.setPorcentajeDescuento(porcentajeDescuento);

                if(admin.eliminarDescuento(descuento)){
                    añadirDescuentos();
                    JOptionPane.showMessageDialog(this, "El descuento ha sido eliminado correctamente", "Descuento eliminado", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "El descuento no ha podido eliminarse", "Descuento no eliminado", JOptionPane.ERROR_MESSAGE);
                }                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se ha seleccionado un boleto", "Boleto no seleccionado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_eliminarDatosBtnActionPerformed

    public void añadirDescuentos(){
        DefaultTableModel tablaDescuento = new DefaultTableModel();
        tablaDescuento.addColumn("Tipo de descuento");
        tablaDescuento.addColumn("Porcentaje de descuento");
        tablaDescuentos.setModel(tablaDescuento);
        
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String []datos = new String[2];
        
        String sql = "SELECT * FROM descuento";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                tablaDescuento.addRow(datos);
            }
            tablaDescuentos.setModel(tablaDescuento);
            
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
            java.util.logging.Logger.getLogger(VentanaEliminarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarDescuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEliminarDescuento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton altaBtn;
    private javax.swing.JLabel buscarLabel;
    private javax.swing.JToggleButton cerrarSesion_btn;
    private javax.swing.JToggleButton consultarVentas_btn;
    private javax.swing.JButton eliminarDatosBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JTable tablaDescuentos;
    // End of variables declaration//GEN-END:variables
}
