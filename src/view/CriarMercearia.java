package view;

import controll.FileMercearia;
import controll.FileUsuario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Mercearia;
import model.Usuario;
import java.util.List;

public class CriarMercearia extends JFrame {

    private JPanel container;
    private JPanel chapa_mercearia;
    private JLabel label_mercearia;
    private JLabel label_usuario;
    private JPanel chapa_usuario;
    private JLabel label_nome;
    private JTextField campo_nome;
    private JLabel label_endereco;
    private JTextField campo_endereco;
    private JLabel label_nome_usuario;
    private JLabel label_apelido_usuario;
    private JTextField campo_nome_usuario;
    private JTextField campo_apelido_usuario;
    
    private JLabel label_username_usuario;
    private JLabel label_senha_usuario;
    private JTextField campo_username_usuario;
    private JPasswordField campo_senha_usuario;
    
    private JButton cancelar;
    private JButton concluir;
    private JButton limpar_campos;

    public CriarMercearia() {
        setSize(550, 600);
        setResizable(false);
        setTitle("Nova Mercearia");
        setLocationRelativeTo(null);

        init_components();
        init_layout();
        style_components();
        add_components();
        init_actions();
    }

    private void init_components() {
        container = new JPanel();
        chapa_mercearia = new JPanel();
        chapa_usuario = new JPanel();
        label_mercearia = new JLabel("DADOS DA MERCEARIS");
        label_usuario = new JLabel("DADOS DO PROPRIETARIO");
        campo_nome = new JTextField();
        label_nome=new JLabel("Nome da Mercearia:");
        campo_endereco = new JTextField();
        label_endereco=new JLabel("Endereco da Mercearia:");
        label_nome_usuario=new JLabel("Nome do proprietario:");
        label_apelido_usuario=new JLabel("Apelido do proprietario:");
        campo_nome_usuario=new JTextField();
        campo_apelido_usuario=new JTextField();
        
        label_username_usuario=new JLabel("Username do proprietario:");
        label_senha_usuario=new JLabel("Senha do proprietario:");
        campo_username_usuario=new JTextField();
        campo_senha_usuario=new JPasswordField();
        
        cancelar=new JButton("Cancelar");
        limpar_campos=new JButton("Limpar campos");
        concluir=new JButton("Concluir");
    }

    private void init_layout() {
        container.setLayout(null);
        chapa_mercearia.setBounds(50, 10, 450,45);
        label_nome.setBounds(50, 80, 150, 25);
        campo_nome.setBounds(50, 115, 200, 25);
        label_endereco.setBounds(300, 80, 150, 25);
        campo_endereco.setBounds(300, 115, 200, 25);
        chapa_usuario.setBounds(50, 170, 450,45);
        label_nome_usuario.setBounds(50, 240, 150,25);
        label_apelido_usuario.setBounds(300,240, 150,25);
        campo_nome_usuario.setBounds(50, 275, 200,25);
        campo_apelido_usuario.setBounds(300,275, 200,25);
        
        label_username_usuario.setBounds(50, 320, 150,25);
        label_senha_usuario.setBounds(300,320, 150,25);
        campo_username_usuario.setBounds(50, 355, 200,25);
        campo_senha_usuario.setBounds(300,355, 200,25);
        
        cancelar.setBounds(50,450,100,30);
        limpar_campos.setBounds(160,450,150,30);
        concluir.setBounds(320,450,100,30);
    }

    private void style_components() {
        container.setBackground(Color.WHITE);
    }

    private void add_components() {
        add(container);
        container.add(chapa_mercearia);
        container.add(chapa_usuario);
        container.add(label_nome);
        chapa_mercearia.add(label_mercearia);
        chapa_usuario.add(label_usuario);
        container.add(campo_nome);
        container.add(label_endereco);
        container.add(campo_endereco);
        
        container.add(label_nome_usuario);
        container.add(label_apelido_usuario);
        
        container.add(campo_nome_usuario);
        container.add(campo_apelido_usuario);
        
        container.add(label_username_usuario);
        container.add(label_senha_usuario);
        
        container.add(campo_username_usuario);
        container.add(campo_senha_usuario);
        
        container.add(cancelar);
        container.add(limpar_campos);
        container.add(concluir);
    }

    private void init_actions() {
        cancelar.addActionListener((event) -> {
            this.setVisible(false);
        });
        
        limpar_campos.addActionListener((event) -> {
            campo_nome.setText("");
            campo_endereco.setText("");
            campo_apelido_usuario.setText("");
            campo_nome_usuario.setText("");
            campo_username_usuario.setText("");
            campo_senha_usuario.setText("");
        });
        
        concluir.addActionListener((event) -> {
            if(campo_nome.getText().equals("") || campo_endereco.getText().equals("")|| campo_apelido_usuario.getText().equals("")
            || campo_nome_usuario.getText().equals("")|| campo_username_usuario.getText().equals("")|| campo_senha_usuario.getText().equals("")){
                JOptionPane.showMessageDialog(null,"PREENCHA TODOS OS CAMPOS","Atencao",JOptionPane.ERROR_MESSAGE);
            }else{
                
                 int id=(int)(1000 + Math.random() * (10000 - 1000 + 1));
                 
                 Usuario usuario=new Usuario(campo_username_usuario.getText(),id, 
                 campo_senha_usuario.getText(),"Gestor",campo_nome_usuario.getText(),
                 campo_apelido_usuario.getText());
                 
                 List<Usuario> usuarios = new ArrayList();
                 
                 List<Mercearia> mercearias = new ArrayList();
                 
                 usuarios.add(usuario);
                 
                 Mercearia mercearia=new Mercearia(campo_nome.getText(), 
                 campo_endereco.getText(), id,usuarios,null);
                 
                 mercearias.add(mercearia);
                 
                 FileMercearia.salvarMercearia(mercearias);
                 FileUsuario.salvarUsuario(usuarios);
                 this.setVisible(false);
                 new PaginaLogin().setVisible(true);
            }
        });
        
    }

}
