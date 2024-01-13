package org.example;

import java.io.File; import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static <File> void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create initialization (create new file and populate current light state)

        String light1 = "green";
        String light2 = "red";

        // is someone at the red light?

            if (light1 == "green") {
                System.out.println("Is someone at light 2? (Y/N) ");
            } else {
                System.out.println("Is someone at light 1 (Y/N)");
            }

            String userInput = input.nextLine();

        boolean isRedLightOccupied = userInput.equals("Y");

            if (isRedLightOccupied) {
                if (light1 == "green") {
                    light1 = "yellow";
                    System.out.println("Light 1 is now " + light1);
                    System.out.println("Light 2 is now " + light2);

                // add countdown

                light2 = "green";
                light1 = "red";
                System.out.println("Light 1 is now " + light1);
                System.out.println("Light 2 is now " + light2);
                } else {
                    light2 = "yellow";
                    System.out.println("Light 1 is now " + light1);
                    System.out.println("Light 2 is now " + light2);

                        // add countdown

                        light2 = "red";
                        light1 = "green";
                        System.out.println("Light 1 is now " + light1);
                        System.out.println("Light 2 is now " + light2);
                }
            } else {
                System.out.println("Light 1 is now " + light1);
                System.out.println("Light 2 is now " + light2);
            }

        // update light state to accommodate for waiting vehicle

        // is someone at the crosswalk?

    }
}