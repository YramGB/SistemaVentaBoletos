package vistas;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Acceso;
import modelo.Boleto;
import modelo.Conexion;

public class VentanaConsultarVentasAdministrador extends javax.swing.JFrame {
    public VentanaConsultarVentasAdministrador() {
        initComponents();  
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoAPP.png")).getImage());
        setLocationRelativeTo(null);
        consultarVentas_btn.setEnabled(false);
        añadirBoletos();
     
        tablaBoletos.getTableHeader().setFont(new java.awt.Font("Agency FB", 9, 22));
        
        DefaultTableCellRenderer alineacion = new DefaultTableCellRenderer();
        alineacion.setHorizontalAlignment(SwingConstants.CENTER);        
        for(int i = 0; i < tablaBoletos.getColumnCount(); i++){
            tablaBoletos.getColumnModel().getColumn(i).setCellRenderer(alineacion);            
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        consultarVentas_btn = new javax.swing.JToggleButton();
        cerrarSesion_btn = new javax.swing.JToggleButton();
        venderBoleto_btn = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBoletos = new javax.swing.JTable();
        fechaLabel = new javax.swing.JLabel();
        estadoComboBox = new javax.swing.JComboBox<>();
        descargarPDF = new javax.swing.JButton();
        estadoLabel = new javax.swing.JLabel();
        origenLabel = new javax.swing.JLabel();
        destinoLabel = new javax.swing.JLabel();
        origenTxt = new javax.swing.JTextField();
        destinoTxt = new javax.swing.JTextField();
        fechaTxt = new com.toedter.calendar.JDateChooser();
        buscarDatosBtn1 = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();

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
        venderBoleto_btn.setText("DAR DE ALTA A PERSONAL");
        venderBoleto_btn.setAutoscrolls(true);
        venderBoleto_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderBoleto_btnActionPerformed(evt);
            }
        });
        jPanel1.add(venderBoleto_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 440, 80));

        tablaBoletos.setBackground(new java.awt.Color(242, 235, 244));
        tablaBoletos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaBoletos.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        tablaBoletos.setForeground(new java.awt.Color(0, 0, 0));
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
        tablaBoletos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaBoletos.setMaximumSize(null);
        tablaBoletos.setMinimumSize(new java.awt.Dimension(0, 20));
        tablaBoletos.setRowHeight(26);
        tablaBoletos.setSelectionBackground(new java.awt.Color(236, 145, 117));
        tablaBoletos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaBoletos.setShowGrid(true);
        jScrollPane2.setViewportView(tablaBoletos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 1240, 330));

        fechaLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        fechaLabel.setText("FECHA:");
        jPanel1.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));

        estadoComboBox.setBackground(new java.awt.Color(236, 145, 117));
        estadoComboBox.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Vendido", "Cancelado" }));
        jPanel1.add(estadoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 120, -1));

        descargarPDF.setBackground(new java.awt.Color(236, 145, 117));
        descargarPDF.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        descargarPDF.setText("DESCARGAR PDF");
        descargarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarPDFActionPerformed(evt);
            }
        });
        jPanel1.add(descargarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 670, 160, 40));

        estadoLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        estadoLabel.setText("ESTADO DEL BOLETO:");
        jPanel1.add(estadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        origenLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        origenLabel.setText("ORIGEN:");
        jPanel1.add(origenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        destinoLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        destinoLabel.setText("DESTINO:");
        jPanel1.add(destinoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        origenTxt.setBackground(new java.awt.Color(236, 145, 117));
        origenTxt.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jPanel1.add(origenTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 140, 40));

        destinoTxt.setBackground(new java.awt.Color(236, 145, 117));
        destinoTxt.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jPanel1.add(destinoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 140, 40));

        fechaTxt.setBackground(new java.awt.Color(236, 145, 117));
        fechaTxt.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 150, 40));

        buscarDatosBtn1.setBackground(new java.awt.Color(236, 145, 117));
        buscarDatosBtn1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        buscarDatosBtn1.setText("BUSCAR");
        buscarDatosBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDatosBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(buscarDatosBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 230, 130, 40));

        salirBtn.setBackground(new java.awt.Color(236, 145, 117));
        salirBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        salirBtn.setText("REGRESAR");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        jPanel1.add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 670, 160, 40));

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

    private void consultarVentas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarVentas_btnActionPerformed
        VentanaConsultarVentas consultarVentas = new VentanaConsultarVentas();
        consultarVentas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consultarVentas_btnActionPerformed

    private void cerrarSesion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesion_btnActionPerformed
        Acceso acceso = new Acceso();
        if (acceso.cerrarSesion()) {
            VentanaLogin ventanaLogin = new VentanaLogin();
            ventanaLogin.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cerrarSesion_btnActionPerformed

    private void venderBoleto_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderBoleto_btnActionPerformed
        VentanaAltaPersonal altaPersonal = new VentanaAltaPersonal();
        altaPersonal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_venderBoleto_btnActionPerformed

    private void descargarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarPDFActionPerformed
        Document documento = new Document();
        documento.setPageSize(PageSize.A3.rotate());
        DateTimeFormatter nombrePDF = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + "Ventas_" + nombrePDF.format(LocalDateTime.now()) + ".pdf"));

            /*
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/imagenes/iconoAPP.png");
            header.scaleToFit(100, 100);
            header.setAlignment(Chunk.ALIGN_CENTER);
            */
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("REPORTE DE VENTAS DE BOLETOS \n \n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 40, Font.BOLD, BaseColor.BLACK));

            documento.open();
            //documento.add(header);
            documento.add(parrafo);

            PdfPTable tablaReporte = new PdfPTable(12);
            tablaReporte.setWidthPercentage(100);

            PdfPCell codigo = new PdfPCell(new Phrase("Código"));
            codigo.setBackgroundColor(BaseColor.YELLOW);
            codigo.setHorizontalAlignment(Element.ALIGN_CENTER);
            codigo.setVerticalAlignment(Element.ALIGN_MIDDLE);
            codigo.setMinimumHeight(30);

            PdfPCell estado = new PdfPCell(new Phrase("Estado"));
            estado.setBackgroundColor(BaseColor.YELLOW);
            estado.setHorizontalAlignment(Element.ALIGN_CENTER);
            estado.setVerticalAlignment(Element.ALIGN_MIDDLE);
            estado.setMinimumHeight(30);

            PdfPCell autobus = new PdfPCell(new Phrase("Autobus"));
            autobus.setBackgroundColor(BaseColor.YELLOW);
            autobus.setHorizontalAlignment(Element.ALIGN_CENTER);
            autobus.setVerticalAlignment(Element.ALIGN_MIDDLE);
            autobus.setMinimumHeight(30);

            PdfPCell origen = new PdfPCell(new Phrase("Origen"));
            origen.setBackgroundColor(BaseColor.YELLOW);
            origen.setHorizontalAlignment(Element.ALIGN_CENTER);
            origen.setVerticalAlignment(Element.ALIGN_MIDDLE);
            origen.setMinimumHeight(30);

            PdfPCell destino = new PdfPCell(new Phrase("Destino"));
            destino.setBackgroundColor(BaseColor.YELLOW);
            destino.setHorizontalAlignment(Element.ALIGN_CENTER);
            destino.setVerticalAlignment(Element.ALIGN_MIDDLE);
            destino.setMinimumHeight(30);

            PdfPCell descuento = new PdfPCell(new Phrase("Descuento"));
            descuento.setBackgroundColor(BaseColor.YELLOW);
            descuento.setHorizontalAlignment(Element.ALIGN_CENTER);
            descuento.setVerticalAlignment(Element.ALIGN_MIDDLE);
            descuento.setMinimumHeight(30);

            PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
            nombre.setBackgroundColor(BaseColor.YELLOW);
            nombre.setHorizontalAlignment(Element.ALIGN_CENTER);
            nombre.setVerticalAlignment(Element.ALIGN_MIDDLE);
            nombre.setMinimumHeight(30);

            PdfPCell aPaterno = new PdfPCell(new Phrase("A. Paterno"));
            aPaterno.setBackgroundColor(BaseColor.YELLOW);
            aPaterno.setHorizontalAlignment(Element.ALIGN_CENTER);
            aPaterno.setVerticalAlignment(Element.ALIGN_MIDDLE);
            aPaterno.setMinimumHeight(30);

            PdfPCell aMaterno = new PdfPCell(new Phrase("A. Materno"));
            aMaterno.setBackgroundColor(BaseColor.YELLOW);
            aMaterno.setHorizontalAlignment(Element.ALIGN_CENTER);
            aMaterno.setVerticalAlignment(Element.ALIGN_MIDDLE);
            aMaterno.setMinimumHeight(30);

            PdfPCell asiento = new PdfPCell(new Phrase("Asiento"));
            asiento.setBackgroundColor(BaseColor.YELLOW);
            asiento.setHorizontalAlignment(Element.ALIGN_CENTER);
            asiento.setVerticalAlignment(Element.ALIGN_MIDDLE);
            asiento.setMinimumHeight(30);

            PdfPCell costo = new PdfPCell(new Phrase("Costo"));
            costo.setBackgroundColor(BaseColor.YELLOW);
            costo.setHorizontalAlignment(Element.ALIGN_CENTER);
            costo.setVerticalAlignment(Element.ALIGN_MIDDLE);
            costo.setMinimumHeight(30);

            PdfPCell fecha = new PdfPCell(new Phrase("Fecha"));
            fecha.setBackgroundColor(BaseColor.YELLOW);
            fecha.setHorizontalAlignment(Element.ALIGN_CENTER);
            fecha.setVerticalAlignment(Element.ALIGN_MIDDLE);
            fecha.setMinimumHeight(30);

            tablaReporte.addCell(codigo);
            tablaReporte.addCell(estado);
            tablaReporte.addCell(autobus);
            tablaReporte.addCell(origen);
            tablaReporte.addCell(destino);
            tablaReporte.addCell(descuento);
            tablaReporte.addCell(nombre);
            tablaReporte.addCell(aPaterno);
            tablaReporte.addCell(aMaterno);
            tablaReporte.addCell(asiento);
            tablaReporte.addCell(costo);
            tablaReporte.addCell(fecha);

            int datos = tablaBoletos.getRowCount();
            System.out.println("filas: " + datos);

            for(int i = 0; i < datos; i++){

                PdfPCell col1 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,0)));
                col1.setHorizontalAlignment(Element.ALIGN_CENTER);
                col1.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col1.setMinimumHeight(20);
                tablaReporte.addCell(col1);

                PdfPCell col2 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,1)));
                col2.setHorizontalAlignment(Element.ALIGN_CENTER);
                col2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col2.setMinimumHeight(20);
                tablaReporte.addCell(col2);

                PdfPCell col3 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,2)));
                col3.setHorizontalAlignment(Element.ALIGN_CENTER);
                col3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col3.setMinimumHeight(20);
                tablaReporte.addCell(col3);

                PdfPCell col4 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,3)));
                col4.setHorizontalAlignment(Element.ALIGN_CENTER);
                col4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col4.setMinimumHeight(20);
                tablaReporte.addCell(col4);

                PdfPCell col5 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,4)));
                col5.setHorizontalAlignment(Element.ALIGN_CENTER);
                col5.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col5.setMinimumHeight(20);
                tablaReporte.addCell(col5);

                PdfPCell col6 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,5)));
                col6.setHorizontalAlignment(Element.ALIGN_CENTER);
                col6.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col6.setMinimumHeight(20);
                tablaReporte.addCell(col6);

                PdfPCell col7 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,6)));
                col7.setHorizontalAlignment(Element.ALIGN_CENTER);
                col7.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col7.setMinimumHeight(20);
                tablaReporte.addCell(col7);

                PdfPCell col8 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,7)));
                col8.setHorizontalAlignment(Element.ALIGN_CENTER);
                col8.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col8.setMinimumHeight(20);
                tablaReporte.addCell(col8);

                PdfPCell col9 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,8)));
                col9.setHorizontalAlignment(Element.ALIGN_CENTER);
                col9.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col9.setMinimumHeight(20);
                tablaReporte.addCell(col9);

                PdfPCell col10 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,9)));
                col10.setHorizontalAlignment(Element.ALIGN_CENTER);
                col10.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col10.setMinimumHeight(20);
                tablaReporte.addCell(col10);

                PdfPCell col11 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,10)));
                col11.setHorizontalAlignment(Element.ALIGN_CENTER);
                col11.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col11.setMinimumHeight(20);
                tablaReporte.addCell(col11);

                PdfPCell col12 = new PdfPCell(new Phrase((String) tablaBoletos.getValueAt(i,11)));
                col12.setHorizontalAlignment(Element.ALIGN_CENTER);
                col12.setVerticalAlignment(Element.ALIGN_MIDDLE);
                col12.setMinimumHeight(20);
                tablaReporte.addCell(col12);

            }
            documento.add(tablaReporte);

            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            documento.add(new Paragraph("\nFecha: " + date.format(LocalDateTime.now())));
            documento.close();
            JOptionPane.showMessageDialog(this, "Reporte creado correctamente", "Archivo creado", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.err.print("Error al generar el pdf: " + e);
            JOptionPane.showMessageDialog(this, "Error al generar PDF", "Operación sin éxito", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_descargarPDFActionPerformed

    private void buscarDatosBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDatosBtn1ActionPerformed
        Boleto boleto = new Boleto();
        String fecha = "";
        try {
            SimpleDateFormat conv;
            conv = new SimpleDateFormat("yyyy-MM-dd");
            fecha = conv.format(this.fechaTxt.getDate());
        } catch (Exception e) {
            System.out.println("No hay fecha: " + e);
            fecha = "";
        }

        if (origenTxt.getText().isEmpty()) {
            origenTxt.setText("%");
        }
        if (destinoTxt.getText().isEmpty()) {
            destinoTxt.setText("%");
        }
        if (fecha == "") {
            fecha = "%";
        }

        boleto.consultarVentas(estadoComboBox.getSelectedItem().toString(), origenTxt.getText(), destinoTxt.getText(), fecha, tablaBoletos);
    }//GEN-LAST:event_buscarDatosBtn1ActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        VentanaAdministrador administrador = new VentanaAdministrador();
        administrador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirBtnActionPerformed

    public void añadirBoletos() {
        DefaultTableModel tablaAutobuses = new DefaultTableModel();
        tablaAutobuses.addColumn("Codigo");
        tablaAutobuses.addColumn("Estado");
        tablaAutobuses.addColumn("Autobus");
        tablaAutobuses.addColumn("Origen");
        tablaAutobuses.addColumn("Destino");
        tablaAutobuses.addColumn("Descuento");
        tablaAutobuses.addColumn("Nombre");
        tablaAutobuses.addColumn("A. Paterno");
        tablaAutobuses.addColumn("A. Materno");
        tablaAutobuses.addColumn("Asiento");
        tablaAutobuses.addColumn("Costo");
        tablaAutobuses.addColumn("Fecha");
        tablaBoletos.setModel(tablaAutobuses);

        Conexion conn = new Conexion();
        Connection reg = conn.conectar();
        Connection con = reg;

        PreparedStatement ps = null;
        ResultSet rs = null;

        String[] datos = new String[15];

        String sql = "SELECT * FROM boleto INNER JOIN autobus ON boleto.numeroAutobus = autobus.numeroAutobus";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(11);
                datos[4] = rs.getString(12);
                datos[5] = rs.getString(4);
                datos[6] = rs.getString(5);
                datos[7] = rs.getString(6);
                datos[8] = rs.getString(7);
                datos[9] = rs.getString(8);
                datos[10] = rs.getString(9);
                datos[11] = rs.getString(14);
                tablaAutobuses.addRow(datos);
            }
            tablaBoletos.setModel(tablaAutobuses);

        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(VentanaConsultarVentasAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultarVentasAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultarVentasAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultarVentasAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaConsultarVentasAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarDatosBtn1;
    private javax.swing.JToggleButton cerrarSesion_btn;
    private javax.swing.JToggleButton consultarVentas_btn;
    private javax.swing.JButton descargarPDF;
    private javax.swing.JLabel destinoLabel;
    private javax.swing.JTextField destinoTxt;
    private javax.swing.JComboBox<String> estadoComboBox;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel fechaLabel;
    private com.toedter.calendar.JDateChooser fechaTxt;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel origenLabel;
    private javax.swing.JTextField origenTxt;
    private javax.swing.JButton salirBtn;
    private javax.swing.JTable tablaBoletos;
    private javax.swing.JToggleButton venderBoleto_btn;
    // End of variables declaration//GEN-END:variables
}
