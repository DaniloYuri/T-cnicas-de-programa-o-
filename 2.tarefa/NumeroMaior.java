package NumeroMaior;
import javax.swing.JOptionPane;
public class NumeroMaior {
    public static void main(String[] args){
        int count = 0;
        int num1 =0;
        int num2 =0;
        int num3 =0;
        int aux =0;


        num1  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero"));
        num3= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o terceiro numero"));

        JOptionPane.showMessageDialog(null,num1+"\n"+num2+"\n"+num3);
        if(num1>num2 && num1>num3)
        JOptionPane.showMessageDialog(null,"O maior numero é: "+num1);
        else if (num2>num1 && num2>num3)
            JOptionPane.showMessageDialog(null,"O maior numero é: "+num2);
        else if (num3>num1 && num3>num2)
            JOptionPane.showMessageDialog(null, "O maior numero é "+num3);




    }
}
