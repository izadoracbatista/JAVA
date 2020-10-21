import java.util.Scanner;
public class URI1006{
public static void main(String args[]){
    Scanner teclado = new Scanner (System.in);
    double notaA, notaB, notaC, media;
    
//System.out.println(" Insira a nota A");

    notaA = teclado.nextDouble();

   // System.out.println(" Insira a nota B");

    notaB = teclado.nextDouble();

    notaC = teclado.nextDouble();

    media = ((2 * notaA)+ (3* notaB)+ (5* notaC))/10;

    System.out.printf("MEDIA = %.5f\n" , media);
}
}