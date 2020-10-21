import java.util.Scanner;
public class URI1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        float numero; //numeros reais
        int qtdPositivos = 0;
        float media, soma;

        soma = 0; // soma inicial vale zero porque inicialmente nao tenho valores positivos


        for (int cont=1; cont <=6; cont++){ //este cabeçalho indica que vou contar ate 6
            numero = teclado.nextFloat(); // leio cada numero
        
            if(numero > 0){    //se o num é positivo
                qtdPositivos++; //conto a quantidade de positivos
                soma = soma + numero; //somo os positivos
                // System.out.println("soma = " +soma+ "  positivos = " +qtdPositivos);
            }
        }

        media = soma / qtdPositivos;
        
        System.out.println(qtdPositivos+" valores positivos");
        System.out.printf("%.1f\n",media);
    }

}