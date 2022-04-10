package norbert.susztek.com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";
            List<String> myList = new ArrayList<>();
            for(int i=0;i<s.length()-k+1;i++){
                myList.add(s.substring(i,i+k));
            }
            for(int i=0;i<myList.size()-1;i++){
                for(int j=i+1;j<myList.size();j++){
                    int result = myList.get(j).compareTo(myList.get(i));
                    if(result<0) {
                        String str = myList.get(i);
                        myList.set(i,myList.get(j));
                        myList.set(j,str);
                    }
                }
            }
            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'
            smallest = myList.get(0);
            largest = myList.get(myList.size()-1);
            return smallest + "\n" + largest;
        }




        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
    }