import java.util.*;

class hashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // Duplicate element, will not be added

        // Check if an element exists
        boolean contains = set.contains(2); // Returns true
        System.out.println("Contains 2: " + contains);

        // Get the size of the HashSet
        int size = set.size(); // Returns 3
        System.out.println("Size of the set: " + size);

        // Iterate over elements using iterator
        System.out.println("Elements using iterator:");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Iterate over elements using enhanced for-loop
        System.out.println("Elements using enhanced for-loop:");
        for (Integer num : set) {
            System.out.println(num);
        }

        // Remove an element
        set.remove(2);
        System.out.println("Set after removing 2: " + set);

        // Clear the HashSet
        set.clear();
        System.out.println("Set after clearing: " + set);

        // Add elements to the HashSet again
        set.add(4);
        set.add(5);
        set.add(6);

        // Use addAll to add a collection of elements
        List<Integer> list = Arrays.asList(7, 8, 9);
        set.addAll(list);
        System.out.println("Set after addAll: " + set);

        // Use removeAll to remove a collection of elements
        set.removeAll(Arrays.asList(4, 5));
        System.out.println("Set after 4 and 5 : " + set);

        // Use retainAll to retain a collection of elements
        set.retainAll(Arrays.asList(6, 7));
        System.out.println("Set after retainAll: " + set);

        // Check if the set contains all elements of a collection
        boolean containsAll = set.containsAll(Arrays.asList(6, 7));
        System.out.println("Contains all elements 6 and 7: " + containsAll);

        // Convert the set to an array
        Integer[] array = set.toArray(new Integer[0]);
        System.out.println("Array from set: " + Arrays.toString(array));
    }
}
