package linkedlist.singly;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of LinkList
        LinkList linklist = new LinkList();

        // Insert elements into the linked list
        System.out.println("Inserting elements into the linked list...");
        linklist.InsertAtBeginning(10); 
        linklist.InsertAtLast(20);     
        linklist.InsertAtPosition(15, 1); 

        // Print the current state of the linked list
        System.out.println("The linked list is:");
        linklist.printData();

        // Testing an empty list
        LinkList emptyList = new LinkList();
        System.out.println("Empty list:");
        emptyList.printData();
    }
}
