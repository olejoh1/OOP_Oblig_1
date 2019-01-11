import java.util.Scanner;

public class Person {
//Må også oppdattere filnavnet til det samme navnet som på klassen
    public static void main(String[] args) {
        // Oppretter og instansierer et objekt av typen Scanner
        Scanner scanner = new Scanner(System.in);

        // Printer ut til konsollen
        System.out.println("Skriv inn fornavn: ");
        // Leser input fra konsollen
        String fornavn = scanner.nextLine();

        System.out.println("Skriv inn etternavn: ");

        String etternavn = scanner.nextLine();

        System.out.println("Skriv inn aldedr: ");
        int alder = scanner.nextInt();

    }

    Person(String fornavn, String etternavn, int alder){

        Person person1 = new Person(fornavn, etternavn, alder);

    }

    public void printPerson() {

        System.out.println(person1);

    }

}
