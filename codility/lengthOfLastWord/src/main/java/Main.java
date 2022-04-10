public class Main {
    public static void main(String[]args){
        String s = "asd klme   labda  ";
        lengthOfLastWord(s);
    }
    public static int lengthOfLastWord(String s){
        String [] tomb = s.split("\\s+");
        for(int i=0;i<tomb.length;i++){
            System.out.println(tomb[i]);
        }
        String myString= tomb[tomb.length-1];
        return myString.length();
    }
}
