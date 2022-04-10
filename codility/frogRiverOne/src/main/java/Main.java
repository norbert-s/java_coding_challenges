import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    int[]tomb={1,3,1,4,2,3,5,4};

    }
    public static int frogRiver(int [] tomb,int  X){
       boolean ableToGetThere = false;
       Set<Integer> mySet = new HashSet<>();
       for(int i=1;i<=X;i++){
           mySet.add(i);
       }
       for(int i=0;i< tomb.length;i++){
           if(mySet.contains(tomb[i])){
               mySet.remove(tomb[i]);
           }
           if(mySet.isEmpty()){
               return i;
           }
       }
        return -1;
    }


}