/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.javacap1;

/**
 *
 * @author T-107
 */
public class AplicacionImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primero creamos un objeto de tipo Imc
        Imc xxx=new Imc();
        float resultado=xxx.calcular(1.86f,86);
        System.out.println ("Tu imc es:"+resultado);
    }
    
}
