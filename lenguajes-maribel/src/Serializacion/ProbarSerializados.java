/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

/**
 *
 * @author T-107
 */
public class ProbarSerializados {
    private static Object per;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un Usuario
        Usuario u=new Usuario();
        u.setEmail("rapidclimate@gmail.com");
        u.setNombre("Juan Carlos");
        u.setSueldo(40000);
        //Lo guardamos
        
        PersistenciaUsuario per=new PersistenciaUsuario();
        try{
        per.guardar(u);
        System.out.println("Usuario guardado con exito");
    } catch (Exception ex){
    System.out.println(ex.getMessage());
   
    }
    

        
    }
}
