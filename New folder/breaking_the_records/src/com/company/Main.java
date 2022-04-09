package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    static int[] breakingRecords(int[] scores) {
        int maxV = scores[0];
        int minV = scores[0];
        int maxC = 0;
        int minC = 0;
        for(int i=1;i<scores.length;i++){

            if(scores[i]>maxV){
                maxV=scores[i];
                maxC++;
            }
            else if(scores[i]<minV){
                minV=scores[i];
                minC++;
            }


        }
        int [] tomb = new int [2];
        tomb[0] = maxC;
        tomb[1] = minC;
        return tomb;

    }
}
