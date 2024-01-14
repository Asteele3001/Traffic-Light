package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        The following is used to make strings that will be color coded. This is done by adding an ANSI code for
        the desired color before the string, then the ANSI reset code after the string (you will notice
        all of the strings end the same way). Storing them in variables just makes the rest of the code cleaner.

        I found all of the ANSI codes here:
        https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
         */
        String red = "\u001B[31m" + "red" + "\u001B[0m";
        String yellow = "\u001B[33m" + "yellow" + "\u001B[0m";
        String green = "\u001B[32m" + "green" + "\u001B[0m";

        /*
        Ask user for current state of the lights. .toUpperCase() will make sure that no matter what case the
        user responds with, it wil evaluate properly.
         */
        System.out.println("Is light 1 green? (Y/N)");
        boolean isLight1Green = input.nextLine().toUpperCase().equals("Y");

        /*
        Declare variables. I tried just declaring them in the following conditional blocks but Java got mad at
        me, not sure why.
        */
        String light1;
        String light2;

        /*
        Set up the states of the lights based on the user input.
         */
        if (isLight1Green) {
            light1 = green;
            light2 = red;
        } else {
            light1 = red;
            light2 = green;
        }

        /*
        Print current state of lights.
         */
        System.out.println("Light 1 is " + light1);
        System.out.println("Light 2 is " + light2);

        /*
        Ask if someone is at the light that is currently red. The conditional block will make sure the
        question references the correct light.
         */
        if (light1 == green) {
            System.out.println("Is there a vehicle at light 2? (Y/N)");
        } else {
            System.out.println("Is there a vehicle at light 1 (Y/N)");
        }
        boolean isRedLightOccupied = input.nextLine().toUpperCase().equals("Y");

        /*
        Create code to cycle lights.
         */
        if (isRedLightOccupied) {
            if (light1 == green) {
                //set light1 to yellow, output current light state.
                light1 = yellow;
                System.out.println("Light 1 is " + light1);
                System.out.println("Light 2 is " + light2);
                System.out.println("-----------------");

                /*
                This code block starting at "try" and ending at the next comment tells the code to pause for
                3000 milliseconds. The line "Thread.sleep(3000);" is doing all the work, the rest is there for
                ?? reasons, but is assuredly necessary.
                 */
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                //End of pause.

                //Update lights to final state after waiting on yellow.
                light1 = red;
                light2 = green;
            } else {
                /*
                Everything in this else block is the same as the if block, just with the light variables
                switched.
                */
                light2 = yellow;
                System.out.println("Light 1 is " + light1);
                System.out.println("Light 2 is " + light2);
                System.out.println("-----------------");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                light2 = red;
                light1 = green;

            }
        }
        /*
        Output final state of lights.
         */
        System.out.println("Light 1 is " + light1);
        System.out.println("Light 2 is " + light2);
    }
    }