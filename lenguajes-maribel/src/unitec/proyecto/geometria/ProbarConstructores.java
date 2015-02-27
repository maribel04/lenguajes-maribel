/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.maribel;

/**
 *
 * @author T-301
 */
public class ProbarConstructores {
    public static void main(String args[]){
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
       
        b=(byte)s;
        s=b;
        i=(int)s;
        b=l;
        l=i;
        s=i;
        b=s;
        s=l;
        l=s;
        b=i;
        b=s;
        i=b;
         
    //
    
    
    
    
    
    
    
        float f=45;
        double dedos=45.2;
        int i2=300;
        
        cuadrado c=new cuadrado(f);
    }
    
}
