//Edanur Mutlu - 02200201030
package huff;
import java.util.*;
public class huffman {
    public static String[] huffman(int[] histo){
        List<Node> tree = new ArrayList<>();
        for (int i = 0; i < histo.length; i++)
            if(histo[i] != 0)
                tree.add(new Node(histo[i], i));

        
        while(tree.size() > 1){
            combine(tree);
        }
        Node root = tree.get(0);
        String[] codage = new String[histo.length];
        root.generateCodes(codage);

        return codage;
    }
    private static void combine(List<Node> list){

        if(list.size() < 2)
            return;

        Collections.sort(list);

        Node smallest = list.remove(0);
        Node secondToSmallest = list.remove(0);

        Node parent = new Node(secondToSmallest, smallest, smallest.getValue()+secondToSmallest.getValue());

        list.add(0, parent);
    }
}