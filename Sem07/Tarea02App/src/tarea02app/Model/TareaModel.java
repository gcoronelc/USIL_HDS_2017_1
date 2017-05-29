/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02app.Model;

/**
 *
 * @author Gabo
 */
public class TareaModel {
    //Input
    private String ciudad;
    private String producto;
    private double precio;
    private int CantPer;
    
    //Output
    private double subTotal;
    private double igv;
    private double total;


    public TareaModel(){

    }

    public TareaModel(String ciudad, String producto, double precio, int CantPer) {
        this.ciudad = ciudad;
        this.producto = producto;
        this.precio = precio;
        this.CantPer = CantPer;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantPer() {
        return CantPer;
    }

    public void setCantPer(int CantPer) {
        this.CantPer = CantPer;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    

}