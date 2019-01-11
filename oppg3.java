import java.util.Scanner;

public class oppg3 extends Thread{

    public static String fornavn, etternavn;
    public static int alder;

    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        t.setPriority(10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn fornavn: ");

        String fornavn = scanner.nextLine();

        System.out.println("Skriv inn etternavn: ");

        String etternavn = scanner.nextLine();

        System.out.println("Skriv inn aldedr: ");
        int alder = scanner.nextInt();

        ChildThread ct = new ChildThread();

        ct.setPriority(1);

        ct.start();

    }

    class ChildThread extends Thread{
        public void run(){
        System.out.println("Navn: " + oppg3.fornavn + " " + oppg3.etternavn + "\n" + "Alder: " + oppg3.alder);
        }

    }

}