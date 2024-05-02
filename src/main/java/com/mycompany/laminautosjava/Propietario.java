/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
public class Propietario extends Persona {
    public int id_propietario;

    // Constructor
    public Propietario(int id_propietario, String nombre, int num_ident, int num_contacto, String direccion) {
        super(id_propietario, nombre, num_ident, num_contacto, direccion);
    }

    public void leerPropietario() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles de propietario...");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de identificación: " + num_ident);
        System.out.println("Teléfono de contacto: " + num_contacto);
        System.out.println("Direccion: "+ direccion);
        System.out.println("----------------------------------------");
    }

    // Getters y setters
    public int getIdPropietario() {
        return id_propietario;
    }

    public void setIdProp(int id_propietario) {
        this.id_propietario = id_propietario;
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
    
}

