/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author jtx
 */
public class mSelectorModulos extends javax.swing.JFrame {
    private boolean habitacionAdmin = true;
    /**
     * Creates new form test
     */
    public mSelectorModulos() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        btn_mPagos = new javax.swing.JButton();
        btn_mClientes = new javax.swing.JButton();
        btn_mClientes1 = new javax.swing.JButton();
        btn_mHabitaciones = new javax.swing.JButton();
        btn_mHabitaciones1 = new javax.swing.JButton();
        btn_mReservas1 = new javax.swing.JButton();
        btn_mReservas = new javax.swing.JButton();
        btn_mUsuarios1 = new javax.swing.JButton();
        btn_mUsuarios = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_mPagos1 = new javax.swing.JButton();
        btn_mHabitaciones2 = new javax.swing.JButton();
        letras17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_mPagos.setFont(btn_mPagos.getFont().deriveFont((btn_mPagos.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, btn_mPagos.getFont().getSize()+3));
        btn_mPagos.setText("Pagos");
        btn_mPagos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_mPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mPagosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 140, 30));

        btn_mClientes.setFont(btn_mClientes.getFont().deriveFont((btn_mClientes.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, btn_mClientes.getFont().getSize()+3));
        btn_mClientes.setText("Clientes");
        btn_mClientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_mClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 140, 30));

        btn_mClientes1.setBackground(new java.awt.Color(255, 204, 0));
        btn_mClientes1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(btn_mClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 20, 30));

        btn_mHabitaciones.setFont(btn_mHabitaciones.getFont().deriveFont((btn_mHabitaciones.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, btn_mHabitaciones.getFont().getSize()+3));
        btn_mHabitaciones.setText("Habitaciones");
        btn_mHabitaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_mHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mHabitacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 140, 30));

        btn_mHabitaciones1.setBackground(new java.awt.Color(255, 204, 0));
        btn_mHabitaciones1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(btn_mHabitaciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 10, 30));

        btn_mReservas1.setBackground(new java.awt.Color(255, 204, 0));
        btn_mReservas1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(btn_mReservas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 20, 30));

        btn_mReservas.setFont(btn_mReservas.getFont().deriveFont((btn_mReservas.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, btn_mReservas.getFont().getSize()+3));
        btn_mReservas.setText("Reservas");
        btn_mReservas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_mReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mReservasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 140, 30));

        btn_mUsuarios1.setBackground(new java.awt.Color(255, 204, 0));
        btn_mUsuarios1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(btn_mUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 20, 30));

        btn_mUsuarios.setFont(btn_mUsuarios.getFont().deriveFont((btn_mUsuarios.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, btn_mUsuarios.getFont().getSize()+3));
        btn_mUsuarios.setText("Usuarios");
        btn_mUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_mUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, 30));

        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/devolver.png"))); // NOI18N
        btn_back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 40, 30));

        btn_mPagos1.setBackground(new java.awt.Color(255, 204, 0));
        btn_mPagos1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(btn_mPagos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 20, 30));

        btn_mHabitaciones2.setBackground(new java.awt.Color(255, 204, 0));
        btn_mHabitaciones2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(btn_mHabitaciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 20, 30));

        letras17.setFont(letras17.getFont().deriveFont(letras17.getFont().getStyle() | java.awt.Font.BOLD, 23));
        letras17.setText("Selector de Modulos");
        jPanel1.add(letras17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 240, -1));

        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 540, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.abrirLogin();
        //ELIMINAR
        super.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_mHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mHabitacionesActionPerformed
        if (habitacionAdmin){
            abrirHabitacionesAdmin();
        }else{
            abrirHabitaciones();
        }
    }//GEN-LAST:event_btn_mHabitacionesActionPerformed

    private void btn_mClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mClientesActionPerformed
        abrirClientes();
    }//GEN-LAST:event_btn_mClientesActionPerformed

    private void btn_mUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mUsuariosActionPerformed
        abrirUsuarios();
    }//GEN-LAST:event_btn_mUsuariosActionPerformed

    private void btn_mPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mPagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_mPagosActionPerformed

    private void btn_mReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mReservasActionPerformed
        abrirReservas();
    }//GEN-LAST:event_btn_mReservasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_mClientes;
    private javax.swing.JButton btn_mClientes1;
    private javax.swing.JButton btn_mHabitaciones;
    private javax.swing.JButton btn_mHabitaciones1;
    private javax.swing.JButton btn_mHabitaciones2;
    private javax.swing.JButton btn_mPagos;
    private javax.swing.JButton btn_mPagos1;
    private javax.swing.JButton btn_mReservas;
    private javax.swing.JButton btn_mReservas1;
    private javax.swing.JButton btn_mUsuarios;
    private javax.swing.JButton btn_mUsuarios1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel letras17;
    // End of variables declaration//GEN-END:variables
    public void desabilitarModulos() {
        this.btn_mUsuarios.setEnabled(false);
        this.btn_mUsuarios1.setEnabled(false);
        
        habitacionAdmin = false;
    }
    
    public void abrirLogin(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new mLogin().setVisible(true);
            }
            
        });
    }

    private void abrirHabitacionesAdmin() {
        mHabitacionesAdmin modulo = new mHabitacionesAdmin();
        modulo.setVisible(true);
        this.setVisible(false);
    }
    private void abrirHabitaciones() {
        H_empleados modulo = new H_empleados();
        modulo.setVisible(true);
        this.setVisible(false);
    }

    private void abrirClientes() {
        mClientes modulo = new mClientes();
        modulo.setVisible(true);
        this.setVisible(false);
    }

    private void abrirEmpleados() {
        mEmpleados modulo = new mEmpleados();
        modulo.setVisible(true);
        this.setVisible(false);
    }
    
    private void abrirUsuarios() {
        mUsuarios modulo = new mUsuarios();
        modulo.setVisible(true);
        this.setVisible(false);
    }

    private void abrirReservas() {
        mReservas modulo = new mReservas();
        modulo.setVisible(true);
        this.setVisible(false);
    }
    }
