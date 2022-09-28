package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/*
    Program reads input.txt file, iterates over each line and prints
    lines which contain at least one number that is equal to or higher than 10.
 */
public class SpecialTask {
    public static void main(String[] args) throws FileNotFoundException {
        // read input.file
        File file = new File("input.txt");
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] intValue = line.split("[^0-9]"); // split numbers from the given string
            for (int i = 0; i < intValue.length; ++i) {
                if (intValue[i].isEmpty()) {
                    continue;
                } else {
                    if (Integer.parseInt(intValue[i]) >= 10) {
                        System.out.println(line);
                    }
                }
            }
        }
        input.close();
    }
}

