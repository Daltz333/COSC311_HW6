import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        double initTime = System.nanoTime();

        BinaryHeap<Integer> binaryHeap = new BinaryHeap<>(0);
        binaryHeap.insert(10);
        binaryHeap.insert(12);
        binaryHeap.insert(1);
        binaryHeap.insert(14);
        binaryHeap.insert(6);
        binaryHeap.insert(5);
        binaryHeap.insert(8);
        binaryHeap.insert(15);
        binaryHeap.insert(3);
        binaryHeap.insert(9);
        binaryHeap.insert(7);
        binaryHeap.insert(4);
        binaryHeap.insert(11);
        binaryHeap.insert(13);
        binaryHeap.insert(2);

        double afterTime = System.nanoTime();

        System.out.println("Result of Empty Heap Insert (nano seconds): " + (afterTime - initTime));

        initTime = System.nanoTime();
        BinaryHeap<Integer> binaryHeapBuild = new BinaryHeap<>(new Integer[]{10, 12, 1, 14, 6, 5, 8, 15, 3, 9, 7, 4, 11, 13, 2});
        afterTime = System.nanoTime();

        System.out.println("Result of buildHeap Insert (nano seconds): " + (afterTime - initTime));

        System.out.println("Before deleteMin x1: " + binaryHeap.findMin());
        binaryHeap.deleteMin();
        System.out.println("Before deleteMin x2: " + binaryHeap.findMin());
        binaryHeap.deleteMin();
        System.out.println("Before deleteMin x3: " + binaryHeap.findMin());
        binaryHeap.deleteMin();
    }
}
