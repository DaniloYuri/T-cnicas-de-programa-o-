 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiLabel extends JPanel{
    private JLabel label1, label2, label3, label4;
    private ImageIcon ImageIcon1;

    public GuiLabel(){
        inicializaComponentes();
    }
    private void inicializaComponentes(){
        setLayout(new GridLayout(4, 1));
        ImageIcon1=new ImageIcon("java.jpg");
        setBackground(new Color(100, 220, 100));
        label1 = new JLabel(" Aprendendo ", JLabel.LEFT);
        label1.setForeground(Color.white);
        label2 = new JLabel(ImageIcon1);
        label3 = new JLabel(" Inserir ", Label.RIGHT);
        label3.setForeground(Color.blue);
        label4 = new JLabel(" Label e Imagens ", ImageIcon1, JLabel.CENTER);
        label4.setFont(new Font("Serif", Font.BOLD, 20));
        setForeground(Color.black);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
    }
}
