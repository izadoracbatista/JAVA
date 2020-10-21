import java.util.Scanner;
public class Exercicio2d{
public static void main(String args[]){
    Scanner teclado = new Scanner (System.in);
    float area, diagonal1, diagonal2;
    
    System.out.println(" Por favor, informe o valor da diagonal 1");
    diagonal1 = teclado.nextFloat();
    System.out.println(" Por favor, informe o valor do diagonal 2");
    diagonal2 = teclado.nextFloat();
    
    area = diagonal1 * diagonal2;

    System.out.println("valor da área do losango = " + area);
    }
}