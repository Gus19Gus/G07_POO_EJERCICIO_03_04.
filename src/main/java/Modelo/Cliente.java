/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Asus
 */
public class Cliente {
      private int codigoC;
      private long numCedula;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccion;
    private long telefono;

    public Cliente(int codigoC, long numCedula, String nombreCliente, String apellidoCliente, String direccion, long telefono) {
        this.codigoC = codigoC;
        this.numCedula = numCedula;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(int codigoC) {
        this.codigoC = codigoC;
    }

    public long getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(long numCedula) {
        this.numCedula = numCedula;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigoC=" + codigoC + ", numCedula=" + numCedula + ", nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    
    
}
