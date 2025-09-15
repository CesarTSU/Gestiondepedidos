/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondepedidos;

/**
 *
 * @author cesar_9brtwac
 */
public class Zona {

    public Zona(int nrozona, String nombre, String ciudadprincipal) {
        this.nrozona = nrozona;
        this.nombre = nombre;
        this.ciudadprincipal = ciudadprincipal;
    }

    public int getNrozona() {
        return nrozona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudadprincipal() {
        return ciudadprincipal;
    }
    private int nrozona;
    private String nombre,ciudadprincipal;
    
}
