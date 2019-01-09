import java.util.Scanner;

public class person{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn fornavn: ");
        String fornavn = scanner.nextLine();

        System.out.println("Skriv inn etternavn: ");
        String etternavn = scanner.nextLine();

        System.out.println("Skriv inn aldedr: ");
        String alder = scanner.nextLine();

        System.out.println("Ditt navn er: " + fornavn + " " + etternavn +"\n" + "Din alder er: " + alder);
    }
}