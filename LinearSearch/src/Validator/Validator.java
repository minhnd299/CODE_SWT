
package Validator;

import java.util.Scanner;

public class Validator {
    static Scanner sc = new Scanner(System.in);
    
  
    public static int getInt(
            String messInfo, String messErrorRange,
            String messErrorInvalidate, int min, int max
    ) {
        do {
            try {
                System.out.print(messInfo);
                int number = Integer.parseInt(sc.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println(messErrorRange);
            } catch (NumberFormatException e) {
                System.out.println(messErrorInvalidate);
            }

        } while (true);
    }

   
}