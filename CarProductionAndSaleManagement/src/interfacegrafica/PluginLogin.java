/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import comando.Comando;
import facade.Fachada;
import facade.Sistema;
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
    private Comando comando;
    private Fachada s;

    public PluginLogin(Comando comando) {
        super("Login no sistema");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 140);
        setResizable(false);
        s = Sistema.getInstance();
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
            @Override
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == login) {
                }
                if (autenticar()) {
                    comando.executar();

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

    private boolean autenticar() {
        return s.autenticar(usuario.getText(), senha.getPassword());
    }
}
