package webinar1.myLinkedList;

public class MyLinkedList {
    private int size;
    private Node head;

    public MyLinkedList() {
        this.size = 0;
    }

    public void add(int valueToAdd, int index){
        Node newNode = new Node(valueToAdd);
        if(index < 0 || index > size ){
            throw new IndexOutOfBoundsException("Index: " + index + " is either too low or to big for that list");
        }
        Node tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.getNext();
        }
        Node pre = tmp;
        Node after = tmp.getNext();
        newNode.setNext(after);
        pre.setNext(newNode);

    }


    public void add(int valueToAdd) {
        Node newNode = new Node(valueToAdd);

        if (isEmpty()) {
            this.head = newNode;
        } else {
            Node tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
        size++;
    }


    public int get(int index){
        if(index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException("Index: " + index + " is either too low or to big for that list");
        }
        Node tmp = head;
        for (int i = 0; i < index ; i++) {
            tmp = tmp.getNext();
        }
        return tmp.getValue();
    }


    private boolean isEmpty() {
        if (size >= 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyLinkedList{");

        if (head != null) {
            sb.append(head.getValue());

            Node tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
                sb.append(", " + tmp.getValue());
            }
        }
        sb.append("}");
        return sb.toString();
    }


}
