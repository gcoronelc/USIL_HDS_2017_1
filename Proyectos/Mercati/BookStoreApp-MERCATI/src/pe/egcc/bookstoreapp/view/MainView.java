package pe.egcc.bookstoreapp.view;

import javax.swing.JInternalFrame;
import pe.egcc.bookstoreapp.model.Empleado;
import pe.egcc.bookstoreapp.util.Session;

public class MainView extends javax.swing.JFrame {

  public MainView() {
    initComponents();
    establecerTitulo();
    this.setExtendedState(MAXIMIZED_BOTH);
  }

  private void establecerTitulo() {

    // Obtener el usuario
    Empleado bean = (Empleado) Session.get("emp");

    // El titulo
    String titulo = "BOOK STORE [ Empleado: " + bean.getNombre() + " ]";
    this.setTitle(titulo);

  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        menuTablas = new javax.swing.JMenu();
        menuTablasEmpleado = new javax.swing.JMenuItem();
        menuTablasPublicaciones = new javax.swing.JMenuItem();
        menuRegistrarVenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        menuTablas.setText("Tablas");

        menuTablasEmpleado.setText("Empleados");
        menuTablasEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTablasEmpleadoActionPerformed(evt);
            }
        });
        menuTablas.add(menuTablasEmpleado);

        menuTablasPublicaciones.setText("Publicaciones");
        menuTablasPublicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTablasPublicacionesActionPerformed(evt);
            }
        });
        menuTablas.add(menuTablasPublicaciones);

        menuRegistrarVenta.setText("Registrar Venta");
        menuRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarVentaActionPerformed(evt);
            }
        });
        menuTablas.add(menuRegistrarVenta);

        menuBar.add(menuTablas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

  private void menuTablasEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTablasEmpleadoActionPerformed
    cargarFormulario(CrudEmpleadoView.class);
  }//GEN-LAST:event_menuTablasEmpleadoActionPerformed

    private void menuTablasPublicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTablasPublicacionesActionPerformed
        cargarFormulario(CrudPublicacionView.class);
    }//GEN-LAST:event_menuTablasPublicacionesActionPerformed

    private void menuRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarVentaActionPerformed
        cargarFormulario(VentasView.class);
    }//GEN-LAST:event_menuRegistrarVentaActionPerformed

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
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainView().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuRegistrarVenta;
    private javax.swing.JMenu menuTablas;
    private javax.swing.JMenuItem menuTablasEmpleado;
    private javax.swing.JMenuItem menuTablasPublicaciones;
    // End of variables declaration//GEN-END:variables

  private void cargarFormulario(Class<?> aClass) {
    try {
      // Variable de control
      JInternalFrame view = null;
      // Buscar formulario
      for (JInternalFrame form : desktopPane.getAllFrames()) {
        if (aClass.isInstance(form)) {
          view = form;
          break;
        }
      }
      // Crear el objeto
      if (view == null) {
        String nomClase = aClass.getName();
        System.err.println("Clase: " + nomClase);
        view = (JInternalFrame) Class.forName(nomClase).newInstance();
        desktopPane.add(view);
      }
      // Activar formulario
      view.setVisible(true);
      view.setMaximum(true);
      view.setSelected(true);
    } catch (Exception e) {
    }
  }

}
