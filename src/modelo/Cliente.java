/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jorge_arm.gomez
 */
public class Cliente {
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String idcliente;

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    private String empresa;

 
    public String getEmpresa() {
        return empresa;
    }


    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Cliente() {
    }

    public Cliente(String nombre, String idcliente, String empresa) {
        this.nombre = nombre;
        this.idcliente = idcliente;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return nombre + "," + idcliente + "" + empresa;
    }

}
