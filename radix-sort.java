void countSort(int[] arr, int size, int exp) {

    int output[] = new int[size]; // output array
    int count[] = new int[10];

    for (int i = 0; i < 10; i++) {
        count[i] = 0;
    }

    for (int i = 0; i < size; i++) {
        count[(arr[i] / exp) % 10]++;
    }

    for (int i = 1; i < 10; i++) {
        count[i] += count[i - 1];
    }

    for (int i = size - 1; i >= 0; i--) {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i];
        count[(arr[i] / exp) % 10]--;
    }

    for (int i = 0; i < size; i++) {
        arr[i] = output[i];
    }

}

void redixSort(int[] arr) {

    int size = arr.length;
    int max = arr[0];

    for (int i = 1; i < size; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    for (int exp = 1; max / exp > 0; exp *= 10) {
        countSort(arr, size, exp);
    }
}

/*

What is the running time of Radix Sort? 
Let there be d digits in input integers. Radix Sort takes O(d*(n+b)) time where b is the base for representing numbers, for example, for the decimal system, b is 10. What is the value of d? If k is the maximum possible value, then d would be O(logb(k)). So overall time complexity is O((n+b) * logb(k)). Which looks more than the time complexity of comparison-based sorting algorithms for a large k. Let us first limit k. Let k <= nc where c is a constant. In that case, the complexity becomes O(nLogb(n)). But it still doesn’t beat comparison-based sorting algorithms. 
What if we make the value of b larger?. What should be the value of b to make the time complexity linear? If we set b as n, we get the time complexity as O(n). In other words, we can sort an array of integers with a range from 1 to nc if the numbers are represented in base n (or every digit takes log2(n) bits). 


Key points about Radix Sort:
 Some key points about radix sort are given here

1- It makes assumptions about the data like the data must be between a range of elements.
2- Input array must have the elements with the same radix and width.
3- Radix sort works on sorting based on individual digit or letter position.
4- We must start sorting from the rightmost position and use a stable algorithm at each position.
5- Radix sort is not an in-place algorithm as it uses temporary count array.

Is Radix Sort preferable to Comparison based sorting algorithms like Quick-Sort? 
If we have log2n bits for every digit, the running time of Radix appears to be better than Quick Sort for a wide range of input numbers. The constant factors hidden in asymptotic notation are higher for Radix Sort and Quick-Sort uses hardware caches more effectively. Also, Radix sort uses counting sort as a subroutine and counting sort takes extra space to sort numbers.


Radix sort is mostly used to sort the numerical values or the real values, but it can be modified to sort the string values in lexicographical order (from left to right ). It follows the same procedure as used for numerical values.

*/