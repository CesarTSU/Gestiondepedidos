/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondepedidos;

/**
 *
 * @author cesar_9brtwac
 */
public class Producto {

    public Producto(String codigo, String nombre, String tipo, double preciounitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.preciounitario = preciounitario;
    }

    public String getCodigo() {
        return codigo;}

    public String getNombre() {
        return nombre;}

    public String getTipo() {
        return tipo;}

    public double getPreciounitario() {
        return preciounitario;
    }
    public boolean tipovalido() {
        return tipo.equalsIgnoreCase("Maleta") ||
               tipo.equalsIgnoreCase("Mochila") ||
               tipo.equalsIgnoreCase("Bolso");
    }
    private String codigo,nombre,tipo;
    private double preciounitario;
    
}
