package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {


    private Map<String, String> rubrica = new HashMap<>();


    public void addContact(String name, String number) {
        rubrica.put(name, number);
    }

    public void removeContact(String name) {
        rubrica.remove(name);
    }

    public String findContactByNum(String number) {
        String result = "";
        for (String name : rubrica.keySet()) {
            if (number.equals(rubrica.get(name))) {
                result = name;
            }
        }
        return result;
    }

    public void findContactByName(String name) {
        System.out.println(rubrica.get(name));
    }

    @Override
    public String toString() {

        return "Rubrica {" +
                " " + rubrica +
                '}';
    }
}
