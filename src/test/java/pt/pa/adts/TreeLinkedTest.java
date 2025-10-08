package pt.pa.adts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeLinkedTest {

    private Tree<String> myTree;
    private Position<String> root;
    private Position<String> posTune;
    private Position<String> posShark;
    private Position<String> posEagles;
    private Position<String> posBarracuda;
    private Position<String> posDolphin;

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
        posDolphin= myTree.insert(posShark, "Dolphin");
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
        assertEquals(false, myTree.isExternal(posTune));
    }

    @Test
    void isRoot() {
        assertEquals(true, myTree.isRoot(root));
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

    @Test
<<<<<<< Updated upstream
    void testIterableElements() {
        List<String> elements = new ArrayList<>();
        elements.add("Ecosystem");
        elements.add("Anchovy");
        elements.add("Tuna");
        elements.add("Mackerel");
        elements.add("Barracuda");
        elements.add("Sardine");
        elements.add("Shark");
        elements.add("Dolphin");
        elements.add("Eagles");
        elements.add("Snakes");
        elements.add("Rabbits");

        assertEquals(elements, myTree.elements());

    }

=======
    void testDegree(){
        assertEquals(2, myTree.degree(posTune));
    }

    @Test
    void testChildren(){
        List<Position<String>> child = (ArrayList<Position<String>>) myTree.children(posShark);
        assertEquals(posDolphin, child.get(0));
    }
>>>>>>> Stashed changes

}