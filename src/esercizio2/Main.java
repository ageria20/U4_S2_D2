package esercizio2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        System.out.println("Inserisci un numero per generare una Lista di numeri Random");
        try {
            int n = scanner.nextInt();
            System.out.println(newList(n));
            list = newList(n);
            System.out.println(reversedList(list));
            boolean oddEven = scanner.nextBoolean();
            System.out.println("Inserisci un valore pari o dispari");
            if (oddEven) {
                System.out.println("Numeri in posizioni pari");
            } else {
                System.out.println("Numeri in posizioni dispari");
            }
            System.out.println(list);
            oddEven(list, oddEven);

        } catch (InputMismatchException e) {
            System.out.println("Devi inserire un numero");
        }


    }


    public static ArrayList<Integer> newList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(0, 100));
        }
        Collections.sort(list);
        return list;
    }

    public static ArrayList<Integer> reversedList(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>(list);
        newList.addAll(list.reversed());
        return newList;

    }

    public static void oddEven(ArrayList<Integer> list, boolean even) {


        if (even) {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) System.out.println(list.get(i));
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0) System.out.println(list.get(i));
            }
        }


    }
}
