import java.util.Scanner;
public class URI1012{
public static void main(String args[]){
    Scanner teclado = new Scanner (System.in);
   
    double pi, A, B, C, AREATRIANGULO, AREATRAPEZIO, AREACIRCULO, AREARETANGULO, AREAQUADRADO ;
    
    A = teclado.nextDouble();

    B = teclado.nextDouble();

    C = teclado.nextDouble();

    pi= 3.14159;

    AREATRIANGULO = ((A * C)/2);

    AREACIRCULO = (pi * C * C);

    AREATRAPEZIO = (((A +B)*C )/2);

    AREAQUADRADO = B*B;

    AREARETANGULO = A*B;

    System.out.printf("AREA DO TRIANGULO: %.3f\n" , AREATRIANGULO );
    System.out.printf("AREA DO CIRCULO: %.3f\n" , AREACIRCULO );
    System.out.printf("AREA DO TRAPEZIO: %.3f\n" , AREATRAPEZIO );
    System.out.printf("AREA DO QUADRADO: %.3f\n" , AREAQUADRADO );
    System.out.printf("AREA DO RETANGULO: %.3f\n" , AREARETANGULO );
}
}