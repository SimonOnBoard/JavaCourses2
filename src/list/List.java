package list;

public class List {
    private Node head;
    private Node end;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public void add(int value) {
        Node node = new Node();
        node.setValue(value);
        if (head == null) {
            head = node;
            end = node;
        } else {
            end.setNext(node);
            end = node;
        }
    }

    public boolean delete(int value) {
        //boolean result = false;
        if(head.getValue() == value){
            head = head.getNext();
            return true;
        }else{
            Node previous = head;
            Node current = previous.getNext();
            while (current.getNext() != null){
               if(current.getValue() == value){
                   previous.setNext(current.getNext());
                   current.setNext(null);
                   return true;
               }
            }
            if(current.getValue() == value){
                previous.setNext(null);
                return true;
            }
            return false;
        }
    }

    public void print() {
        Node current = head;
        while(current != null){
            System.out.println(current);
            current = current.getNext();
        }
    }

    public Node search(int value){
        Node current = head;
        while (current != null){
            if(current.getValue() == value){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }
}
