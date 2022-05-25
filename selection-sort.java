void selectionSort(int[] arr) {
    int temp;
    int size = arr.length;
    int minimum;
    for (int i = 0; i < size - 1; i++) {
        minimum = i;
        for (int j = i + 1; j < size; j++) {
            if (arr[j] < arr[minimum]) {
                minimum = j;
            }
        }
        temp = arr[i];
        arr[i] = arr[minimum];
        arr[minimum] = temp;
    }
}

/*

Selection sort is a sorting algorithm that (selects) <<the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list.>>

1-Set the first element as minimum.
2-Compare minimum with the second element. If the second element is smaller than minimum, assign the second element as minimum.
  Compare minimum with the third element. Again, if the third element is smaller, then assign minimum to the third element otherwise do nothing. The process goes on until the last element.

3-After each iteration, minimum is placed in the front of the unsorted list.

4-For each iteration, indexing starts from the first unsorted element. Step 1 to 3 are repeated until all the elements are placed at their correct positions.

Time Complexity	 
Best	O(n2)
Worst	O(n2)
Average	O(n2)
Space Complexity	O(1)
Stability	No

Selection Sort Applications
The selection sort is used when

a small list is to be sorted
cost of swapping does not matter
checking of all the elements is compulsory
cost of writing to a memory matters like in flash memory (number of writes/swaps is O(n) as compared to O(n2) of bubble sort)

*/