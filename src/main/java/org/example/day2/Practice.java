package org.example.day2;

import java.util.ArrayList;

public class Practice {
    void printFilteredArray(String firstLetter){
        ArrayList <String> newArr = new ArrayList<>();
        ArrayList <String> existedArr = generateTestCases();
        for (String item: existedArr){
            if (item.startsWith(firstLetter)){
                newArr.add(item);
            }
        }

        for (String arr: newArr){
            System.out.println(arr);
        }
    }

    ArrayList <String> generateTestCases (){
        ArrayList<String> testCases = new ArrayList<>();
        testCases.add("Check");
        testCases.add("Let it stay");
        testCases.add("Leverage");
        testCases.add("Verify");
        testCases.add("What if");

        return testCases;
    }
}
