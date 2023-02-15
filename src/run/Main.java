package run;

import logic.CircledList;
import logic.StackNode;

import java.util.Scanner;

public class Main {

    String process( String line ){


        return line;
    }
    public static void main(String[] args) {
        /*StackNode<Character> st = new StackNode<>( (o1,o2)->Character.compare(o1,o2));
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        Main main = new Main();
        while(input.hasNext()){

            System.out.println(main.process( input.nextLine()));
        }*/

        new Main().listCircled();
    }

    private void listCircled() {
        CircledList<Character> list = new CircledList<>((o1,o2)->Character.compare(o1,o2));
        list.addNodeFirst('J');
        list.addNodeFirst('A');
        list.addNodeFirst('I');
        list.addNodeFirst('R');
        list.addNodeFirst('O');

        System.out.println( list.findNode('J').getInfo());
        System.out.println( list.findNode('A').getInfo());
        System.out.println( list.findNode('I').getInfo());
        System.out.println( list.findNode('R').getInfo());
        System.out.println( list.findNode('O').getInfo());


        System.out.println(list.getLinkedList());
        System.out.println(list.getLinkedList( list.findNode('J')));
    }
}