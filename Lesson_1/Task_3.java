import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число : ");
        int num_1 = iScanner.nextInt();

        System.out.printf("Введите операцию ");
        char operation = iScanner.next().charAt(0);

        System.out.printf("Введите второе число ");
        int num_2 = iScanner.nextInt();
        if (operation == '+') {
            System.out.print(num_1 + num_2);
        }
        if (operation == '-') {
            System.out.print(num_1 - num_2);
        }
        if (operation == '*') {
            System.out.print(num_1 * num_2);
        }
        if (operation == '/') {
            boolean flag = true;
            if (num_2 == 0) {
                System.out.print("На 0 делить нельзя");
                flag = false;
            }
            if (flag) {
                System.out.print(num_1 / num_2);
            }

        }
        iScanner.close();
    }
}
