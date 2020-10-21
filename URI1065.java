import java.util.Scanner;
public class URI1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
            int numero, qtdPares=0; 

            for (int cont = 1; cont <=5; cont++){ //este cabeçalho indica que vou contar ate 5
            numero = teclado.nextInt(); // leio cada numero
        
            if(numero % 2 == 0){    //se o num é par
                qtdPares++; //conto a quantidade de positivos
            }
        }
        
        System.out.println(qtdPares+" valores pares");
    }

}