/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

//import configuracion.Conexion;
import java.lang.System.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JTextField;
import sql.dbConnection;
/**
 *
 * @author USER
 */
public class mClientes extends javax.swing.JFrame {
    
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int ID;
    private Connection conn = null;
    
    public mClientes() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
        conn = dbConnection.connect();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombrestxt = new javax.swing.JTextField();
        apellidostxt = new javax.swing.JTextField();
        direcciontxt = new javax.swing.JTextField();
        correotxt = new javax.swing.JTextField();
        nrotxt = new javax.swing.JTextField();
        nacionalidadtxt = new javax.swing.JTextField();
        fechatxt = new com.toedter.calendar.JDateChooser();
        registrartxt = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        editarbt = new javax.swing.JButton();
        limpiarbt = new javax.swing.JButton();
        eliminarbt = new javax.swing.JButton();
        buscarbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Fecha de N.", "Correo", "Nro. Celular", "Direccion", "Nacionalidad"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));

        jLabel1.setText("NOMBRES:");

        jLabel2.setText("APELLIDOS:");

        jLabel3.setText("Nro. Celular:");

        jLabel4.setText("Correo:");

        jLabel5.setText("Fecha de Nacimiento:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Nacionalidad:");

        nombrestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrestxtActionPerformed(evt);
            }
        });

        direcciontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direcciontxtActionPerformed(evt);
            }
        });

        correotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correotxtActionPerformed(evt);
            }
        });

        nrotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrotxtActionPerformed(evt);
            }
        });

        nacionalidadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadtxtActionPerformed(evt);
            }
        });

        fechatxt.setDateFormatString("yyyy/MM/dd");

        registrartxt.setText("REGISTRAR");
        registrartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrartxtActionPerformed(evt);
            }
        });

        editarbt.setText("EDITAR");
        editarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarbtActionPerformed(evt);
            }
        });

        limpiarbt.setText("LIMPIAR");
        limpiarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtActionPerformed(evt);
            }
        });

        eliminarbt.setText("ELIMINAR");
        eliminarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtActionPerformed(evt);
            }
        });

        buscarbt.setText("BUSCAR");
        buscarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direcciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nacionalidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nrotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(registrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(editarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(limpiarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eliminarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombrestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fechatxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nrotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direcciontxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nacionalidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpiarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
int fila=tabla.getSelectedRow();
        if(fila==-1){}
        else{
            String nombres=(String)tabla.getValueAt(fila,1);
            this.nombrestxt.setText(nombres);
            String apellidos=(String)tabla.getValueAt(fila,2);
            this.apellidostxt.setText(apellidos);            
            Date fecha=(Date) tabla.getValueAt(fila,3);
            this.fechatxt.setDate(fecha);
            String correo=(String)tabla.getValueAt(fila,4);
            this.correotxt.setText(correo);
            String nro=(String)tabla.getValueAt(fila,5);
            this.nrotxt.setText(nro);
            String direccion=(String)tabla.getValueAt(fila,6);
            this.direcciontxt.setText(direccion);
            String nacionalidad=(String)tabla.getValueAt(fila,7);
            this.nacionalidadtxt.setText(nacionalidad);
        }        
    }//GEN-LAST:event_tablaMouseClicked

    private void tablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMouseEntered

    private void registrartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrartxtActionPerformed
registrar();
listar();
nuevo();
    }//GEN-LAST:event_registrartxtActionPerformed

    private void nacionalidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadtxtActionPerformed

    private void nrotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrotxtActionPerformed

    private void correotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correotxtActionPerformed

    private void direcciontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direcciontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direcciontxtActionPerformed

    private void nombrestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrestxtActionPerformed

    private void eliminarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtActionPerformed
    eliminar();
    listar();
    nuevo();
    }//GEN-LAST:event_eliminarbtActionPerformed

    private void limpiarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtActionPerformed
    nuevo();
    }//GEN-LAST:event_limpiarbtActionPerformed

    private void editarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarbtActionPerformed
    editar();
    listar();
    nuevo();    }//GEN-LAST:event_editarbtActionPerformed

    private void buscarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtActionPerformed
        buscarCliente();
    }//GEN-LAST:event_buscarbtActionPerformed

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
            java.util.logging.Logger.getLogger(mClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mClientes().setVisible(true);
            }
        });
    }
void editar(){
        String nombres=nombrestxt.getText();
        String apellidos=apellidostxt.getText();
        String nro=nrotxt.getText();
        String correo=correotxt.getText();
        String direccion=direcciontxt.getText();
        String nacionalidad=nacionalidadtxt.getText();
        String fecha=((JTextField)fechatxt.getDateEditor().getUiComponent()).getText();
        int fila=tabla.getSelectedRow();
        int id=(int) tabla.getValueAt(fila,0);
        String sql="update clientes set nombre='"+nombres+"',apellido='"+apellidos+"',fecha_nacimiento='"+fecha+"',correo_electronico='"+correo+"',telefono='"+nro+"',direccion='"+direccion+"',nacionalidad='"+nacionalidad+"' where cliente_id="+id;
        if(nro.equals("")||nombres.equals("")||apellidos.equals("")||fecha.equals("")||correo.equals("")||direccion.equals("")||nacionalidad.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar datos en las cajas.");
            }else{
                try{
                    cn = dbConnection.connect();
                    st=cn.createStatement();
                    st.executeUpdate(sql);
                    limpiartabla();
                }catch(Exception e){}
            }
        }
void eliminar(){
        int fila=tabla.getSelectedRow();
        int id=(int) tabla.getValueAt(fila,0);
        if(fila==-1){
        }else{
            String sql="delete from clientes where cliente_id="+id;
            try{
                cn=dbConnection.connect();
                st=cn.createStatement();
                st.executeUpdate(sql);
                limpiartabla();
            }catch(Exception e){}
        }
    }
void registrar(){
    String nombres=nombrestxt.getText();
    String fecha=((JTextField)fechatxt.getDateEditor().getUiComponent()).getText();
    String apellidos=apellidostxt.getText();
    String correo=correotxt.getText();
    String nro=nrotxt.getText();
    String direccion=direcciontxt.getText();
    String nacionalidad=nacionalidadtxt.getText();
    if(nro.equals("")||nombres.equals("")||apellidos.equals("")||fecha.equals("")||correo.equals("")||direccion.equals("")||nacionalidad.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar datos en las cajas.");
        }else{
            String sql="insert into clientes(nombre,apellido,fecha_nacimiento,correo_electronico,telefono,direccion,nacionalidad)values('"+nombres+"','"+apellidos+"','"+fecha+"','"+correo+"','"+nro+"','"+direccion+"','"+nacionalidad+"')";            
            try{
                cn = dbConnection.connect();
                st=cn.createStatement();
                st.executeUpdate(sql);
                limpiartabla();
            }catch(Exception e){}

        }
}
void limpiartabla(){
        for (int i=0;i<=tabla.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
void nuevo(){
        nombrestxt.setText("");
        nrotxt.setText("");
        correotxt.setText("");
        apellidostxt.setText("");
        nacionalidadtxt.setText("");
        direcciontxt.setText("");
        fechatxt.setDate(null);
    }
void listar(){
    String sql="select * from clientes";
        try {
            cn=dbConnection.connect();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object[]clientes=new Object[8];
            modelo=(DefaultTableModel)tabla.getModel();
            while(rs.next()){
                clientes[0]=rs.getInt("cliente_id");
                clientes[1]=rs.getString("nombre");
                clientes[2]=rs.getString("apellido");
                clientes[3]=rs.getDate("fecha_nacimiento");
                clientes[4]=rs.getString("correo_electronico");
                clientes[5]=rs.getString("telefono");
                clientes[6]=rs.getString("direccion");
                clientes[7]=rs.getString("nacionalidad");
                modelo.addRow(clientes);
                }
            tabla.setModel(modelo);
            } catch(Exception e){}
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidostxt;
    private javax.swing.JButton buscarbt;
    private javax.swing.JTextField correotxt;
    private javax.swing.JTextField direcciontxt;
    private javax.swing.JButton editarbt;
    private javax.swing.JButton eliminarbt;
    private com.toedter.calendar.JDateChooser fechatxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarbt;
    private javax.swing.JTextField nacionalidadtxt;
    private javax.swing.JTextField nombrestxt;
    private javax.swing.JTextField nrotxt;
    private javax.swing.JButton registrartxt;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void buscarCliente() {
        mBusqueda buscar = null;
        try {
            buscar = new mBusqueda(conn, "Clientes");
            buscar.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
