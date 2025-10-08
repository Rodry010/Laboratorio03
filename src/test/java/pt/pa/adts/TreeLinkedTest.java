package pt.pa.adts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeLinkedTest {

    private TreeLinked<String> myTree;
    private Position<String> root;
    private Position<String> posTune;
    private Position<String> posShark;
    private Position<String> posEagles;
    private Position<String> posBarracuda;

    @BeforeEach
    void setup() {
        myTree = new TreeLinked<>("Ecosystem");
        root = myTree.root();
        myTree.insert(root, "Anchovy");
        posTune = myTree.insert(root, "Tuna");
        posShark = myTree.insert(root, "Shark");
        posEagles = myTree.insert(root, "Eagles");
        myTree.insert(posTune, "Mackerel");
        posBarracuda = myTree.insert(posTune, "Barracuda");
        myTree.insert(posShark, "Dolphin");
        myTree.insert(posEagles, "Snakes");
        myTree.insert(posEagles, "Rabbits");
        myTree.insert(posBarracuda, "Sardine");
    }

    @Test
    void size(){
        assertEquals(11, myTree.size());
    }

    @Test
    void isEmpty() {
        assertEquals(false, myTree.isEmpty());
    }

    @Test
    void isExternal() {
    }

    @Test
    void isRoot() {
    }

    @Test
    void testInsertShouldReturnCorrectPosition() {
        assertEquals("Barracuda", posBarracuda.element());
    }

    @Test
    void testRemoveShouldReturnCorrectPosition() {
        String removed = myTree.remove(posBarracuda);
        assertEquals("Barracuda", removed);
    }

    @Test
    void testInsertThrowsInvalidPositionException() {
        assertThrows(InvalidPositionException.class, () -> {
            myTree.insert(null, "Invalid");
        });
    }
}