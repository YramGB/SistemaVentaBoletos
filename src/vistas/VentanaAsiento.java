package vistas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Asiento;
import modelo.Autobus;
import modelo.Boleto;
import modelo.Conexion;

public class VentanaAsiento extends javax.swing.JFrame {

    public VentanaAsiento(Autobus autobus, Boleto boleto) {
        initComponents();                                          
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoAPP.png")).getImage());
        asignarAsiento(tablaOculta, autobus);                           
        asignarAsientos();
                
        String numero = String.valueOf(autobus.getNumeroAutobus());
        numeroAutobusTxt.setText(numero);
        setOrigenLabel.setText(autobus.getNombreOrigen());
        setDestinoLabel.setText(autobus.getNombreDestino());
        
        String precio = Double.toString(autobus.getPrecioViaje());
        setPrecioLabel.setText(precio); 
        
        setFechaLabel.setText(autobus.getFechaViaje());
        setHorarioLabel.setText(autobus.getHorarioViaje());
        
        String precioAnterior = String.valueOf(boleto.getPrecioFinal());
        setPrecioAnterior.setText(precioAnterior);        
        
        setLocationRelativeTo(null);
        venderBoleto_btn.setEnabled(false);        
        cerrarSesion_btn.setEnabled(false);
        consultarVentas_btn.setEnabled(false);                            
    }

    public void asignarAsiento(JTable tabla, Autobus numero){
        
        Conexion conn = new Conexion();
        Connection reg = conn.conectar();  
        Connection con = reg; 
         
        PreparedStatement ps = null;
        ResultSet rs = null;
               
        DefaultTableModel tablaAsientos = new DefaultTableModel();
        tablaAsientos.addColumn("No Autobus");
        tablaAsientos.addColumn("Asiento");
        tablaAsientos.addColumn("Estado De asiento");     
        
        String []datos = new String[3];
        
        String sql = "SELECT * FROM asiento WHERE numeroAutobus = '" + numero.getNumeroAutobus() + "'";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
            
                if(rs.getString(3).equals("1")){
                    datos[2] = "Disponible"; 
                    
                }else if(rs.getString(3).equals("0")){
                    datos[2] = "Ocupado";                    
                }                
                tablaAsientos.addRow(datos);               
            }
            tabla.setModel(tablaAsientos);   
           
        }catch(Exception e){
            System.out.println("Error en la consulta: " + e);
            
        }      
    }    
    
    public void asignarAsientos(){
        Color colorBlanco = new java.awt.Color(255,255,255);
        Color colorGris = new java.awt.Color(153,153,153); 
         
        if(tablaOculta.getValueAt(0, 2).toString().equals("Disponible")){
            asiento1.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(0, 2).toString().equals("Ocupado")){
            asiento1.setEnabled(false);
            asiento1.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(1, 2).toString().equals("Disponible")){
            asiento2.setBackground(colorBlanco);                
        }else if(tablaOculta.getValueAt(1, 2).toString().equals("Ocupado")){
            asiento2.setEnabled(false);
            asiento2.setBackground(colorGris);                
        }
        
        if(tablaOculta.getValueAt(2, 2).toString().equals("Disponible")){
            asiento3.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(2, 2).toString().equals("Ocupado")){
            asiento3.setEnabled(false);
            asiento3.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(3, 2).toString().equals("Disponible")){
            asiento4.setBackground(colorBlanco);         
        }else if(tablaOculta.getValueAt(3, 2).toString().equals("Ocupado")){
            asiento4.setEnabled(false);
            asiento4.setBackground(colorGris);
        }

        if(tablaOculta.getValueAt(4, 2).toString().equals("Disponible")){
            asiento5.setBackground(colorBlanco);           
        }else if(tablaOculta.getValueAt(4, 2).toString().equals("Ocupado")){
            asiento5.setEnabled(false);
            asiento5.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(5, 2).toString().equals("Disponible")){
            asiento6.setBackground(colorBlanco);              
        }else if(tablaOculta.getValueAt(5, 2).toString().equals("Ocupado")){
            asiento6.setEnabled(false);
            asiento6.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(6, 2).toString().equals("Disponible")){
            asiento7.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(6, 2).toString().equals("Ocupado")){
            asiento7.setEnabled(false);
            asiento7.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(7, 2).toString().equals("Disponible")){
            asiento8.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(7, 2).toString().equals("Ocupado")){
            asiento8.setEnabled(false);
            asiento8.setBackground(colorGris);                
        }
        
        if(tablaOculta.getValueAt(8, 2).toString().equals("Disponible")){
            asiento9.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(8, 2).toString().equals("Ocupado")){
            asiento9.setEnabled(false);
            asiento9.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(9, 2).toString().equals("Disponible")){
            asiento10.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(9, 2).toString().equals("Ocupado")){
            asiento10.setEnabled(false);
            asiento10.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(10, 2).toString().equals("Disponible")){
            asiento11.setBackground(colorBlanco);        
        }else if(tablaOculta.getValueAt(10, 2).toString().equals("Ocupado")){                
            asiento11.setEnabled(false);
            asiento11.setBackground(colorGris);
        }
               
        if(tablaOculta.getValueAt(11, 2).toString().equals("Disponible")){        
            asiento12.setBackground(colorBlanco);            
        }else if(tablaOculta.getValueAt(11, 2).toString().equals("Ocupado")){                
            asiento12.setEnabled(false);
            asiento12.setBackground(colorGris);            
        }
                    
        if(tablaOculta.getValueAt(12, 2).toString().equals("Disponible")){        
            asiento13.setBackground(colorBlanco);           
        }else if(tablaOculta.getValueAt(12, 2).toString().equals("Ocupado")){                
            asiento13.setEnabled(false);
            asiento13.setBackground(colorGris);           
        }
                    
        if(tablaOculta.getValueAt(13, 2).toString().equals("Disponible")){                    
            asiento14.setBackground(colorBlanco);            
        }else if(tablaOculta.getValueAt(13, 2).toString().equals("Ocupado")){                                
            asiento14.setEnabled(false);
            asiento14.setBackground(colorGris);            
        }
                    
        if(tablaOculta.getValueAt(14, 2).toString().equals("Disponible")){        
            asiento15.setBackground(colorBlanco);            
        }else if(tablaOculta.getValueAt(14, 2).toString().equals("Ocupado")){                
            asiento15.setEnabled(false);
            asiento15.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(15, 2).toString().equals("Disponible")){
            asiento16.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(15, 2).toString().equals("Ocupado")){
            asiento16.setEnabled(false);
            asiento16.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(16, 2).toString().equals("Disponible")){
            asiento17.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(16, 2).toString().equals("Ocupado")){
            asiento17.setEnabled(false);
            asiento17.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(17, 2).toString().equals("Disponible")){
            asiento18.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(17, 2).toString().equals("Ocupado")){
            asiento18.setEnabled(false);
            asiento18.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(18, 2).toString().equals("Disponible")){
            asiento19.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(18, 2).toString().equals("Ocupado")){
            asiento19.setEnabled(false);
            asiento19.setBackground(colorGris);
        }
                
        if(tablaOculta.getValueAt(19, 2).toString().equals("Disponible")){
            asiento20.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(19, 2).toString().equals("Ocupado")){
            asiento20.setEnabled(false);
            asiento20.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(20, 2).toString().equals("Disponible")){
            asiento21.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(20, 2).toString().equals("Ocupado")){
            asiento21.setEnabled(false);
            asiento21.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(21, 2).toString().equals("Disponible")){
            asiento22.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(21, 2).toString().equals("Ocupado")){
            asiento22.setEnabled(false);
            asiento22.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(22, 2).toString().equals("Disponible")){
            asiento23.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(22, 2).toString().equals("Ocupado")){
            asiento23.setEnabled(false);
            asiento23.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(23, 2).toString().equals("Disponible")){
            asiento24.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(23, 2).toString().equals("Ocupado")){
            asiento24.setEnabled(false);
            asiento24.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(24, 2).toString().equals("Disponible")){
            asiento25.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(24, 2).toString().equals("Ocupado")){
            asiento25.setEnabled(false);
            asiento25.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(25, 2).toString().equals("Disponible")){
            asiento26.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(25, 2).toString().equals("Ocupado")){
            asiento26.setEnabled(false);
            asiento26.setBackground(colorGris);
        }
               
        if(tablaOculta.getValueAt(26, 2).toString().equals("Disponible")){
            asiento27.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(26, 2).toString().equals("Ocupado")){
            asiento27.setEnabled(false);
            asiento27.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(27, 2).toString().equals("Disponible")){
            asiento28.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(27, 2).toString().equals("Ocupado")){
            asiento28.setEnabled(false);
            asiento28.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(28, 2).toString().equals("Disponible")){
            asiento29.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(28, 2).toString().equals("Ocupado")){
            asiento29.setEnabled(false);
            asiento29.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(29, 2).toString().equals("Disponible")){
            asiento30.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(29, 2).toString().equals("Ocupado")){
            asiento30.setEnabled(false);
            asiento30.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(30, 2).toString().equals("Disponible")){
            asiento31.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(30, 2).toString().equals("Ocupado")){
            asiento31.setEnabled(false);
            asiento31.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(31, 2).toString().equals("Disponible")){
            asiento32.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(31, 2).toString().equals("Ocupado")){
            asiento32.setEnabled(false);
            asiento32.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(32, 2).toString().equals("Disponible")){
            asiento33.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(32, 2).toString().equals("Ocupado")){
            asiento33.setEnabled(false);
            asiento33.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(33, 2).toString().equals("Disponible")){
            asiento34.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(33, 2).toString().equals("Ocupado")){
            asiento34.setEnabled(false);
            asiento34.setBackground(colorGris);
        }
        
        if(tablaOculta.getValueAt(34, 2).toString().equals("Disponible")){
            asiento35.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(34, 2).toString().equals("Ocupado")){
            asiento35.setEnabled(false);
            asiento35.setBackground(colorGris);
        }
       
        if(tablaOculta.getValueAt(35, 2).toString().equals("Disponible")){       
            asiento36.setBackground(colorBlanco);
        }else if(tablaOculta.getValueAt(35, 2).toString().equals("Ocupado")){
            asiento36.setEnabled(false);
            asiento36.setBackground(colorGris);
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
        logoLabel = new javax.swing.JLabel();
        cerrarSesion_btn = new javax.swing.JToggleButton();
        venderBoleto_btn = new javax.swing.JToggleButton();
        consultarVentas_btn = new javax.swing.JToggleButton();
        borrarBtn = new javax.swing.JButton();
        origenLabel = new javax.swing.JLabel();
        destinoLabel = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        horarioLabel = new javax.swing.JLabel();
        setHorarioLabel = new javax.swing.JLabel();
        setFechaLabel = new javax.swing.JLabel();
        setPrecioLabel = new javax.swing.JLabel();
        setDestinoLabel = new javax.swing.JLabel();
        setOrigenLabel = new javax.swing.JLabel();
        regresarBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOculta = new javax.swing.JTable();
        seleccionarAsientoLabel1 = new javax.swing.JLabel();
        asiento3 = new javax.swing.JButton();
        asiento4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        asiento2 = new javax.swing.JButton();
        asiento1 = new javax.swing.JButton();
        asiento7 = new javax.swing.JButton();
        asiento6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        asiento5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        asiento8 = new javax.swing.JButton();
        asiento11 = new javax.swing.JButton();
        asiento12 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        asiento10 = new javax.swing.JButton();
        asiento9 = new javax.swing.JButton();
        asiento15 = new javax.swing.JButton();
        asiento14 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        asiento13 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        asiento16 = new javax.swing.JButton();
        asiento19 = new javax.swing.JButton();
        asiento20 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        asiento18 = new javax.swing.JButton();
        asiento17 = new javax.swing.JButton();
        asiento23 = new javax.swing.JButton();
        asiento22 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        asiento21 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        asiento24 = new javax.swing.JButton();
        asiento27 = new javax.swing.JButton();
        asiento28 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        asiento26 = new javax.swing.JButton();
        asiento25 = new javax.swing.JButton();
        asiento31 = new javax.swing.JButton();
        asiento30 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        asiento29 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        asiento32 = new javax.swing.JButton();
        asiento36 = new javax.swing.JButton();
        asiento35 = new javax.swing.JButton();
        asiento34 = new javax.swing.JButton();
        asiento33 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        continuarBtn1 = new javax.swing.JButton();
        numeroAutobusTxt = new javax.swing.JLabel();
        setPrecioAnterior = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Venta de Boletos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 235, 244));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        logoLabel.setText("LOGO");
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

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

        borrarBtn.setBackground(new java.awt.Color(236, 145, 117));
        borrarBtn.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        borrarBtn.setText("BORRAR SELECCIÓN");
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(borrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 530, -1, -1));

        origenLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        origenLabel.setText("ORIGEN:");
        jPanel1.add(origenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        destinoLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        destinoLabel.setText("DESTINO:");
        jPanel1.add(destinoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        precioLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        precioLabel.setText("PRECIO:");
        jPanel1.add(precioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        fechaLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        fechaLabel.setText("FECHA DE SALIDA:");
        jPanel1.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        horarioLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        horarioLabel.setText("HORARIO:");
        jPanel1.add(horarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        setHorarioLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        setHorarioLabel.setText("Ttx");
        jPanel1.add(setHorarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        setFechaLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        setFechaLabel.setText("Ttx");
        jPanel1.add(setFechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        setPrecioLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        setPrecioLabel.setText("Ttx");
        jPanel1.add(setPrecioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        setDestinoLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        setDestinoLabel.setText("Ttx");
        jPanel1.add(setDestinoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, -1, -1));

        setOrigenLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        setOrigenLabel.setText("Ttx");
        jPanel1.add(setOrigenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        regresarBtn1.setBackground(new java.awt.Color(236, 145, 117));
        regresarBtn1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        regresarBtn1.setText("REGRESAR");
        regresarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(regresarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        tablaOculta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaOculta.setEnabled(false);
        tablaOculta.setFocusable(false);
        jScrollPane1.setViewportView(tablaOculta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 20, 20));

        seleccionarAsientoLabel1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        seleccionarAsientoLabel1.setText("SELECCIONAR ASIENTO:");
        jPanel1.add(seleccionarAsientoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        asiento3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento3.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento3.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento3ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        asiento4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento4.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento4.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento4ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("3");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 20, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("4");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 20, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 20, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 20, -1));

        asiento2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento2.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento2.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento2ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        asiento1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento1.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento1.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento1ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, -1, -1));

        asiento7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento7.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento7.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento7ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        asiento6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento6.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento6.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento6ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("6");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 20, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("5");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, 20, -1));

        asiento5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento5.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento5.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento5ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("7");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 20, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("8");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 20, -1));

        asiento8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento8.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento8.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento8ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        asiento11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento11.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento11.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento11ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        asiento12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento12.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento12.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento12ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("11");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 20, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("12");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 20, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("9");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 20, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("10");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 20, -1));

        asiento10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento10.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento10.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento10ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, -1, -1));

        asiento9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento9.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento9.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento9ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, -1, -1));

        asiento15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento15.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento15.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento15ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        asiento14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento14.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento14.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento14ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, -1, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 20, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("13");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 20, -1));

        asiento13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento13.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento13.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento13ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, -1, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("15");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 20, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("16");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 20, -1));

        asiento16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento16.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento16.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento16ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        asiento19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento19.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento19.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento19ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        asiento20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento20.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento20.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento20ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("19");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 20, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("20");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 20, -1));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("17");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, 20, -1));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("18");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 20, -1));

        asiento18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento18.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento18.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento18ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, -1));

        asiento17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento17.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento17.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento17ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, -1, -1));

        asiento23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento23.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento23.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento23ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, -1, -1));

        asiento22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento22.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento22.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento22ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, -1, -1));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("22");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 20, -1));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("21");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 600, 20, -1));

        asiento21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento21.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento21.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento21ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, -1, -1));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("23");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 20, -1));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("24");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 20, -1));

        asiento24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento24.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento24.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento24ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento24, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, -1, -1));

        asiento27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento27.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento27.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento27ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento27, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, -1, -1));

        asiento28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento28.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento28.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento28ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento28, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, -1, -1));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("27");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 20, -1));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("28");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 20, -1));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("25");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 20, -1));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("26");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 20, -1));

        asiento26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento26.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento26.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento26ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento26, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, -1, -1));

        asiento25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento25.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento25.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento25ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento25, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, -1, -1));

        asiento31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento31.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento31.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento31ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento31, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, -1, -1));

        asiento30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento30.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento30.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento30ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento30, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 530, -1, -1));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("30");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 20, -1));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("29");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 20, -1));

        asiento29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento29.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento29.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento29ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento29, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 580, -1, -1));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("31");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 20, -1));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("32");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, 20, -1));

        asiento32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento32.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento32.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento32ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento32, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, -1, -1));

        asiento36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento36.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento36.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento36ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento36, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, -1, -1));

        asiento35.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento35.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento35.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento35ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento35, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, -1, -1));

        asiento34.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento34.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento34.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento34ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento34, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, -1, -1));

        asiento33.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\NetBeansProjects\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        asiento33.setMaximumSize(new java.awt.Dimension(40, 40));
        asiento33.setMinimumSize(new java.awt.Dimension(40, 40));
        asiento33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento33ActionPerformed(evt);
            }
        });
        jPanel1.add(asiento33, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 580, -1, -1));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("33");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 600, 20, -1));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("34");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 20, -1));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("35");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 20, -1));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("36");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 20, -1));
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, -1, -1));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        jLabel39.setText("Disponible");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 660, -1, -1));

        jLabel40.setBackground(new java.awt.Color(196, 196, 196));
        jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        jLabel40.setText("Ocupado");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yram\\Documents\\SistemaVentaBoletos\\src\\imagenes\\asiento.png")); // NOI18N
        jLabel41.setText("Seleccionado");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 660, -1, -1));

        jPanel2.setBackground(new java.awt.Color(236, 145, 117));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 660, 120, 40));

        jPanel3.setBackground(new java.awt.Color(196, 196, 196));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, 110, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 660, 110, 40));

        continuarBtn1.setBackground(new java.awt.Color(236, 145, 117));
        continuarBtn1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        continuarBtn1.setText("CONTINUAR");
        continuarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(continuarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 450, -1, -1));

        numeroAutobusTxt.setText("jLabel7");
        jPanel1.add(numeroAutobusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 130, -1, -1));

        setPrecioAnterior.setText("0.0");
        jPanel1.add(setPrecioAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void cerrarSesion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesion_btnActionPerformed
       
    }//GEN-LAST:event_cerrarSesion_btnActionPerformed

    private void venderBoleto_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderBoleto_btnActionPerformed

    }//GEN-LAST:event_venderBoleto_btnActionPerformed

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        asignarAsientos();
    }//GEN-LAST:event_borrarBtnActionPerformed

    private void regresarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtn1ActionPerformed
        Boleto boleto = new Boleto();
        double precioAnterior = Double.parseDouble(setPrecioAnterior.getText());
        boleto.setPrecioFinal(precioAnterior);
        if(precioAnterior > 0.0){
            VentanaNuevoOrigenDestino ventanaNuevoBoleto = new VentanaNuevoOrigenDestino(boleto);
            ventanaNuevoBoleto.setVisible(true);
            this.setVisible(false);
        }else{
            VentanaOrigenDestino ventanaBoleto = new VentanaOrigenDestino();
            ventanaBoleto.setVisible(true);
            this.setVisible(false);
        }        
    }//GEN-LAST:event_regresarBtn1ActionPerformed

    private void asiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento3ActionPerformed
        colorSeleccionado(asiento3);       
    }//GEN-LAST:event_asiento3ActionPerformed

    private void asiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento4ActionPerformed
        colorSeleccionado(asiento4);
    }//GEN-LAST:event_asiento4ActionPerformed

    private void asiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento2ActionPerformed
        colorSeleccionado(asiento2);
    }//GEN-LAST:event_asiento2ActionPerformed

    private void asiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento1ActionPerformed
        colorSeleccionado(asiento1);
    }//GEN-LAST:event_asiento1ActionPerformed

    private void asiento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento7ActionPerformed
        colorSeleccionado(asiento7);
    }//GEN-LAST:event_asiento7ActionPerformed

    private void asiento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento6ActionPerformed
        colorSeleccionado(asiento6);
    }//GEN-LAST:event_asiento6ActionPerformed

    private void asiento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento5ActionPerformed
        colorSeleccionado(asiento5);
    }//GEN-LAST:event_asiento5ActionPerformed

    private void asiento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento8ActionPerformed
        colorSeleccionado(asiento8);
    }//GEN-LAST:event_asiento8ActionPerformed

    private void asiento11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento11ActionPerformed
        colorSeleccionado(asiento11);
    }//GEN-LAST:event_asiento11ActionPerformed

    private void asiento12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento12ActionPerformed
        colorSeleccionado(asiento12);
    }//GEN-LAST:event_asiento12ActionPerformed

    private void asiento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento10ActionPerformed
        colorSeleccionado(asiento10);
    }//GEN-LAST:event_asiento10ActionPerformed

    private void asiento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento9ActionPerformed
        colorSeleccionado(asiento9);
    }//GEN-LAST:event_asiento9ActionPerformed

    private void asiento15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento15ActionPerformed
        colorSeleccionado(asiento15);
    }//GEN-LAST:event_asiento15ActionPerformed

    private void asiento14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento14ActionPerformed
        colorSeleccionado(asiento14);
    }//GEN-LAST:event_asiento14ActionPerformed

    private void asiento13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento13ActionPerformed
        colorSeleccionado(asiento13);
    }//GEN-LAST:event_asiento13ActionPerformed

    private void asiento16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento16ActionPerformed
        colorSeleccionado(asiento16);
    }//GEN-LAST:event_asiento16ActionPerformed

    private void asiento19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento19ActionPerformed
        colorSeleccionado(asiento19);
    }//GEN-LAST:event_asiento19ActionPerformed

    private void asiento20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento20ActionPerformed
        colorSeleccionado(asiento20);
    }//GEN-LAST:event_asiento20ActionPerformed

    private void asiento18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento18ActionPerformed
        colorSeleccionado(asiento18);
    }//GEN-LAST:event_asiento18ActionPerformed

    private void asiento17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento17ActionPerformed
        colorSeleccionado(asiento17);
    }//GEN-LAST:event_asiento17ActionPerformed

    private void asiento23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento23ActionPerformed
        colorSeleccionado(asiento23);
    }//GEN-LAST:event_asiento23ActionPerformed

    private void asiento22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento22ActionPerformed
        colorSeleccionado(asiento22);
    }//GEN-LAST:event_asiento22ActionPerformed

    private void asiento21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento21ActionPerformed
        colorSeleccionado(asiento21);
    }//GEN-LAST:event_asiento21ActionPerformed

    private void asiento24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento24ActionPerformed
        colorSeleccionado(asiento24);
    }//GEN-LAST:event_asiento24ActionPerformed

    private void asiento27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento27ActionPerformed
        colorSeleccionado(asiento27);
    }//GEN-LAST:event_asiento27ActionPerformed

    private void asiento28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento28ActionPerformed
        colorSeleccionado(asiento28);
    }//GEN-LAST:event_asiento28ActionPerformed

    private void asiento26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento26ActionPerformed
        colorSeleccionado(asiento26);
    }//GEN-LAST:event_asiento26ActionPerformed

    private void asiento25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento25ActionPerformed
        colorSeleccionado(asiento25);
    }//GEN-LAST:event_asiento25ActionPerformed

    private void asiento31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento31ActionPerformed
        colorSeleccionado(asiento31);
    }//GEN-LAST:event_asiento31ActionPerformed

    private void asiento30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento30ActionPerformed
        colorSeleccionado(asiento30);
    }//GEN-LAST:event_asiento30ActionPerformed

    private void asiento29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento29ActionPerformed
        colorSeleccionado(asiento29);
    }//GEN-LAST:event_asiento29ActionPerformed

    private void asiento32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento32ActionPerformed
        colorSeleccionado(asiento32);
    }//GEN-LAST:event_asiento32ActionPerformed

    private void asiento36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento36ActionPerformed
        colorSeleccionado(asiento36);
    }//GEN-LAST:event_asiento36ActionPerformed

    private void asiento35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento35ActionPerformed
        colorSeleccionado(asiento35);
    }//GEN-LAST:event_asiento35ActionPerformed

    private void asiento34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento34ActionPerformed
        colorSeleccionado(asiento34);
    }//GEN-LAST:event_asiento34ActionPerformed

    private void asiento33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento33ActionPerformed
        colorSeleccionado(asiento33);
    }//GEN-LAST:event_asiento33ActionPerformed

    private void continuarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBtn1ActionPerformed
                       
        Asiento asiento = new Asiento();
        Asiento num1 = new Asiento();
        Asiento num2 = new Asiento();
        Asiento num3 = new Asiento();
        Asiento num4 = new Asiento();
        Asiento num5 = new Asiento();
        Asiento num6 = new Asiento();
        Asiento num7 = new Asiento();
        Asiento num8 = new Asiento();
        Asiento num9 = new Asiento();
        Asiento num10 = new Asiento();
        Asiento num11 = new Asiento();
        Asiento num12 = new Asiento();
        Asiento num13 = new Asiento();
        Asiento num14 = new Asiento();
        Asiento num15 = new Asiento();
        Asiento num16 = new Asiento();
        Asiento num17 = new Asiento();
        Asiento num18 = new Asiento();
        Asiento num19 = new Asiento();
        Asiento num20 = new Asiento();
        Asiento num21 = new Asiento();
        Asiento num22 = new Asiento();
        Asiento num23 = new Asiento();
        Asiento num24 = new Asiento();
        Asiento num25 = new Asiento();
        Asiento num26 = new Asiento();
        Asiento num27 = new Asiento();
        Asiento num28 = new Asiento();
        Asiento num29 = new Asiento();
        Asiento num30 = new Asiento();
        Asiento num31 = new Asiento();
        Asiento num32 = new Asiento();
        Asiento num33 = new Asiento();
        Asiento num34 = new Asiento();
        Asiento num35 = new Asiento();
        Asiento num36 = new Asiento();                
        
        Color colorBlanco = new java.awt.Color(255,255,255);
        Color colorGris = new java.awt.Color(153,153,153); 
        Color colorNaranja = new java.awt.Color(236,145,117);
        
        int totalAsientos = 0;
        
        if(asiento1.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num1.setNumeroAsiento(1);
            asiento.add(num1);
        }
        if(asiento2.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num2.setNumeroAsiento(2);
            asiento.add(num2);
        }
        if(asiento3.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num3.setNumeroAsiento(3);
            asiento.add(num3);
        }
        if(asiento4.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num4.setNumeroAsiento(4);
            asiento.add(num4);
        }
        if(asiento5.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num5.setNumeroAsiento(5);
            asiento.add(num5);
        }
        if(asiento6.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num6.setNumeroAsiento(6);
            asiento.add(num6);
        }
        if(asiento7.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num7.setNumeroAsiento(7);
            asiento.add(num7);
        }
        if(asiento8.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num8.setNumeroAsiento(8);
            asiento.add(num8);
        }
        if(asiento9.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num9.setNumeroAsiento(9);
            asiento.add(num9);
        }
        if(asiento10.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num10.setNumeroAsiento(10);
            asiento.add(num10);
        }
        if(asiento11.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num11.setNumeroAsiento(11);
            asiento.add(num11);
        }
        if(asiento12.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num12.setNumeroAsiento(12);
            asiento.add(num12);
        }
        if(asiento13.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num13.setNumeroAsiento(13);
            asiento.add(num13);
        }
        if(asiento14.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num14.setNumeroAsiento(14);
            asiento.add(num14);
        }
        if(asiento15.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num15.setNumeroAsiento(15);
            asiento.add(num15);
        }
        if(asiento16.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num16.setNumeroAsiento(16);
            asiento.add(num16);
        }
        if(asiento17.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num17.setNumeroAsiento(17);
            asiento.add(num17);
        }
        if(asiento18.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num18.setNumeroAsiento(18);
            asiento.add(num18);
        }
        if(asiento19.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num19.setNumeroAsiento(19);
            asiento.add(num19);
        }
        if(asiento20.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num20.setNumeroAsiento(20);
            asiento.add(num20);
        }
        if(asiento21.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num21.setNumeroAsiento(21);
            asiento.add(num21);
        }
        if(asiento22.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num22.setNumeroAsiento(22);
            asiento.add(num22);
        }
        if(asiento23.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num23.setNumeroAsiento(23);
            asiento.add(num23);
        }
        if(asiento24.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num24.setNumeroAsiento(24);
            asiento.add(num24);
        }
        if(asiento25.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num25.setNumeroAsiento(25);
            asiento.add(num25);
        }
        if(asiento26.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num26.setNumeroAsiento(26);
            asiento.add(num26);
        }
        if(asiento27.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num27.setNumeroAsiento(27);
            asiento.add(num27);
        }
        if(asiento28.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num28.setNumeroAsiento(28);
            asiento.add(num28);
        }
        if(asiento29.getBackground().equals(colorNaranja)){
            totalAsientos += 1;            
            num29.setNumeroAsiento(29);
            asiento.add(num29);
        }
        if(asiento30.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num30.setNumeroAsiento(30);
            asiento.add(num30);
        }
        if(asiento31.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num31.setNumeroAsiento(31);
            asiento.add(num31);
        }
        if(asiento32.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num32.setNumeroAsiento(32);
            asiento.add(num32);
        }
        if(asiento33.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num33.setNumeroAsiento(33);
            asiento.add(num33);
        }
        if(asiento34.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num34.setNumeroAsiento(34);
            asiento.add(num34);
        }
        if(asiento35.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num35.setNumeroAsiento(35);
            asiento.add(num35);
        }
        if(asiento36.getBackground().equals(colorNaranja)){
            totalAsientos += 1;
            num36.setNumeroAsiento(36);
            asiento.add(num36);
        }                
        
        Autobus autobus = new Autobus();        
        Boleto boleto = new Boleto();
        
        int numero = Integer.parseInt(numeroAutobusTxt.getText());
        autobus.setNumeroAutobus(numero);       
        autobus.setNombreOrigen(setOrigenLabel.getText()); 
        autobus.setNombreDestino(setDestinoLabel.getText());
        double precioD = Double.parseDouble(setPrecioLabel.getText());        
        autobus.setPrecioViaje(precioD);
        autobus.setHorarioViaje(setHorarioLabel.getText());               
        autobus.setFechaViaje(setFechaLabel.getText());                                                                                             
        
        Double precioAnterior = Double.parseDouble(setPrecioAnterior.getText());
        boleto.setPrecioFinal(precioAnterior);
        
        VentanaDatosPasajero pasajero = new VentanaDatosPasajero(autobus, asiento, boleto);
        pasajero.setVisible(true);
        this.setVisible(false);               
                                
    }//GEN-LAST:event_continuarBtn1ActionPerformed
     
    public void colorSeleccionado (JButton boton){
        boton.setBackground(new java.awt.Color(236,145,117));
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
            java.util.logging.Logger.getLogger(VentanaAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VentanaAsiento(Autobus asd).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asiento1;
    private javax.swing.JButton asiento10;
    private javax.swing.JButton asiento11;
    private javax.swing.JButton asiento12;
    private javax.swing.JButton asiento13;
    private javax.swing.JButton asiento14;
    private javax.swing.JButton asiento15;
    private javax.swing.JButton asiento16;
    private javax.swing.JButton asiento17;
    private javax.swing.JButton asiento18;
    private javax.swing.JButton asiento19;
    private javax.swing.JButton asiento2;
    private javax.swing.JButton asiento20;
    private javax.swing.JButton asiento21;
    private javax.swing.JButton asiento22;
    private javax.swing.JButton asiento23;
    private javax.swing.JButton asiento24;
    private javax.swing.JButton asiento25;
    private javax.swing.JButton asiento26;
    private javax.swing.JButton asiento27;
    private javax.swing.JButton asiento28;
    private javax.swing.JButton asiento29;
    private javax.swing.JButton asiento3;
    private javax.swing.JButton asiento30;
    private javax.swing.JButton asiento31;
    private javax.swing.JButton asiento32;
    private javax.swing.JButton asiento33;
    private javax.swing.JButton asiento34;
    private javax.swing.JButton asiento35;
    private javax.swing.JButton asiento36;
    private javax.swing.JButton asiento4;
    private javax.swing.JButton asiento5;
    private javax.swing.JButton asiento6;
    private javax.swing.JButton asiento7;
    private javax.swing.JButton asiento8;
    private javax.swing.JButton asiento9;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JToggleButton cerrarSesion_btn;
    private javax.swing.JToggleButton consultarVentas_btn;
    private javax.swing.JButton continuarBtn1;
    private javax.swing.JLabel destinoLabel;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel horarioLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel numeroAutobusTxt;
    private javax.swing.JLabel origenLabel;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JButton regresarBtn1;
    private javax.swing.JLabel seleccionarAsientoLabel1;
    private javax.swing.JLabel setDestinoLabel;
    private javax.swing.JLabel setFechaLabel;
    private javax.swing.JLabel setHorarioLabel;
    private javax.swing.JLabel setOrigenLabel;
    private javax.swing.JLabel setPrecioAnterior;
    private javax.swing.JLabel setPrecioLabel;
    private javax.swing.JTable tablaOculta;
    private javax.swing.JToggleButton venderBoleto_btn;
    // End of variables declaration//GEN-END:variables
}
