package formularios;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import sql.dbConnection;

public class mReservas extends javax.swing.JFrame {

    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    String ID;
    private Connection conn = null;// Inicializamos con 1

     public mReservas() {
        initComponents();
        setLocationRelativeTo(null);
        conn = dbConnection.connect();
        listar();
    }
    

    
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
            java.util.logging.Logger.getLogger(mUsuariosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mUsuariosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mUsuariosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mUsuariosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mReservas().setVisible(true);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ingreso1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHabitacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtReserva = new javax.swing.JTextField();
        btn_moduloHabitacion1 = new javax.swing.JButton();
        btn_moduloCliente = new javax.swing.JButton();
        btn_buscarCliente = new javax.swing.JButton();
        btn_moduloPaago = new javax.swing.JButton();
        btn_buscarPago = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaReserv = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateReserva = new com.toedter.calendar.JDateChooser();
        dateIngreso = new com.toedter.calendar.JDateChooser();
        btn_back = new javax.swing.JButton();
        btn_registrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ingreso1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID HABITACIÓN:");

        txtHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabitacionActionPerformed(evt);
            }
        });

        jLabel2.setText("ID CLIENTE");

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        jLabel4.setText("ID PAGO:");

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("ID RESERVA:");

        txtReserva.setEditable(false);
        txtReserva.setEnabled(false);
        txtReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservaActionPerformed(evt);
            }
        });

        btn_moduloHabitacion1.setText("+");
        btn_moduloHabitacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moduloHabitacion1ActionPerformed(evt);
            }
        });

        btn_moduloCliente.setText("+");
        btn_moduloCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moduloClienteActionPerformed(evt);
            }
        });

        btn_buscarCliente.setText("b");
        btn_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarClienteActionPerformed(evt);
            }
        });

        btn_moduloPaago.setText("+");
        btn_moduloPaago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moduloPaagoActionPerformed(evt);
            }
        });

        btn_buscarPago.setText("b");
        btn_buscarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ingreso1Layout = new javax.swing.GroupLayout(Ingreso1);
        Ingreso1.setLayout(Ingreso1Layout);
        Ingreso1Layout.setHorizontalGroup(
            Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ingreso1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ingreso1Layout.createSequentialGroup()
                        .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_moduloHabitacion1))
                    .addGroup(Ingreso1Layout.createSequentialGroup()
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_moduloCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscarCliente))
                    .addComponent(txtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Ingreso1Layout.createSequentialGroup()
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_moduloPaago, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Ingreso1Layout.setVerticalGroup(
            Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ingreso1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_moduloHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_moduloCliente)
                    .addComponent(btn_buscarCliente))
                .addGap(18, 18, 18)
                .addGroup(Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_moduloPaago, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        getContentPane().add(Ingreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 52, 270, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("GESTIÓN DE RESERVAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 14, -1, -1));

        BtnAgregar.setText("AGREGAR");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnNuevo.setText("NUEVO");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        jButton1.setText("REFRESCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 299, 470, -1));

        TablaReserv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Reserva", "ID Habitación", "ID Cliente", "F.Reserva", "F.Ingreso", "Coste"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaReserv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaReservMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaReserv);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 52, -1, 235));

        jLabel5.setText("Fecha de Reserva:");

        jLabel6.setText("Fecha de Ingreso:");

        dateReserva.setDateFormatString("y/MM/dd");

        dateIngreso.setDateFormatString("y/MM/dd");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dateReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dateIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, -1, -1));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/devolver.png"))); // NOI18N
        btn_back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_back.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        btn_registrar1.setBackground(new java.awt.Color(255, 204, 0));
        btn_registrar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_registrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_registrar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitacionActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        Agregar();
        listar();

    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        Eliminar();    // TODO add your handling code here:
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        Nuevo();    // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        Modificar();
        listar();
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void txtReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservaActionPerformed

    private void TablaReservMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaReservMouseClicked
        int fila = TablaReserv.getSelectedRow();
        if (fila == -1) {
        } else {
            String habitacion = (String) TablaReserv.getValueAt(fila, 1);
            this.txtHabitacion.setText(habitacion);
            String cliente = (String) TablaReserv.getValueAt(fila, 2);
            this.txtCliente.setText(cliente);
            Date FReserva = (Date) TablaReserv.getValueAt(fila, 3);
            this.dateReserva.setDate(FReserva);
            Date FIngreso = (Date) TablaReserv.getValueAt(fila, 4);
            this.dateIngreso.setDate(FIngreso);
            String coste = (String) TablaReserv.getValueAt(fila, 5);
            this.txtMonto.setText(coste);
        }
    }//GEN-LAST:event_TablaReservMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        listar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_moduloHabitacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moduloHabitacion1ActionPerformed
        try {
            obtenerIDhabitaciones();
        } catch (SQLException ex) {
            Logger.getLogger(mReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_moduloHabitacion1ActionPerformed

    private void btn_moduloClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moduloClienteActionPerformed
        abrirClientes();
    }//GEN-LAST:event_btn_moduloClienteActionPerformed

    private void btn_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarClienteActionPerformed
        try {
            obtenerIDCliente();
        } catch (SQLException ex) {
            Logger.getLogger(mReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscarClienteActionPerformed

    private void btn_buscarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPagoActionPerformed
        try {
            obtenerIDPagos();
        } catch (SQLException ex) {
            Logger.getLogger(mReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscarPagoActionPerformed

    private void btn_moduloPaagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moduloPaagoActionPerformed
        abrirDialogoPagos();
    }//GEN-LAST:event_btn_moduloPaagoActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        retornarModulo();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    void Modificar() {
        String IDHabitación = txtHabitacion.getText();
        String IDCliente = txtCliente.getText();
        String sql = "update Reservaciones set cliente_id='" + IDCliente + "',habitacion_id='" + IDHabitación + "' where reservacion_id=+id";
        if (IDHabitación.equals("") || IDCliente.equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene las casillas por favor");
        } else {
            try {
                cn = dbConnection.connect();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario Desactualizado");
                limpieza();
            } catch (Exception e) {
            }
        }
    }

    void listar() {
        String sql = "select * from Reservaciones";
        try {
            cn = dbConnection.connect();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] Reservaciones = new Object[6];
            modelo = (DefaultTableModel) TablaReserv.getModel();
            while (rs.next()) {
                Reservaciones[0] = rs.getInt("reservacion_id");
                Reservaciones[1] = rs.getInt("cliente_id");
                Reservaciones[2] = rs.getString("habitacion_id");
                Reservaciones[3] = rs.getDate("fecha_entrada");
                Reservaciones[4] = rs.getDate("fecha_salida");
                Reservaciones[5] = rs.getInt("monto");
                modelo.addRow(Reservaciones);
            }
            TablaReserv.setModel(modelo);
        } catch (Exception e) {
        }

    }

      private void Agregar() {
        String IDreserv = String.valueOf(idSiguiente());
        String IDhab = txtHabitacion.getText();
        String IDcli = txtCliente.getText();
        String mont = txtMonto.getText();
        String fecha_reserva = ((JTextField) dateReserva.getDateEditor().getUiComponent()).getText();
        String fecha_ingreso = ((JTextField) dateIngreso.getDateEditor().getUiComponent()).getText();
        if (IDhab.equals("") || IDcli.equals("") || mont.equals("") || fecha_reserva.equals("") || fecha_ingreso.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Introduzca los ID correspondientes ");
        } else {
            String sql = "insert into Reservaciones(reservacion_id, cliente_id, habitacion_id, fecha_entrada, fecha_salida, monto) values ('" + IDreserv + "','" + IDcli + "','" + IDhab + "','" + fecha_reserva + "','" + fecha_ingreso + "','" + mont + "')";
            System.out.println(sql);
            Connection cn = null;
            Statement st = null;
            try {
                cn = dbConnection.connect();
                st = cn.createStatement();
                st.executeUpdate(sql);

                // Agregar los datos a la tabla en la interfaz de usuario
                DefaultTableModel model = (DefaultTableModel) TablaReserv.getModel();
                model.addRow(new Object[]{IDreserv, IDcli, IDhab, fecha_reserva, fecha_ingreso, mont});

                // Incrementar nextReservaId y actualizar txtReserva
                txtReserva.setText(String.valueOf(idSiguiente()));

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al insertar los datos: " + e.getMessage());
            } finally {
                try {
                    if (st != null) {
                        st.close();
                    }
                    if (cn != null) {
                        cn.close();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }

    void limpieza() {
        for (int i = 0; i <= TablaReserv.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void Eliminar() {
        int fila = TablaReserv.getSelectedRow();
        int id = (int) TablaReserv.getValueAt(fila, 0);
        if (fila == -1) {
        } else {
            String sql = "delete from Reservaciones where reservacion_id=" + id;
            try {
                cn = dbConnection.connect();
                st = cn.createStatement();
                st.executeUpdate(sql);
                limpieza();
            } catch (Exception e) {
            }
        }
    }

    void Nuevo() {
        txtReserva.setText("");
        txtHabitacion.setText("");
        txtCliente.setText("");
        txtMonto.setText("");
        dateReserva.setDate(null);
        dateIngreso.setDate(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JPanel Ingreso1;
    private javax.swing.JTable TablaReserv;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_buscarCliente;
    private javax.swing.JButton btn_buscarPago;
    private javax.swing.JButton btn_moduloCliente;
    private javax.swing.JButton btn_moduloHabitacion1;
    private javax.swing.JButton btn_moduloPaago;
    private javax.swing.JButton btn_registrar1;
    private com.toedter.calendar.JDateChooser dateIngreso;
    private com.toedter.calendar.JDateChooser dateReserva;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtReserva;
    // End of variables declaration//GEN-END:variables

    private int idSiguiente() {
        String sql = "SELECT MAX(reservacion_id) AS max_id FROM Reservaciones";
        int nextReservaId = 0;
        try {
            cn = dbConnection.connect();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                nextReservaId = rs.getInt("max_id") + 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el ID máximo: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
        System.out.println(nextReservaId);
        return nextReservaId;
        
    }
    private void obtenerIDhabitaciones() throws SQLException{
        mBusqueda modulo = new mBusqueda(conn,"Habitaciones");
        modulo.setVisible(true);
        modulo.modoSeleccion();
    }
    
    private void obtenerIDCliente() throws SQLException{
        mBusqueda modulo = new mBusqueda(conn,"Clientes");
        modulo.setVisible(true);
        modulo.modoSeleccion();
    }
    public void cambiarID(String id){
        this.txtHabitacion.setText(id);
    }
    private void obtenerIDPagos() throws SQLException{
        mBusqueda modulo = new mBusqueda(conn,"Pagos");
        modulo.setVisible(true);
        modulo.modoSeleccion();
    }

    private void abrirClientes() {
        mClientes modulo = new mClientes();
        modulo.modoDialogo = true;
        modulo.setVisible(true);
    }

    private void abrirDialogoPagos() {
        rPagos modulo = new rPagos();
        modulo.modoDialogo = true;
        modulo.setVisible(true);
    }
    private void portapapeles(String value) {
        StringSelection stringSelection = new StringSelection(value);

            // Obtener el portapapeles del sistema
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            // Copiar el texto al portapapeles
            clipboard.setContents(stringSelection, null);
    }

    private void retornarModulo() {
        this.dispose();
    }
}
