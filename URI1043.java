import java.util.Scanner;
public class URI1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        Double A, B, C;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
                

        if(((A + B) > C) && ((B + C) > A)) && ( ) { 
            System.out.println("Q1");
        }
        else if((x < 0) && (y > 0) ){ 
            System.out.println("Q2");
        }
        else if((x < 0) && (y < 0) ){ 
            System.out.println("Q3");
        }
        else if((x > 0) && (y < 0) ){ 
            System.out.println("Q4");
        }        
        else if((x == 0) && (y != 0) ){ 
            System.out.println("Eixo Y");
        }        
        else if((x != 0) && (y == 0) ){ 
            System.out.println("Eixo X");
        }
       else {
            System.out.println("Origem");
        }
    }

}