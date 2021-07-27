package Kris.start.Money.step;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] slova = {"apple", "lemon", "orange", "apple", "pineapple", "kiwi", "kiwi",
                "coconut", "banana", "watermelon", "kiwi",
                "pear", "plum", "orange", "avocado", "avocado", "plum"};

        Map<String , Integer > map = new HashMap<>();
        for (String x:slova) {
          map.put(x,map.getOrDefault(x,0)+1);

        }
        System.out.println(map);
        Note nt = new Note();
        nt.add("Andrey","+79038546582");
        nt.add("Kris","+79038576582");
        nt.add("Vasya","+79038846582");
        nt.add("Igor","+79038566582");
        nt.add("Alex","+79038516582");
        System.out.println(nt.get("Andrey"));
        }


}

