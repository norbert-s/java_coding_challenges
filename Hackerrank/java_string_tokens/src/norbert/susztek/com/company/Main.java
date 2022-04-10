package norbert.susztek.com.company;

import java.util.Scanner;

public class Main {

    public static void splitItUp(String str){
        String[] ops = str.split("[ !,?._'@]+/g");
        System.out.println(ops.length);
        for(String i: ops){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
	// write your code here
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        // Write your code here.
//        scan.close();
        splitItUp("He is a very very good boy, isn't he?");

    }
}
