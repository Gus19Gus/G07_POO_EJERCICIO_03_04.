/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Factura;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class FacturaServicio implements IFacturaServicio{
  private static List<Factura> facturaList = new ArrayList<>();
    @Override
    public Factura crear(Factura factura) {
      this.facturaList.add(factura);
        return factura;
    }

    @Override
    public Factura modificar(int codigoFactura, Factura facturaNuevo) {
         var posicion=this.buscarPosicionFactura(this.buscarCodigo(codigoFactura));
        this.listar().get(posicion).setCliente(facturaNuevo.getCliente());
        this.listar().get(posicion).setDireccion(facturaNuevo.getDireccion());
        this.listar().get(posicion).setFecha(facturaNuevo.getFecha());
        this.listar().get(posicion).setTotal(facturaNuevo.getTotal());
        this.listar().get(posicion).setCantidad(facturaNuevo.getCantidad());
        
        return facturaNuevo;

    }

    @Override
     public Factura eliminar(int codigoFactura) {

        Factura factura=this.buscarCodigo(codigoFactura);
        var posicion=this.buscarPosicionFactura(factura);
        this.listar().remove(posicion);
        return factura;
    }
     @Override
    public Factura buscarCodigo(int codigoFactura) {
         Factura factura=null;
        for(var b:this.facturaList){
            if(codigoFactura==b.getCodigo()){
                factura=b;
                break;
            }
        }
        return factura;
    }

    @Override
    public List<Factura> listar() {
           return this.facturaList;
    }

    

    @Override
    public int buscarPosicionFactura(Factura factura) {
        int posicion=-1;
        for(var b:this.facturaList){
            posicion++;
            if(b.getCodigo()==factura.getCodigo()){
                break;
            }
        }
        return posicion;
    }
    
}
