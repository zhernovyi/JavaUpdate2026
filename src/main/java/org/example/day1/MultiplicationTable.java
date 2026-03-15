package org.example.day1;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
        mt.multTable(3,10);
    }
    public void multTable(int arg1, int arg2){
        for (int i = 1; i <= arg2; i++) {
            int result=arg1*i;
            System.out.println(arg1+" * "+i+" = "+result);
            if (i==5){
                if (result==15){
                    System.out.println("ok");
                }
                else {
                    System.out.println("fail");
                }
            }
        }
    }
}
