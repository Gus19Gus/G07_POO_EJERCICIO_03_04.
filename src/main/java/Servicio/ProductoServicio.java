/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ProductoServicio implements IProductoServicio {
   private static List<Producto> productoList = new ArrayList<>();

    @Override
    public Producto crear(Producto producto) {
       this.productoList.add(producto);
        return producto;
    }

    @Override
    public Producto modificar(int codigoProducto, Producto productoNuevo) {
         var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoProducto));
        this.listar().get(posicion).setNombreProducto(productoNuevo.getNombreProducto());
        this.listar().get(posicion).setTipoProducto(productoNuevo.getTipoProducto());
        this.listar().get(posicion).setCantidadProducto(productoNuevo.getCantidadProducto());
        this.listar().get(posicion).setPrecioProducto(productoNuevo.getPrecioProducto());
        this.listar().get(posicion).setProductoStok(productoNuevo.getProductoStok());
        this.listar().get(posicion).setUnafactura(productoNuevo.getUnafactura());
        return productoNuevo;
    }

    @Override
    public Producto eliminar(int codigoProducto) {

        Producto producto=this.buscarPorCodigo(codigoProducto);
        var posicion=this.buscarPosicion(producto);
        this.listar().remove(posicion);
        return producto;
    }

    @Override
    public Producto buscarPorCodigo(int codigoProducto) {
        Producto producto=null;
        for(var b:this.productoList){
            if(codigoProducto==b.getCodigoP()){
                producto=b;
                break;
            }
        }
        return producto;
    
    }
     @Override
    public List<Producto> listar() {
        return this.productoList;
    }

    @Override
    public int buscarPosicion(Producto producto) {
         int posicion=-1;
        for(var b:this.productoList){
            posicion++;
            if(b.getCodigoP()==producto.getCodigoP()){
                break;
            }
        }
        return posicion;
    }
    }

   
    

