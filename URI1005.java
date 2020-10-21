import java.util.Scanner;
public class URI1005{
public static void main(String args[]){
    Scanner teclado = new Scanner (System.in);
    double notaA, notaB, media;
    
//System.out.println(" Insira a nota A");

    notaA = teclado.nextDouble();

   // System.out.println(" Insira a nota B");

    notaB = teclado.nextDouble();

    media = ((3.5 * notaA)+ (7.5* notaB))/11;

    System.out.printf("MEDIA = %.5f\n" , media);
}
}