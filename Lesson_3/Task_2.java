package Java_on_GIT.Lesson_3;

import java.util.*;
//Задан целочисленный список ArrayList.Найти минимальное,максимальное и среднее из этого списка.
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, -2, 3, -11, 22, 32, 44, 6, 9, 6, -5, 55, 13, 12, -32);
        list.sort(null);
        int maxNum = list.get(list.size()-1);
        int minNum = list.get(0);
        int centerNum = list.get(list.size()/2);
        System.out.printf("Минимальное = " + minNum + "\nСреднее = "+ centerNum + "\nМаксимальное = " + maxNum);
    }
}
