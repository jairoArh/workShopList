package logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CircledList <T>{
    private Node<T> head;

    Comparator<T> comparator;

    public CircledList(Comparator<T> comparator) {
        this.comparator = comparator;
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addNodeFirst( T info ){
        if( isEmpty()){
            head = new Node<>(info);
            head.setNext( head );
        }else{
            Node<T> nodeNew = new Node<>(info);
            nodeNew.setNext( head.getNext());
            head.setNext( nodeNew );
        }
    }

    public List<T> getLinkedList(){
        ArrayList<T> list = new ArrayList<>();

        Node<T> aux = head;

        do{
            list.add( aux.getNext().getInfo());
            aux = aux.getNext();
        }while( aux != head );

        return list;
    }

    public List<T> getLinkedList( Node<T> node){
        ArrayList<T> list = new ArrayList<>();

        Node<T> aux = node;

        do{
            list.add( aux.getInfo());
            aux = aux.getNext();
        }while( aux != node );

        return list;
    }

    public Node<T> findNode( T node ){
        Node<T> aux = head;
        do{
            if( comparator.compare(node,aux.getNext().getInfo())==0){
                return aux.getNext();
            }
            aux = aux.getNext();
        }while( aux != head);

        return null;
    }
}
