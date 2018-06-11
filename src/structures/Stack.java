package structures;

public class Stack {
    private  Node top;

    public int getSize() {
        return size;
    }

    private int size;
    public Stack(){
        size = 0;
    }
    public Stack(Node node){
        top = node;
        size = 1;
    }
    public void push(Node node){
        if(top != null){
            node.setNext(top);
            top = node;
        }else{
            top = node;
        }
        size++;
    }
    public Node pop(){
        try {
            Node tmp = top;
            top = top.getNext();
            size--;
            return tmp;
        }catch(NullPointerException e){
            System.out.println("Stack is empty");
            return null;
        }
    }
    public boolean isEmpty(){
        return(size == 0);
    }
}