package AcrescimoProduto;
import javax.swing.JOptionPane;

public class AcrescimoProduto {

    public static void main(String[] args) {

        double taxa = 0;
        double valorProduto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto: "));
        int codigoProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto"));
        valorProduto = valorAtualizado(valorProduto, taxa, codigoProduto);

        JOptionPane.showMessageDialog(null, "O Valor do produto com a taxa é: R$" + String.format("%.2f", valorProduto));
    }

    public static double valorAtualizado(double valorProduto, double taxa, int codigoProduto) {
        switch (codigoProduto) {
            case 1:
                taxa = valorProduto * 0.15;
                valorProduto = valorProduto + taxa;
                break;
            case 3:
                taxa = valorProduto * 0.20;
                valorProduto = valorProduto + taxa;
                break;

            case 4:
                taxa = valorProduto * 0.35;
                valorProduto = valorProduto + taxa;
                break;
            case 8:
                taxa = valorProduto * 0.40;
                valorProduto = valorProduto + taxa;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código inválido");
                int novoCodigoProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um novo código do produto:"));
                valorProduto = valorAtualizado(valorProduto, taxa, novoCodigoProduto);
                break;
        }

        return valorProduto;
    }
}
