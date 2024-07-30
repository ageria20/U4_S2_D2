package esercizio1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti elementi vuoi inserire");

        int nElements = 0;
        try {
            nElements = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Devi inserire un numero");

        }
        Set wordsList = new HashSet<>();
        for (int i = 0; i < nElements; i++) {
            String word = null;
            try {
                System.out.println("Inserisci una parole da aggiungere");
                word = scanner.nextLine();
                if (wordsList.contains(word)) {
                    System.out.println(word);
                }
                wordsList.add(word);
            } catch (Exception e) {
                System.err.println("Devi inserire una parola");
            }


        }
        scanner.close();


        System.out.println(wordsList);
    }
}