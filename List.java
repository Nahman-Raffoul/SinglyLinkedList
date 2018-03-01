package singlylinkedlist;

public class List {

    Node root;

    List() {
    }

    void print() {
        Node tmp = root;
        if (tmp == null) {
            System.out.println("root of list is empty");
        }
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        System.out.println("");
    }

    void addToEnd(int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node temp = root;
        if (root == null) {
            root = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void delete(int target) {
        Node tmp = root;
        if (tmp.data == target) {
            if (tmp.next != null) {
                root = root.next;
            } else {
                root = null;
            }
        } else {
            while (tmp.next.next != null) {
                if (tmp.next.data == target) {
                    tmp.next = tmp.next.next;
                    return;
                }
                tmp = tmp.next;
            }
            if (tmp.next.data == target) {
                tmp.next = null;
            }
        }
    }

}
