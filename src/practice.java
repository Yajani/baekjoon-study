package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String Line1 = sc.nextLine();
        char[][] word = new char[5][];

        for (int i = 0; i < 5; i++) {
            String Line1 = sc.nextLine();
            for (int j = 0; j < Line1.length(); j++) word[i][j] = Line1.charAt(j);
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < word.length; j++) {
                if (Objects.equals(word[j][i], "")) {
                    continue;
                } else {
                    System.out.println(word[j][i]);
                }
            }
        }


    }
}
