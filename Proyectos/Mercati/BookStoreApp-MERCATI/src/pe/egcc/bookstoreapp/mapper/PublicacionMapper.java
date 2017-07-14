/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.bookstoreapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.egcc.bookstoreapp.model.Publicacion;

/**
 *
 * @author Gabo
 */
public class PublicacionMapper implements RowMapper<Publicacion>{

    @Override
    public Publicacion mapRow(ResultSet rs) throws SQLException {
    
     Publicacion bean = new Publicacion();
    bean.setIdpublicacion(rs.getString("idempleado"));
    bean.setTitulo(rs.getString("titulo"));
    bean.setAutor(rs.getString("autor"));
    bean.setNroedicion(rs.getInt("nroedicion"));
    bean.setPrecio(rs.getDouble("precio"));
    bean.setStock(rs.getInt("stock"));
    return bean;
    
    
    }
    
}
