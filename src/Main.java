import com.bridgelabz.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList l = new SinglyLinkedList();
        l.insertAtFirst(56);  //Adding elements to the linked list(added from left) in the sequence 70->30->56
        l.insertAtFirst(30);
        l.insertAtFirst(70);


        l.display();

    }
}