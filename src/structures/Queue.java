package structures;

public class Queue {
    private Node head;
    private Node tail;

    public int getSize() {
        return size;
    }

    private int size;
    public Queue(){
        size = 0;
    }
    public Queue(Node node){
        tail = node;
        head = node;
        size = 1;
    }
    public void enqueue(Node node){
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.setNext(node);
            tail = node;
        }
        size++;
    }
    public Node dequeue(){
        try{
            Node tmp = head;
            head = head.getNext();
            size--;
            return tmp;
        }catch (NullPointerException e){
            System.out.println("Queue is empty");
            return null;
        }
    }
    public boolean isEmpty(){
        return (size == 0);
    }
}
