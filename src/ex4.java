import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero intero");
        int conto = scan.nextInt();
        for(int i = conto ; i > 0 ; i--){
            System.out.println(i);
        }
    }
}
