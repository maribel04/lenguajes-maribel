/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public class cuadrado {
     private float lado;
     
     public cuadrado(int lado){
         this.lado=lado;
     }
    public cuadrado(){
        
    }
    float calcularArea(){
    
    float area=lado*lado;
            return area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    
}
