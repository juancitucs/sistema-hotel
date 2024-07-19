/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.*;
import javax.swing.*;
//import gui.SQLConnection.*;
import javax.swing.border.LineBorder;
import sql.dbConnection;
import java.sql.*;
/**
 *
 * @author AKG
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        FlatLightLaf.setup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        fondoimagen = new javax.swing.JLabel();
        fondo1 = new javax.swing.JButton();
        fondo0 = new javax.swing.JButton();
        fondo2 = new javax.swing.JButton();
        fondo4 = new javax.swing.JButton();
        entrar = new javax.swing.JButton();
        fondo5 = new javax.swing.JButton();
        contrasena = new javax.swing.JTextField();
        letras0 = new javax.swing.JLabel();
        letras1 = new javax.swing.JLabel();
        icono_hotel = new javax.swing.JLabel();
        pruebas = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/basadohotel.png"))); // NOI18N
        fondoimagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel1.add(fondoimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 260));

        fondo1.setBackground(new java.awt.Color(255, 204, 51));
        fondo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        fondo1.setFocusPainted(false);
        fondo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondo1ActionPerformed(evt);
            }
        });
        jPanel1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 90, 50));

        fondo0.setBackground(new java.awt.Color(255, 204, 51));
        fondo0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        fondo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondo0ActionPerformed(evt);
            }
        });
        jPanel1.add(fondo0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 90, 50));

        fondo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        fondo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondo2ActionPerformed(evt);
            }
        });
        jPanel1.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, 360));

        fondo4.setBackground(new java.awt.Color(255, 204, 102));
        fondo4.setBorder(null);
        fondo4.setBorderPainted(false);
        jPanel1.add(fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 360));

        entrar.setFont(entrar.getFont().deriveFont((entrar.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, entrar.getFont().getSize()+3));
        entrar.setText("Entrar");
        entrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 120, -1));

        fondo5.setBackground(new java.awt.Color(255, 204, 0));
        fondo5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(fondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 120, 30));

        contrasena.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 160, 20));

        letras0.setText("Usuario:");
        jPanel1.add(letras0, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        letras1.setText("Contraseña:");
        jPanel1.add(letras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        icono_hotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Untitled_logo_1_free-file.jpg"))); // NOI18N
        jPanel1.add(icono_hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 170, 110));
        jPanel1.add(pruebas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 160, -1));

        usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 160, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fondo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fondo1ActionPerformed

    private void fondo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fondo2ActionPerformed

    private void fondo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondo0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fondo0ActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // TODO add your handling code here:
        
        String contrasenal = contrasena.getText();
        String usuariol = usuario.getText();
        
        this.pruebas.setText(contrasenal);
        
        System.out.println(validarUsuario(usuariol,contrasenal));
        
    }//GEN-LAST:event_entrarActionPerformed

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    
        
public static boolean validarUsuario(String nombreUsuario,String contrasena) {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            conn = dbConnection.connect();
            String sql = "SELECT contrasena FROM usuarios WHERE nombre_usuario = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, nombreUsuario);
            rs = psmt.executeQuery();

            if (rs.next()) {
                String contrasenaBD = rs.getString("contrasena");
                return contrasena.equals(contrasenaBD);
            } else {
                return false; // Usuario no encontrado
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (psmt != null) {
                    psmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
}   
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
            //UIManager.put( "Button.arc", 999 );
            //UIManager.put( "Component.arc", 999 );
            //UIManager.put( "ProgressBar.arc", 999 );
            //UIManager.put( "TextComponent.arc", 999 );
            UIManager.put("Button.arc", 5); // Radio de las esquinas redondeadas
            UIManager.put("Button.borderColor", Color.BLACK); // Color del borde
            UIManager.put("Button.focusedBorderColor", Color.BLACK); // Color del borde cuando está enfocado
            UIManager.put("Button.default.borderColor", Color.BLACK); // Color del borde para el botón por defecto
            UIManager.put("Component.borderWidth", 5);
            
            
            //UIManager.put("Button.border", new LineBorder(Color.BLACK,2));
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contrasena;
    private javax.swing.JButton entrar;
    private javax.swing.JButton fondo0;
    private javax.swing.JButton fondo1;
    private javax.swing.JButton fondo2;
    private javax.swing.JButton fondo4;
    private javax.swing.JButton fondo5;
    private javax.swing.JLabel fondoimagen;
    private javax.swing.JLabel icono_hotel;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel letras0;
    private javax.swing.JLabel letras1;
    private javax.swing.JTextField pruebas;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
