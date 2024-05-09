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
    public VehiculoReparacion vehiculoR;
    public String descripcion_problema;

    // Constructor
    public OrdenDeServicio(int id_orden, VehiculoReparacion vehiculoR, String descripcion_problema) {
        this.id_orden = id_orden;
        this.vehiculoR = vehiculoR;
        this.descripcion_problema = descripcion_problema;
    }

    public void verOrden() {
        System.out.println("Cliente: " + vehiculoR.getCliente().getNombre());
        System.out.println("Vehículo: " + vehiculoR.getModelo());
        System.out.println("Descripción del problema: " + descripcion_problema);
    }

     // Getters y setters
    public int getIdOrden() {
        return id_orden;
    }

    public void setIdOrden(int id_orden) {
        this.id_orden = id_orden;
    }

    public VehiculoReparacion getVehiculoR() {
        return vehiculoR;
    }

    public void setVehiculoR(VehiculoReparacion vehiculoR) {
        this.vehiculoR = vehiculoR;
    }

    public String getDescripcionProblema() {
        return descripcion_problema;
    }

    public void setDescripcionProblema(String descripcion_problema) {
        this.descripcion_problema = descripcion_problema;
    }

}

