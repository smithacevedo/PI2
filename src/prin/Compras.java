package prin;

import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Compras extends javax.swing.JFrame {
    
    Conexion conCompras1= new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public Compras() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }
LocalDateTime datetime = LocalDateTime.now();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        IDCompra = new javax.swing.JLabel();
        Fechacompra = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID_Compra = new javax.swing.JTextField();
        txtFecha_compra = new javax.swing.JTextField();
        txtIDProveedor = new javax.swing.JTextField();
        IDProveedor = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Compras");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        IDCompra.setText("ID Compra:");

        Fechacompra.setText("Fecha compra:");

        txtID_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_CompraActionPerformed(evt);
            }
        });

        txtFecha_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFecha_compraActionPerformed(evt);
            }
        });

        IDProveedor.setText("ID Proveedor:");

        Total.setText("Total:");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDCompra)
                    .addComponent(Fechacompra)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDProveedor)
                            .addComponent(Total))))
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID_Compra, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(txtFecha_compra)
                    .addComponent(txtIDProveedor)
                    .addComponent(txtTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDCompra)
                    .addComponent(txtID_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fechacompra)
                    .addComponent(txtFecha_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        Agregar.setText("AGREGAR");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Regresar.setText("REGRESAR");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Limpiar)
                    .addComponent(Regresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("BD"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "documento", "nombre_profesor", "apellido_profesor", "telefono"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(301, 301, 301))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtID_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_CompraActionPerformed

    private void txtFecha_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFecha_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFecha_compraActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Agregar();
        consultar();
    }//GEN-LAST:event_AgregarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila = Tabla.getSelectedRow();
        if (fila == -1){
            
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna fila");
        } else{
            int id = Integer.parseInt((String) Tabla.getValueAt(fila, 0) .toString());
            String aul = (String) Tabla.getValueAt(fila, 1);
            String amb = (String) Tabla.getValueAt(fila, 2);
            
           
            txtID_Compra.setText(""+ id);
            txtFecha_compra.setText(aul);
            txtIDProveedor.setText(amb);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Modificar();
        consultar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Eliminar();
        consultar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        PanelPrincipal paneladmin = new PanelPrincipal();
        paneladmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    public void Modificar(){
        String Com = txtID_Compra.getText();
        String Fec = txtFecha_compra.getText();
        String Pro = txtIDProveedor.getText();
        String Tot = txtTotal.getText();
        LocalDateTime fecha = datetime;
        try {
            if (Com.equals("") || Fec.equals("") || Pro.equals("") || Tot.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            } else {
                
                String sql = "UPDATE \"PI2\".Compras SET Compra = '" + Com + "', fecha compra = '" +fecha + "', ID proveedor = '" + Pro + "' WHERE IDcompra = '" +Com +"'";

            conet = conCompras1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
               JOptionPane.showMessageDialog(null, "Datos de Compra actualizados");
               limpiarTabla();
            }
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }
    
    void consultar(){
        String sql = "SELECT * FROM \"PI2\".Compras";
        
        try {
            conet = conCompras1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] Compra = new Object[3];
            modelo = (DefaultTableModel) Tabla.getModel();
            while (rs.next()){
                Compra [0] = rs.getInt("idCompra");
                Compra [1] = rs.getString("FechaCompra");
                Compra [2] = rs.getString("IDProveedor");
                Compra [2] = rs.getString("Total");
                
                modelo.addRow(Compra);
            }
            
            Tabla.setModel(modelo);
            
        } catch (Exception e) {
        }
    }
    
    void Agregar(){
        
        String Com = txtID_Compra.getText();
        String Fec = txtFecha_compra.getText();
        String Pro = txtIDProveedor.getText();
        String Tot = txtTotal.getText();
        try {
            if (Com.equals("") || Fec.equals("") || Pro.equals("") || Tot.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            } else {
                
                String sql = "INSERT INTO \"PI2\".Compras(ID compra, Fecha Compra, ID proveedor,  Total) VALUES ('"+Com+"', '"+Fec+"', '"+Pro+"', '"+Tot+"' )";
            conet = conCompras1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
               JOptionPane.showMessageDialog(null, "Nueva compra registrada");
               limpiarTabla();
            }
        } catch (Exception e) {
        }
        
    }
    
    void limpiarTabla(){
        for (int i = 0; i <= Tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
    public void Eliminar() {
    String id = txtID_Compra.getText();

    try {
        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Falta ingresar el id de compra");
        } else {
            String sql = "DELETE FROM \"PI2\".Compras WHERE  ID_Compra= '" + id + "'";

            conet = conCompras1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Compra eliminada exitosamente");
            limpiarTabla();
        }
    } catch (Exception e) {
    }
}
    
    void Limpiar(){
        txtID_Compra.setText("");
        txtFecha_compra.setText("");
        txtIDProveedor.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Fechacompra;
    private javax.swing.JLabel IDCompra;
    private javax.swing.JLabel IDProveedor;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFecha_compra;
    private javax.swing.JTextField txtIDProveedor;
    private javax.swing.JTextField txtID_Compra;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}