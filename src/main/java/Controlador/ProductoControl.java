/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Factura;
import Modelo.Producto;
import Servicio.FacturaServicio;
import Servicio.ProductoServicio;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ProductoControl {
  
    private final ProductoServicio productoServicio = new ProductoServicio();
    private final FacturaServicio facturaServicio = new FacturaServicio();
    
    
    public Producto crearProducto(String [] args){
         Factura factura = this.facturaServicio.buscarCodigo(Integer.valueOf(args[6]));
        Producto producto = new Producto(Integer.valueOf(args[0]),args[1],args[2], Integer.valueOf(args [3]), Integer.valueOf(args[4]), Integer.valueOf(args[5]),factura);
       this.productoServicio.crear(producto);
        return producto;
        
    }
    
    public Producto buscarProducto(String arg){
        return this.productoServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Producto eliminar(String arg){
        return this.productoServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Producto modificar(String [] args){
      Factura factura = this.facturaServicio.buscarCodigo(Integer.valueOf(args[6]));
        Producto productoNuevo = new Producto(Integer.valueOf(args[0]),args[1],args[2], Integer.valueOf(args [3]), Integer.valueOf(args[4]), Integer.valueOf(args[5]),factura);
        this.productoServicio.modificar(Integer.valueOf(args[0]), productoNuevo);
        return productoNuevo;
}
    
      
    public List<Producto> listar(){
        return this.productoServicio.listar();
    }
    
                
    }
    

