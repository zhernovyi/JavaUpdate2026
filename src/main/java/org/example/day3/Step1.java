package org.example.day3;

import java.util.ArrayList;

public class Step1 {
    public static void main(String[] args) {
        TestCase tc1 = new TestCase();
        ArrayList<TestCase> testCases = new ArrayList<>();
        tc1.setName("case 1");
        tc1.setPassed(true);
        testCases.add(tc1);

        TestCase tc2 = new TestCase("case 2", true);
        testCases.add(tc2);

        testCases.add(new TestCase("case 3", false));

        for (TestCase item: testCases){
            item.printStatus();
        }
    }
}
