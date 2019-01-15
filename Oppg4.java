import java.util.Scanner;
import java.util.ArrayList;

public class Oppg4 {

    private static ArrayList<Person> personer = new ArrayList<Person>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Skriv inn fornavn: ");
		String fornavn = scanner.nextLine();

		System.out.println("Skriv inn etternavn: ");
		String etternavn = scanner.nextLine();

		System.out.println("Skriv inn alder: ");
		int alder = scanner.nextInt();

		Person person = new Person(fornavn, etternavn, alder);
		System.out.println(
                "\nNavn: " + person.getFornavn() + " " + person.getEtternavn() + "\n" + "Alder: " + person.getAlder());
                
        personer.add(person);

        //Add option to show array
        System.out.println("\nVil du se hele listen over personer?" + "\nEnter Yes/No");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Yes")){
            for(int i = 0; i < personer.size(); i++) {
                System.out.println(personer.get(i));
            }
        }

        else if (answer.equalsIgnoreCase("No")){
            System.out.println("\nKanskje neste gang");
        }



		scanner.close();
	}
}