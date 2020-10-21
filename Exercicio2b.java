import java.util.Scanner;
public class Exercicio2b{
public static void main(String args[]){
    Scanner teclado = new Scanner (System.in);
    float area, base, altura;
    
    System.out.println(" Por favor, informe o valor do base");
    base = teclado.nextFloat();
    System.out.println(" Por favor, informe o valor do altura");
    altura = teclado.nextFloat();
    
    area = base * altura;

    System.out.println("valor da área = " + area);
    }
}