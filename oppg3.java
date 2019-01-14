import java.util.Scanner;

public class Oppg3 {

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
				"Navn: " + person.getFornavn() + " " + person.getEtternavn() + "\n" + "Alder: " + person.getAlder());

		scanner.close();
	}
}