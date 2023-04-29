package Java_on_GIT.Lesson_2;

import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class Task_1 {
    public static void main(String[] args) {
        // Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
        // результат после каждой итерации запишите в лог-файл.
        BubbleSort();
    }

    static void BubbleSort() {
        try (FileWriter file = new FileWriter("file.txt", false)) {

            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите длину массива : ");
            int size = iScanner.nextInt();
            int Array[] = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.printf("Введите элемент массива : ");
                Array[i] = iScanner.nextInt();
            }
            System.out.println(Arrays.toString(Array));  //ВЫводим получившийся массив

            for (int current = 0; current < size - 1; current++) { //сортируем массив
                for (int j = 0; j < size - 1; j++) {
                    if (Array[j] > Array[j + 1]) {
                        int temp = Array[j];
                        Array[j] = Array[j + 1];
                        Array[j + 1] = temp;
                    }
                    file.write(Arrays.toString(Array));  //добавляем наши итерации в текстовый файл
                    file.append('\n');
                }
            }
            System.out.println(Arrays.toString(Array));
        } catch (IOException ex) {                          
            System.out.println(ex.getMessage());
        }
    }

}