import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    // Adding elements to the list
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

    // Printing the initial list
    System.out.println("Initial list: " + list);

    // Sorting the list in ascending order
    Collections.sort(list);

    // Printing the sorted list
    System.out.println("Sorted list (ascending): " + list);

    // Sorting the list in descending order
    Collections.sort(list, Collections.reverseOrder());

    // Printing the sorted list
    System.out.println("Sorted list (descending): " + list);

    // Removing the first element
    list.remove(0);

    // Printing the updated list
    System.out.println("Updated list after removing the first element: " + list);

    // Printing the size of the list
    System.out.println("Size of list: " + list.size());

    // Looping through the list
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
  }
}
