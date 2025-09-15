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
public class Cliente {

    public Cliente(String rut, String nombre, int edad, LocalDate fechadenacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechadenacimiento = fechadenacimiento;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=18 && edad <100){
            this.edad=edad;
        }else{
            System.out.println("La edad no puede ser menor que 18 y tampoco mayor que 100");
        }
        this.edad = edad;
    }

    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(LocalDate fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }
    private String rut,nombre;
    private int edad;
    private LocalDate fechadenacimiento;
    
}
