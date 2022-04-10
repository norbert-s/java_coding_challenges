package norbert.susztek.com.company;



import java.io.*;
import java.util.*;

public class Main {
    public static String isItAPalindrome(String A){
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!=A.charAt(A.length()-1-i)) return "No";
        }
        return "Yes";
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        System.out.println(isItAPalindrome(A));
    }

}
