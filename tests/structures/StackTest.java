package structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;
    private Node node;

    @BeforeEach
    void setUp(){
        node = new Node(3);
        stack = new Stack(node);
    }
    @Test
    void push() {
        Node node1 = new Node(4);
        stack.push(node1);
        assertEquals(2, stack.getSize());
        assertTrue(node1 == stack.pop());
    }
    @Test
    void pop() {
        assertTrue(node == stack.pop());
        assertEquals(0, stack.getSize());
    }

    @Test
    void isEmpty() {
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}