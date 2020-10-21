import java.util.Scanner;
public class URI1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int DDD;

        DDD = teclado.nextInt();
                

        if(DDD == 61 ){ //cidade
            System.out.println("Brasilia");
        }
        else if(DDD == 71 ){ //cidade
            System.out.println("Salvador");
        }
        else if(DDD == 11 ){ //cidade
            System.out.println("São Paulo");
        }
        else if(DDD == 21 ){ //cidade
            System.out.println("Rio de Janeiro");
        }
        else if(DDD == 32 ){ //cidade
            System.out.println("Juiz de Fora");
        }
        else if(DDD == 19 ){ //cidade
            System.out.println("Campinas");
        }
        else if(DDD == 27 ){ //cidade
            System.out.println("Vitoria");
        }
        else if(DDD == 31 ){ //cidade
            System.out.println("Belo Horizonte");
        }
        else {
            System.out.println("DDD nao cadastrado");
        }
    }

}