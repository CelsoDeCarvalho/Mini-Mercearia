package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaginaInicial extends JFrame {

    private JPanel navbar;
    private JButton nova_mercearia;
    private JButton entrar;

    public PaginaInicial() {
        setSize(900, 600);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setTitle("Mercearia Bila");
        setBackground(Color.GRAY);

        init_components();
        init_layout();
        style_components();
        add_components();
        init_actions();
    }

    private void init_components() {
        navbar = new JPanel();
        nova_mercearia = new JButton("Criar Mercearia");
        entrar=new JButton("Entrar");
    }

    private void init_actions() {
        nova_mercearia.addActionListener((ActionEvent event) -> {
            new CriarMercearia().setVisible(true);
        });
        
        entrar.addActionListener((ActionEvent event) -> {
            new PaginaLogin().setVisible(true);
        });
    }

    private void init_layout() {
        setLayout(new BorderLayout());
        navbar.setLayout(new FlowLayout(FlowLayout.RIGHT));
    }

    private void style_components() {
        navbar.setPreferredSize(new Dimension(900, 50));
        navbar.setBackground(Color.BLUE);
    }

    private void add_components() {
        add(navbar, BorderLayout.NORTH);
        navbar.add(nova_mercearia);
        navbar.add(entrar);
    }

    public static void main(String[] args) {
        new PaginaInicial().setVisible(true);
    }

}
