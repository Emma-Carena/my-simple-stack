package deqo.emau.mysimplestack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.Assert.*;

public class SimpleStackTest {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackClass();
        System.out.println("Je suis exécuté avant chaque test");
    }

    @Test
    public void testCreateEmptyStack() {
        simpleStack = new SimpleStackClass();
        assertTrue("A new stack should be empty", simpleStack.isEmpty());
        assertEquals("A new stack has no element", 0, simpleStack.getSize());
    }

    @Test
    public void testPush() throws EmptyStackException {
        SimpleStack simpleStack = new SimpleStackClass();
        Item item = new Item("toto");
        simpleStack.push(item);
        assertFalse("The stack must not be empty", simpleStack.isEmpty());
        assertEquals("Pushed item should be on top of the stack", item, simpleStack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack() {
        SimpleStack simpleStack = new SimpleStackClass();
        simpleStack.pop();
    }
}