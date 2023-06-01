import java.util.*;
import java.io.*;

public class Task_3 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = "*";
            }
        }
        array[0][0] = "0";
        fill(array,0,0);

        print(array);
    }

    public static void fill(String[][] array, int i, int j) {
        for ( i = 0; i < array.length; i++) {
            for ( j = 0; j < array.length; j++) {
                if (array[i][j] == "0" ) {
                    for (int l = 0; l < array.length; l++) {
                        if (array[j][l] != "0") {
                            array[j][l] = "+";
                        }
                    }
                    for (int hd = 0; hd < array.length; hd++) {
                        if (array[j][hd] != "0") {
                            if (hd + i < 8) {
                                array[i + hd][hd + j] = "+";
                            }
                        }
                    }
                    for (int hu = 0; hu < array.length; hu++) {
                        if (i != 0) {
                            if (array[i][hu] != "0") {
                                if (i - hu > 0) {
                                    array[i - hu][i - hu] = "+";
                                }
                            }
                        }
                        else {
                            continue;
                        }
                     
                    }
                }
                
                    
                
            }
        }
    }

    public static void print(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

}