import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] tomb = {4,3,5,1};
        Arrays.sort(tomb);
        for(Integer i:tomb){
            System.out.println(i);
        }
        for(int i=0;i<tomb.length;i++){
           if(tomb[i]!=i+1) return tomb[i];
        }
//        return i;
    }
    public static int missingElement(int [] tomb){}

}