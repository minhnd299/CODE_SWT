/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.util.Scanner;


public class Validate {
    private final Scanner SCANNER = new Scanner(System.in);
    private final String REGEX_INTEGER = "\\d+";
   
    public int getInt(
            String messInfo,
            String messageErrorRange,
            String messageInvalidate,
            double min,
            double max
    ) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int number = 0;
        while (flag) {
            System.out.print(messInfo);
            String numberStr = scanner.nextLine().trim();
            if (numberStr.matches(REGEX_INTEGER)) {
                number = Integer.valueOf(numberStr);
                if (number >= min && number <= max) {
                    flag = false;
                } else {
                    System.out.println(messageErrorRange);
                }
            } else {
                System.out.println(messageInvalidate);
            }
        }
        return number;
    }
}