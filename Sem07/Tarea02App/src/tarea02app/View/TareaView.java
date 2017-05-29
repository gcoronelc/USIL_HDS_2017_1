/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02app.View;

import javax.swing.JOptionPane;
import tarea02app.Model.TareaModel;
import tarea02app.Service.TareaService;

/**
 *
 * @author Gabo
 */
public class TareaView extends javax.swing.JFrame {

    /**
     * Creates new form TareaView
     */
    public TareaView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboCiudad = new javax.swing.JComboBox<>();
        cboProducto = new javax.swing.JComboBox<>();
        txtprecio = new javax.swing.JTextField();
        txtcant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTA DE PAQUETES TURISTICOS");

        jLabel2.setText("Ciudad:");

        jLabel3.setText("Producto:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Cant. Personas:");

        cboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE CIUDAD", "CUZCO", "AYACUCHO", "IQUITOS" }));
        cboCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCiudadActionPerformed(evt);
            }
        });

        cboProducto.setEnabled(false);
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });

        jLabel6.setText("Dolares por persona");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Procesar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cboProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboCiudad, 0, 176, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(txtprecio, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCiudadActionPerformed
        int posicion;
        
        posicion = cboCiudad.getSelectedIndex();
        
        if(posicion >0){
            cboProducto.setEnabled(true);
        }
        
        switch(posicion){
            case 0:
                cboProducto.setEnabled(false);
                txtprecio.setText(null);
                break;
                
            case 1:
                cboProducto.removeAllItems();
                cboProducto.addItem("TURISMO CULTURAL");
                cboProducto.addItem("TURISMO AVENTURERO");
                cboProducto.addItem("TURISMO RELIGIOSO");
                break;
                
            case 2:
                cboProducto.removeAllItems();
                cboProducto.addItem("TURISMO RELIGIOSO");
                cboProducto.addItem("TURISMO DE SALUD");
                cboProducto.addItem("TURISMO RURAL");
                break;
                
            case 3:
                cboProducto.removeAllItems();
                cboProducto.addItem("TURISMO DE NATURALEZA");
                cboProducto.addItem("TURISMO DE DIVERSION");
                cboProducto.addItem("TURISMO AVENTURERO");
                break;
        }
    }//GEN-LAST:event_cboCiudadActionPerformed

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        int posicion1=0, posicion2=0;
        
        posicion1 = cboCiudad.getSelectedIndex();
        
        switch(posicion1){  
            case 1:
                posicion2 = cboProducto.getSelectedIndex();
                
                switch(posicion2){
                    case 0:
                        txtprecio.setText("1450.00");
                        break;
                        
                    case 1:
                        txtprecio.setText("1880.00");
                        break;
                        
                    case 2:
                        txtprecio.setText("1260.00");
                        break;
                }
                break;
                
            case 2:
                posicion2 = cboProducto.getSelectedIndex();
                
                switch(posicion2){
                    case 0:
                        txtprecio.setText("1300.00");
                        break;
                        
                    case 1:
                        txtprecio.setText("950.00");
                        break;
                        
                    case 2:
                        txtprecio.setText("1500.00");
                        break;
                }
                break;
                
            case 3:
                posicion2 = cboProducto.getSelectedIndex();
                
                switch(posicion2){
                    case 0:
                        txtprecio.setText("2500.00");
                        break;
                        
                    case 1:
                        txtprecio.setText("2800.00");
                        break;
                        
                    case 2:
                        txtprecio.setText("1800.00");
                        break;
                }
                break;
        }
    }//GEN-LAST:event_cboProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Datos
        
        TareaModel model = new TareaModel();
        
        model.setCiudad(cboCiudad.getSelectedItem().toString());
        model.setProducto(cboProducto.getSelectedItem().toString());
        model.setPrecio(Double.parseDouble(txtprecio.getText()));
        model.setCantPer(Integer.parseInt(txtcant.getText()));
        
        //Proceso
        
        TareaService service = new TareaService();
        model = service.procesar(model);
        
        //Reporte
        
        String repo = "";
        repo += "Ciudad :"+ model.getCiudad()+"\n";
        repo += "Producto :"+ model.getProducto()+"\n";
        repo += "Precio por Persona :"+ model.getPrecio()+"\n";  
        repo += "Cantidad de personas :"+ model.getCantPer()+"\n";
        repo += "Subtotal :"+ model.getSubTotal()+"\n";
        repo += "I.G.V. :"+ model.getIgv()+"\n";
        repo += "Total :"+ model.getTotal()+"\n";
        JOptionPane.showMessageDialog(rootPane,repo);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TareaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TareaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TareaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TareaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TareaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCiudad;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}