package pt.pa;

import pt.pa.adts.Position;
import pt.pa.adts.TreeLinked;

/**
 *
 * @author amfs
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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

        System.out.print(myTree);
    }


}
