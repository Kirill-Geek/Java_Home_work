
package Java_on_GIT.Lesson_2;

import java.io.*;
public class Task_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader file = new BufferedReader(new FileReader("File_2.txt"));
        String str;
        while ((str = file.readLine()) != null) {
            char[] Str = new char[str.length()];
            String name = "";
            char grade = 'z';
            String object = "";
            int srcBegin = 0;
            int scrEnd = str.length();
            int dstBegin = 0;
            str.getChars(srcBegin, scrEnd, Str, dstBegin); // получаем массив символов
            for (int i = 0; i < Str.length; i++) {
                if (Str[i] == 'я') {
                    while (Str[i + 4] != '"') { // скрепляем имя студента
                        name += Str[i + 4];
                        i++;
                    }
                    while (Str[i] != ':') { // получаем его оценку
                        grade = Str[i + 3];
                        i++;
                    }
                    while (i < Str.length) { // получам предмет обучения
                        if (Str[i] == 'т') {
                            i += 4;
                            while (i < Str.length - 1) {
                                object += Str[i];
                                i++;
                            }
                        }
                        i++;
                    }
                }
            }
            System.out.printf("Студент " + name + " получил " + grade + " по предмету " + object + "\n");
        }
        file.close();
    }
}
