package org.example.day3;

public class TestCase {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    private String name;
    private boolean isPassed;

    TestCase(){}

    TestCase(String name, boolean isPassed){
        setName(name);
        setPassed(isPassed);
    }

    public void printStatus(){
        System.out.println(name + " - Is passed: " + isPassed);
    }
}
