package InteiroImpares;
import javax.swing.JOptionPane;

public class InteiroImpares {
    public static void main(String[] args) {
    int count= 0;
    int aux=0;
    int impar=0;
            while (count<15){
                if (count % 2 != 0) {
                    aux = aux + count;
                    System.out.print(count + "+");
                }
                count ++;
            }
        System.out.print("15 ="+(aux+15));
    }
}
