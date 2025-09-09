import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("inserisci una stringa");
            String stringa = scan.nextLine();
            if(stringa.contains(":q")) break;

        }
    }
}
