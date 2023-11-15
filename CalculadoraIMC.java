import javax.swing.JOptionPane;

public class CalculadoraIMC {

    public static void main(String[] args) {

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso (em kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (em metros):"));

        double imc = calcularIMC(peso, altura);
        if (imc < 18.5)
            JOptionPane.showMessageDialog(null, "IMC = "+String.format("%.2f",imc)+"\n"+"Peso abaixo do normal.");
        else if (imc>18.5 && imc<24.4)
            JOptionPane.showMessageDialog(null, "IMC = "+String.format("%.2f",imc)+"\n"+"Peso Ideal.");
        else if (imc>=24.4 && imc<29.9)
            JOptionPane.showMessageDialog(null, "IMC = "+String.format("%.2f",imc)+"\n"+"Pré-obesidade.");
        else if (imc>30 && imc<34.9)
            JOptionPane.showMessageDialog(null, "IMC = "+String.format("%.2f",imc)+"\n"+"Obesidade classe | .");
        else if (imc>35 && imc<39.9)
            JOptionPane.showMessageDialog(null, "IMC = "+String.format("%.2f",imc)+"\n"+"Obesidade classe || (severa.)");
        else if (imc>39.9)
            JOptionPane.showMessageDialog(null, "IMC = "+String.format("%.2f",imc)+"\n"+"Obesidade classe ||| (mórbida.");

    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}


