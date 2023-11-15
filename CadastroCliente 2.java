import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCliente {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro de Cliente");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 200);

        janela.setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeCampo = new JTextField(20);

        JLabel sobrenomeLabel = new JLabel("Sobrenome:");
        JTextField sobrenomeCampo = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailCampo = new JTextField(20);

        JLabel senhaLabel = new JLabel("Senha:");
        JPasswordField senhaCampo = new JPasswordField(20);

        JCheckBox mostrarSenhaCheckBox = new JCheckBox("Revelar Senha");

        JButton enviarBotao = new JButton("Enviar");
        JButton limparBotao = new JButton("Limpar");

        enviarBotao.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent e) {
                String nome = nomeCampo.getText();
                String sobrenome = sobrenomeCampo.getText();
                String email = emailCampo.getText();
                String senha = mostrarSenhaCheckBox.isSelected() ? new String(senhaCampo.getPassword()) : "********";
                String mensagem = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nEmail: " + email + "\nSenha: " + senha;
                JOptionPane.showMessageDialog(janela, mensagem, "Dados do Cliente", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        limparBotao.addActionListener(new ActionListener() {
      
            public void actionPerformed(ActionEvent e) {
       
                nomeCampo.setText("");
                sobrenomeCampo.setText("");
                emailCampo.setText("");
                senhaCampo.setText("");
            }
        });

        painel.add(nomeLabel);
        painel.add(nomeCampo);
        painel.add(sobrenomeLabel);
        painel.add(sobrenomeCampo);
        painel.add(emailLabel);
        painel.add(emailCampo);
        painel.add(senhaLabel);
        painel.add(senhaCampo);
        painel.add(enviarBotao);
        painel.add(limparBotao);

        janela.add(painel);
        janela.setVisible(true);
    }
}
