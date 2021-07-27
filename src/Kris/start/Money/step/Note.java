package Kris.start.Money.step;

import java.util.*;

public class Note {
    private Map<String, Set<String>> phoneBook = new HashMap<>();


    public void add(String name, String phone) {
        Set<String> number = phoneBook.getOrDefault(name, new HashSet<>());
        number.add(phone);
        phoneBook.put(name, number);

    }

    public Set<String> get(String name){
        return phoneBook.get(name);
    }
}

