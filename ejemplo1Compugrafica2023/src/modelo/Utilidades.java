/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileWriter;
import java.util.LinkedList;
/**
 *
 * @author daniel.santana
 */
public class Utilidades {
    
    public static boolean guardarArchivo(LinkedList<Cliente> listaC){
    boolean t=false;
    try{
        String nombreArchivo = "clientes.txt";
        
        FileWriter fileWriter = new Filewriter(nombreArchivo);
        
        BufferedWriter writer = new BufferedWriter(filewriter);
        
        for(Cliente cliente: listaC){
          writer.write(cliente.toString()+"\n");
          

     }
        writer.close();
        fileWriter.close();
        t=true;
    
    
    
    }
    } catch (IOException e){
    e.printStackTrace();
}
    return t;
}
        
  }
