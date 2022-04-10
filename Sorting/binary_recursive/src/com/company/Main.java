package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = {29,33,111,21,3424,332,21312,43532,213423,21321,3};
        Arrays.sort(a);
        System.out.println(binaryS(a,29));
        System.out.println(recursiveS(a,33));
    }

    public static int binaryS(int [] a,int value){
        int start = 0;
        int end = a.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]>value){
                end = mid-1;
            }
            else if (a[mid]<value){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static int recursiveS(int []a,int value){
        return recursiveS(a,value,0,a.length-1);
    }

    private static int recursiveS(int[]a,int value,int start,int end){
        if(start>=end){
            return -1;
        }
        int mid = (start+end)/2;
        if(a[mid]>value){
            return recursiveS(a,value,start,mid-1);
        }
        else if (a[mid]<value){
            return recursiveS(a,value,mid+1,end);
        }
        else{
            return mid;
        }
    }

}
