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


import java.io.*;
public class PersistenciaUsuario {
    public void guardar (Usuario u)throws Exception {
    File file=new File ("D:\\archivaldo.yo");
    
    //Paso 2
    
    FileOutputStream fos=new FileOutputStream(file);
    
    //paso 3 llenarlo con algo ese algo en este caso es
    //Un Usuario
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(u);
    oos.close();
    
    }
    
    public Usuario leer()throws Exception{
        File file=new File ("D:\\archivaldo.yo");
        FileInputStream fis=new FileInputStream (file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario u=new Usuario();
        u= (Usuario)ois.readObject();
        
        return u;
        
    
        
        
        
    }
    
}
