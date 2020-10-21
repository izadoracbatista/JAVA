import java.util.Scanner;
public class Exercicio2e{
public static void main(String args[]){
    Scanner teclado = new Scanner (System.in);
    float area, basemaior, basemenor, altura;
    System.out.println(" Vamos calcular a área de um TRAPÉZIO");

    System.out.println(" Por favor, informe o valor do base MAIOR");
    basemaior = teclado.nextFloat();

    System.out.println(" Por favor, informe o valor do base MENOR");
    basemenor = teclado.nextFloat();

    System.out.println(" Por favor, informe o valor do ALTURA");
    altura = teclado.nextFloat();
    
    area = ((basemaior + basemenor)*altura)/2;
//saída com 4 casas decimais depois da virgula
    System.out.printf("Valor da área do trapézio é %.4f", area);
    }
}