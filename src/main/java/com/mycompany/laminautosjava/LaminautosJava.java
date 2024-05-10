

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class LaminautosJava {
    
    // LISTAS PARA ALMACENAR OBJETOS
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    public static ArrayList<VehiculoNuevo> vehiculosNuevos = new ArrayList<>();
    public static ArrayList<VehiculoUsado> vehiculosUsados = new ArrayList<>();
    public static ArrayList<VehiculoReparacion> vehiculosReparaciones = new ArrayList<>();
    public static ArrayList<Vendedor> vendedores = new ArrayList<>();
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Propietario> propietarios = new ArrayList<>();
    public static ArrayList<Mecanico> mecanicos = new ArrayList<>();
    public static ArrayList<OrdenDeServicio> ordenes_servicio = new ArrayList<>();
    public static ArrayList<Reparacion> reparaciones = new ArrayList<>();
    public static ArrayList<Transaccion> transacciones = new ArrayList<>();
    
    // FUNCIONES
    public static boolean asignarOrdenServicioMecanico(OrdenDeServicio ordenServicio, List<Mecanico> mecanicos) {
        for (Mecanico mecanico : mecanicos) {
            if (mecanico.getEstado().equals("Libre")) {
                mecanico.tomarOrdenServicio(ordenServicio);
                return true;
            }
        }
        System.out.println("No hay mecánicos disponibles en este momento.");
        return false;
    }
         
        
        
    public static void main(String[] args) {
            
        
        
        // OBJETOS QUEMADOS
        Cliente cliente1 = new Cliente(1, "Andrea Arias", 10985421, 323381475, "Cra 12#50-30", 2);
        Cliente cliente2 = new Cliente(2, "Cristian Garcia", 10983541, 311838453, "Cra 50#3-21", 1);
        Cliente cliente3 = new Cliente(3, "Alejandra Ramirez", 10234231, 233224443, "Cra 60#33-21", 1);
        
        VehiculoReparacion vehiculoR1 = new VehiculoReparacion(101, "Chevrolet", "Aveo", "Morado mate", 1600, 4, 2020, cliente1);
        VehiculoReparacion vehiculoR2 = new VehiculoReparacion(102, "Renol", "Koleos", "Blanco", 2000, 4, 2022, cliente1);
        VehiculoReparacion vehiculoR3 = new VehiculoReparacion(103, "Mercedes", "Amg line", "Gris", 1800, 4, 2023, cliente2);
        
        VehiculoNuevo vehiculoN1 = new VehiculoNuevo(50, "Mazda", "CX-30", "Gris", 2000, 4, 2024, 90000000);
        VehiculoNuevo vehiculoN2 = new VehiculoNuevo(2, "BMW", "420-sport", "Blanco", 2500, 4, 2023, 100000000);
        
        Propietario propietario1 = new Propietario(15, "Gabriel Diaz", 251565, 320158634, "Cra 34#1-23");
        Propietario propietario2 = new Propietario(16, "Margarita Aguirre", 10256341, 325684172, "Calle 37#45-4");        
        
        VehiculoUsado vehiculoU1 = new VehiculoUsado(10, "Kia", "Sportage", "Blanco mate", 2000, 4, 2015, 50000, 2, 55500000, 56000000, propietario1);
        VehiculoUsado vehiculoU2 = new VehiculoUsado(11, "Jeep", "Willys", "Rojo", 1800, 4, 2010, 90000, 1, 41000000, 41500000, propietario2);
             
        Vendedor vendedor1 = new Vendedor(10, "Felipe Torres", 2514036, 304569841, "Avenida 15#43-23");
        Vendedor vendedor2 = new Vendedor(11, "Daniela Lopez", 1098229, 311828637, "Calle falsa#123");     
        
        Transaccion transaccion1 = new Transaccion(201, vendedor1, vehiculoN1);
        Transaccion transaccion2 = new Transaccion(202, vendedor2, vehiculoU2);
                     
        Mecanico mecanico1 = new Mecanico(1, "Donchi", 2641562, 321458614, "Hotel Karras", "Latonero", "Libre");
        Mecanico mecanico2 = new Mecanico(2, "Armando Casas", 25478115, 313589255, "Avenida caracas 50-23", "Pintor", "Libre");
        Mecanico mecanico3 = new Mecanico(3, "Gunter Gaviria", 109455872, 311489657, "Cra 30#45-16", "Ensamblador", "Libre");
        
        OrdenDeServicio orden1 = new OrdenDeServicio(1, vehiculoR1, "Choque lateral");
        OrdenDeServicio orden2 = new OrdenDeServicio(2,  vehiculoR2, "Falla de motor");
        OrdenDeServicio orden3 = new OrdenDeServicio(3,  vehiculoR3, "Daño en la direccion");
        
        Reparacion reparacion1 = new Reparacion(20, orden3);
        Reparacion reparacion2 = new Reparacion(21, orden1);
        
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        vehiculosReparaciones.add(vehiculoR1);
        vehiculosReparaciones.add(vehiculoR2);
        vehiculosReparaciones.add(vehiculoR3);
        vehiculosNuevos.add(vehiculoN1);
        vehiculosNuevos.add(vehiculoN2);
        vehiculosUsados.add(vehiculoU1);
        vehiculosUsados.add(vehiculoU2);
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        transacciones.add(transaccion1);
        transacciones.add(transaccion2);
        propietarios.add(propietario1);
        propietarios.add(propietario2);
        mecanicos.add(mecanico1);
        mecanicos.add(mecanico2);
        mecanicos.add(mecanico3);
        ordenes_servicio.add(orden1);
        ordenes_servicio.add(orden2);
        ordenes_servicio.add(orden3);
        reparaciones.add(reparacion1);
        reparaciones.add(reparacion2);
        
       for (int i = 0; i < vehiculosNuevos.size(); i++) {
            // Obtén el objeto en la posición actual
            VehiculoNuevo vehiculoN = vehiculosNuevos.get(i);
            
            System.out.println(vehiculoN.getMarca());
        }
        
        Scanner scanner = new Scanner(System.in);
        while(true) {
            // Menú principal
            Menus.mainMenu();
            System.out.print("Opcion: ");
            int opcionPrincipal = scanner.nextInt();
            scanner.nextLine(); // Consumir el carácter de nueva línea
            if (opcionPrincipal == 1) {
                OUTER:
                while (true) {
                    Menus.menuIngresarVehiculos();
                    System.out.print("Opcion: ");
                    int opcion1 = scanner.nextInt();
                    scanner.nextLine();
                    if (opcion1 == 1) {
                        System.out.println("- Ingreso vehiculo nuevo -");
                        System.out.print("Identificador del vehiculo: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Marca del vehiculo: ");
                        String marca = scanner.nextLine();
                        System.out.print("Modelo del vehiculo: ");
                        String modelo = scanner.nextLine();
                        System.out.print("Color del vehiculo: ");
                        String color = scanner.nextLine();
                        System.out.print("Cilindraje del vehiculo: ");
                        int cilindraje = Integer.parseInt(scanner.nextLine());
                        int opcion;
                        do{
                            System.out.print("Es una motocicleta o un automovil? (Ingrese 1 para moto o 2 para auto): ");
                            opcion = Integer.parseInt(scanner.nextLine());
                        } while (opcion < 1 || opcion > 2);
                        int num_llantas;
                        switch (opcion) {
                            case 1 -> {
                                do {
                                    System.out.print("Numero de llantas (debe estar entre 2 y 4): ");
                                    num_llantas = Integer.parseInt(scanner.nextLine());
                                    if (num_llantas < 2 || num_llantas > 4) {
                                        System.out.println("El numero de llantas para una motocicleta debe estar entre 2 y 4.");
                                    }
                                } while (num_llantas < 2 || num_llantas > 4);
                            }
                            case 2 -> {
                                do {
                                    System.out.print("Numero de llantas (debe estar entre 4 y 6): ");
                                    num_llantas = Integer.parseInt(scanner.nextLine());
                                    if (num_llantas < 4 || num_llantas > 6) {
                                        System.out.println("El numero de llantas para un automovil debe estar entre 4 y 6.");
                                    }
                                } while (num_llantas < 4 || num_llantas > 6);
                            }
                            default -> {
                                System.out.println("Opcion no valida");
                                break OUTER;
                            }
                        }
                        System.out.print("Anio del vehiculo: ");
                        int anio = Integer.parseInt(scanner.nextLine());
                        System.out.print("Valor de compra: ");
                        double valor_compra = Double.parseDouble(scanner.nextLine());
                        VehiculoNuevo vehiculoN = new VehiculoNuevo(id, marca, modelo, color, cilindraje, num_llantas, anio, valor_compra);
                        vehiculosNuevos.add(vehiculoN);
                    } else if (opcion1 == 2) {
                        System.out.println("- Ingreso vehiculo usado -");
                        System.out.print("Identificador del vehiculo: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Marca del vehiculo: ");
                        String marca = scanner.nextLine();
                        System.out.print("Modelo del vehiculo: ");
                        String modelo = scanner.nextLine();
                        System.out.print("Color del vehiculo: ");
                        String color = scanner.nextLine();
                        System.out.print("Cilindraje del vehiculo: ");
                        int cilindraje = Integer.parseInt(scanner.nextLine());
                        int opcion;
                        do{
                            System.out.print("Es una motocicleta o un automovil? (Ingrese 1 para moto o 2 para auto): ");
                            opcion = Integer.parseInt(scanner.nextLine());
                        } while (opcion < 1 || opcion > 2);
                        int num_llantas;
                        switch (opcion) {
                            case 1 -> {
                                do {
                                    System.out.print("Numero de llantas (debe estar entre 2 y 4): ");
                                    num_llantas = Integer.parseInt(scanner.nextLine());
                                    if (num_llantas < 2 || num_llantas > 4) {
                                        System.out.println("El numero de llantas para una motocicleta debe estar entre 2 y 4.");
                                    }
                                } while (num_llantas < 2 || num_llantas > 4);
                            }
                            case 2 -> {
                                do {
                                    System.out.print("Numero de llantas (debe estar entre 4 y 6): ");
                                    num_llantas = Integer.parseInt(scanner.nextLine());
                                    if (num_llantas < 4 || num_llantas > 6) {
                                        System.out.println("El numero de llantas para un automovil debe estar entre 4 y 6.");
                                    }
                                } while (num_llantas < 4 || num_llantas > 6);
                            }
                            default -> {
                                System.out.println("Opcion no valida");
                                break OUTER;
                            }
                        }
                        System.out.print("Anio del vehiculo: ");
                        int anio = Integer.parseInt(scanner.nextLine());
                        System.out.print("Kilometraje del vehiculo: ");
                        int kilometraje = Integer.parseInt(scanner.nextLine());
                        System.out.print("Numero de siniestros del vehiculo: ");
                        int siniestros = Integer.parseInt(scanner.nextLine());
                        System.out.print("Valor comercial del vehiculo: ");
                        double valor_comercial = Double.parseDouble(scanner.nextLine());
                        System.out.print("Valor de compra del vehiculo: ");
                        double valor_compra = Double.parseDouble(scanner.nextLine());
                        
                        System.out.println("- Ingresa propietario anterior -");
                        System.out.print("Identificador del propietario: ");
                        int identificador = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Numero de identificacion: ");
                        int num_ident = Integer.parseInt(scanner.nextLine());
                        System.out.print("Numero de telefono: ");
                        int num_contacto = Integer.parseInt(scanner.nextLine());
                        System.out.print("Direccion: ");
                        String direccion = scanner.nextLine();
                        Propietario propietario = new Propietario(identificador, nombre, num_ident, num_contacto, direccion);
                        propietarios.add(propietario);
                                                                       
                        VehiculoUsado vehiculoU = new VehiculoUsado(id, marca, modelo, color, cilindraje, num_llantas, anio, kilometraje, siniestros, valor_comercial, valor_compra, propietario);
                        vehiculosUsados.add(vehiculoU);
                    }
                    else if (opcion1 == 3) {
                        System.out.println("...");
                        
                        break;                            
                    }
                    else {
                        System.out.println("Opcion invalida, intente nuevamente");
                    }
                }
            }
            else if (opcionPrincipal == 2) {
                while(true) {
                    Menus.menuConsultaVehiculos();
                    System.out.print("Opcion: ");
                    int opcion2 = scanner.nextInt();
                    scanner.nextLine();
                    if (opcion2 == 1) {
                        System.out.println("- Consultar vehiculo nuevo -");
                        System.out.print("Identificador del vehiculo: ");
                        int id_vehN = Integer.parseInt(scanner.nextLine());
                        boolean encontrado = false;
                        for (VehiculoNuevo vehiculoN : vehiculosNuevos) {
                            if (vehiculoN.getIdNuevo() == id_vehN) {
                                vehiculoN.leerNuevo();
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("El vehiculo solicitado no existe\n");
                        }
                    }
                    else if (opcion2 == 2) {
                        System.out.println("- Consultar vehiculo usado -");
                        System.out.print("Identificador del vehiculo: ");
                        int id_vehU = Integer.parseInt(scanner.nextLine());
                        boolean encontrado = false;
                        for (VehiculoUsado vehiculoU : vehiculosUsados) {
                            if (vehiculoU.getIdUsado() == id_vehU) {
                                vehiculoU.leerUsado();
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("El vehiculo solicitado no existe\n");
                        }
                    }
                    else if (opcion2 == 3) {
                        System.out.println("...");
                        break;
                    }
                    else {
                        System.out.println("Opcion invalida, intente nuevamente");
                    }
                }
            }
            else if (opcionPrincipal == 3) {
                while(true) {
                    Menus.menuIngresarUsuarios();
                    System.out.print("Opcion: ");
                    int opcion3 = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (opcion3 == 1) {
                        System.out.println("- Ingreso vendedores -");
                        System.out.print("Identificador del vendedor: ");
                        int identificador = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Numero de identificacion: ");
                        int num_ident = Integer.parseInt(scanner.nextLine());
                        System.out.print("Numero de telefono: ");
                        int num_contacto = Integer.parseInt(scanner.nextLine());
                        System.out.print("Direccion: ");
                        String direccion = scanner.nextLine();
                        Vendedor vendedor = new Vendedor(identificador, nombre, num_ident, num_contacto, direccion);
                        vendedores.add(vendedor);
                    }
                    else if (opcion3 == 2) {
                        System.out.println("- Ingreso clientes -");
                        System.out.print("Identificador del cliente: ");
                        int identificador = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Numero de identificacion: ");
                        int num_ident = Integer.parseInt(scanner.nextLine());
                        System.out.print("Numero de telefono: ");
                        int num_contacto = Integer.parseInt(scanner.nextLine());
                        System.out.print("Direccion: ");
                        String direccion = scanner.nextLine();
                        System.out.print("Numero de vehiculos: ");
                        int num_vehiculos = Integer.parseInt(scanner.nextLine());
                        Cliente cliente = new Cliente(identificador, nombre, num_ident, num_contacto, direccion, num_vehiculos);
                        clientes.add(cliente);
                    }
                    else if (opcion3 == 3) {
                        System.out.println("- Ingreso mecanicos -");
                        System.out.print("Identificador del mecanico: ");
                        int identificador = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Numero de identificacion: ");
                        int num_ident = Integer.parseInt(scanner.nextLine());
                        System.out.print("Numero de telefono: ");
                        int num_contacto = Integer.parseInt(scanner.nextLine());
                        System.out.print("Direccion: ");
                        String direccion = scanner.nextLine();
                        
                        System.out.println("* Seleccione especialidad del mecanico *");
                        System.out.println("1. Latonero");
                        System.out.println("2. Pintor");
                        System.out.println("3. Ensamblador");
                        System.out.print("Opción: ");
                        int opcionEsp = scanner.nextInt();
                        String especialidad = "";
                        
                        if (opcionEsp == 1) {
                            especialidad = "Latonero";
                        }
                        else if (opcionEsp == 2) {
                            especialidad = "Pintor";
                        }
                        else if (opcionEsp == 3) {
                            especialidad = "Ensamblador";
                        }
                        else {
                            System.out.println("Opción invalida");
                        }
                        
                        Mecanico mecanico = new Mecanico(identificador, nombre, num_ident, num_contacto, direccion, especialidad, "Libre");
                        mecanicos.add(mecanico);
                    }
                    else if (opcion3 == 4) {
                        System.out.println("...");
                        break;
                    }
                    else {
                        System.out.println("Opcion invalida, intente nuevamente");
                    }
                }
            }
            else if (opcionPrincipal == 4) {
                while(true) {
                    Menus.menuConsultaUsuarios();
                    System.out.print("Opcion: ");
                    int opcion4 = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (opcion4 == 1) {
                        System.out.println("- Consultar vendedor -");
                        System.out.print("Identificador del vendedor: ");
                        int id_vend = Integer.parseInt(scanner.nextLine());
                        boolean encontrado = false;

                        for (Vendedor vendedor : vendedores) {
                            if (vendedor.getIdVendedor() == id_vend) {
                                vendedor.leerVendedor();
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("El vendedor solicitado no existe\n");
                        }
                    }
                    else if (opcion4 == 2) {
                        System.out.println("- Consultar propietario -");
                        System.out.print("Identificador del propietario anterior: ");
                        int id_prop = Integer.parseInt(scanner.nextLine());
                        boolean encontrado = false;

                        for (Propietario propietario : propietarios) {
                            if (propietario.getIdPropietario() == id_prop) {
                                propietario.leerPropietario();
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("El propietario solicitado no existe\n");
                        }
                    }
                    else if (opcion4 == 3) {
                        System.out.println("- Consultar cliente -");
                        System.out.print("Identificador del cliente: ");
                        int id_cli = Integer.parseInt(scanner.nextLine());
                        boolean encontrado = false;

                        for (Cliente cliente : clientes) {
                            if (cliente.getIdCliente() == id_cli) {
                                cliente.leerCliente();
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("El cliente solicitado no existe\n");
                        }
                    }
                    else if (opcion4 == 4) {
                        System.out.println("- Consultar mecanico -");
                        System.out.print("Identificador del mecanico: ");
                        int id_mec = Integer.parseInt(scanner.nextLine());
                        boolean encontrado = false;

                        for (Mecanico mecanico : mecanicos) {
                            if (mecanico.getIdMecanico() == id_mec) {
                                mecanico.leerMecanico();
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("El mecanico solicitado no existe");
                        }
                    }
                    else if (opcion4 == 5) {
                        System.out.println("...");
                        break;
                    }
                    else {
                        System.out.println("Opcion invalida, intente nuevamente");
                    }
                }
            }
            else if (opcionPrincipal == 5) {
                while(true) {
                    Menus.menuVentas();
                    System.out.print("Opcion: ");
                    int opcion5 = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (opcion5 == 1) {
                        System.out.println("- Venta -");
                        System.out.print("Identificador vendedor: ");
                        int id_ven = Integer.parseInt(scanner.nextLine());
                        System.out.print("Cuantos vehiculos va a vender:  ");
                        int cant_veh = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < cant_veh; i++) {
                            System.out.println("Vehiculo nuevo o usado?");
                            System.out.println("1. Nuevo");
                            System.out.println("2. Usado");
                            System.out.print("Opcion: ");
                            int opc = Integer.parseInt(scanner.nextLine());
                            if (opc == 1) {
                                System.out.print("Identificador del vehiculo nuevo que sera vendido: ");
                                int id_vehN = Integer.parseInt(scanner.nextLine());
                                Vendedor vendedor_encontrado = null;
                                VehiculoNuevo vehiculoN_encontrado = null;

                                for (Vendedor vendedor : vendedores) {
                                    if (vendedor instanceof Vendedor && vendedor.getIdVendedor() == id_ven) {
                                        vendedor_encontrado = vendedor;
                                        break;
                                    }
                                }

                                if (vendedor_encontrado != null) {
                                    for (VehiculoNuevo vehiculoN : vehiculosNuevos) {
                                        if (vehiculoN instanceof VehiculoNuevo && vehiculoN.getIdNuevo() == id_vehN) {
                                            vehiculoN_encontrado = vehiculoN;
                                            break;
                                        }
                                    }

                                    if (vehiculoN_encontrado != null) {
                                        System.out.print("Identificador de la transaccion: ");
                                        int id_tran = Integer.parseInt(scanner.nextLine());
                                        Transaccion transaccion = new Transaccion(id_tran, vendedor_encontrado, vehiculoN_encontrado);
                                        transacciones.add(transaccion);
                                        
                                        double comision = vendedor_encontrado.calcularComision(vehiculoN_encontrado);
                                        System.out.println("+ Vendedor " + vendedor_encontrado.getNombre() + " con identificacion " + vendedor_encontrado.getNumIdent());
                                        System.out.println("Valor de comision: $" + comision);
                                        System.out.println("----------------------------------------");
                                        System.out.println("Transacción creada!");                                        
                                         
                                    } else {
                                        System.out.println("El vehiculo no está en el sistema, verifique");
                                    }
                                } else {
                                    System.out.println("El vendedor no está en el sistema, verifique");
                                }
                            }
                            else if (opc == 2) {
                                System.out.print("Identificador del vehiculo usado que sera vendido: ");
                                int id_vehU = Integer.parseInt(scanner.nextLine());
                                Vendedor vendedor_encontrado = null;
                                VehiculoUsado vehiculoU_encontrado = null;

                                for (Vendedor vendedor : vendedores) {
                                    if (vendedor instanceof Vendedor && vendedor.getIdVendedor() == id_ven) {
                                        vendedor_encontrado = vendedor;
                                        break;
                                    }
                                }

                                if (vendedor_encontrado != null) {
                                    for (VehiculoUsado vehiculoU : vehiculosUsados) {
                                        if (vehiculoU instanceof VehiculoUsado && vehiculoU.getIdUsado() == id_vehU) {
                                            vehiculoU_encontrado = vehiculoU;
                                            break;
                                        }
                                    }

                                    if (vehiculoU_encontrado != null) {
                                        System.out.print("Identificador de la transaccion: ");
                                        int id_tran = Integer.parseInt(scanner.nextLine());
                                        Transaccion transaccion = new Transaccion(id_tran, vendedor_encontrado, vehiculoU_encontrado);
                                        transacciones.add(transaccion);                                        
                                        
                                        double comision = vendedor_encontrado.calcularComision(vehiculoU_encontrado);
                                        System.out.println("+ Vendedor " + vendedor_encontrado.getNombre() + " con identificacion " + vendedor_encontrado.getNumIdent());
                                        if (comision < 0) {
                                            System.out.println("No comisiona");
                                        } else {                                                                                    
                                            System.out.println("Valor de comision: $" + comision);
                                            System.out.println("----------------------------------------");
                                        }
                                        System.out.println("Transacción creada!");
                                        
                                    } else {
                                        System.out.println("El vehiculo no está en el sistema, verifique");
                                    }
                                } else {
                                    System.out.println("El vendedor no está en el sistema, verifique");
                                }
                            }
                        }

                    }
                    else if (opcion5 == 2) {
                        System.out.println("- Buscar transaccion -");
                        System.out.print("Identificador de transaccion: ");
                        int id_tran = Integer.parseInt(scanner.nextLine());
                        boolean encontrado = false;

                        for (Transaccion transaccion : transacciones) {
                            if (transaccion.getIdTransaccion() == id_tran) {
                                if (transaccion.esNuevo() && transaccion.getVehiculoN() != null) {
                                    transaccion.verTransaccionN(); // Se encontró la transacción con vehículo nuevo
                                } else if (transaccion.esUsado() && transaccion.getVehiculoU() != null) {
                                    transaccion.verTransaccionU(); // Se encontró la transacción con vehículo usado
                                }
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("El vendedor solicitado no existe\n");
                        }
                    }
                    else if (opcion5 == 3) {
                        System.out.println("...");
                        break;
                    }
                    else {
                        System.out.println("Opcion invalida, intente nuevamente");
                    }
                }
            }
            else if (opcionPrincipal == 6) {
                while(true) {
                    Menus.menuOrdenesS();
                    System.out.print("Opcion: ");
                    int opcion6 = scanner.nextInt();
                    scanner.nextLine();
                    if (opcion6 == 1) {
                        while(true) {
                            Menus.menuCreaOrden();
                            System.out.print("Opcion: ");
                            int opcion7 = scanner.nextInt();      
                            scanner.nextLine();
                            
                            if ( opcion7 == 1) {
                                System.out.println("- Ingresa vehiculo a reparacion -");
                                System.out.print("Identificador del vehiculo: ");
                                int id = Integer.parseInt(scanner.nextLine());
                                System.out.print("Marca del vehiculo: ");
                                String marca = scanner.nextLine();
                                System.out.print("Modelo del vehiculo: ");
                                String modelo = scanner.nextLine();
                                System.out.print("Color del vehiculo: ");
                                String color = scanner.nextLine();
                                System.out.print("Cilindraje del vehiculo: ");
                                int cilindraje = Integer.parseInt(scanner.nextLine());
                                System.out.print("Numero de llantas: ");
                                int num_llantas = Integer.parseInt(scanner.nextLine());
                                System.out.print("Año del vehiculo: ");
                                int anio = Integer.parseInt(scanner.nextLine());
                                
                                System.out.println("- Ingresa cliente -");
                                System.out.print("Identificador del cliente: ");
                                int id_cli = Integer.parseInt(scanner.nextLine());
                                
                                Cliente cliente_encontrado = null;

                                for (Cliente cliente : clientes) {
                                    if (cliente instanceof Cliente && cliente.getIdCliente() == id_cli) {
                                        cliente_encontrado = cliente;
                                        break;
                                    }
                                }
                                
                                if (cliente_encontrado != null) {
                                    VehiculoReparacion vehiculoR = new VehiculoReparacion(id, marca, modelo, color, cilindraje, num_llantas, anio, cliente_encontrado);
                                    vehiculosReparaciones.add(vehiculoR);                                    
                                    System.out.println("Vehiculo ingresado al sistema! ");
                                    
                                    System.out.print("Ingresa identificador de la orden: ");
                                    int id_ord = Integer.parseInt(scanner.nextLine());
                                    System.out.print("Descripcion del problema: ");
                                    String descripcion_problema = scanner.nextLine();
                                    vehiculoR.setEstado("En reparacion");
                                    if (vehiculoR.getEstado().equals("En reparacion")) {
                                            OrdenDeServicio orden_servicio = new OrdenDeServicio(id_ord, vehiculoR, descripcion_problema);
                                            ordenes_servicio.add(orden_servicio);
                                            System.out.println("----------------------------------------");
                                            System.out.println("Orden creada!");
                                            System.out.println("Cliente: " + vehiculoR.getCliente().getNombre());
                                            System.out.println("Vehiculo: " + vehiculoR.getMarca());
                                            System.out.println("----------------------------------------");

                                            // Asignar orden de servicio a un mecánico
                                            boolean asignar = asignarOrdenServicioMecanico(orden_servicio, mecanicos);

                                            if (asignar) {
                                                System.out.println("\nEstado actual de los mecánicos:");
                                                for (Mecanico mecanico : mecanicos) {
                                                    System.out.println(mecanico.getNombre() + ": " + mecanico.getEstado());
                                                }
                                            }
                                            System.out.println("----------------------------------------");
                                            System.out.print("** Por favor ingrese identificador de la reparacion: ");
                                            int id_rep = Integer.parseInt(scanner.nextLine());

                                            Reparacion reparacion = new Reparacion(id_rep, orden_servicio);
                                            reparaciones.add(reparacion);
                                    } else {
                                        System.out.println("JMMMMMM");
                                    }
                                }
                                else {
                                    System.out.println("El cliente no esta en el sistema\n- Registra cliente -");
                                    System.out.print("Identificador del cliente: ");
                                    int identificador = Integer.parseInt(scanner.nextLine());
                                    System.out.print("Nombre: ");
                                    String nombre = scanner.nextLine();
                                    System.out.print("Numero de identificacion: ");
                                    int num_ident = Integer.parseInt(scanner.nextLine());
                                    System.out.print("Numero de telefono: ");
                                    int num_contacto = Integer.parseInt(scanner.nextLine());
                                    System.out.print("Direccion: ");
                                    String direccion = scanner.nextLine();
                                    System.out.print("Numero de vehiculos: ");
                                    int num_vehiculos = Integer.parseInt(scanner.nextLine());
                                    Cliente cliente = new Cliente(identificador, nombre, num_ident, num_contacto, direccion, num_vehiculos);
                                    clientes.add(cliente);
                                    
                                    VehiculoReparacion vehiculoR = new VehiculoReparacion(id, marca, modelo, color, cilindraje, num_llantas, anio, cliente);
                                    vehiculosReparaciones.add(vehiculoR);                                    
                                    System.out.println("Vehiculo ingresado al sistema! ");
                                    
                                    System.out.print("Ingresa identificador de la orden: ");
                                    int id_ord = Integer.parseInt(scanner.nextLine());
                                    System.out.print("Descripcion del problema: ");
                                    String descripcion_problema = scanner.nextLine();
                                    vehiculoR.setEstado("En reparacion");
                                    if (vehiculoR.getEstado().equals("En reparacion")) {
                                            OrdenDeServicio orden_servicio = new OrdenDeServicio(id_ord, vehiculoR, descripcion_problema);
                                            ordenes_servicio.add(orden_servicio);
                                            System.out.println("----------------------------------------");
                                            System.out.println("Orden creada!");
                                            System.out.println("Cliente: " + vehiculoR.getCliente().getNombre());
                                            System.out.println("Vehiculo: " + vehiculoR.getMarca());
                                            System.out.println("----------------------------------------");

                                            // Asignar orden de servicio a un mecánico
                                            boolean asignar = asignarOrdenServicioMecanico(orden_servicio, mecanicos);

                                            if (asignar) {
                                                System.out.println("\nEstado actual de los mecanicos:");
                                                for (Mecanico mecanico : mecanicos) {
                                                    System.out.println(mecanico.getNombre() + ": " + mecanico.getEstado());
                                                }
                                            }
                                            System.out.println("----------------------------------------");
                                            System.out.print("** Por favor ingrese identificador de la reparacion: ");
                                            int id_rep = Integer.parseInt(scanner.nextLine());

                                            Reparacion reparacion = new Reparacion(id_rep, orden_servicio);
                                            reparaciones.add(reparacion);
                                    } else {
                                        System.out.println("JMMMMMM");
                                    }
                                }                              
                            }
                    
                            if (opcion7 == 2) {
                                System.out.println("- Busca un vehiculo -");
                                System.out.print("Identificador del vehiculo: ");
                                int id_veh = Integer.parseInt(scanner.nextLine());
                                
                                VehiculoReparacion vehiculo_encontrado = null;

                                for (VehiculoReparacion vehiculoR : vehiculosReparaciones) {
                                    if (vehiculoR instanceof VehiculoReparacion && vehiculoR.getIdVehRep() == id_veh) {
                                        vehiculo_encontrado = vehiculoR;
                                        break;
                                    }
                                }

                                if (vehiculo_encontrado != null) {
                                    System.out.print("Ingresa identificador de la orden: ");
                                    int id_ord = Integer.parseInt(scanner.nextLine());
                                    System.out.print("Descripcion del problema: ");
                                    String descripcion_problema = scanner.nextLine();
                                    vehiculo_encontrado.setEstado("En reparacion");
                                    if (vehiculo_encontrado.getEstado().equals("En reparacion")) {
                                        OrdenDeServicio orden_servicio = new OrdenDeServicio(id_ord, vehiculo_encontrado, descripcion_problema);
                                        ordenes_servicio.add(orden_servicio);
                                        System.out.println("----------------------------------------");
                                        System.out.println("Orden creada!");
                                        System.out.println("Cliente: " + vehiculo_encontrado.getCliente().getNombre());
                                        System.out.println("Vehiculo: " + vehiculo_encontrado.getMarca());
                                        System.out.println("----------------------------------------");

                                        // Asignar orden de servicio a un mecánico
                                        boolean asignar = asignarOrdenServicioMecanico(orden_servicio, mecanicos);

                                        if (asignar) {
                                            System.out.println("\nEstado actual de los mecanicos:");
                                            for (Mecanico mecanico : mecanicos) {
                                                System.out.println(mecanico.getNombre() + ": " + mecanico.getEstado());
                                            }
                                        }
                                        System.out.println("----------------------------------------");
                                        System.out.print("** Por favor ingrese identificador de la reparacion: ");
                                        int id_rep = Integer.parseInt(scanner.nextLine());

                                        Reparacion reparacion = new Reparacion(id_rep, orden_servicio);
                                        reparaciones.add(reparacion);
                                    } else {
                                        System.out.println("JMMMMMM");
                                    }
                                } else {
                                    System.out.println("El vehiculo no esta en el sistema, verifique");
                                }
                            }
                            else if (opcion7 == 3) {
                                System.out.println("...");
                                break;
                            }
                        }
                    }
                    else if (opcion6 == 2) {
                        System.out.println("- Busca una orden -");
                        System.out.print("Identificador de la orden: ");
                        int id_ord = scanner.nextInt();

                        OrdenDeServicio orden_encontrada = null;

                        for (OrdenDeServicio orden : ordenes_servicio) {
                            if (orden instanceof OrdenDeServicio && orden.getIdOrden() == id_ord) {
                                orden_encontrada = orden;
                                break;
                            }
                        }

                        if (orden_encontrada != null) {
                            System.out.println("----------------------------------------");
                            orden_encontrada.verOrden();
                            System.out.println("----------------------------------------");
                        } else {
                            System.out.println("La orden no está registrada en el sistema, verifique");
                        }
                    }
                    else if (opcion6 == 3) {
                        while(true) {
                            Menus.menuReparaciones();
                            System.out.print("Opcion: ");
                            int opcion8 = scanner.nextInt();

                            if (opcion8 == 1) {
                                System.out.print("Ingrese identificador de la reparacion: ");
                                int id_rep = scanner.nextInt();
                                Reparacion reparacion_encontrada = null;
                                for (Reparacion reparacion : reparaciones) {
                                    if (reparacion instanceof Reparacion && reparacion.getIdReparacion() == id_rep) {
                                        reparacion_encontrada = reparacion;
                                        break;
                                    }
                                }
                                if (reparacion_encontrada != null) {
                                    System.out.println("----------------------------------------");
                                    String estadoRep = "";
                                    Random random = new Random();
                                    int randomNum = random.nextInt(3) + 1;
                                    if (randomNum == 1) {
                                        estadoRep = "En reparacion";
                                    }
                                    else if (randomNum == 2) {
                                        estadoRep = "En pintura";
                                    }
                                    else if (randomNum == 3) {
                                        estadoRep = "Para entrega";
                                    }
                                    
                                    reparacion_encontrada.calcularEstadoReparacion(estadoRep);
                                    reparacion_encontrada.verReparacion();
                                    System.out.println("----------------------------------------");
                                } else {
                                    System.out.println("La orden no está registrada en el sistema, verifique");
                                }
                                
                            }
                            else if (opcion8 == 2) {
                                System.out.println("...");
                                break;
                            }
                            else {
                                System.out.println("Opcion invalida, intente nuevamente");
                            }
                        }
                    }
                    else if (opcion6 == 4) {
                        System.out.println("...");
                        break;
                    }
                    else {
                        System.out.println("Opcion invalida, intente nuevamente");
                    }
                }
            }
            else if (opcionPrincipal == 7){
                System.out.println("Gracias por usar nuestros servicios");
                scanner.close();
                break;
            }
            else{
                System.out.println("Opcion invalida, intente nuevamente");
            }
        }
    }
}

