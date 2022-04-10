package norbert.susztek.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] tomb = { 20, 35, -15, 7, 55, 1, -22 ,20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsorted = tomb.length-1;lastUnsorted>0;lastUnsorted--){
            int largestNumberIndex =0;
            for(int i=1;i<=lastUnsorted;i++){
                if(tomb[i]>tomb[largestNumberIndex]){
                    largestNumberIndex = i;
                }
            }
            int temp = tomb[largestNumberIndex];
            tomb[largestNumberIndex] = tomb[lastUnsorted];
            tomb[lastUnsorted] = temp;
        }

        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
    }
}
