package norbert.susztek.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] tomb = { 45,23,1,99,-2,56};
        int lastSortedIndex=0;
        for(int i=lastSortedIndex;i<tomb.length-2;i++){
            for(int j=lastSortedIndex+1;j<tomb.length-1;j++){
                int vizsgalt_elem_index = j;
                int vizsgalt_elem = tomb[j];
                while(vizsgalt_elem <tomb[vizsgalt_elem_index-1] && vizsgalt_elem_index>=2){

                    tomb[vizsgalt_elem_index] = tomb[vizsgalt_elem_index-1];


                   vizsgalt_elem_index--;
                }
                tomb[vizsgalt_elem_index] = vizsgalt_elem;

            }
        }
        for(int i: tomb){
            System.out.println(i);
        }
    }
}
