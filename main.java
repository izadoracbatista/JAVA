import java.util.Scanner;
public class Main{
public static void main(String args[]){
    Scanner teclado = new Scanner (System.in);
    float codigopeca1, valorpeca1, codigopeca2, valorpeca2, valoraserpago;
    System.out.println(" Código da peça 1");
    codigopeca1 = teclado.nextFloat();

    System.out.println(" Valor da peça 1");
    valorpeca1 = teclado.nextFloat();
    
    System.out.println(" Valor da peça 1");
    valorpeca1 = teclado.nextFloat();
    
    System.out.println(" Código da peça 2");
    codigopeca2 = teclado.nextFloat();

    System.out.println(" Valor da peça 2");
    valorpeca2 = teclado.nextFloat();


    System.out.println(" Por favor, informe o valor do ALTURA");
    altura = teclado.nextFloat();
    
    area = ((basemaior + basemenor)*altura)/2;
//saída com 4 casas decimais depois da virgula
    System.out.printf("Valor da área do trapézio é %.4f", area);
    }
}