package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> library = new HashMap<>();

        library.put("\"Преступление и наказание\"", "Ф.М. Достаевский");
        library.put("\"Евгений Онегин\"", "А.С. Пушкин");

        Set<Map.Entry<String, String>> set = library.entrySet();

        List<Map.Entry<String, String>> list = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + ", " + list.get(i).getValue());
        }
    }
}
