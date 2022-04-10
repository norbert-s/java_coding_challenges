import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args){

    }
    public static int passingCars(int[]tomb){
        int counter=0;
        for(int i=0;i<tomb.length-1;i++){
            if(tomb[i]==0){
                for(int j=i+1;j<tomb.length;j++){
                    if(tomb[j]==1) counter++;
                }
            }

        }
        if(counter>1000000000) return -1;
        return counter;
    }
    public static int passingCars2(int[]tomb){
        int countOnes=0;
        int result=0;
        for(int i=tomb.length-1;i>=0;i--){
            if(tomb[i]==1){
                countOnes++;
            }else{
                result+=countOnes;
            }

        }
        if(result>1000000000) return -1;
        return result;
    }
}

