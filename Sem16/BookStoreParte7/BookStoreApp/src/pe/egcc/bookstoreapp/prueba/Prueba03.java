package pe.egcc.bookstoreapp.prueba;

import java.sql.Connection;
import pe.egcc.bookstoreapp.db.AccesoDB;
import pe.egcc.bookstoreapp.model.Empleado;
import pe.egcc.bookstoreapp.model.Venta;
import pe.egcc.bookstoreapp.service.UsuarioService;
import pe.egcc.bookstoreapp.service.VentaService;

/**
 * Probar validación de usuario
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {

    public static void main(String[] args) {

        try {
            // Datos
            Venta venta = new Venta();
            venta.setCliente("Gustavo Coronel");
            venta.setIdpublicacion("LIB00004");
            venta.setCantidad(10);
            venta.setIdempleado(6);
            
            // Proceso
            VentaService service = new VentaService();
            venta = service.registrarVenta(venta);

            // Reporte
            System.out.println("Precio: " + venta.getPrecio());
            System.out.println("Dcto: " + venta.getDcto());
            System.out.println("Subtotal: " + venta.getSubtotal());
            System.out.println("Impuesto: " + venta.getImpuesto());
            System.out.println("Total: " + venta.getTotal());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
