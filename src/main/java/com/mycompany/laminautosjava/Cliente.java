/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
public class Cliente extends Persona{
    public int id_cliente;
    public int num_vehiculos;

    // Constructor
    public Cliente(int id_cliente, String nombre, int num_ident, int num_contacto,String direccion, int num_vehiculos) {
        super(id_cliente, nombre, num_ident, num_contacto, direccion);
        this.num_vehiculos = num_vehiculos;
    }

    public void leerCliente() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles de cliente...");
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de identificacion: " + num_ident);
        System.out.println("Telefono de contacto: " + num_contacto);
        System.out.println("Direccion: "+ direccion);
        System.out.println("Numero de vehiculos: " + num_vehiculos);
        System.out.println("----------------------------------------");
    }

 
    // Getters y setters
    public int getIdCliente() {
        return id_cliente;
    }

    public void setIdCliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumIdent() {
        return num_ident;
    }

    public void setNumIdent(int num_ident) {
        this.num_ident = num_ident;
    }

    public int getContacto() {
        return num_contacto;
    }

    public void setContacto(int num_contacto) {
        this.num_contacto = num_contacto;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumVehiculos() {
        return num_vehiculos;
    }

    public void setNumVehiculos(int num_vehiculos) {
        this.num_vehiculos = num_vehiculos;
    }
    
}

