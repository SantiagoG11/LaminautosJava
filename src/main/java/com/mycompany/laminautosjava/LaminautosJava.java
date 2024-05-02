/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class LaminautosJava {
    public static void main(String[] args) {
        // LISTAS PARA ALMACENAR OBJETOS
        public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        public static ArrayList<VehiculoNuevo> vehiculosNuevos = new ArrayList<>();
        public static ArrayList<VehiculoUsado> vehiculosUsados = new ArrayList<>();
        public static ArrayList<Cliente> clientes = new ArrayList<>();
        public static ArrayList<Propietario> propietarios = new ArrayList<>();
        public static ArrayList<Mecanico> mecanicos = new ArrayList<>();
        public static ArrayList<OrdenDeServicio> ordenes_servicio = new ArrayList<>();
        public static ArrayList<Reparacion> reparaciones = new ArrayList<>();
        
        // OBJETOS QUEMADOS
        Vehiculo vehiculo1 = new Vehiculo(101, "Chevrolet", "Aveo", "Morado mate", 1600, 4, 2020);
        Vehiculo vehiculo2 = new Vehiculo(102, "Renol", "Koleos", "Blanco", 2000, 4, 2022);
        
        VehiculoNuevo vehiculoN1 = new VehiculoNuevo(1, "Mazda", "CX-30", "Gris", 2000, 4, 2024, 90000000, 95000000, "Para la venta");
        VehiculoNuevo vehiculoN2 = new VehiculoNuevo(2, "BMW", "420-sport", "Blanco", 2500, 4, 2023, 100000000, 150000000, "Para la venta");
        
        VehiculoUsado vehiculoU1 = new VehiculoUsado(10, "Kia", "Sportage", "Blanco mate", 2000, 4, 2015, 50000, 2, 55.000.000, 56.000.000, 60.000.000,"Para la venta");
        VehiculoUsado vehiculoU2 = new VehiculoUsado(11, "Jeep", "Willys", "Rojo", 1800, 4, 2010, 90000, 1, 40.000.000, 41.000.000, 48.000.000,"Para la venta");
        
        Cliente cliente1 = new Cliente(1, "Andrea Arias", 10985421, 323381475, "Cra 12#50-30", 2);
        Cliente cliente2 = new Cliente(2, "Cristian Garcia", 10983541, 311838453, "Cra 50#3-21", 1);
        
        Vendedor vendedor1 = new Vendedor(10, "Felipe Torres", 2514036, 304569841, "Avenida 15#43-23");
        Vendedor vendedor2 = new Vendedor(11, "Daniela Lopez", 1098229, 311828637, "Calle falsa#123");
        
        Propietario propietario1 = new Propietario(15, "Gabriel Diaz", 251565, 320158634, "Cra 34#1-23");
        Propietario propietario2 = new Propietario(16, "Margarita Aguirre", 10256341, 325684172, "Calle 37#45-4");
        
        Mecanico mecanico1 = new Mecanico(1, "Donchi", 2641562, 321458614, "Hotel Karras", "Latonero", "Libre");
        Mecanico mecanico2 = new Mecanico(2, "Armando Casas", 25478115, 313589255, "Avenida caracas 50-23", "Pintor", "Libre");
        Mecanico mecanico3 = new Mecanico(3, "Gunter Gaviria", 109455872, 311489657, "Cra 30#45-16", "Ensamblador", "Libre");
        
        OrdenDeServicio orden1 = new OrdenDeServicio(1, 1, 101, "Choque lateral");
        OrdenDeServicio orden2 = new OrdenDeServicio(2, 2, 102, "Falla de motor");
        
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculosNuevos.add(vehiculoN1);
        vehiculosNuevos.add(vehiculoN2);
        vehiculosUsados.add(vehiculoU1);
        vehiculosUsados.add(vehiculoU2);
        clientes.add(cliente1);
        clientes.add(cliente2);
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        propietarios.add(propietario1);
        propietarios.add(propietario2);
        mecanicos.add(mecanico1);
        mecanicos.add(mecanico2);
        mecanicos.add(mecanico3);
        ordenes_servicio.add(order1);
        ordenes_servicio.add(order2);
        
        
        Scanner scanner = new Scanner(System.in);
        
        // Menú principal
        Menus.mainMenu();
        int opcionPrincipal = scanner.nextInt();
        
        // Procesar la opción del menú principal
        switch (opcionPrincipal) {
            case 1:
                Menus.menuIngresarVehiculos();
                break;
            case 2:
                Menus.menuConsultaVehiculos();
                break;
            case 3:
                Menus.menuIngresarUsuarios();
                break;
            case 4:
                Menus.menuConsultaUsuarios();
                break;
            case 5:
                Menus.menuVentas();
                break;
            case 6:
                Menus.menuReparaciones();
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
        }
        scanner.close();
    }
}
