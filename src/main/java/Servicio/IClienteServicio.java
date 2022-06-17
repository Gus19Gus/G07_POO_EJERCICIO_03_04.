/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Modelo.Cliente;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IClienteServicio {
    
    public Cliente crear(Cliente cliente);
    public Cliente modificar(int codigoC, Cliente clienteNuevo);
    public Cliente eliminar(int codigoC);
    public Cliente buscarCodigo(int codigoC);
    public int buscarPosicionCliente(Cliente cliente);
    public List<Cliente> listar();  
}

