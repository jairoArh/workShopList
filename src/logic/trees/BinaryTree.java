package logic.trees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BinaryTree <T>{
    private Comparator<T> comparator;
    private TreeNode<T> root;
    int aux;

    private List<T> list;

    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void addNode( T info ){
        if( isEmpty() ){
            root = new TreeNode<>(info);
        }else{
            TreeNode<T> nodeNew = new TreeNode<>(info);
            TreeNode<T> act = root;
            TreeNode<T> ant = null;
            while( act != null ){
                ant = act;
                act = comparator.compare(info,act.getInfo()) < 0 ? act.getLeft() : act.getRight();
            }
            if( comparator.compare(info,ant.getInfo())<0){
                ant.setLeft( nodeNew );
            }else{
                ant.setRight( nodeNew );
            }
        }
    }

    public List<T> listPresort(){
        list = new ArrayList<>();
        presort( root );
        return list;
    }

    private void presort(TreeNode<T> node) {
        if( node != null ){
            list.add( node.getInfo()); //Procesar Nodo
            presort( node.getLeft());
            presort( node.getRight());
        }
    }

    public List<T> listInsort(){
        list = new ArrayList<>();
        insort( root );
        return list;
    }

    private void insort(TreeNode<T> node){
        if( node != null ){
            insort( node.getLeft());
            list.add( node.getInfo()); //Procesar Nodo
            insort( node.getRight());
        }

    }

    private List<T> listPosort(){
        return null;
    }

    private void posort(){

    }

    public TreeNode<T> findNode( T info){
        return null;
    }

    public int heightNode(TreeNode<T> node){
        return 0;
    }

    public int heightTree(){
        return 0;
    }

    public int levelNode(TreeNode<T> node){
        return 0;
    }

    public int weightTree(){
        return 0;
    }

    private int weight(TreeNode<T> node){
        return 0;
    }

    public TreeNode<T> findFather( TreeNode<T> node){
        return null;
    }

    public boolean isLeaf(TreeNode<T> node){
        return false;
    }

    public int gradeNode(TreeNode<T> node){
        return 0;
    }

    public List<T> listAmplitudeDown(){
        return null;
    }

    public List<T> listAmplitudeTop(){
        return null;
    }

    public T deleteNode(TreeNode<T> node){
        return null;
    }

    private T deleteLeaf(TreeNode<T> node){
        return null;
    }

    private T deleteWithSon(TreeNode<T> node){
        return null;
    }

    private T deleteWithSons(TreeNode<T> node){
        return null;
    }
}
