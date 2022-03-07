import java.util.Scanner;
public class Controle{
    public static void main(String[]args){
        int valor ;
        Scanner leitura=new Scanner(System.in);
        System.out.println("digite um numero");
       valor=leitura.nextInt();
        switch (valor) {
            case 1:
                System.out.println("valor = 1");
                break;
            case 2:
                System.out.println("valor = 2");
                break;
            case 3:
                System.out.println("valor = 3");
                break;
        
            default:
            System.out.println("Nenhum dos 3 valores");
                
        }
    }

}
