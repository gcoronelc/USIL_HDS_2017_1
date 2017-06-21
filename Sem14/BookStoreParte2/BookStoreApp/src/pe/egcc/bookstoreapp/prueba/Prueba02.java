package pe.egcc.bookstoreapp.prueba;

import java.sql.Connection;
import pe.egcc.bookstoreapp.db.AccesoDB;
import pe.egcc.bookstoreapp.model.Empleado;
import pe.egcc.bookstoreapp.service.UsuarioService;

/**
 * Probar validación de usuario
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {

    public static void main(String[] args) {

        try {
            // Datos
            String usuario = "flung";
            String clave = "por100pre";

            // Proceso
            UsuarioService service = new UsuarioService();
            Empleado bean = service.validarUsuario(usuario, clave);
            if (bean == null) {
                throw new Exception("Datos incorrectos.");
            }

            // Reporte
            System.out.println("Hola " + bean.getNombre());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
