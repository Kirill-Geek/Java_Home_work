public class Task_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.printf("%d, ", i);
            }
        }
    }
}
