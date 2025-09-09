import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi un numero intero");
        int numero = scan.nextInt();
        String stringaNumero = Integer.toString(numero);

        switch(numero){
            case 0 : {

                System.out.println(stringaNumero);
            } break;
            case 1 : {
                System.out.println(stringaNumero);
            } break;
            case 2 : {
                System.out.println(stringaNumero);
            } break;
            default :
                System.out.println("errore");
        }
    }
}
