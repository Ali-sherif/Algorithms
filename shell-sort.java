static void shellSort(int[] arr) {
    
    int n = arr.length;
    for (int gap = n / 2; gap >= 1; gap /= 2) {
        for (int j = gap; j < n; j++) {
            for (int i = j - gap; i >= 0; i = i - gap) { 
                if (arr[i + gap] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                }
            }
        }
    }
}


/*
i use >= not > becouse i want to swap last element of i with element 0 if it small than them

Shell sort is a generalized version of the insertion sort algorithm. It first sorts elements that are far apart from each other and successively reduces the interval between the elements to be sorted.

The interval between the elements is reduced based on the sequence used and this using Shell's original sequence: N/2 , N/4 , …, 1

Note: The performance of the shell sort depends on the type of sequence used for a given input array.

Shell Sort Complexity
Time Complexity	 
Best	O(nlog n)
Worst	O(n2)
Average	O(nlog n)
Space Complexity	O(1)
Stability	No

Shell Sort Applications
Shell sort is used when:

calling a stack is overhead. uClibc library uses this sort.
recursion exceeds a limit. bzip2 compressor uses it.
Insertion sort does not perform well when the close elements are far apart. Shell sort helps in reducing the distance between the close elements. Thus, there will be less number of swappings to be performed.

Shellsort can also serve as a sub-algorithm of introspective sort, to sort short subarrays and to prevent a slowdown when the recursion depth exceeds a given limit. This principle is employed, for instance, in the bzip2 compressor.

Shell sort algorithm is only efficient for finite number of elements in an array.
Shell sort algorithm is 5.32 x faster than bubble sort algorithm.

Shell sort algorithm is complex in structure and bit more difficult to understand.
Shell sort algorithm is significantly slower than the merge sort, quick sort and heap sort algorithms.

*/