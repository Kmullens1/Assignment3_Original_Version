/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */
package oop.example.Ex41;
import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
    static String[] function() throws Exception    //main(String[] args) throws Exception
    {
        // pass the path to the file as a parameter

        FileReader fr =
                new FileReader("C:\\Users\\dutch\\Desktop\\OOP\\Intellij Projects\\Motivated Practice Problems\\Exercises_41-46\\src\\main\\java\\oop\\example\\Ex41\\Names List");

        String names[];
        names = new String[7];

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 7; i++)
        {
            names[i] = input.nextLine();
        }

    return names;
    }


    public void main() throws Exception {
        function();
    }
}
