package NumeroPausadamente;
import java.util.Scanner;

    public class NumeroPausado {

        public static void main(String[] args) {
            int numInicio=0;
            int numFinal=0;
            Scanner scan = new Scanner(System.in);
            System.out.println("digite O numero inicial e o numero final");
            numInicio= scan.nextInt();
            numFinal= scan.nextInt();


            while (numInicio<=numFinal) {
                System.out.println(numInicio);
                pausar(3000);
                numInicio++;
            }

        }

        public static void pausar(int milissegundos) {
            try {
                Thread.sleep(milissegundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }







