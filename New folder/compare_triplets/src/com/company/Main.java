package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> result = compareTriplets(a, b);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
        List<Integer> a = new LinkedList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = new LinkedList<Integer>();
        b.add(1);
        b.add(3);
        b.add(2);
        compareTriplets(a,b);

    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> vissza = new LinkedList<>();
        int alice = 0;
        int bob = 0;
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i)){
                alice++;
            }
            else if (b.get(i)>a.get(i)){
                bob++;
            }
        }
        vissza.add(alice);
        vissza.add(bob);

        return vissza;
    }
}
