import java.util.Scanner;
public class Exercicio2a{
public static void main(String args[]){
    Scanner teclado = new Scanner (System.in);
    float area, lado;
    
    System.out.println(" Por favor, informe o valor do lado");
    lado = teclado.nextFloat();
    
    area = lado * lado;

    System.out.println("valor da área = " + area);
    }
}