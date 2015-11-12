package tb2e3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TB2E3 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        ArrayList<Integer> list = new ArrayList();

        Random rand = new Random();
        Set added = new HashSet();
        int treeRange = 10000;
        for (int nodeNum = 1; nodeNum <= 10000; nodeNum++) {
            for (int counter = 0; counter < nodeNum; counter++) {
                int aux = rand.nextInt(nodeNum * treeRange);
                while (!added.add(aux)) {
                    aux = rand.nextInt(nodeNum * treeRange);
                }
                tree.add(aux);
            }
            tree.printLength();
            list.add(nodeNum);
            list.add(tree.discharge());

            tree.cutTree();
            added = new HashSet();
        }
        Writer.writeCSV(list);
    }
}
