void heapSort(int[] arr) {

    int n = arr.length;

    // build max heap
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }

    // sort heap
    for (int i = n - 1; i >= 0; i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        // Heapify root element
        heapify(arr, i, 0);
    }
}

void heapify(int[] arr, int n, int i) {

    // Find largest among root, left child and right child    
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;

    if (l < n && arr[l] > arr[largest]) {
        largest = l;
    }

    if (r < n && arr[r] > arr[largest]) {
        largest = r;
    }

    // Swap and continue heapifying if root is not largest
    if (largest != i) {
        int temp = arr[largest];
        arr[largest] = arr[i];
        arr[i] = temp;

        heapify(arr, n, largest);
    }
}


/*
check this first : https://www.programiz.com/dsa/heap-sort

Starting from a complete binary tree, we can modify it to become a Max-Heap by running a function called heapify on all the non-leaf elements of the heap becouse leaf nodes are max heap by definition ( n/2 - 1 )
after build max heap, to maintain the max-heap property in a tree where both sub-trees are max-heaps, we need to run heapify on the root element repeatedly until it is larger than its children or it becomes a leaf node.

Heap Sort Complexity
Time Complexity	 
Best	O(nlog n) 
Worst	O(nlog n)
Average	O(nlog n)
Space Complexity	O(1)
Stability	No

with more analysis we can find that algorithm  could working faster in some cases than we think O(n) becouse it is a constant operation


Advantages of Heap Sort

The Heap Sort algorithm exhibits consistent performance. As in the worst case performance, best case performance, average case performance comlexity are the same, O(n log n)
The Heap Sort algorithm is very efficient. It is efficient for sorting a large number of elements. This implies that no other sorting algorithms can perform better in comparison.
Memory usage is minimal. In contrast, the Merge Sort algorithm requires more memory space. Similarly, the Quicksort algorithm requires more stack space due to its recursive nature.

Limitations of Heap Sort

It is not a stable sort.
It requires more processing time. ( becouse it is recursive so push & pop address and data in the stack make overhead )
*/