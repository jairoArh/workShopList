package logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LinkedListDouble <T>{
    private Comparator<T> comparator;

    private NodeDouble<T> head;
    private NodeDouble<T> last;

    public LinkedListDouble(Comparator<T> comparator) {
        this.comparator = comparator;
        head = last = null;
    }

    public boolean isEmpty(){
        return head == null && last == null;
    }

    public void addNodeFirst( T info){
        if( isEmpty()){
            head = last = new NodeDouble<>(info);
        }else{
            NodeDouble<T> nodeNew = new NodeDouble<>(info);
            head.setPrevious( nodeNew );
            nodeNew.setNext( head );
            head = nodeNew;
        }
    }

    public void addNodeLast(T info){
        if( isEmpty()){
            head = last = new NodeDouble<>(info);
        }else{
            NodeDouble<T> nodeNew = new NodeDouble<>(info);
            last.setNext( nodeNew );
            nodeNew.setPrevious(last);
            last = nodeNew;
        }
    }

    public void addNodeBeforeTo(NodeDouble<T> node, T info){
        if( node == head ){
            addNodeFirst( info );
        }else{
            
        }
    }

    public List<T> getLinkedList( boolean back ){
        ArrayList<T> out = new ArrayList<>();

        NodeDouble<T> aux = !back ? head : last;
        while(aux != null){
            out.add( aux.getInfo());

            aux = !back ? aux.getNext() : aux.getPrevious();
        }

        return out;
    }
}
