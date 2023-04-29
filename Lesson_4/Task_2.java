package Java_on_GIT.Lesson_4;

import java.util.Scanner;
import java.util.*;
/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue()-помещает элемент в конец очереди,
dequeue()-возвращает первый элемент из очереди и удаляет его,
first()-возвращает первый элемент из очереди,не удаляя.
*/
public class Task_2 {
 
    public static void main(String[] args) {
        LinkedList<Integer> linklist = new LinkedList<Integer>();
        linklist.add(1);
        linklist.add(4);
        linklist.add(5);
        linklist.add(3);
        linklist.add(7);
        System.out.println(linklist);
        enqueue(linklist);
        dequeue(linklist);
        first(linklist);
    }

    public static void enqueue(LinkedList<Integer> linklist) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число : ");
        int num = iScanner.nextInt();
        linklist.add(num);
        System.out.printf("Изминения : добавлено число - %s",num + " в список \n" + linklist +"\n");
    }

    public static void dequeue(LinkedList<Integer> linklist) {
        System.out.printf("Удалён первы эллемент списка : \n %s \n", linklist.removeFirst(), "\n");
        System.out.println(linklist);
    }
    public static void first(LinkedList<Integer> linklist) {
        System.out.printf("Возвращение первого элемента списка : \n%s \n", linklist.getFirst(), "\n");
        System.out.println(linklist);
    }
}
