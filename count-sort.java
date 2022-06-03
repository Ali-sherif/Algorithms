void countSort(int[] arr) {

        int size = arr.length;
        int[] output = new int[size];

        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < size; i++) {
            arr[i] = output[i];
        }
}

/*

Points to be noted: 

1- Counting sort is efficient if the range of input data is not significantly greater than the number of objects to be sorted. Consider the situation where the input sequence is between range 1 to 10K and the data is 10, 5, 10K, 5K. 
2- It is not a comparison-based sorting. Its running time complexity is O(n) with space proportional to the range of data. 
3- Counting sort is able to achieve this because we are making assumptions about the data we are sorting.
4- It is often used as a sub-routine to another sorting algorithm like radix sort. 
5- Counting sort uses partial hashing to count the occurrence of the data object in O(1).
6- Counting sort can be extended to work for negative inputs also.
7- Counting sort is not a stable algorithm. But it can be made stable with some code changes.


Time Complexity: O(n+k) where n is the number of elements in the input array and k is the range of input. 
Auxiliary Space: O(n+k)
Overall complexity = O(max)+O(size)+O(max)+O(size) = O(max+size)

Worst Case Complexity: O(n+k)
Best Case Complexity: O(n+k)
Average Case Complexity: O(n+k)

The problem with the previous counting sort was that we could not sort the elements if we have negative numbers in it. Because there are no negative array indices. So what we do is, we find the minimum element and we will store the count of that minimum element at zero index.


Counting sort is used when:

there are smaller integers with multiple counts.
linear complexity is the need.

It must be noted that the last value of the cumulative array must be total number of values present in the input array.

Note: To perform Counting Sort in descending order, we need to calculate cumulative frequencies in reverse order. Everything besides this remains the same.


Advantages and Disadvantages of Counting Sort
Every concept in Computer Science has its pros and cons:

Advantages:

Linear Time Complexity. Since it is not a comparison-based sorting, it is not lower bounded by O(nlogn) complexity.
Reduced space complexity if the range of elements is narrow, that is, more frequency of close integers.
Disadvantages:

Both time and space complexities skyrocket if the range of input numbers is large.
It works only for discrete values like integers.
In case, negative integers are involved, the complexity increases, as well as certain changes in the algorithm, are required.
Conclusion
Sorting algorithms are a key component in the field of Computer Science. Being a non-comparison based sorting technique, Counting Sort is very efficient provided the range of values is limited.
*/