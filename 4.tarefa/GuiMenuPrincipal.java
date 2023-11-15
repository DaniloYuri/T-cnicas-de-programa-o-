 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Alunos
 */
public class GuiMenuPrincipal extends JFrame {
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaOpcao, miGuiRadio, miGuiLabel;
    
    
    public GuiMenuPrincipal(){
        inicializaComponentes();
        DefinirEventos();
        
    }
    
    private void inicializaComponentes(){
        setTitle("Menu Principal");
        setBounds(0,0, 800, 600);
        contentPane=getContentPane();
        mnBarra=new JMenuBar();
        mnArquivo=new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplos=new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');
        miSair= new JMenuItem("Sair");
        //  miSair= new JMenuItem("Sair", new ImagemIcon(sair.jpg));
        miSair.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao= new JMenuItem("botão");
        miCaixaOpcao= new JMenuItem("Caixa de Opção");
        miGuiRadio= new JMenuItem("Botão de Rádio");
        miGuiLabel= new JMenuItem("Tipos de Label");
        mnArquivo.add(miSair);
        mnExemplos.add( miBotao);
        mnExemplos.add(miCaixaOpcao);
        mnExemplos.add(miGuiRadio);
        mnExemplos.add(miGuiLabel);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        setJMenuBar(mnBarra);
      }
   
    private void DefinirEventos(){
        miSair.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               System.exit(0);
           }
        });
        miBotao.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
              // chama outro Código
              GuiBotao botao=new GuiBotao();
              contentPane.removeAll();
              contentPane.add(botao);
              contentPane.validate();
           }
        });
        miCaixaOpcao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                GuiCaixaOpcao guiCaixaOpcao=new GuiCaixaOpcao();
                contentPane.removeAll();
                contentPane.add(guiCaixaOpcao);
                contentPane.validate();
            }
        });
        miGuiRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                GuiRadio guiRadio=new GuiRadio();
                contentPane.removeAll();
                contentPane.add(guiRadio);
                contentPane.validate();


            }
        });
        miGuiLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                GuiLabel guiLabel=new GuiLabel();
                contentPane.removeAll();
                contentPane.add(guiLabel);
                contentPane.validate();
            }
        });
    }
    
    public static void abrir(){
        GuiMenuPrincipal frame=new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width)/2,(tela.height - frame.getSize().height)/2);
        frame.setVisible(true);
    }
    
}
