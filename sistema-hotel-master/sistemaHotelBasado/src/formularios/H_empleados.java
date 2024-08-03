/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sql.dbConnection;

public class H_empleados extends javax.swing.JFrame {
    private Connection conn = null;
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int ID;
    public H_empleados() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        editarbtn = new javax.swing.JButton();
        nuevobtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tipocb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        nrotxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pisotxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        estadocb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        preciotxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripciontxt = new javax.swing.JTextArea();
        buscarbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 22, -1, 128));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editarbtn.setText("EDITAR");
        editarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarbtnActionPerformed(evt);
            }
        });
        jPanel3.add(editarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 150, 30));

        nuevobtn.setText("LIMPIAR");
        nuevobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevobtnActionPerformed(evt);
            }
        });
        jPanel3.add(nuevobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 150, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 18, 19, 25));

        tipocb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Familiar", "Matrimonial", "Suit", "Gran Suit" }));
        tipocb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipocbActionPerformed(evt);
            }
        });
        jPanel1.add(tipocb, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 80, 144, 25));

        jLabel6.setText("Nro de Habitación:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 49, 166, 25));

        jLabel7.setText("Tipo de Habitación:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 80, 166, 25));

        idtxt.setEditable(false);
        idtxt.setBackground(new java.awt.Color(255, 255, 255));
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 18, 70, 25));

        nrotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrotxtActionPerformed(evt);
            }
        });
        jPanel1.add(nrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 49, 144, 25));

        jLabel2.setText("Piso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 18, 32, 25));

        pisotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pisotxtMouseExited(evt);
            }
        });
        pisotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pisotxtActionPerformed(evt);
            }
        });
        pisotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pisotxtKeyPressed(evt);
            }
        });
        jPanel1.add(pisotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 18, 144, 25));

        jLabel3.setText("Estado:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 111, 45, 25));

        estadocb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Desocupado" }));
        estadocb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadocbActionPerformed(evt);
            }
        });
        jPanel1.add(estadocb, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 111, 115, 25));

        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 111, 44, 25));

        preciotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciotxtActionPerformed(evt);
            }
        });
        jPanel1.add(preciotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 111, 94, 25));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 150));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nro", "Piso", "Tipo", "Precio", "Estado", "Descrip."
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 425, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion:"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descripciontxt.setColumns(20);
        descripciontxt.setRows(5);
        jScrollPane3.setViewportView(descripciontxt);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 340, 270));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 370, 310));

        buscarbtn1.setText("BUSCAR");
        buscarbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(buscarbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 150, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarbtnActionPerformed
        editar();
        listar();
        nuevo();
        // TODO add your handling code here:
    }//GEN-LAST:event_editarbtnActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila=tabla.getSelectedRow();
        if(fila==-1){}
        else{
            String id=(String)tabla.getValueAt(fila,0);
            idtxt.setText(id);
            String nro=(String)tabla.getValueAt(fila,1);
            nrotxt.setText(nro);
            String piso=(String)tabla.getValueAt(fila,2);
            pisotxt.setText(piso);
            String tipo=(String)tabla.getValueAt(fila,3);
            tipocb.setSelectedItem(tipo);
            String precio=(String)tabla.getValueAt(fila,4);
            preciotxt.setText(precio);
            String estado=(String)tabla.getValueAt(fila,5);
            estadocb.setSelectedItem(estado);
            String descripcion=(String)tabla.getValueAt(fila,6);
            descripciontxt.setText(descripcion);

        }
    }//GEN-LAST:event_tablaMouseClicked

    private void tipocbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipocbActionPerformed

    }//GEN-LAST:event_tipocbActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void nrotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrotxtActionPerformed

    private void pisotxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pisotxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pisotxtMouseExited

    private void pisotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pisotxtActionPerformed

    private void pisotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pisotxtKeyPressed

    }//GEN-LAST:event_pisotxtKeyPressed

    private void estadocbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadocbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadocbActionPerformed

    private void preciotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciotxtActionPerformed

    private void nuevobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevobtnActionPerformed
    listar();
    nuevo();
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevobtnActionPerformed

    private void buscarbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtn1ActionPerformed
        // TODO add your handling code here:
        buscarHabitacion();
    }//GEN-LAST:event_buscarbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(H_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(H_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(H_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(H_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new H_empleados().setVisible(true);
            }
        });
    }
    void listar(){
        String sql="select * from Habitaciones";
        try {
            cn = dbConnection.connect();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object[]habitaciones=new Object[7];
            modelo=(DefaultTableModel)tabla.getModel();
            while(rs.next()){
                habitaciones[0]=rs.getString("habitacion_id");
                habitaciones[1]=rs.getInt("numero_habitacion");
                habitaciones[3]=rs.getString("tipo_habitacion");
                habitaciones[4]=rs.getDouble("precio_noche");
                habitaciones[5]=rs.getString("estado");
                habitaciones[2]=rs.getInt("piso");
                habitaciones[6]=rs.getString("descripcion");
                modelo.addRow(habitaciones);
                }
            tabla.setModel(modelo);
            } catch(Exception e){}
   
    }
    void limpiartabla(){
        for (int i=0;i<=tabla.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    void nuevo(){
        idtxt.setText("");
        nrotxt.setText("");
        preciotxt.setText("");
        pisotxt.setText("");
        descripciontxt.setText("");
    }
    void editar(){
        String precio=preciotxt.getText();
        String estado=estadocb.getSelectedItem().toString();
        String descripcion=descripciontxt.getText();
        String nro=nrotxt.getText();
        String sql="update Habitaciones set precio_noche='"+precio+"',estado='"+estado+"',descripcion='"+descripcion+"' where numero_habitacion="+nro;
        if(precio.equals("")){
            JOptionPane.showMessageDialog(null, "Se requiere ingresar datos ");
        }else{
            try{
                cn = dbConnection.connect();
                st=cn.createStatement();
                st.executeUpdate(sql);
                limpiartabla();
            }catch(Exception e){}
        }
    }
    private void buscarHabitacion() {
            mBusqueda buscar = null;
            try {
                buscar = new mBusqueda(conn, "Habitaciones");
                buscar.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(mUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarbtn1;
    private javax.swing.JTextArea descripciontxt;
    private javax.swing.JButton editarbtn;
    private javax.swing.JComboBox<String> estadocb;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nrotxt;
    private javax.swing.JButton nuevobtn;
    private javax.swing.JTextField pisotxt;
    private javax.swing.JTextField preciotxt;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipocb;
    // End of variables declaration//GEN-END:variables
}
