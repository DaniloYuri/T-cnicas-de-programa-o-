import java.util.Scanner;

public class SaldoBancario {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String nome ="";
        String cpf="";

  
        int opcao = 0;
        double saque= 0;
        double deposito = 0;
        double saldo = 0;

        System.out.println("Para começar Digite Nome E cpf: ");
        nome = scan.nextLine();
        cpf = scan.nextLine();

        System.out.println("Conta gerada "+nome);
        System.out.println("Usuario: "+nome +"Cpf: "+cpf);
        do {
            System.out.println("**********||**********");
            System.out.println("1 - Depositar ");
            System.out.println("2 - Saldo");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.println("**********||**********");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor do depósito");
                deposito = scan.nextDouble();
                saldo = saldo + deposito;
            } else if (opcao == 2) {
                System.out.println("Seu saldo é: " + saldo);
            }
            else if (opcao==3){
                System.out.println("Quanto voce deja Sacar ?");
                saque = scan.nextDouble();
                saldo = saldo-saque ;
            
            } else if (opcao == 4) {
                System.exit(0);
            }

        } while (opcao != 4);
}
}
