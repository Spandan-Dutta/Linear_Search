to display the first

        public void display() {
            ListNode current= head;
            while(current != null){
                System.out.print(current.data+"->");
                current= current.next;


            }
            System.out.println("null");
        }
        // to count a length of a linked list

        public int length(){
        if (head==null){return 0;} 
        int count =0;
        ListNode current=head;
        while(current !=null) {
            count++;
            current = current.next;
        }
        return count;
