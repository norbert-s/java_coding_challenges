package norbert.susztek.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] tomb = {112,-444,357,-4342,333,33,-55,34,23,65,12,-23,34};

        for(int i=0;i<tomb.length-1;i++){
            int minindex = i;
            for(int j=i+1;j<tomb.length;j++){
                if(tomb[minindex]>tomb[j]){
                    minindex = j;
                }
            }
            int temp = tomb[i];
            tomb[i] = tomb[minindex];
            tomb[minindex] = temp;
        }
        for(int i :tomb){
            System.out.println(i);
        }
    }
}
