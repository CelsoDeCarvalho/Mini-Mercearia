/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author De Carvalho
 */
public class PaginaLogin extends JFrame{
    
    private JPanel container;
    
    private JLabel label_username_usuario;
    private JLabel label_senha_usuario;
    private JTextField campo_username_usuario;
    private JPasswordField campo_senha_usuario;
    
    private JButton cancelar;
    private JButton logar;

    public PaginaLogin() {
        setSize(400, 400);
        setResizable(false);
        setTitle("Pagina Login");
        setLocationRelativeTo(null);

        init_components();
        init_layout();
        style_components();
        add_components();
        init_actions();
    }

    private void init_components() {
       container=new JPanel();
    }

    private void init_layout() {
        setLayout(null);
       
    }

    private void style_components() {
        container.setBackground(Color.WHITE);
    }

    private void add_components() {
        add(container);
    }

    private void init_actions() {
        
    }
    
}
