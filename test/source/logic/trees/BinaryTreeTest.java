package logic.trees;

import logic.Dish;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    private BinaryTree<Integer> bts;

    void setup(){
        bts = new BinaryTree<>((o1,o2)->Integer.compare(o1,o2));
        BinaryTree<Dish> btd = new BinaryTree<Dish>((o1,o2)->o1.getCode().compareTo(o2.getCode()));
        /**
         *                  50
         *
         */

        bts.addNode(50);
        bts.addNode(80);
        bts.addNode(30);
        bts.addNode(20);
        bts.addNode(10);
        bts.addNode(99);
        bts.addNode(75);
        bts.addNode(60);
        bts.addNode(40);
        bts.addNode(15);
    }

    @Test
    void listPresort() {
        //50-20-30-10-15-40-80-75-60-99
        setup();
        assertEquals(50,bts.listPresort().get(0));
        assertEquals(40,bts.listPresort().get(5));
    }

    @Test
    void listInsort() {
    }

    @Test
    void findNode() {
    }

    @Test
    void heightNode() {
    }

    @Test
    void heightTree() {
    }

    @Test
    void levelNode() {
    }

    @Test
    void weightTree() {
    }

    @Test
    void findFather() {
    }

    @Test
    void isLeaf() {
    }

    @Test
    void gradeNode() {
    }

    @Test
    void listAmplitudeDown() {
    }

    @Test
    void listAmplitudeTop() {
    }

    @Test
    void deleteNode() {
    }
}