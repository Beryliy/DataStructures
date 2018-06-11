package structures;

public class Node<T> {
    public Node(T data){
        this.data = data;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    private Node<T> next;
}
