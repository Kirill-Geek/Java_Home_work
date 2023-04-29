package Java_on_GIT.Lesson_3;

import java.util.*;
 // Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class Task_1 {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 11, 22, 33, 44, 6, 9, 6, 5, 55, 13, 12, 37};
        List<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < array.length; j++) {
            list.add(array[j]);
        }
        System.out.printf("Изначальный список = %s\n", list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.printf("Измененный список = %s", list);
    }

}