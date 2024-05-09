/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mons
 */
public class VehiculoReparacion extends Vehiculo {
    public static final List<String> estadosVehiculoR = Arrays.asList("En reparacion", "Para entrega");
    
    public int id_vehRep;
    public String marca;
    public String modelo;
    public String color;
    public int cilindraje;
    public int num_llantas;
    public int anio;
    Cliente cliente;
    public String estado;

    // Constructor
    public VehiculoReparacion(int id_vehRep, String marca, String modelo, String color, int cilindraje, int num_llantas, int anio, Cliente cliente) {
        super(id_vehRep, marca, modelo, color, cilindraje, num_llantas, anio);
        this.id_vehRep = id_vehRep;
        this.marca = marca;
        this. modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.num_llantas = num_llantas;
        this.anio = anio;
        this.cliente = cliente;
    }
 

    public void leerReparado() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles del automóvil...");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Número de llantas: " + num_llantas);
        System.out.println("Año: " + anio);
        System.out.println("Cliente: " + getCliente().nombre);
        System.out.println("Estado: " + getEstado());
        System.out.println("----------------------------------------");
    }

    // Getters y setters
    public int getIdVehRep() {
        return id_vehRep;
    }

    public void setIdVehRep(int id_nuevo) {
        this.id_vehRep = id_vehRep;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getNumLlantas() {
        return num_llantas;
    }

    public void setNumLlantas(int num_llantas) {
        this.num_llantas = num_llantas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estadosVehiculoR.contains(estado)) {
            this.estado = estado;
        } else {
            System.out.println("Estado no válido");
        }
    }
    
   
}
