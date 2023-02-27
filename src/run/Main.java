package run;

import logic.CircledList;
import logic.Digit;
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
        CircledList<Digit> list = new CircledList<>((o1, o2)->Integer.compare(o1.getDigit(),o2.getDigit()));

       list.addNodeLast(new Digit(2));
        list.addNodeLast(new Digit(6));
        list.addNodeFirst(new Digit(3));
        list.addNodeLast(new Digit(1));
        list.addNodeLast(new Digit(9));
        list.addNodeFirst(new Digit(5));
        list.addNodeFirst(new Digit(8));

        list.getLinkedList().forEach( d -> System.out.printf( "%d\t",d.getDigit()));

        System.out.println("---" + list.jumpList(list.findNode( new Digit(5)),11).getInfo().getDigit());
    }
}