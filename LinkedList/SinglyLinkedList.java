public class SinglyLinkedList{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
            
        }
    }
    public void display(){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.print("null");
    }
    
    public void insertFirst(int value){
        ListNode newNode= new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
        }
        ListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
            
        }
        curr.next = newNode;
    }
    
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(11);
        sll.insertFirst(10);
        sll.insertFirst(9);
        sll.insertLast(1);
        sll.insertLast(4);
        sll.display();
    }
}
