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
public class Vendedor {

    public Vendedor(String rut, String nombre, int nrovendedor, LocalDate fechaingreso, Zona zona) {
        this.rut = rut;
        this.nombre = nombre;
        this.nrovendedor = nrovendedor;
        this.fechaingreso = fechaingreso;
        this.zona = zona;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.isEmpty()){
            System.out.println("Nombre no puede estar vacio");
        }else{
        
        this.nombre = nombre;}
    }

    public int getNrovendedor() {
        return nrovendedor;
    }

    public void setNrovendedor(int nrovendedor) {
        this.nrovendedor = nrovendedor;
    }

    public LocalDate getFechaingreso() {
        return fechaingreso;
    }

    public boolean fechaIngresoValida() {
        return !fechaingreso.isAfter(LocalDate.now());
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    private String rut,nombre;
    private int nrovendedor;
    private LocalDate fechaingreso;
    private Zona zona;
    
    
}
