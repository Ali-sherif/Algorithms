void insertionSort(int[] arr) {

    int size = arr.length;
    for (int i = 1; i < size; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && key < arr[j]) {
            arr[j + 1] = arr[j--];
        }
        arr[j + 1] = key;
    }
}

/*

What is Insertion sort?
It is a simple sorting algorithm that sorts an array one item at a time.

Why is insertion sort important?
Insertion sort has several advantages including:

The pure simplicity of the algorithm.
The relative order of items with equal keys does not change.
The ability to sort a list as it is being received.
Efficient for small data sets, especially in practice than other quadratic algorithms — i.e. O(n²).
It only requires a constant amount of additional memory space — O(1).
Performance of Insertion Sort
Worst-case performance of insertion sort is O(n²) comparisons and swaps.
Best-case performance is O(n) comparisons and O(1) swaps.
Average-case performance is O(n²) comparisons and swaps.

How does Insertion sort work?
In each iteration, insertion sort compares the current element with the next element and determines whether the current element is greater than the one it was compared to.

If this is true, then it leaves the element in its place and moves on to the next element. If it is false, then it finds its correct position in the sorted array and moves it to that position by shifting all the elements which are larger in the sorted array to one position ahead.


*/