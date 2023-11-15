import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoAreaTriangulo {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Digite a base do triângulo: ");
            double base = Double.parseDouble(reader.readLine());

            System.out.print("Digite a altura do triângulo: ");
            double altura = Double.parseDouble(reader.readLine());

            double area = (base * altura) / 2;

            System.out.println("A área do triângulo é: " + area);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ocorreu um erro ao ler os valores. Certifique-se de inserir números válidos.");
        }
    }
}