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

public class Mecanico extends Persona {
    public static final List<String> especialidadesMec = Arrays.asList("Latonero", "Pintor", "Ensamblador");
    public static final List<String> estadosMec = Arrays.asList("Libre", "Ocupado");

    public int id_mecanico;
    public String especialidad;
    public String estado;

    // Constructor
    public Mecanico(int id_mecanico, String nombre, int num_ident, int num_contacto, String direccion, String especialidad, String estado) {
        super(id_mecanico, nombre, num_ident, num_contacto, direccion);
        if (especialidadesMec.contains(especialidad)) {
            this.especialidad = especialidad;
        }
        if (estadosMec.contains(estado)) {
            this.estado = estado;
        }
    }

    public void leerMecanico() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles de mecánico...");
        System.out.println("Identificador de la empresa: " + id_mecanico);
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de identificación: " + num_ident);
        System.out.println("Teléfono de contacto: " + num_contacto);
        System.out.println("Direccion: " + direccion);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Estado: " + estado);
        System.out.println("----------------------------------------");
    }

   public void tomarOrdenServicio(String ordenServicio) {
        if (this.estado.equals("Libre")) {
            // Implementación para tomar la orden de servicio
            this.estado = "Ocupado";
            System.out.println(nombre + " ha tomado la orden de servicio.");
        } else {
            System.out.println(nombre + " está ocupado en otra tarea.");
        }
    }

    // Getters y setters
    public int getIdMecanico() {
        return id_mecanico;
    }

    public void setIdMecanico(int idMec) {
        this.id_mecanico = id_mecanico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContacto() {
        return num_contacto;
    }

    public void setContacto(int num_contacto) {
        this.num_contacto = num_contacto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidadesMec.contains(especialidad)) {
            this.especialidad = especialidad;
        } else {
            System.out.println("Especialidad no válida.");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estadosMec.contains(estado)) {
            this.estado = estado;
        } else {
            System.out.println("Estado no válido.");
        }
    }
}

