import java.util.Arrays;

class Task_3 {
    // Функция для проверки, угрожают ли два ферзя друг другу или нет
    static boolean isSafe(String[][] mat, int r, int c) {
        // возвращаем false, если два ферзя делят один и тот же столбец
        for (int i = 0; i < r; i++) {
            if (mat[i][c] == "Q") {
                return false;
            }
        }

        // вернуть false, если два ферзя делят одну и ту же диагональ
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == "Q") {
                return false;
            }
        }

        // вернуть false, если два ферзя делят одну и ту же диагональ
        for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++) {
            if (mat[i][j] == "Q") {
                return false;
            }
        }

        return true;
    }

    static void print(String[][] mat) {
        // вывод "доски" при расстановке ферзей по местам.
        for (String[] el : mat) {
            System.out.println(Arrays.toString(el).replaceAll(","," "));
        }
        System.out.println();
    }

    static void Queen(String[][] mat, int r) {
        // если все ферзи размещены то выводим их позиции.
        if (r == mat.length) {
            print(mat);
            return;
        }
        // помещаем ферзя на каждую клетку в текущем ряду `r`
        // и повторяться для каждого допустимого движения
        for (int i = 0; i < mat.length; i++) {
            // если никакие два ферзя не угрожают друг другу
            if (isSafe(mat, r, i)) {
                // ставим ферзя на текущую клетку
                mat[r][i] = "Q";

                // повторить для следующей строки
                Queen(mat, r + 1);

                // возвращаемся назад и удаляем ферзя с текущей клетки
                mat[r][i] = "+";
            }
        }

    }

    public static void main(String[] args) {
        int N = 8;
        // Создали "шахматную доску"
        String[][] mat = new String[N][N];

        // инициализируем доску с помощью "+"
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = "+";
            }
        }
        Queen(mat, 0);
    }
}
