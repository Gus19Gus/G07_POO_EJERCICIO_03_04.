/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Servicio.ClienteServicio;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ClienteControl {
     private ClienteServicio clienteServicio = new ClienteServicio();
    
    public Cliente crearCliente(String [] args){
        Cliente cliente = new Cliente(Integer.valueOf(args[0]), Integer.valueOf(args [1]), args[2], args[3],args[4],Integer.valueOf(args [5]));
        this.clienteServicio.crear(cliente);
        return cliente;
        
    }
    
    public Cliente buscarCliente(String arg){
        return this.clienteServicio.buscarCodigo(Integer.valueOf(arg));
    }
    
    public Cliente eliminar(String arg){
        return this.clienteServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Cliente modificar(String [] args){
            Cliente clienteNuevo = new Cliente(Integer.valueOf(args[0]), Integer.valueOf(args [1]), args[2], args[3],args[4],Integer.valueOf(args [5]));
            this.clienteServicio.modificar(Integer.valueOf(args[0]), clienteNuevo);
           return clienteNuevo;
}
    
    public List<Cliente> listar(){
        return this.clienteServicio.listar();
                
}
}