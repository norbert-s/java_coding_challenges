package org.norbertsusztek.recursion;

public class Factorial{
    public static void main (String[]args){


    }
    public int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

}
