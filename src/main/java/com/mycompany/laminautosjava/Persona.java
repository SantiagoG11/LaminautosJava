/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
public class Persona {
    public int id_persona;
    public String nombre;
    public int num_ident;
    public int num_contacto;
    public String direccion;
    
    // Constructor
    public Persona(int id_persona, String nombre, int num_ident, int num_contacto, String direccion) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.num_ident  = num_ident;
        this.num_contacto = num_contacto;
        this.direccion = direccion;
    }
    
    // ver persona
    public void leerPersona() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles de la persona...");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de identificación: " + num_ident);
        System.out.println("Teléfono de contacto: " + num_contacto);
        System.out.println("Direccion: " + direccion);
        System.out.println("----------------------------------------");
    }
    
    // Getters y setters
    public int getIdPersona() {
        return id_persona;
    }

    public void setIdPersona(int id_persona) {
        this.id_persona = id_persona;
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

