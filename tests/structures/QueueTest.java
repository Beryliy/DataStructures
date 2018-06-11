package structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private Queue queue;
    private Node node;

    @BeforeEach
    void setUp(){
        node = new Node(4);
        queue = new Queue(node);
    }
    @Test
    void enqueue() {
        Node node1 = new Node(3);
        queue.enqueue(node1);
        assertEquals(2, queue.getSize());
        assertEquals(node.getNext(), node1);
    }

    @Test
    void dequeue() {
        assertEquals(queue.dequeue(), node);
        assertEquals(0, queue.getSize());
        assertEquals(queue.dequeue(), null);
    }

    @Test
    void isEmpty() {
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}