/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.event.*;
import javax.swing.*;

public class GuiCaixaOpcao extends JPanel{
    private JButton btVerificar, btMarcar, btDesmarcar;
    private JCheckBox ckIngles, ckInformatica;

    public GuiCaixaOpcao()
    {
        inicializaComponentes();
        definirEventos();
    }
    private void inicializaComponentes(){
        btVerificar=new JButton("Verificar");
        ckIngles= new JCheckBox("Ingles");
        ckInformatica= new JCheckBox("Informatica");
        btMarcar= new JButton("Marcar");
        btDesmarcar= new JButton("Desmarcar");
        setLayout(null);
        add(btVerificar);
        add(ckIngles);
        add(ckInformatica);
        add(btMarcar);
        add(btDesmarcar);
        btVerificar.setBounds(20, 70, 100, 20);
        ckIngles.setBounds(15, 15, 100, 25);
        ckInformatica.setBounds(15, 40, 100, 25);
        btMarcar.setBounds(20, 100, 100, 20);
        btDesmarcar.setBounds(20, 130, 100, 20);
    }
    private void definirEventos(){
        btMarcar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                ckInformatica.setSelected(true);
                ckIngles.setSelected(true);
            }
        });
        btDesmarcar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                ckInformatica.setSelected(false);
                ckIngles.setSelected(false);
            }
        });
        btVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                String selecao="Selecionados: ";
                if (ckIngles.isSelected()){
                    selecao+="\nInglês";
                }
                if (ckInformatica.isSelected()){
                    selecao+="\nInformática";
                }
                JOptionPane.showMessageDialog(null, selecao);
            }
        });
    }
}

