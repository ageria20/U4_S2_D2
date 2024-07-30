package esercizio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        int number = 0;
        Rubrica rubrica = new Rubrica();
        try {
            System.out.println("Inserisci un nome");
            name = scanner.nextLine();
            System.out.println("Inserisci il numero di telefono");
            number = scanner.nextInt();
            rubrica.addContact(name, number);
        } catch (InputMismatchException e) {
            System.out.println("Devi inserire un nome" + e.getMessage());
        }

        System.out.println(rubrica);
    }


}
