package norbert.susztek.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            Node myTree = new Node(10);
            myTree.insert(5);
            myTree.insert(122);
            myTree.insert(87);
            myTree.insert(36);
//            System.out.println(myTree.contains(11));
//            System.out.println(myTree.contains(122));
            myTree.printInOrder();
        }catch(Exception e){
            System.out.println(e.getStackTrace()+" something went very wrong");
        }

    }
}
