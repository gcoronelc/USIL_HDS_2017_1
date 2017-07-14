/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.bookstoreapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.bookstoreapp.db.AccesoDB;
import pe.egcc.bookstoreapp.mapper.PublicacionMapper;
import pe.egcc.bookstoreapp.model.Publicacion;

/**
 *
 * @author Gabo
 */
public class PublicacionService {
    
    private final String SQL_SELECT = "select idpublicacion,titulo,autor,nroedicion,precio,stock,idtipo from publicacion ";
    
    //CRUD PUBLICACION
    
    public Publicacion read(String idpublicacion){
        
        return null;
    }
    
    
    public List<Publicacion> read(Publicacion bean) {
    List<Publicacion> lista = new ArrayList<>();
    // Inicio del proceso        
    Connection cn = null;
    try {
      
      cn = AccesoDB.getConnection();
      String sql = SQL_SELECT
              +" where idpublicacion like concat('%',?,'%') ";
             
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, bean.getIdpublicacion());
      ResultSet rs = pstm.executeQuery();
      PublicacionMapper mapper = new PublicacionMapper();
      while(rs.next()){
        Publicacion pub = mapper.mapRow(rs);
        lista.add(pub);
      }
      rs.close();
      pstm.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new RuntimeException("No se puede ejecutar la consulta");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    // Fin del proceso
    return lista;
  }
    
    public void create(Publicacion bean){
        Connection cn = null;
    try {
      // Inicio de Tx
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      
      
      // Confirmar TX
      cn.commit();
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    }
    
    public void update(Publicacion bean){
        Connection cn = null;
    try {
      // Inicio de Tx
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      
      
      // Confirmar TX
      cn.commit();
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    }
    
    public void delete(String idpublicacion){
        Connection cn = null;
    try {
      // Inicio de Tx
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      
      
      // Confirmar TX
      cn.commit();
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    }
}
