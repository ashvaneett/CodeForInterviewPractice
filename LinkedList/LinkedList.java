package LinkedList;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList {

    private static void displayRec(Node head){
        if(head==null){
            return ;
        }
        else{
            System.out.println(head.data);
            displayRec(head.next);
        }
    }

    private static void insertAtEnd(Node head,int data){
        if(head==null){
            head= new Node(data);
        }
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);

    }
    private static Node revOfLinkedList(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }

    private static Node removeDuplicates(Node head){
        Node curr=head;
        while(curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else
            curr=curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(60);
        insertAtEnd(head, 100);
        insertAtEnd(head, 59);
        insertAtEnd(head, 59);
        insertAtEnd(head, 59);
        head=revOfLinkedList(head);
       head= removeDuplicates(head);
        displayRec(head);
    }
    
}
