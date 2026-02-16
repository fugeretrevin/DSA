Overview

Bucket Sort is a distribution-based sorting algoritm that works by breaking up an array into a number of buckets. Then, each bucket is sorted individually using a diffenet sorting algorithm (here it was Insertion Sort). 
Bucket sort can also achieve a linear time compexity when the input data is already uniformly distributed across a range, making it more efficient in some cases as compared to Merge Sort or Quick Sort.

How It Works

Initialize an array of empty buckets
Distribute the elements in the input array into a bucket based on its value
Sort each bucket individually
Concatenate the sorted buckets back into the original array

Complexity Analysis
Average Time Complexity: O(n+k), where n is the size of the array and k is the number of buckets
Worst Case time Complexity: O(n^2) when all data is distributed into a single bucket

Space Complexity: O(n+k)

When to Use
Bucket Sort is useful when the input data is uniformly distributed, when memory isn't a strict constraint, and when sorting large sets of categorized data