import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrayshuffle {
    public static void main(String[] args) {
        // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the shuffled list back to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
