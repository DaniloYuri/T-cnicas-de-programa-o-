package SomaDosCem;

public class SomaDosCem {
    public static void main(String args[]){

        int count = 0 ;
        int aux= 0;
        int countLine=0;
        while(count<=99){
            aux = aux +count;
            if (count % 20 == 0)
                System.out.println(count+"+");
            else  System.out.print(count+"+");
            count++;

        }
        System.out.println("100 = "+(aux+100));;
    }
}
