package tb2e3;

import java.util.*;

public class BinaryTree {

    private static class Node {

        public int item;
        public Node father = null;
        public Node left = null;
        public Node right = null;

        public Node(int element) {
            item = element;
            father = null;
            left = null;
            right = null;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setLeft(Node n) {
            left = n;
        }

        public void setRight(Node n) {
            right = n;
        }

        public Node getFather() {
            return father;
        }

        public void setFather(Node n) {
            father = n;
        }

        public int getItem() {
            return item;
        }

        public void setItem(int element) {
            item = element;
        }
    }
    
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public void setRoot(int element) {
        
        if (isEmpty()) {
            root = new Node(element);
        } else {
            root.setItem(element);
        }
    }

    public int count() {
        return count(root);
    }

    private int count(Node n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + count(n.getLeft()) + count(n.getRight());
        }
    }

    public void add(int element) {
        root = add(root, element, null);
    }

    private Node add(Node n, int element, Node father) {
        if (n == null) {
            Node aux = new Node(element);
            aux.setFather(father);
            return aux;
        }
        if (n.getItem() < element) {
            n.setRight(add(n.getRight(), element, n));
        } else {
            n.setLeft(add(n.getLeft(), element, n));
        }
        return n;
    }

    public ArrayList<Integer> printLength() {
        ArrayList<Integer> list = new ArrayList();
        
        ArrayList<Node> ns = new ArrayList();
        ns.add(root);
        Contador.adicionaCont(2);
        while (ns.size() > 0) {
            Node aux = ns.remove(0);
            list.add(aux.item);
            if (aux.left != null) {
                ns.add(aux.left);
                Contador.adicionaCont(2);
            }
            if (aux.right != null) {
                ns.add(aux.right);
                Contador.adicionaCont(2);
            }
            Contador.adicionaCont(10);
        }
        Contador.adicionaCont(2);
        return list;
    }
    
    public int discharge(){
        return Contador.dischargeCounter();
    }
    
    public void cutTree(){
        root = null;
    }
}