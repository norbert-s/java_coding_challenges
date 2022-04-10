package norbert.susztek.com.company;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length()!=b.length()) return false;
        char  tomb1 [] = makeAnArray(a);
        char  tomb2 [] = makeAnArray(b);
        sorbarendez(tomb1);
        sorbarendez(tomb2);
        display(tomb1);
        display(tomb2);
        return osszehasonlit(tomb1,tomb2);
    }
    public static boolean osszehasonlit(char [] str1,char [] str2){
        for(int i=0;i<str1.length;i++){
            if(str1[i]!=str2[i]) return false;

        }
        return true;
    }
    public static void display(char [] str){
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }

    public static void sorbarendez(char [] str){
        for(int i=0;i<=str.length-1;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[j]<str[i]){
                    char temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
        }
    }

    public static char[] makeAnArray(String str){
        char [] tomb = new char[str.length()];
        for (int i=0;i<str.length();i++){
            tomb[i] = str.charAt(i);
        }
        return tomb;
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}