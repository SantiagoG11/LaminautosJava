/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */

public class Vendedor extends Persona {
    public int id_vendedor;
    
    // Constructor
    public Vendedor(int id_vendedor, String nombre, int num_ident, int num_contacto, String direccion) {
        super(id_vendedor, nombre, num_ident, num_contacto, direccion);
    }

    public void leerNuevo() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles de vendedor...");
        System.out.println("Identificador de la empresa: "+ id_vendedor);
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de identificacion: " + num_ident);
        System.out.println("Telefono de contacto: " + num_contacto);
        System.out.println("Direccion: " + direccion);
        System.out.println("----------------------------------------");
    }

  
    public double calcularComision(Vehiculo vehiculo) {
        double comision = 0.0;
        if (vehiculo instanceof VehiculoUsado) {
            comision = 0.07 * (((VehiculoUsado) vehiculo).calcularValorVenta() - ((VehiculoUsado) vehiculo).getValorCompra());
        } 
        else if (vehiculo instanceof VehiculoNuevo) {
            comision = 0.05 * (((VehiculoNuevo) vehiculo).calcularValorVenta() - ((VehiculoNuevo) vehiculo).getValorCompra());
        }
        return comision;
    }

    // Getters y setters
    public int getIdVendedor() {
        return id_vendedor;
    }

    public void setIdVendedor(int idVend) {
        this.id_vendedor= id_vendedor;
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