/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Steven
 */
public class Propiedad {
    private ArrayList<String> propiedades = new ArrayList<>();
    private String densidad;

    public String getDensidad() {
        return densidad;
    }

    public void setDensidad(String densidad) {
        this.densidad = densidad;
    }

    public ArrayList<String> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<String> propiedades) {
        this.propiedades = propiedades;
    }
    
    public  void addToProperties(String property){
        propiedades.add(property);
    }
    
}
