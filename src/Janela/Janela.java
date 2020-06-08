package Janela;

import Botoes.Ativar;
import Botoes.Desativar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela {

    public Janela() {
    ConstrutorJanela("AutoClicker");
    }

    public void ConstrutorJanela(String title){
        JFrame janela = new JFrame(title);
        JPanel painel = new JPanel();
        JButton ativar = new JButton("Ativar");
        JButton desativar = new JButton("Desativar");
        ativar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ativar enable = new Ativar();
                enable.Enable();
            }
        });
        desativar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Desativar desativar = new Desativar();
                desativar.Disable();
            }
        });
        painel.add(ativar);
        painel.add(desativar);
        janela.add(painel);
        janela.setSize(600,400);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

}
