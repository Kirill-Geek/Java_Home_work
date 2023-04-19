public class Task_1 {
    public static void main(String[] args) {
        System.out.println(factor(5));
    }

    public static int factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }
}
