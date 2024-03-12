package util;

import java.util.Scanner;

public class Validate {

    private final static Scanner SCANNER = new Scanner(System.in);

  
    public static int getInt(
            String messageInfo,
            String messeageErroroutOfRange,
            String messageErrorInvalidNumber,
            int min, int max
    ) {
        while (true) {
            try {
                System.out.print(messageInfo);
                int number = Integer.parseInt(SCANNER.nextLine().trim());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println(messeageErroroutOfRange);
            } catch (NumberFormatException e) {
                System.out.println(messageErrorInvalidNumber);
            }
        }
    }

  
    public static String getString(
        String messageInfo,
        String messageErrorInvalidString,
        String messageErrorEmptyString,
        String REGEX
    ){
        while(true){
            System.out.println(messageInfo);
            String result = SCANNER.nextLine().trim();
            if(result.matches(REGEX)){
                return result;
            }
            System.out.println(messageErrorInvalidString);
        }
    }
       
}