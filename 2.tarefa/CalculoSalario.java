package SalarioLiquido;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o salário por hora: ");
        double salarioHora = scanner.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int numDependentes = scanner.nextInt();

        double salarioBruto = calcularSalarioBruto(horasTrabalhadas, salarioHora, numDependentes);
        double inss = calcularINSS(salarioBruto);
        double ir = calcularIR(salarioBruto);
        double salarioLiquido = salarioBruto - inss - ir;
        System.out.println("Informação               | Cálculo");
        System.out.println("------------------------------------------------");
        System.out.printf("Salário Bruto            | %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS            | %.2f%n", inss);
        System.out.printf("Desconto IR              | %.2f%n", ir);
        System.out.printf("Salário Líquido          | %.2f%n", salarioLiquido);
    }

    public static double calcularSalarioBruto(double horasTrabalhadas, double salarioHora, int numDependentes) {
        return horasTrabalhadas * salarioHora + (50 * numDependentes);
    }

    public static double calcularINSS(double salarioBruto) {
        if (salarioBruto <= 1000) {
            return salarioBruto * 8.5 / 100;
        } else {
            return salarioBruto * 9 / 100;
        }
    }
    public static double calcularIR(double salarioBruto) {
        if (salarioBruto <= 500) {
            return 0;
        } else if (salarioBruto <= 1000) {
            return salarioBruto * 5 / 100;
        } else {
            return salarioBruto * 7 / 100;
        }
    }
}
