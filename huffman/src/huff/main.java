//Edanur Mutlu - 02200201030
package huff;
import static huff.huffman.huffman;
public class main {
    public static void main(String[] args) {
        int[] histo = new int[]{8, 65, 124, 55, 2, 1, 0, 1};
        System.out.println("Codage de Huffman:");
        String[] huffman = huffman(histo);
        for (int i = 0; i < huffman.length; i++) {
            if (histo[i] > 0) {
                System.out.println(i + "] " + huffman[i]);
    }
}
    }   
}