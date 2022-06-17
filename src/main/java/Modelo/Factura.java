/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class Factura {
     private int codigo;
    private Cliente cliente;
    private String direccion;
    private LocalDate fecha;
    private int total;
    private int cantidad;
     private Producto unProducto ;

    public Factura(int codigo, Cliente cliente, String direccion, LocalDate fecha, int total, int cantidad, Producto unProducto) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.direccion = direccion;
        this.fecha = fecha;
        this.total = total;
        this.cantidad = cantidad;
        this.unProducto = unProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getUnProducto() {
        return unProducto;
    }

    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", cliente=" + cliente + ", direccion=" + direccion + ", fecha=" + fecha + ", total=" + total + ", cantidad=" + cantidad + ", unProducto=" + unProducto + '}';
    }

  

   
    
    

}
