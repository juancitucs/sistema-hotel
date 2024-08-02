/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jtx
 */
public class mBusqueda extends javax.swing.JFrame {
    
    private ArrayList<String> columnas;
    private Connection conn;
    private String tableName;
     /*
     * @param conn
     * @param tableName
     * @throws java.sql.SQLException
     */
    public mBusqueda(Connection conn, String tableName) throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        
        this.conn = conn;
        this.tableName = tableName;
        //CBOX LLENADO
        ArrayList<String> columnas = getColumns(conn, tableName);
        System.out.println(tableName);
        System.out.println(columnas.toString());
        this.cbox_column.removeAllItems();
        for(int i = 0; i < columnas.size(); i++){
            this.cbox_column.addItem(columnas.get(i));
        };
        llenarTabla(this.conn, this.tableName,this.tf_barraBusqueda.getText());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_filter = new javax.swing.JTable();
        cbox_column = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JButton();
        tf_barraBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_registrar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txts = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_filter.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_filter);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 510, 180));

        cbox_column.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbox_column.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cbox_column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_columnActionPerformed(evt);
            }
        });
        jPanel1.add(cbox_column, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 20));

        buscar.setText("buscar");
        buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 60, -1));

        tf_barraBusqueda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tf_barraBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_barraBusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_barraBusquedaKeyReleased(evt);
            }
        });
        jPanel1.add(tf_barraBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/lupa.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 20, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Buscar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 80, 40));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/devolver.png"))); // NOI18N
        btn_back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_back.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 30, 30));

        btn_registrar1.setBackground(new java.awt.Color(255, 204, 0));
        btn_registrar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_registrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_registrar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 20, 30));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        txts.setBackground(new java.awt.Color(255, 255, 255));
        txts.setForeground(new java.awt.Color(255, 255, 255));
        txts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 600, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_columnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_columnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_columnActionPerformed

    private void tf_barraBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_barraBusquedaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_barraBusquedaKeyPressed

    private void tf_barraBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_barraBusquedaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_barraBusquedaKeyReleased

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrar1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_registrar1;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> cbox_column;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_filter;
    private javax.swing.JTextField tf_barraBusqueda;
    private javax.swing.JSeparator txts;
    // End of variables declaration//GEN-END:variables

    private ArrayList<String> getColumns(Connection conn, String tableName) throws SQLException {
        ArrayList<String> columnNames = new ArrayList<>();
        DatabaseMetaData md = conn.getMetaData();
        try (ResultSet rs = md.getColumns(null, null, tableName, null) // Asegúrate de cerrar ResultSet
                ) 
        {    // Obtén las columnas para la tabla especificada
            while (rs.next()) {
                columnNames.add(rs.getString("COLUMN_NAME"));
            }
        } catch (SQLException e) {
            System.out.println("Error");
        }

        return columnNames;
    }
    private ArrayList<Object[]> getInfo(Connection conn, String tableName, String buscador) throws SQLException {
        ArrayList<Object[]> data = new ArrayList<>();
        String query = "SELECT * FROM "+ tableName + " WHERE "+ this.cbox_column.getSelectedItem() + " LIKE ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, "%" + buscador + "%");
        ResultSet rs = stmt.executeQuery();   
        int columnCount = rs.getMetaData().getColumnCount();
            
        while (rs.next()) {
            Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                data.add(row);
            }
        return data;
    }

    private void llenarTabla(Connection conn, String tableName, String buscador) throws SQLException {
        ArrayList<String> columnas = getColumns(conn, tableName);
        ArrayList<Object[]> data = getInfo(conn, tableName,buscador);
        
        // Convert column names to an array
        String[] columns = columnas.toArray(String[]::new);

        // Convert data to a 2D array
        Object[][] tableData = new Object[data.size()][columns.length];
        for (int i = 0; i < data.size(); i++) {
            tableData[i] = data.get(i);
        }
        // Create the table model and table
        DefaultTableModel model = new DefaultTableModel(tableData, columns);
        this.tbl_filter.setModel(model);
    }
    
}