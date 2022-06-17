/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Factura;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IFacturaServicio {
    public Factura crear(Factura factura);
    public Factura modificar(int codigoFactura, Factura facturaNuevo);
    public Factura eliminar(int codigoFactura);
    public Factura buscarCodigo(int codigoFactura);
    public int buscarPosicionFactura(Factura factura);
    public List<Factura> listar(); 
}
