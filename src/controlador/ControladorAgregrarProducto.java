/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.AgregarProducto;
import modelo.*;

/**
 *
 * @author Steven
 */
public class ControladorAgregrarProducto implements ActionListener{
    private final AgregarProducto vistaAP;
    private final Propiedad propiedad;
    private final DaoPropiedades DaoPropiedades;

    public ControladorAgregrarProducto(AgregarProducto vistaAP, Propiedad propiedad, DaoPropiedades DaoPropiedades) {
        this.vistaAP = vistaAP;
        this.propiedad = propiedad;
        this.DaoPropiedades = DaoPropiedades;
        setListener();
        
        /*ArrayList<Propiedad> listadoPropiedades;
        listadoPropiedades = this.DaoPropiedades.leer(0);
        this.vistaAP.cargarNombresPropiedades(listadoPropiedades); */
    }
    
    public void setListener(){
        this.vistaAP.setListeners(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) { 
        if(e.getActionCommand().equalsIgnoreCase("CARGAR PROPIEDADES")){
            JOptionPane.showMessageDialog(null, "cargar propiedades");
            System.out.println("cargar propiedades");
            /*ArrayList<Propiedad> listadoPropiedades;
            listadoPropiedades = this.DaoPropiedades.leer(0);
            this.vistaAP.cargarNombresPropiedades(listadoPropiedades);*/
        } else {
            JOptionPane.showMessageDialog(null, "no action command");
        }
        /*if(vistaAP.getSelected()==null){
            JOptionPane.showMessageDialog(null, "cargar propiedades");
        }*/
    }
    
}
