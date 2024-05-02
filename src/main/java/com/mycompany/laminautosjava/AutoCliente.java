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

public class AutoCliente {
    private static final List<String> estadosVehiculo = Arrays.asList("Optimo", "En reparacion");

    private int idCar;
    private String marca;
    private String modelo;
    private String color;
    private int cilindraje;
    private int numLlantas;
    private int anio;
    private String estado;

    // Constructor
    public AutoCliente(int idCar, String marca, String modelo, String color, int cilindraje, int numLlantas, int anio, String estado) {
        this.idCar = idCar;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.numLlantas = numLlantas;
        this.anio = anio;
        if (estadosVehiculo.contains(estado)) {
            this.estado = estado;
        } else {
            System.out.println("Estado no válido");
        }
    }

    public void leerAutoCliente() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles del automóvil...");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Número de llantas: " + numLlantas);
        System.out.println("Año: " + anio);
        System.out.println("Estado: " + estado);
        System.out.println("----------------------------------------");
    }

    public void cambiarEstado(String nuevoEstado) {
        if (estadosVehiculo.contains(nuevoEstado)) {
            this.estado = nuevoEstado;
        } else {
            System.out.println("Estado no válido.");
        }
    }

    public void actualizarEstadoVehiculo() {
        System.out.println("* Estado del vehículo *");
        System.out.println("1. Reparación");
        
        //System.out.println("Opción no válida.");
    }

    // Getters y setters
    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
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
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estadosVehiculo.contains(estado)) {
            this.estado = estado;
        } else {
            System.out.println("Estado no válido.");
        }
    }
}

