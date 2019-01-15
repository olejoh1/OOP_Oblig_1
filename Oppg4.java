import java.util.Scanner;
import java.util.ArrayList;

public class Oppg4 {

    private static ArrayList<Person> personer = new ArrayList<Person>();

	public static void main(String[] args) {

        Person person1 = new Person("Nikolai", "Tesla", 86);
        Person person2 = new Person("Tom", "Pettersen", 64);
        Person person3 = new Person("Per", "Johansen", 13);

        personer.add(person1);
        personer.add(person2);
        personer.add(person3);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nVil du se hele listen over personer eller legge til person?" + "\nEnter Se eller Legg til");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Se")){
            for(int i = 0; i < personer.size(); i++) {
                System.out.println("\nNavn: " + personer.get(i).getFornavn() + " " + personer.get(i).getEtternavn() + "\nAlder: " + personer.get(i).getAlder());
            }
        }

        else if (answer.equalsIgnoreCase("Legg til")){

            System.out.println("Skriv inn fornavn: ");
            String fornavn = scanner.nextLine();

            System.out.println("Skriv inn etternavn: ");
            String etternavn = scanner.nextLine();

            System.out.println("Skriv inn alder: ");
                int alder = -1;
                try {
                    Integer.parseInt(scanner.nextLine());
                } catch(Exception e) {
                    System.err.println(e.getMessage());
                

            Person person = new Person(fornavn, etternavn, alder);
            System.out.println(
                    "\nNavn: " + person.getFornavn() + " " + person.getEtternavn() + "\n" + "Alder: " + person.getAlder());
                    
            personer.add(person);

            System.out.println("\nVil du se hele listen over personer?" + "\nEnter Ja eller Nei");
            String answer2 = scanner.nextLine();

            if (answer2.equalsIgnoreCase("Ja")){
                for(int i = 0; i < personer.size(); i++) {
                    System.out.println("\nNavn: " + personer.get(i).getFornavn() + " " + personer.get(i).getEtternavn() + "\nAlder: " + personer.get(i).getAlder());
                }
            }

            else if (answer2.equalsIgnoreCase("Nei")){
                System.out.println("\nKanskje neste gang :(");
            }

        }



		scanner.close();
	}
}