/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Keri Mullens
 */
package oop.example.Ex41;

public class SortNames {
    public static void main(String[] args)
    {

    }

    static void sortNamesFunction(String names[])
    {
        int size = names.length;

        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<names.length; j++) {
                if(names[i].compareTo(names[j])>0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println(names);
    }
        
}


