package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    static int jumpingOnClouds(int[] c, int k) {
        int e=100;
        for(int i=0;i<c.length;i=i+k){
            if(c[i]==0){
                e=e-1;
            }
            else{
                e=e-3;
            }
        }
        return e;

    }
}
