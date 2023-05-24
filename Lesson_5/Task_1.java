import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Task_1 {
    static Scanner iScanner = new Scanner(System.in);
    static Scanner iscanner = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, String> NumberBook = new HashMap<>(); //создали коллекцию Map
        book(NumberBook);
    }

    public static String book(Map<String, String> NumberBook) {
        System.out.println("Выберите операцию: \n0 - выход\n1 - Добавить контакт\n2 - Вывод всего");
        char operation = iScanner.next().charAt(0);  //выбираем действие 
        if (operation == '0') {
            System.out.println("Программа завершена ");
        }
        if (operation == '1') {
            /*
             * В этом условии проверяется есть ои совпадение по фамилии,
             * если есть то идет добавление нового номера. Не понимаю почему 
             * но работает все только если вводить фамилии на латинице. 
             */          
            System.out.println("Введите фамилию ");
            String names = iscanner.nextLine();
            
            System.out.println("Введите номер ");
            String number = iscanner.nextLine();

            if (NumberBook.containsKey(names)) {
                String temp = NumberBook.get(names);
                NumberBook.put(names, temp + ", " + number);
            } else {
                NumberBook.put(names, number);
            }
            return book(NumberBook);
        }
        if (operation == '2') {
            for (Map.Entry<String, String> item : NumberBook.entrySet()) {
                System.out.printf("[%s: %s]\n", item.getKey(), item.getValue());
            }
        }
        return "Программа завершена ";
    }
}