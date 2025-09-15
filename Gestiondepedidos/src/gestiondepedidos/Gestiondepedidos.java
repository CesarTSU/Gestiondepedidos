/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondepedidos;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author cesar_9brtwac
 */
public class Gestiondepedidos {
     private static Cliente cliente = null;
     private static Vendedor vendedor = null;
     private static Producto producto = null;
     private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            System.out.println("--Sistema de pedidos de equipaje y accesorios de viaje---");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar vendedor");
            System.out.println("3. Ingresar Producto");
            System.out.println("4. Generar pedido");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt(); sc.nextLine();
            switch (opcion){
                case 1 -> ingresarcliente();
                case 2 -> ingresarvendedor();
                case 3 -> ingresarproducto();
                case 4 -> generarpedido();
                case 5 -> {System.out.println("Saliendo del sistema...");return;}
                default -> System.out.println("Opcion invalida");
            }
    }
        
    }
    private static void ingresarcliente() {
     System.out.println("Ingreso Cliente");
     System.out.print("Rut cliente: "); String rut = sc.nextLine();
     System.out.print("Nombre: "); String nombre = sc.nextLine();
     System.out.print("Edad: "); int edad = sc.nextInt(); sc.nextLine();
     System.out.print("Fecha nacimiento (yyyy-MM-dd): "); LocalDate fecha = LocalDate.parse(sc.nextLine());
     cliente = new Cliente(rut, nombre, edad, fecha);
     System.out.println("Cliente registrado con exito.");
    }
    private static void ingresarvendedor() {
        System.out.println("Ingreso vendedor");
     System.out.print("Rut Vendedor: "); String rut = sc.nextLine();
     System.out.print("Nombre: "); String nombre = sc.nextLine();
     System.out.print("Ingrese número de vendedor: ");int nrovendedor = Integer.parseInt(sc.nextLine());
     System.out.print("Fecha de ingreso (yyyy-MM-dd): "); LocalDate fecha = LocalDate.parse(sc.nextLine());
     System.out.print("Ingrese número de zona: ");int nrozona = Integer.parseInt(sc.nextLine());
     System.out.print("Ingrese nombre de la zona: ");String nombrezona = sc.nextLine();
     System.out.print("Ingrese ciudad principal: ");String ciudadprincipal = sc.nextLine();
     Zona zona=new Zona(nrozona,nombrezona,ciudadprincipal);
     vendedor = new Vendedor(rut, nombre, nrovendedor, fecha,zona);
     System.out.println("Vendedor registrado con exito.");
    }
    private static void ingresarproducto(){
        System.out.println("Ingreso Producto");
        System.out.print("Ingrese codigo: ");String codigo=sc.nextLine();
        System.out.print("Ingrese nombre: ");String nombre=sc.nextLine();
        System.out.print("Ingrese tipo de producto (Maleta / Mochila / Bolso): ");String tipo = sc.nextLine();
        System.out.print("Ingrese precio unitario: ");double precio = Double.parseDouble(sc.nextLine());
        producto = new Producto(codigo, nombre, tipo, precio);
        System.out.println("Producto registrado con exito.");
    }
    private static void generarpedido() {
        if (cliente == null || vendedor == null || producto == null) {
            System.out.println("Debe registrar cliente, vendedor y producto antes de generar un pedido.");
            return;
        }

        System.out.println("Generar pedido");
        System.out.print("Ingrese cantidad solicitada: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        LocalDate fechaPedido = LocalDate.now();
        Pedido pedido = new Pedido(cliente, vendedor, producto, cantidad, fechaPedido);

        double totalBruto = pedido.calculartotalbruto();
        double totalNeto = pedido.calculartotalneto();

        System.out.println("\n---resumen pedido---");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Producto: " + producto.getNombre() + " x" + cantidad);
        System.out.println("Vendedor: " + vendedor.getNombre());
        System.out.println("Total Bruto: " + totalBruto);
        System.out.println("Total Neto (con descuentos): $" + totalNeto);
        System.out.println("Estado del Pedido: " + pedido.estadoPedido());
    }
}