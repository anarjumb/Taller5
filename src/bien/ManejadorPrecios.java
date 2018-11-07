/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bien;

/**
 *
 * @author CltControl
 */
public class ManejadorPrecios {
    
        public double calcularPrecioFinal(Postre postre){
        double precioFinal;
        precioFinal=(postre.getPrecioParcial()+(postre.getPrecioParcial()*0.12))+(postre.getAderezos().size()*0.50);
        return precioFinal;

    }
}
