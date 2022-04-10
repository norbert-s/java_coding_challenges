import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args){

    }
    public static int permOrNot(int[]tomb){
        if(tomb.length==0) return 0;
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<tomb.length;i++){
            mySet.add(tomb[i]);
        }
        int length = tomb.length;
        for(int i=1;i<=length;i++){
            if(!mySet.contains(i)) return 0;
        }
        return 1;
    }
}
