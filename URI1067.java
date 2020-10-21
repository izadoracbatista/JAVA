import java.util.Scanner;
public class URI1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valorinteiro, valor=1, qtdImpares=0; 

        valorinteiro = teclado.nextInt(); // lendo valor de x
        do {
            System.out.println(valor);
            valor += 2;
        } while (valor <= valorinteiro);
        
                
    }

}