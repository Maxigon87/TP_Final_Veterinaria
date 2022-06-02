/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Manuel Belgrano Nº3
 */
public class Cliente {
    int id_cliente;
    int dni;
    String apellido;
    String nombre;
    String direccion;
    int telefono;
    String contactoAlternativo;
    boolean activo;

    public Cliente(int id_cliente, int dni, String apellido, String nombre, String direccion, int telefono, String contactoAlternativo, boolean activo) {
        this.id_cliente = id_cliente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contactoAlternativo = contactoAlternativo;
        this.activo = activo;
    }

    public Cliente(int dni, String apellido, String nombre, String direccion, int telefono, String contactoAlternativo, boolean activo) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contactoAlternativo = contactoAlternativo;
        this.activo = activo;
    }

    public Cliente() {
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContactoAlternativo() {
        return contactoAlternativo;
    }

    public void setContactoAlternativo(String contactoAlternativo) {
        this.contactoAlternativo = contactoAlternativo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
