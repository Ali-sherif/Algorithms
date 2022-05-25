void bubbleSort(int[] arr) {
    int size = arr.length;
    boolean swapped;
    for (int i = 0; i < size; i++) {
        swapped = false;
        for (int j = 0; j < size - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {

                arr[j] += arr[j + 1];
                arr[j + 1] = arr[j] - arr[j + 1];
                arr[j] -= arr[j + 1];

                swapped = true;
            }

        }
        if (!swapped) {
            break;
        }

    }

}



/*
 This algorithm is not suitable for large data sets as its average and worst case time complexity is quite high.
 
 This is the most simplest algorithm and inefficient at the same time.
 
 i-th Pass:
   After the ith pass, the ith largest element will be at the ith last position in the array.

 n-th Pass:
  After the nth pass, the nth largest element(smallest element) will be at nth last position(1st position) in the array   , where ‘n’ is the size of the array.

 It is about four times as slow as insertion sort and twice as slow as selection sort.
 
 It has a good best-case behavior, but is impractically slow on almost all real world data sets and is not considered   for implementation in real applications.

 The built-in ability to detect whether the list is sorted efficiently is the only advantage of bubble sort over other  sorting techniques.
 
When the list is already sorted (which is the best-case scenario), the complexity of bubble sort is only O(n).
It is faster than other in case of sorted array and consumes less time to describe whether the input array is sorted or not.
*/







*/
