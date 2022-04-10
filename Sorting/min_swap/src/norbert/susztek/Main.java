package norbert.susztek;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Arrays.toString(getIt(new int[]{6,3,5,1})));
    }

    public static int [] getIt(int [] tomb){
        for(int i=0;i<tomb.length-1;i++){
            int min =tomb[i];
            int minIndex=i;
            int temp = 0;
            for(int j=i+1;j<tomb.length;j++){
                if(tomb[j]<min){
                    min=tomb[j];
                    minIndex=j;
                }
            }
            temp=tomb[i];
            tomb[i]=min;
            tomb[minIndex]=temp;
        }
        return tomb;
    }
}
