package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(5);
    }
    public static int viralAdvertising(int n) {
        int cumul =0;
        int shared = 5;
        int like = 0;
        for(int i=1;i<=n;i++){

            like = shared/2;
            cumul += like;
            shared = (shared/2)*3;
        }
        return cumul;

    }
}
