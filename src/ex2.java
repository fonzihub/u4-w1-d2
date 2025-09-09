import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi un numero intero");
        int numero = scan.nextInt();


        switch(numero){
            case 0 : {

                System.out.println("zero");
            } break;
            case 1 : {
                System.out.println("uno");
            } break;
            case 2 : {
                System.out.println("due");
            } break;
            default :
                System.out.println("errore");
        }
    }
}
