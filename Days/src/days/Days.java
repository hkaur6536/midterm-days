/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author Harleen Kaur 
 */
enum Day {
    ONE("Monday"),
    TWO("Tuesday"),
    THREE("Wednesday"),
    FOUR("Thursday"),
    FIVE("Friday"),
    SIX("Saturday"),
    SEVEN("Sunday");

    private final String name;

    Day(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Days {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (ONE, TWO, THREE, FOUR, FIVE):");
        String code = in.next().toUpperCase();

        try {
            Day day = Day.valueOf(code);
            System.out.println(day.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day number");
        }
    }
}
