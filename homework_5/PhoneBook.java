package homework_5;

import java.util.*;
//    * Java Homework 5
//    @author Mykhailo Biesiedin
//    @version 19 May 2023
public class PhoneBook {

    private final Map<String, List<Integer>> phoneBook = new HashMap<>();

    public List<Integer> getNumbers(String surname) {
        if (!phoneBook.containsKey(surname)){
            throw new RuntimeException("This key is not present");
        }
        return phoneBook.get(surname);
    }

    public void add(String surname, List<Integer> phoneNumber) {
        phoneBook.put(surname, phoneNumber);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Biesiedin", List.of(123456789));
        phoneBook.add("Fedorov", List.of(987654321, 45394939));
        phoneBook.add("Goncharov", List.of(555123456));
        System.out.println(phoneBook.getNumbers("Fedorov"));

    }
}




