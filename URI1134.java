import java.util.Scanner;
public class URI1134{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int tipo, qtdAlcool=0, qtdGasolina=0, qtdDiesel=0;

        do{
            tipo = teclado.nextInt();
            if (tipo==1){
                qtdAlcool++;
            }
            else if (tipo==2){
                qtdGasolina++;         
            }
            else if (tipo==3){
                qtdDiesel++;
            }
        } while (tipo !=4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool " + qtdAlcool);
        System.out.println("Gasolina " + qtdGasolina);
        System.out.println("Diesel " + qtdDiesel);
    }

}