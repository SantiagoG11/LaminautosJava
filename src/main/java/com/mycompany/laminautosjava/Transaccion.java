/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
public class Transaccion {
    public int id_transaccion;
    public Vendedor vendedor;
    public VehiculoNuevo vehiculoN;
    public VehiculoUsado vehiculoU;
    
    // Constructor de transaccion con vehiculo nuevo
    public Transaccion(int id_transaccion, Vendedor vendedor, VehiculoNuevo vehiculoN) {
        this.id_transaccion = id_transaccion;
        this.vendedor = vendedor;
        this.vehiculoN = vehiculoN;
    }
    
    // Constructor de transaccion con vehiculo usado
    public Transaccion(int id_transaccion, Vendedor vendedor, VehiculoUsado vehiculoU) {
        this.id_transaccion = id_transaccion;
        this.vendedor = vendedor;
        this.vehiculoU = vehiculoU;
    }
    
    // Transaccion a vehiculo nuevo
    public void verTransaccionN() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles de transaccion.");
        System.out.println("Identificacion de la transaccion: " + id_transaccion);
        System.out.println("Vendedor: " + vendedor.getNombre());
        System.out.println("Vehiculo: " + vehiculoN.getMarca());
        System.out.println("Venta: $" + vehiculoN.calcularValorVenta());
        System.out.println("----------------------------------------");
    }
    
    // Transaccion a vehiculo usado
    public void verTransaccionU() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles de transaccion.");
        System.out.println("Identificacion: " + id_transaccion);
        System.out.println("Vendedor: " + vendedor.getNombre());
        System.out.println("Vehiculo: " + vehiculoU.getMarca());
        System.out.println("Venta: $" + vehiculoU.calcularValorVenta());
        System.out.println("----------------------------------------");
    }
    
    // Método para verificar si la transacción es con un vehículo nuevo
    public boolean esNuevo() {
        return vehiculoN != null;
    }

    // Método para verificar si la transacción es con un vehículo usado
    public boolean esUsado() {
        return vehiculoU != null;
    }
    
    // Getters y setters
    public int getIdTransaccion() {
        return id_transaccion;
    }
    
    public void setIdTransaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }
    
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculoN() {
        return vehiculoN;
    }

    public void setVehiculoN(VehiculoNuevo vehiculoN) {
        this.vehiculoN = vehiculoN;
    }
    
    public Vehiculo getVehiculoU() {
        return vehiculoU;
    }

    public void setVehiculoU(VehiculoUsado vehiculoU) {
        this.vehiculoU = vehiculoU;
    }
}
