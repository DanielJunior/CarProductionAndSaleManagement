/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author lorena
 */
public class PluginLogin extends JFrame {

    private JTextField usuario;
    private JPasswordField senha;
    private JButton login, limpa;
    private JLabel user, pass;

    public PluginLogin() {
        super("Login no sistema");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 140);
        setResizable(false);

        user = new JLabel("Usuário: ");
        add(user);

        usuario = new JTextField(15);
        add(usuario);

        pass = new JLabel("Senha:   ");
        add(pass);

        senha = new JPasswordField(15);
        add(senha);

        login = new JButton("Entrar");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == login) {
                }
                if (usuario.getText().equals("Gerente") && senha.getText().equals("123")) {
                    JOptionPane.showMessageDialog(null, "Usuário autenticado!");
                  
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário não autenticado!");
                }

            }
        }
        );
        add(login);

        limpa = new JButton("Limpar");
        limpa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == limpa) {
                    usuario.setText("");
                    senha.setText("");
                }
            }
        }
        );
        add(limpa);
    }

}