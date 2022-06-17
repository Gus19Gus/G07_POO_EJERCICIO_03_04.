/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IProductoServicio {
    public Producto crear(Producto producto);
    public Producto modificar(int codigoProducto, Producto productoNuevo);
    public  Producto eliminar(int codigoProducto);
    public Producto buscarPorCodigo(int codigoProducto);
    public int buscarPosicion(Producto producto);
    public List<Producto> listar(); 
}
