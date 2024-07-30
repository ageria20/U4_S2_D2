package esercizio2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero per generare una Lista di numeri Random");
        try {
            int n = scanner.nextInt();
            System.out.println(newList(n));
            System.out.println(reversedList(newList(n)));
            boolean oddEven = scanner.nextBoolean();
            System.out.println("Inserisci un valore pari o dispari");
            System.out.println(newList(n));
            System.out.println(oddEven(newList(n), oddEven));

        } catch (InputMismatchException e) {
            System.out.println("Devi inserire un numero");
        }


    }


    public static ArrayList newList(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(0, 100));
        }
        sort(list);
        return list;
    }

    public static ArrayList reversedList(ArrayList list) {
        ArrayList newList = new ArrayList<>();
        newList.addAll(list);
        newList.addAll(list.reversed());
        return newList;

    }

    public static ArrayList oddEven(ArrayList list, boolean even) {
        ArrayList evenList = new ArrayList();

        if (even) {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) evenList.add(list.get(i));
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0) evenList.add(list.get(i));
            }
        }

        return evenList;
    }
}
