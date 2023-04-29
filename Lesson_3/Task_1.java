package Java_on_GIT.Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
//Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class Task_1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        static <E> List<E> of(2, 3, 4, 5);
        System.out.println(list);
   

    }

}
import java.util.HashMap;
import java.util.Map;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class program_1 {
    public static void main(String[] args) {
        int temp = 0;
        int count = 0;
        int[] array = new int[] { 1, 2, 3, 11, 22, 32, 44, 6, 9, 6, 5 };
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] % 2 == 0) {
                for (int j = i; j < size; j++) {
                    if (array[j] % 2 != 0) {
                        count += 1;
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                    System.out.println(count);
                }

            }
        }
        System.out.println(Arrays.toString(array));

    }

}