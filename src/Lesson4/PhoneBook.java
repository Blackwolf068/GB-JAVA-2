package Lesson4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PhoneBook {
    HashMap<String, HashSet<String>> book = new HashMap<>();

    public void add(String familiya, String phone) {
        if (this.book.containsKey(familiya)) {
            this.book.get(familiya).add(phone);
        } else {
            HashSet <String> phoneSet = new HashSet<>();
            phoneSet.add(phone);
            this.book.put(familiya, phoneSet);
        }
    }

    public void get(String familiya) {
        if (this.book.containsKey(familiya)) {
            System.out.println(familiya + " - телефон(ы):");
            Iterator<String> iterator = this.book.get(familiya).iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        } else {
            System.out.printf("На человека с фамилией %s телефон не зарегистрирован\n", familiya);
        }
    }
}
