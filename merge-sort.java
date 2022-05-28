   static void merge(int arr[], int bottom, int mid, int top) {

       int n1 = mid - bottom + 1;
       int n2 = top - mid;

       int[] l = new int[n1];
       int[] r = new int[n2];

       for (int i = 0; i < n1; i++) {
           l[i] = arr[bottom + i];
       }
       for (int i = 0; i < n2; i++) {
           r[i] = arr[mid + 1 + i];
       }

       int i = 0;
       int j = 0;
       int k = bottom;
       while (i < n1 && j < n2) {
           if (l[i] <= r[j]) {
               arr[k++] = l[i++];
           } else {
               arr[k++] = r[j++];
           }
       }
       while (i < n1) {
           arr[k++] = l[i++];
       }
       while (j < n2) {
           arr[k++] = r[j++];
       }

   }

   static void mergeSortAux(int[] arr, int bottom, int top) {

       if (bottom < top) { // at least there 2 element 
           int mid = (bottom + top) / 2;

           mergeSortAux(arr, bottom, mid);

           mergeSortAux(arr, mid + 1, top);

           merge(arr, bottom, mid, top);
       }
   }

   static void mergeSort(int[] arr) {

       mergeSortAux(arr, 0, arr.length - 1);
   }

/*

Drawbacks of Merge Sort

Slower comparative to the other sort algorithms for smaller tasks.
Merge sort algorithm requires an additional memory space of 0(n) for the temporary array.
It goes through the whole process even if the array is sorted.

Auxiliary Space: O(n)
Algorithmic Paradigm: Divide and Conquer
Sorting In Place: No in a typical implementation
Stable: Yes

Time complexity of Merge Sort is  θ(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and takes linear time to merge two halves.


Applications of Merge Sort 

Merge Sort is useful for sorting linked lists in O(nLogn) time.

Inversion Count Problem

Used in External Sorting

*/