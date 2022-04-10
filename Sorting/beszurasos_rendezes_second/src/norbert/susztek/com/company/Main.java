package norbert.susztek.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] tomb = { 45,23,1,99,-2,56,45,23,1,99,-2,56};

        for(int firstUnsortedIndex=1;firstUnsortedIndex<tomb.length;firstUnsortedIndex++){
            int newElement = tomb[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0 && tomb[i-1]>newElement;i--){
                tomb[i]=tomb[i-1];
            }
            tomb[i] = newElement;
        }
        for(int i:tomb){
            System.out.println(i);
        }
    }
}
