package ss10.thuc_hanh.simple_mylinkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(999999999);

        ll.addFirst(123);
        ll.addFirst(992);
        ll.addFirst(13897);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
