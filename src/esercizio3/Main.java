package esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rubrica rubrica = new Rubrica();
        rubrica.addContact("Andrea", "3459");
        rubrica.addContact("Mirko", "3455");
        rubrica.addContact("Michele", "3458");
        rubrica.addContact("Santo", "3452");
        rubrica.addContact("Luca", "3454");


        System.out.println(rubrica);
        rubrica.removeContact("Santo");
        rubrica.findContactByName("Luca");
        System.out.println(rubrica.findContactByNum("3458"));
        System.out.println(rubrica);

    }


}
