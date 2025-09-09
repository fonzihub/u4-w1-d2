import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("crea una stringa");
        String parolaInserita = scan.nextLine();

        System.out.println(parolaInserita.length() % 2 == 0);




        System.out.println("scrivi un anno");
        int annoBisestile = scan.nextInt();
        if(annoBisestile % 400 == 0 ){
            System.out.println( " è un anno bisestile");
        } else if (annoBisestile % 100 == 0) {
            System.out.println("non bisestile");
        }else if(annoBisestile % 4 == 0){
            System.out.println(" è bisestile");
        }
        else{
            System.out.println("non è bisestile");

        }


    scan.close();
    }
}
