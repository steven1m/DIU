/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Steven
 */
public class Producto {
    String nombre;
    List<String> propiedades;

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<String> propiedades) {
        this.propiedades = propiedades;
    }
    
}
