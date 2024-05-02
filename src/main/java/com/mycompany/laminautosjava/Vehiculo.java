/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
public class Vehiculo {
    public  int id_vehiculo;
    public String marca;
    public String modelo;
    public String color;
    public int cilindraje;
    public int num_llantas;
    public int anio;
    
    // Constructor
    public Vehiculo(int id_vehiculo, String marca, String modelo, String color, int cilindraje, int num_llantas, int anio) {
        this.id_vehiculo = id_vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.num_llantas = num_llantas;
        this.anio = anio;
    }
    
    // Ver vehiculo
    public void leerVehiculo() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles del automóvil...");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Número de llantas: " + num_llantas);
        System.out.println("Año: " + anio);
        System.out.println("----------------------------------------");
    }
    
        // Getters y setters
    public int getIdVehiculo() {
        return id_vehiculo;
    }

    public void setIdVehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
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
}
