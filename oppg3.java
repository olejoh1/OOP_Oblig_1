import java.util.Scanner;

public class oppg3{

    public static String fornavn, etternavn;
    public static int alder;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn fornavn: ");

        String fornavn = scanner.nextLine();

        System.out.println("Skriv inn etternavn: ");

        String etternavn = scanner.nextLine();

        System.out.println("Skriv inn aldedr: ");
        int alder = scanner.nextInt();

    }

    public void printPersonInformasjon(){

        System.out.println("Navn: " + oppg3.fornavn + " " + oppg3.etternavn + "\n" + "Alder: " + oppg3.alder);

    }

}