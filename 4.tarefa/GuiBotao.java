 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.event.*;
import javax.swing.*;
public class GuiBotao extends JPanel{
    private JButton btMensagem, btTeimoso;
    private ImageIcon ImageIcon1;
    public GuiBotao(){
        InicializarComponentes();
        definirEventos();
    }
    private void InicializarComponentes(){
        setLayout(null);
        ImageIcon1=new ImageIcon("java.jpg");
        btMensagem=new JButton("Mensagem", ImageIcon1);
        btMensagem.setBounds(50,20,140,38);
        btMensagem.setMnemonic(KeyEvent.VK_M);
        btMensagem.setToolTipText("Clique aqui para ver a mensagem");
        btTeimoso=new JButton("Teimoso");
        btTeimoso.setBounds(50,70,100,25);
        add(btMensagem);
        add(btTeimoso);
    }
    private void definirEventos(){
        btMensagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Botão Mensagem");
            }
        });
        btTeimoso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Botão Teimoso");
            }
        });
        btTeimoso.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                btTeimoso.setBounds(50,120,100,25);
            }
            public void mouseExited(MouseEvent e){
                btTeimoso.setBounds(50,70,100,25);
            }
        });
    }
}