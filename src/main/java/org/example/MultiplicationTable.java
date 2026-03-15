package org.example;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
        mt.multTable(3,10);
    }
    public void multTable(int arg1, int arg2){
        for (int i = 1; i <= arg2; i++) {
            System.out.println(arg1+" * "+i+" = "+arg1*i);
        }
    }
}
