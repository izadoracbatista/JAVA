import java.util.Scanner;
public class URI1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int senha=1234; 

        valor = teclado.nextInt(); // lendo valor de x

        if(valor != senha){
            System.out.println("Senha Invalida");

        }
        else{
            System.out.println("Acesso Permitido");
        }

        }
    }

}