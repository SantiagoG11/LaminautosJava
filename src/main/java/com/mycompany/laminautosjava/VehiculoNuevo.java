/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
public class VehiculoNuevo extends Vehiculo {
    public int id_nuevo;
    public double valorCompra;
    public double valorVenta;
    public String estado;

    // Constructor
    public VehiculoNuevo(int id_nuevo, String marca, String modelo, String color, int cilindraje, int num_llantas, int anio, double valorCompra, double valorVenta, String estado) {
        super(id_nuevo, marca, modelo, color, cilindraje, num_llantas, anio);
        this.valorCompra = valorCompra;
        this.valorVenta = valorVenta;
        this.estado = estado;
    }

    public void leerNuevo() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles del automóvil...");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Número de llantas: " + num_llantas);
        System.out.println("Año: " + anio);
        System.out.println("Valor de compra: $" + valorCompra);
        System.out.println("Valor de venta: $"+ valorVenta);
        System.out.println("Estado: " + estado);
        System.out.println("----------------------------------------");
    }

    // Getters y setters
    public int getIdNuevo() {
        return id_nuevo;
    }

    public void setIdNuevo(int id_nuevo) {
        this.id_nuevo = id_nuevo;
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

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public double calcularValorVenta() {
        double valorVenta = 1.35 * valorCompra;  // Valor de venta es 35% más del valor de compra
        return valorVenta;
    }
}
