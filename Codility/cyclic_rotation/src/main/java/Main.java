public class Main {
    public static void main(String[]args){
        int [] tomb = {3,5,6,4};
        int K = 6;
        tomb = rotate(tomb,K);
        for(int i=0;i<tomb.length;i++){
            System.out.println(tomb[i]);
        }
    }
    public static int[] rotate(int[]tomb,int K){
        for(int i=0;i<tomb.length;i++){
            System.out.println(tomb[i]);
        }
        int length = tomb.length;
        int [] result = new int [length];
        if(length==0||length==1){
            return tomb;
        }
        else if(length==K){
            return tomb;
        }
        else if(length>K||length<K){
            System.out.println("itt");
            int eredetibenIndex=0;
            int ujbanIndex=K%length;
            while(ujbanIndex<=length-1){
                result[ujbanIndex]=tomb[eredetibenIndex];
                eredetibenIndex++;
                ujbanIndex++;
            }
            int maradek = length-eredetibenIndex;
            if(maradek!=0){
                for(int l=0;l<maradek;l++){
                    result[l]=tomb[eredetibenIndex];
                    eredetibenIndex++;
                }
            }


        }
        return result;
    }

}
