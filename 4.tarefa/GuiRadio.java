 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiRadio extends JPanel {
    private JLabel lbSexo;
    private JButton btVerificar;
    private JRadioButton rbMasculino, rbFeminino;
    private ButtonGroup buttonGroup;

    public GuiRadio(){
        inicializaComponentes();
        definirEventos();
    }

    private void inicializaComponentes(){
        setLayout(null);
        btVerificar=new JButton("Verificar");
        rbMasculino=new JRadioButton("Masculino");
        lbSexo=new JLabel("Selecione o Sexo");
        rbFeminino=new JRadioButton("Feminino");
        buttonGroup=new ButtonGroup();
        buttonGroup.add(rbMasculino);
        buttonGroup.add(rbFeminino);
        btVerificar.setBounds(55,105,100,20);
        rbMasculino.setBounds(55,45,100,25);
        lbSexo.setBounds(55,10,105,30);
        rbFeminino.setBounds(55,70,100,25);
        rbMasculino.setSelected(true);
        add(btVerificar);
        add(rbMasculino);
        add(lbSexo);
        add(rbFeminino);

    }
    private void definirEventos() {
        btVerificar.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                if (rbMasculino.isSelected()){
                    JOptionPane.showMessageDialog(null, "Masculino Selecionado");
                } else if (rbFeminino.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Feminino Selecionado");
                }
            }
        });
    }
}
