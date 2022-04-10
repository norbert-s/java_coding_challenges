package norbert.susztek.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] tomb = { 45,23,1,99,-2,56,45,23,1,99,-2,56};
        for(int j=tomb.length-1;j>0;j--){
            for(int i=0;i<j;i++){
                if(tomb[i]>tomb[i+1]){
                    int temp = tomb[i];
                    tomb[i]= tomb[i+1];
                    tomb[i+1] = temp;
                }
            }
        }
        for(int i:tomb){
            System.out.println(i);
        }
    }
}
