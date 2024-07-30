package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {

    //    private String name;
//    private int number;
    private Map<String, Integer> rubrica = new HashMap<>();


    public Integer addContact(String name, int number) {
        return rubrica.put(name, number);
    }

    public Integer removeContact(String name) {
        return rubrica.remove(name);
    }

    public Integer findContactByNum(int number) {
        return rubrica.get(number);
    }

    public Integer findContactByName(String name) {
        return rubrica.get(name);
    }

    @Override
    public String toString() {

        return "Rubrica {" +
                "rubrica = " + rubrica +
                '}';
    }
}
