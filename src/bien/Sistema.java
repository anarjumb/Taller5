/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bien;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        OperacionesAderezo.anadirAderezoPostre(helado_vainilla, new Aderezo("Chispas"));
        OperacionesAderezo.anadirAderezoPostre(helado_vainilla, new Aderezo("Frutilla"));
        System.out.println(helado_vainilla);
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        OperacionesAderezo.quitarAderezoPostre(pastel_chocolate, new Aderezo("Crema"));
        OperacionesAderezo.anadirAderezoPostre(pastel_chocolate, new Aderezo("Frutillas"));
        System.out.println(pastel_chocolate);
        
        
    }
}
