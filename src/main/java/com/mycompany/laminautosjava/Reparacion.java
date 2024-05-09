/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
import java.util.Arrays;
import java.util.List;


public class Reparacion {
    public static final List<String> estadosReparacion = Arrays.asList("En reparacion", "En pintura", "Para entrega");
    
    public int id_reparacion ;
    public OrdenDeServicio orden_servicio;
    public String estado_reparacion;
        
    public Reparacion(int id_reparacion, OrdenDeServicio orden_servicio){
        this.id_reparacion = id_reparacion;
        this.orden_servicio = orden_servicio;
        
    }
    
    public String calcularEstadoReparacion(String reparacion) {
        this.estado_reparacion = reparacion;
        if (estado_reparacion.equals("Para entrega")) {
            return "Reparación completada";
        } else if (estado_reparacion.equals("En pintura")) {
            return "En proceso de pintura";
        } else if (estado_reparacion.equals("En reparacion")) {
            return "En proceso de reparación";
        } else {
            return "Estado de reparación desconocido";
        }
    }
    
    public void verReparacion() {
        System.out.println("Estado de reparacion");
        System.out.println("Identificador de la orden: " + orden_servicio.getIdOrden());
        System.out.println("Cliente: " + orden_servicio.getVehiculoR().getCliente().nombre);
        System.out.println("Vehiculo: " + orden_servicio.getVehiculoR().marca);
        System.out.println("Estado: " + estado_reparacion);
    }
    
    // Getters y setters
    
    public int getIdReparacion() {
        return id_reparacion;
    }

    public void setIdReparacion(int id_reparacion) {
        this.id_reparacion = id_reparacion;
    }
    
}
