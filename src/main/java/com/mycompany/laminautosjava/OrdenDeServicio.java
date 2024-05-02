/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
public class OrdenDeServicio {
    public int id_orden;
    public Cliente cliente;
    public Vehiculo vehiculo;
    public String descripcion_problema;

    // Constructor
    public OrdenDeServicio(int id_orden, Cliente cliente, Vehiculo vehiculo, String descripcion_problema) {
        this.id_orden = id_orden;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.descripcion_problema = descripcion_problema;
    }

    public void verOrden() {
        System.out.println("Identificador del cliente: " + cliente.getIdCliente());
        System.out.println("Identificador del vehículo: " + vehiculo.getIdVehiculo());
        System.out.println("Descripción del problema: " + descripcion_problema);
    }

     // Getters y setters
    public int getIdOrden() {
        return id_orden;
    }

    public void setIdOrden(int id_orden) {
        this.id_orden = id_orden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getDescripcionProblema() {
        return descripcion_problema;
    }

    public void setDescripcionProblema(String descripcion_problema) {
        this.descripcion_problema = descripcion_problema;
    }

}

