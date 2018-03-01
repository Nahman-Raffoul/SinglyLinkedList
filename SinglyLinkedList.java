package singlylinkedlist;

public class SinglyLinkedList {

    public static void main(String[] args) {
        List list = new List();
        for (int i = 1; i <= 5; i++) {
            list.addToEnd(i);
        }
        list.print();
        list.addToEnd(1);
        list.delete(1);
        list.print();

    }

}
