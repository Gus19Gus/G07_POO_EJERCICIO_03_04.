/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Asus
 */
public class Producto {
       private int codigoP;
    private String nombreProducto;
    private String tipoProducto;
    private int cantidadProducto;
    private int precioProducto;
    private int productoStok;
    private Factura unafactura ;

    public Producto(int codigoP, String nombreProducto, String tipoProducto, int cantidadProducto, int precioProducto, int productoStok, Factura unafactura) {
        this.codigoP = codigoP;
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.productoStok = productoStok;
        this.unafactura = unafactura;
    }

    public int getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getProductoStok() {
        return productoStok;
    }

    public void setProductoStok(int productoStok) {
        this.productoStok = productoStok;
    }

    public Factura getUnafactura() {
        return unafactura;
    }

    public void setUnafactura(Factura unafactura) {
        this.unafactura = unafactura;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoP=" + codigoP + ", nombreProducto=" + nombreProducto + ", tipoProducto=" + tipoProducto + ", cantidadProducto=" + cantidadProducto + ", precioProducto=" + precioProducto + ", productoStok=" + productoStok + ", unafactura=" + unafactura + '}';
    }



   

}
