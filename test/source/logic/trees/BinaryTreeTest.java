package logic.trees;

import logic.Dish;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    private BinaryTree<Integer> bts;

    void setup(){
        bts = new BinaryTree<>((o1,o2)->Integer.compare(o1,o2));
        //BinaryTree<Dish> btd = new BinaryTree<Dish>((o1,o2)->o1.getCode().compareTo(o2.getCode()));

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
        //50-30-20-10-15-40-80-75-60-99
        setup();
        assertEquals(50,bts.listPresort().get(0));
        assertEquals(40,bts.listPresort().get(5));
        assertEquals(20,bts.listPresort().get(2));
        assertEquals(30,bts.listPresort().get(1));
        assertEquals(80,bts.listPresort().get(6));
        assertEquals(99,bts.listPresort().get(9));
    }

    @Test
    void listInsort() {
        //10-15-20-30-40-50-60-75-80-99
        setup();
        List<Integer> list = bts.listInsort();
        list.forEach(System.out::println);

    }

    @Test
    void listPosort(){
        //15-10-20-40-30-60-75-99-80-50
        setup();
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