import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Inserisci una stringa (':q' per uscire):");
            String stringa = scan.nextLine();
            if(stringa.contains(":q")) break;

            // Split della stringa in caratteri
            String[] stringaSplit = stringa.split("");

            // Join dei caratteri con una virgola
            String stringaConVirgola = String.join(",", stringaSplit);

            System.out.println("Stringa con virgola: " + stringaConVirgola);
        }

        scan.close();
    }
}
