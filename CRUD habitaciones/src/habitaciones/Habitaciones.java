/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package habitaciones;

import configuracion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Habitaciones extends javax.swing.JFrame {
    Conexion con=new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int ID;
    public Habitaciones() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripciontxt = new javax.swing.JTextArea();
        registrarbtn = new javax.swing.JToggleButton();
        editarbtn = new javax.swing.JButton();
        eliminarbtn = new javax.swing.JButton();
        buscarbtn = new javax.swing.JButton();
        nuevobtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        comodidadestxt = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nro", "Piso", "Tipo", "Precio", "Estado", "Descrip.", "Comod."
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);
        tabla.getAccessibleContext().setAccessibleName("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));

        jLabel1.setText("ID:");

        tipocb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clasica", "Presidencial" }));
        tipocb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipocbActionPerformed(evt);
            }
        });

        jLabel6.setText("Nro de Habitación:");

        jLabel7.setText("Tipo de Habitación:");

        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });

        nrotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrotxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Piso:");

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

        jLabel3.setText("Estado:");

        estadocb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Desocupado" }));
        estadocb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadocbActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio:");

        preciotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciotxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pisotxt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipocb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nrotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadocb, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pisotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nrotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipocb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadocb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion:"));

        descripciontxt.setColumns(20);
        descripciontxt.setRows(5);
        jScrollPane3.setViewportView(descripciontxt);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        registrarbtn.setText("REGISTRAR");
        registrarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarbtnActionPerformed(evt);
            }
        });

        editarbtn.setText("EDITAR");
        editarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarbtnActionPerformed(evt);
            }
        });

        eliminarbtn.setText("ELIMINAR");
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });

        buscarbtn.setText("BUSCAR");
        buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtnActionPerformed(evt);
            }
        });

        nuevobtn.setText("LIMPIAR");
        nuevobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevobtnActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Comodidades"));

        comodidadestxt.setColumns(20);
        comodidadestxt.setRows(5);
        jScrollPane4.setViewportView(comodidadestxt);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\sxd.jfif")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(buscarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buscarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(registrarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipocbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipocbActionPerformed
     
    }//GEN-LAST:event_tipocbActionPerformed

    private void registrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarbtnActionPerformed
    registrar();
    listar();
    nuevo();
    }//GEN-LAST:event_registrarbtnActionPerformed

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
    eliminar();
    listar();
    nuevo();
    }//GEN-LAST:event_eliminarbtnActionPerformed

    private void editarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarbtnActionPerformed
    editar();
    listar();
    nuevo();
// TODO add your handling code here:
    }//GEN-LAST:event_editarbtnActionPerformed

    private void buscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtnActionPerformed
        buscar();
        nuevo();
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarbtnActionPerformed

    private void nrotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrotxtActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void pisotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pisotxtActionPerformed

    private void estadocbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadocbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadocbActionPerformed

    private void preciotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciotxtActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila=tabla.getSelectedRow();
        if(fila==-1){}
        else{
            String estado=(String)tabla.getValueAt(fila,5);
            estadocb.setSelectedItem(estado);
            String tipo=(String)tabla.getValueAt(fila,3);
            tipocb.setSelectedItem(tipo);
            String nro=(String)tabla.getValueAt(fila,1);
            nrotxt.setText(nro);
            String id=(String)tabla.getValueAt(fila,0);
            idtxt.setText(id);
            String piso=(String)tabla.getValueAt(fila,2);
            pisotxt.setText(piso);
            String precio=(String)tabla.getValueAt(fila,4);
            preciotxt.setText(precio);
            String descripcion=(String)tabla.getValueAt(fila,6);
            descripciontxt.setText("<html>"+descripcion+"<html>");
            String comodidades=(String)tabla.getValueAt(fila,7);
            comodidadestxt.setText("<html>"+comodidades+"<html>");
            
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void nuevobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevobtnActionPerformed
        nuevo();
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevobtnActionPerformed

    private void pisotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pisotxtKeyPressed


    }//GEN-LAST:event_pisotxtKeyPressed

    private void pisotxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pisotxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pisotxtMouseExited

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
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Habitaciones().setVisible(true);
            }
        });
    }
    
    void listar(){
        String sql="select * from habitaciones";
        try {
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object[]habitaciones=new Object[8];
            modelo=(DefaultTableModel)tabla.getModel();
            while(rs.next()){
                habitaciones[0]=rs.getInt("habitacion_id");
                habitaciones[1]=rs.getInt("numero_habitacion");
                habitaciones[3]=rs.getString("tipo_habitacion");
                habitaciones[4]=rs.getDouble("precio_por_noche");
                habitaciones[5]=rs.getString("estado");
                habitaciones[2]=rs.getInt("piso");
                habitaciones[6]=rs.getString("descripcion");
                habitaciones[7]=rs.getString("comodidades");
                modelo.addRow(habitaciones);
                }
            tabla.setModel(modelo);
            } catch(Exception e){}
   
    }
    void registrar(){
        String nro=this.nrotxt.getText();
        String piso=this.pisotxt.getText();
        String precio=this.preciotxt.getText();
        String tipo=this.tipocb.getSelectedItem().toString();
        String estado=this.estadocb.getSelectedItem().toString();


        if(nro.equals("")||piso.equals("")||precio.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar datos en las cajas.");
        }else{
            String sql="insert into habitaciones(numero_habitacion,piso,precio_por_noche,tipo_habitacion,estado)values('"+nro+"','"+piso+"','"+precio+"','"+tipo+"','"+estado+"')";
            try{
                cn=con.getConnection();
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
    void editar(){
        String precio=preciotxt.getText();
        String nro=nrotxt.getText();
        String piso=pisotxt.getText();
        String tipo=tipocb.getSelectedItem().toString();
        String id=idtxt.getText();        
        String estado=estadocb.getSelectedItem().toString();
        String descripcion=descripciontxt.getText();
        String comodidades=comodidadestxt.getText();
        String sql="update habitaciones set numero_habitacion='"+nro+"',piso='"+piso+"',tipo_habitacion='"+tipo+"',precio_por_noche='"+precio+"',estado='"+estado+"',descripcion='"+descripcion+"',comodidades='"+comodidades+"' where habitacion_id="+id;
        if(precio.equals("")||nro.equals("")||piso.equals("")){
            JOptionPane.showMessageDialog(null, "Se requiere ingresar datos ");
        }else{
            try{
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                limpiartabla();
            }catch(Exception e){}
        }
    }
    void eliminar(){
        int fila=tabla.getSelectedRow();
        if(fila==-1){
        }else{
            String id=(String)tabla.getValueAt(fila,0);
            idtxt.setText(id);
            String sql="delete from habitaciones where habitacion_id="+id;
            try{
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                limpiartabla();
            }catch(Exception e){}
        }
    }
    void nuevo(){
        idtxt.setText("");
        nrotxt.setText("");
        preciotxt.setText("");
        pisotxt.setText("");
        descripciontxt.setText("");
        comodidadestxt.setText("");
    }
    void buscar(){
        
        String sql="select * from habitaciones where piso like '%"+pisotxt.getText()+"%'";
        try {
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object[]habitaciones=new Object[6];
            modelo=(DefaultTableModel)tabla.getModel();
            while(rs.next()){
                habitaciones[0]=rs.getInt("habitacion_id");
                habitaciones[1]=rs.getInt("numero_habitacion");
                habitaciones[3]=rs.getString("tipo_habitacion");
                habitaciones[4]=rs.getDouble("precio_por_noche");
                habitaciones[5]=rs.getString("estado");
                habitaciones[2]=rs.getInt("piso");
                modelo.addRow(habitaciones);
                }
            tabla.setModel(modelo);
            } catch(Exception e){}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarbtn;
    private javax.swing.JTextArea comodidadestxt;
    private javax.swing.JTextArea descripciontxt;
    private javax.swing.JButton editarbtn;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JComboBox<String> estadocb;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nrotxt;
    private javax.swing.JButton nuevobtn;
    private javax.swing.JTextField pisotxt;
    private javax.swing.JTextField preciotxt;
    private javax.swing.JToggleButton registrarbtn;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipocb;
    // End of variables declaration//GEN-END:variables
   }
