/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bien;

import java.util.ArrayList;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre{
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Helado(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
    
    
    
    
}
