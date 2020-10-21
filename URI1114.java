import java.util.Scanner;
public class URI1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int senha, valor; 
        senha = 2002;

        do { 
            valor = teclado.nextInt(); // lendo valor digitado

        if(valor != senha){
            System.out.println("Senha Invalida");

        }
        else{
            System.out.println("Acesso Permitido");
        }
        } while (valor!= senha);
    }

}