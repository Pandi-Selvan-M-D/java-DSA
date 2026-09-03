class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Linked_list {
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(30);

        // Print using '.'
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);

        //Print using temp
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
