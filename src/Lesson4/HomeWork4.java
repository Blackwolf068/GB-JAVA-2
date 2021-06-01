package Lesson4;

import java.util.*;

public class HomeWork4 {

    public static void printUniqElem (String[] str) {
        Set<String> uniq = new HashSet<>(Arrays.asList(str));
        List<String> strList = new ArrayList<>(Arrays.asList(str));
        System.out.println("Список уникальных элементов массива: " + uniq);
        Iterator<String> iter = uniq.iterator();
        while (iter.hasNext()){
            String s1 = iter.next();
            int num = 0;
            for (String s : strList) {
                if (s1.equals(s)) num++;
            }
            System.out.println("Строка " + s1 + " встречается " + num + " раз");
        }
    }

    public static void main(String[] args) {

        String[] str1 = new String[] {"A", "B", "C", "A", "D", "E", "A", "B", "A", "B", "C", "A", "D", "C", "C"};
        printUniqElem(str1);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "111111111");
        phoneBook.add("Иванов", "222222222");
        phoneBook.add("Иванов", "3334445556");
        phoneBook.add("Петров", "444888456");
        phoneBook.add("Сергеев", "555551234567");
        phoneBook.add("Плотникова", "66666454545");
        phoneBook.add("Плотникова", "77777545454");

        phoneBook.get("Иванов");
        phoneBook.get("Иванова");
        phoneBook.get("Плотникова");
        phoneBook.get("Сергеев");
        phoneBook.get("Петров");

    }
}
