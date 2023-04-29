package Java_on_GIT.Lesson_4;
//) Пусть дан LinkedList с несколькими элементами. 
//Реализуйте метод(не void), который вернет “перевернутый” список.
import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> linklist = new LinkedList<Integer>();
        linklist.add(2);
        linklist.add(5);
        linklist.add(1);
        linklist.add(3);
        
        System.out.printf("Начальный связный список %s\n", linklist);
        Collections.reverse(linklist);
        System.out.printf("Измененный связный список %s\n", linklist);
    }
}
