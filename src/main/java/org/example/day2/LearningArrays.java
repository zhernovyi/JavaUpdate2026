package org.example.day2;
import java.util.ArrayList;

public class LearningArrays {
    void classicArray(){
        String[] browsers = {"Chrome", "Firefox", "Safari"};
        for(String browser: browsers){
            System.out.println(browser);
        }
    }

    void regArrayList(){
        ArrayList<String> testCases = new ArrayList<>();
        testCases.add("Verify first case: start up");
        testCases.add("Verify second case: no errors in the log");
        testCases.add("Verify third case: compare generated data");

        System.out.println(testCases.size());

        testCases.remove(0);
    }

    boolean isEven (int n){
        if (n%2==0){
            return true;
        } else return false;
    }

    void reverseString(String s){
        int strLength = s.length();
        String newStr = "";
        for (int i = strLength; i >= 0; i--) {
            if (i>0){
                newStr += s.substring(i-1,i);
            }
        }
        System.out.println(newStr);
    }

}
