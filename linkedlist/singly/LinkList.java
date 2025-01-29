package linkedlist.singly;

public class LinkList {
    Node head = null;

    // Inner class for Node
    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //insery at begin
    public void InsertAtBeginning(int item) {
        Node newnode = new Node(item);
        newnode.next = head;
        head = newnode;
    }

    // Insert at the last
    public void InsertAtLast(int item) {
        Node newnode = new Node(item);

        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    // Insert at a specific position
    public void InsertAtPosition(int item, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newnode = new Node(item);

        if (position == 0) {
            newnode.next = head;
            head = newnode;
            return;
        }

        Node temp = head;
        int index = 0;

        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    // Print the linked list
    public void printData() {
        Node temp = head;
        if (temp == null) {
            System.out.println("The list is empty.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

        //delete at first

        public void DeleteFirst()
        {
            if(head==null)
            {
                System.out.println("linked list is empty");
            }

            head.next=null;
        }

        //delete at last

        public void DeleteLast()
        {
            if(head==null)
            {
                System.out.println("linked list is empty");

            }

            if(head.next==null)
            {
                head=null;
            }

            Node temp =head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }

        public void DeleteAtPosition(int position)
        {
            if(head==null)
            {
                System.out.println("linked list is empty");

            }

            if(position==0)
            {
                head=head.next;
            }

            Node temp=head;

            for(int i=0; i<position-1 && temp!=null; i++)
            {
                temp=temp.next;
            }

            if(temp == null || temp.next==null)
            {
                System.out.println("linked list is empty");

            }
                temp.next=temp.next.next;
        }
    
}
