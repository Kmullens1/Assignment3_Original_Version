/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */

package oop.example.Ex41;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) throws Exception {
    /* Points for:
    Pseudo Code
    Code
    Multiple Classes
    UML Class Diagrams
    Test Cases*/


        //Name Sorter
        /*Alphabetizing the contents of a file, or sorting its contents, is a great way
        to get comfortable manipulating a file in your program.

                Create a program that reads in the following list of names:
            Ling, Mai
            Johnson, Jim
            Zarnecki, Sabrina
            Jones, Chris
            Jones, Aaron
            Swift, Geoffrey
            Xiong, Fong

        Read this program and sort the list alphabetically. Then print the sorted list to a
        file that looks like the following example output.
        Example Output
            Total of 7 names
            -----------------
            Ling, Mai
            Johnson, Jim
            Jones, Aaron
            Jones, Chris
            Swift, Geoffrey
            Xiong, Fong
            Zarnecki, Sabrina
        Constraint
            Don't hard-code the number of names.*/

        System.out.println("Total of 7 names\n-----------------");

        //Read from File
        ReadingFromFile accessFile;
        accessFile = new ReadingFromFile();
        String[] names = ReadingFromFile.function();

        //Sort the Names
        SortNames sort;
        sort = new SortNames();
        SortNames.sortNamesFunction(names);

    }
}
