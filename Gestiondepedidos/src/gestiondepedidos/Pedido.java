/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondepedidos;
import java.time.LocalDate;

/**
 *
 * @author cesar_9brtwac
 */
public class Pedido {

    public Pedido(Cliente cliente, Vendedor vendedor, Producto producto, int cantidad, LocalDate fechapedido) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechapedido = fechapedido;
    }
    public double calculartotalbruto(){
        double total=cantidad*producto.getPreciounitario();
        if (cliente.getEdad()>65){
            total=total*0.5;}
        return total;
    }
    public double calculardescuento(double totalbruto){
        if(totalbruto>120000){
            return totalbruto*0.25;}
        else if (totalbruto > 60000){
            return totalbruto* 0.15;}
        return 0;
    }
    public double calculartotalneto() {
        double totalBruto = calculartotalbruto();
        double descuento = calculardescuento(totalBruto);
        return totalBruto - descuento;
    }
    public String estadoPedido() {
    boolean clienteValido = cliente.getNombre() != null && !cliente.getNombre().trim().isEmpty()
                            && cliente.getEdad() >= 18 && cliente.getEdad() < 100;

    boolean vendedorValido = vendedor.getNombre() != null && !vendedor.getNombre().trim().isEmpty()
                             && vendedor.fechaIngresoValida();

    boolean productoValido = producto.getTipo().equalsIgnoreCase("Maleta")
                             || producto.getTipo().equalsIgnoreCase("Mochila")
                             || producto.getTipo().equalsIgnoreCase("Bolso");

    if (clienteValido && vendedorValido && productoValido) {
        return "Confirmado";
    }
    return "Pendiente";}
    
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto producto;
    private int cantidad;
    private LocalDate fechapedido;
    
}
