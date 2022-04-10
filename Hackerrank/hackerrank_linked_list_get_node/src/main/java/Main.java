public class Main {

    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        // Write your code here
        SinglyLinkedListNode ptr_base = llist;
        int counter = -1;
        while (ptr_base != null) {
            ptr_base = ptr_base.next;
            counter++;
        }
        int counterMatcher = 0;
        SinglyLinkedListNode ptr = llist;
        while (counterMatcher < counter - positionFromTail) {
            ptr = ptr.next;
            counterMatcher++;
        }
        return ptr.data;
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode ptr = head;
        SinglyLinkedListNode myNode = new SinglyLinkedListNode(data);
        if (head == null) {
            head = myNode;
            return head;
        } else {
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = myNode;
        }
        return head;
    }
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode ptr = llist;
        SinglyLinkedListNode myNode = new SinglyLinkedListNode(data);
        if(ptr==null){
            ptr=myNode;
            return ptr;
        }
        else{
            myNode.next = ptr;
            ptr = myNode;
            return ptr;
        }
    }
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here

        SinglyLinkedListNode current = llist;
        int counter = 0;
        if(position==0){
            current=current.next;
            return current;
        }
        else{
            while(counter<position-1){
                current=current.next;
                counter++;
            }
            SinglyLinkedListNode temp = current.next.next;
            current.next = null;
            current.next=temp;
            if(current==null) return null;
            else return llist;
        }
    }
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        // Write your code here

        // Write your code here
        SinglyLinkedListNode temp = llist;

        while(temp.next!=null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
        }
        return llist;

    }
    public boolean isPalindrome(ListNode head) {
        ListNode current = head;
        ArrayList<Integer> myList = new ArrayList<>();
        if(current==null){
            return false;
        }else{
            while(current!=null){
                myList.add(current.val);
                current=current.next;
            }
        }
        int listSize = myList.size();

        for(int i=0;i<listSize;i++){
            if(myList.get(i).compareTo(myList.get(listSize-1-i))==0){

            }else{
                return false;
            }

        }
        return false;
    }

}