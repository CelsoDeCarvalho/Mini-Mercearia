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
import model.Usuario;

/**
 *
 * @author De Carvalho
 */
public class FileUsuario {
    
    
     public static void salvarUsuario(List<Usuario> usuarios){
        File file=new File("usuarios.dat");
        try{
            file.delete();
            file.createNewFile();
            try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(file))) {
                escritor.writeObject(usuarios);
            }
            JOptionPane.showMessageDialog(null,"Usuario Cadastrado com sucesso");
        }catch(IOException e){
            System.err.println(e+" Falha ao cadastrar o usuario");
        }finally{
            
        }
        
    }
    
}
