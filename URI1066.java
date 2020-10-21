import java.util.Scanner;
public class URI1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
            int numero, qtdPares=0, qtdImpares=0, qtdPositivos=0, qtdNegativos=0 ; 

            for (int cont = 1; cont <=5; cont++){ //este cabeçalho indica que vou contar ate 5
                numero = teclado.nextInt(); // leio cada numero
            
                if(numero % 2 == 0){    //se o num é par
                    qtdPares++; //conto a quantidade de pares
                }
                else { 
                    qtdImpares++; //conto a quantidade de impares
                }
                if(numero > 0){    
                    qtdPositivos++; //conto a quantidade de positivo
                }
                else if (numero < 0){  
                    qtdNegativos++; //conto a quantidade de negativos
                }

            }
        
        System.out.println(qtdPares+" valor(es) par(es)");
        System.out.println(qtdImpares+" valor(es) impar(es)");
        System.out.println(qtdPositivos+" valor(es) positivo(s)");
        System.out.println(qtdNegativos+" valor(es) negativo(s)");
    }

}