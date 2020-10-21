import java.util.Scanner;
public class URI1017{
public static void main(String args[]){
    Scanner teclado = new Scanner (System.in);
   
    double TEMPOGASTO, VELOCIDADEMEDIA, LITROS;
    TEMPOGASTO = teclado.nextDouble();

    VELOCIDADEMEDIA = teclado.nextDouble();

    LITROS = (TEMPOGASTO * VELOCIDADEMEDIA);

    System.out.printf("LITROS GASTO: %.3f\n" , LITROS );
   
}
}