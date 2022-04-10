package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = {5,4,454,3242,2342123,33,3424,5165,222,555654};
        kivRend(a);
        for(int i:a) {
            System.out.println(i);
        }
        kivRend2(a);
        for(int i:a) {
            System.out.println(i);
        }
//        Map<Integer,String> b = new TreeMap<Integer,String>();
//        b.put(4,"bla");
//        b.put(2,"bika");
//        b.put(13,"gizda");
//
//        for(Object i: b.keySet()){
//            System.out.println(i+" "+b.get(i));
//        }
//
//        Map<Integer,String> d = new HashMap<>();
//        d.put(4,"bla");
//        d.put(1,"tehen");
//        d.put(2,"bika");
//        d.put(13,"gizda");
//
//
//        for(Object i: d.keySet()){
//            System.out.println(i+" "+d.get(i));
//        }

    }
    public static int[] kivRend(int[]a){
        for(int i=0;i<a.length-1;i++){
            int index = i;
            int temp = 0;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public static int[] kivRend2(int[]a){
        for(int i=0;i<a.length-1;i++){
            int index = i;
            int temp = a[i];
            for(int j=i+1;j<a.length;j++){
                if(a[j]<temp){
                    temp = a[j];
                    index = j;
                }
            }
            int temp2 = a[i];
            a[i]= temp;
            a[index] = temp2;
        }
        return a;
    }
}


