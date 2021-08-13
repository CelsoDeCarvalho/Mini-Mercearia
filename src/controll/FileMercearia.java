/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import javax.swing.JOptionPane;
import model.Mercearia;

/**
 *
 * @author De Carvalho
 */
public class FileMercearia {
    
    public static void salvarMercearia(List<Mercearia> mercearias){
        File file=new File("mercearia.dat");
        try{
            file.delete();
            file.createNewFile();
            try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(file))) {
                escritor.writeObject(mercearias);
            }
            JOptionPane.showMessageDialog(null,"Mercearia Cadastrada com sucesso");
        }catch(IOException e){
            System.err.println(e+" Falha ao cadastrar a mercearia");
        }finally{
            
        }
        
    }
    
}
