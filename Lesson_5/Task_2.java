import java.util.*;
import java.io.*;

public class Task_2 {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> people = new HashMap<>(); 
        Map<String, Integer> nameCount = new HashMap<>();
        String[] OneName = new String[10];
        /*
         * Коллекция 'people' создал для добавления в нее имён людей из списка
         * Коллекция 'nameCount' создал что бы считать и записывать в нее 
         * сколько раз повторяется имя.
         */
        BufferedReader file = new BufferedReader(new FileReader("Name.txt"));
        String str;
        //Считывание информации с текстового файла
        int count = 0;
        int j = 0;
        while ((str = file.readLine()) != null) { //берем из файла информацию и оставляем только имя
            OneName = str.split(" ");
            people.put(count, OneName[0]);
            count++;
        }
        /*
         * В цикле снизу мы считаем сколько раз повторяется каждое из имен.
         */
        for (int i = 0; i < people.size(); i++) {
            for (int k = 0; k < people.size(); k++) {
                String name = people.get(i);
                String temp = people.get(k);
                if (name.equals(temp)) {
                    j++;
                } else {
                    nameCount.put(name, j);
                }
                if (k + 1 == (people.size())) {
                    nameCount.put(name, j);
                }
            }
            j = 0;
        }
        /*
         * В цикле снизу мы сортируем имена по убыванию повторений.
         */
        for (int g = 0; g < nameCount.size(); g++) {
            for (Map.Entry<String, Integer> item : nameCount.entrySet()) {
                if (g == item.getValue()) {
                    System.out.printf("[%d: %s]\n", item.getValue(), item.getKey());
                }
            }
        }
    }
}
/*
 * Пусть дан список сотрудников:
 * 
 * Написать программу, которая найдет и выведет повторяющиеся имена с
 * количеством повторений.
 * Отсортировать по убыванию популярности Имени.
 */
