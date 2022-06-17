/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Cliente;
;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ClienteServicio implements IClienteServicio{
private static List<Cliente> clienteList = new ArrayList<>();

    @Override
    public Cliente crear(Cliente cliente) {
          this.clienteList.add(cliente);
        return cliente;
    }

    @Override
    public Cliente modificar(int codigoC, Cliente clienteNuevo) {
        var posicion=this.buscarPosicionCliente(this.buscarCodigo(codigoC));
        this.listar().get(posicion).setNumCedula(clienteNuevo.getNumCedula());
        this.listar().get(posicion).setNombreCliente(clienteNuevo.getNombreCliente());
        this.listar().get(posicion).setApellidoCliente(clienteNuevo.getApellidoCliente());
        this.listar().get(posicion).setDireccion(clienteNuevo.getDireccion());
        this.listar().get(posicion).setTelefono(clienteNuevo.getTelefono());
        
        return clienteNuevo;  
    }

    @Override
    public Cliente eliminar(int codigoC) {
      Cliente cliente=this.buscarCodigo(codigoC);
        var posicion=this.buscarPosicionCliente(cliente);
        this.listar().remove(posicion);
        return cliente; 
    }

    @Override
    public Cliente buscarCodigo(int codigoC) {
       Cliente cliente=null;
        for(var b:this.clienteList){
            if(codigoC==b.getCodigoC()){
                cliente=b;
                break;
            }
        }
        return cliente;
    }
 @Override
    public List<Cliente> listar() {
          return this.clienteList;
    }
    @Override
    
    public int buscarPosicionCliente(Cliente cliente) {
         int posicion=-1;
        for(var b:this.clienteList){
            posicion++;
            if(b.getCodigoC()==cliente.getCodigoC()){
                break;
            }
        }
        return posicion;
    }
}

    
   

   




   

   
 
 
    


  