package pt.pa.adts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeLinkedTest {

    @BeforeEach
    void setup(){
        TreeLinked<String> myTree = new TreeLinked<>("Ecosystem");
        Position<String> root = myTree.root();
        myTree.insert(root, "Anchovy");
        Position<String> posTune = myTree.insert(root, "Tuna");
        Position<String> posShark = myTree.insert(root, "Shark");
        Position<String> posEagles = myTree.insert(root, "Eagles");
        myTree.insert(posTune, "Mackerel");
        Position<String> posBarracuda = myTree.insert(posTune, "Barracuda");
        myTree.insert(posShark, "Dolphin");
        myTree.insert(posEagles, "Snakes");
        myTree.insert(posEagles, "Rabbits");
        myTree.insert(posBarracuda, "Sardine");
    }



    @Test
    void size(){

    }

    @Test
    void isEmpty() {
    }

    @Test
    void isExternal() {
    }

    @Test
    void isRoot() {
    }
}