import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(){
        int []tomb ={1,2,2};
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<tomb.length;i++){
            mySet.add(tomb[i]);
        }
    }
    public int solution(int[] tomb) {
        // write your code in Java SE 8
        if(tomb.length==0)return 0;
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<tomb.length;i++){
            mySet.add(tomb[i]);
        }
        return mySet.size();

    }
}
