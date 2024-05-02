/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
public class Menus {

    public static void mainMenu() {
        System.out.println("****** LAMINAUTOS ******");
        System.out.println("1. Ingresar vehiculo al sistema");
        System.out.println("2. Consultar informacion de vehiculos");
        System.out.println("3. Ingresar usuarios al sistema");
        System.out.println("4. Consultar informacion de usuarios");
        System.out.println("5. Ventas");
        System.out.println("6. Ordenes de servicio");
        System.out.println("7. Salir");
    }

    public static void menuIngresarVehiculos() {
        System.out.println("- Ingreso de vehiculos -");
        System.out.println("1. Ingresar automovil nuevo");
        System.out.println("2. Ingresar automovil usado");
        System.out.println("3. Ingresar moto nueva");
        System.out.println("4. Ingresar moto usada");
        System.out.println("5. Volver");
    }

    public static void menuConsultaVehiculos() {
        System.out.println("- Busqueda vehiculos -");
        System.out.println("1. Buscar automovil nuevo");
        System.out.println("2. Buscar automovil usado");
        System.out.println("3. Buscar moto nueva");
        System.out.println("4. Buscar moto usada");
        System.out.println("5. Volver");
    }

    public static void menuIngresarUsuarios() {
        System.out.println("- Ingreso de usuarios -");
        System.out.println("1. Ingresar vendedor");
        System.out.println("2. Ingresar cliente");
        System.out.println("3. Ingresar mecanico");
        System.out.println("4. Volver");
    }

    public static void menuConsultaUsuarios() {
        System.out.println("- Busqueda de usuarios -");
        System.out.println("1. Buscar vendedor");
        System.out.println("2. Buscar propietario");
        System.out.println("3. Buscar cliente");
        System.out.println("4. Buscar mecanico");
        System.out.println("5. Volver");
    }

    public static void menuVentas() {
        System.out.println("- Ventas -");
        System.out.println("1. Vender auto nuevo");
        System.out.println("2. Vender auto usado");
        System.out.println("3. Vender moto nueva");
        System.out.println("4. Vender moto usada");
        System.out.println("5. Volver");
    }

    public static void menuReparaciones() {
        System.out.println("- Reparaciones -");
        System.out.println("1. Reparar auto nuevo");
        System.out.println("2. Reparar auto usado");
        System.out.println("3. Reparar moto nueva");
        System.out.println("4. Reparar moto usada");
        System.out.println("5. Volver");
    }
}

