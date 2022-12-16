//Edanur Mutlu - 02200201030
package tripleminheap;


import java.util.Arrays;
import java.util.Scanner;

public class TripleMinHeap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aralarında virgul olacak sekilde sayilari giriniz: ");
        String input = scanner.nextLine();

        
        String[] parts = input.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        
        boolean isTripleMinHeap = isTripleMinHeap(numbers);
        if (isTripleMinHeap) {
            System.out.println("Evet min heaptir");
            printHeap(numbers);
        } else {
            System.out.println("Değildir");
        }

        
        
    }

    
    public static boolean isTripleMinHeap(int[] heap) {
        int i = 0;

    
    while (i < heap.length) {
        
        int child1 = i * 3 + 1;
        int child2 = i * 3 + 2;
        int child3 = i * 3 + 3;
        if (child1 < heap.length && heap[i] > heap[child1]) {
            return false;
        }
        if (child2 < heap.length && heap[i] > heap[child2]) {
            return false;
        }
        if (child3 < heap.length && heap[i] > heap[child3]) {
            return false;
        }

        
        i++;
    }

    
    return true;
    }

    
    public static void printHeap(int[] heap) {
         int i = heap.length;
    for (int j = 0; j < i; j++) {
        System.out.print(heap[j] + " ");
    }
    System.out.println();
    }
}


