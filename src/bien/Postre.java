/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bien;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public abstract class Postre {
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public ArrayList<Aderezo> getAderezos(){
        return aderezos;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }
    
    
}
