package Java_on_GIT.Lesson_4;

import java.io.*;
import java.util.*;

public class program {
    static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        name(list);
    }

    public static int name(LinkedList<Integer> list) {
        char operation = charOperation();  // Ввод данных в данном методе
        if (operation == '0') {
            System.out.println("Программа завершена ");
        } else {
            int num_1 = method();
            int num_2 = method();
            int result = Calc(num_1, num_2, operation, list);
        }
        return 0;
    }

    public static int method() {
        System.out.printf("Введите число : "); // метод для ввода чисел
        int num = iScanner.nextInt();
        return num;
    }

    public static char charOperation() {
        System.out.printf("Введите операцию '+,-,*,/' либо 0 для выхода ");
        char operation = iScanner.next().charAt(0);  //метод для ввода операции 
        return operation;
    }

    public static int Calc(int num_1, int num_2, char operation, LinkedList<Integer> list) {
        int res = 0;                   // метод который делает математические операции
        if (operation == '+') {
            res = num_1 + num_2;
            list.add(res);
        }
        if (operation == '-') {
            res = num_1 - num_2;
            list.add(res);
        }
        if (operation == '*') {
            res = num_1 * num_2;
            list.add(res);
        }
        if (operation == '/') {
            boolean flag = true;
            if (num_2 == 0) {
                System.out.print("На 0 делить нельзя");
                flag = false;
            }
            if (flag) {
                res = num_1 / num_2;
                list.add(res);
            }
        }
        System.out.printf("Ответ : %s", res + "\n");   //вывод ответа 
        System.out.println("Для отмены нажмите '0',\nДля продолжения '1' ");
        /*
         * Запрос на дальнейшие действия, если мы ввели '1' 
         * то продолжаем работать с новыми числами.
         * Если ввели '0' то продолжаем работу с полученным результатом 
         */
        char temp = iScanner.next().charAt(0);  
        if (temp == '1') {
            return name(list);
        }
        while (temp == '0') {          
            System.out.printf("Далее работаем с числом %d\n", res);
            System.out.println("Для отмены нажмите '0'\nДля продолжения '1' ");
            temp = iScanner.next().charAt(0);
            if (temp == '1') {
                operation = charOperation();
                if (operation == '0') {
                    System.out.println("Программа завершена ");
                } else {
                    num_1 = list.getLast();
                    num_2 = method();
                    int result = Calc(num_1, num_2, operation, list);
                }
            }
            if (temp == '0') {
                list.removeLast();
                res = list.getLast();
            }
        }
        return name(list);
    }
}