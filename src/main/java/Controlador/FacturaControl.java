/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Producto;
import Servicio.ClienteServicio;
import Servicio.FacturaServicio;
import Servicio.ProductoServicio;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Asus
 */
public class FacturaControl {
      private final FacturaServicio facturaServicio = new FacturaServicio();
       private final ProductoServicio productoServicio = new ProductoServicio();
     private final ClienteServicio clienteServicio=new ClienteServicio();
    
    public Factura crearFactura(String [] args){
         Cliente cliente=this.clienteServicio.buscarCodigo(Integer.valueOf(args[5]));
         Producto producto=this.productoServicio.buscarPorCodigo(Integer.valueOf(args[6]));
         Factura factura=new Factura(Integer.valueOf(args[0]),cliente, args[1],LocalDate.parse(args[2]),Integer.valueOf(args[3]), Integer.valueOf(args[4]),producto);
        this.facturaServicio.crear(factura);
        return factura;
        
    }
    
    public Factura buscarFactura(String arg){
        return this.facturaServicio.buscarCodigo(Integer.valueOf(arg));
    }
    
    public Factura eliminar(String arg){
        return this.facturaServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Factura modificar(String [] args){
     Cliente cliente=this.clienteServicio.buscarCodigo(Integer.valueOf(args[5]));
         Producto producto=this.productoServicio.buscarPorCodigo(Integer.valueOf(args[6]));
         Factura facturaNuevo=new Factura(Integer.valueOf(args[0]),cliente, args[1],LocalDate.parse(args[2]),Integer.valueOf(args[3]), Integer.valueOf(args[4]),producto);
        this.facturaServicio.modificar(Integer.valueOf(args[0]), facturaNuevo);
          return facturaNuevo;
    }
    public List<Factura> listar(){
        return this.facturaServicio.listar();
    }
    
}
