```text
1. Arrange 0 and 1

example :- arr=[1,0,1,0,1,0]
 output: arr=[0,0,0,1,1,1]
 
 Note:- You can't use any sorting function
 
 
 2.  Two Sum II - Input Array Is Sorted 
 
 Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].


3. Pair With Given Difference

Problem Description

Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.

Return 1 if any such pair exists else return 0.


Example Input
Input 1:

 A = [5, 10, 3, 2, 50, 80]
 B = 78
 
 Input 2:

 A = [-10, 20]
 B = 30
 
 Example Output
Output 1:

 1
Output 2:

 1
 
 
 
4. Product Pair

Given an array arr[] of size N of distinct elements and a number X, find if there is a pair in arr[] with product equal to X.


Example 1:

Input:
N = 4, X = 400
arr[] = {10, 20, 9, 40}
Output: Yes
Explanation: As 10 * 40 = 400.

Example 2:

Input:
N = 4, X = 30
arr[] = {-10, 20, 9, -40}
Output: No
Explanation: No pair with product 30.



5. Remove Duplicates from Sorted Array



Given a sorted array A consisting of duplicate elements.

Your task is to remove all the duplicates and return the length of the sorted array of distinct elements consisting of all distinct elements present in A.

Note: You need to update the elements of array A by removing all the duplicates




Example Input
Input 1:

A = [1, 1, 2]
Input 2:

A = [1, 2, 2, 3, 3]


Example Output
Output 1:

2
Output 2:

3



6. 3Sum
   Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.
   
   
Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.



7. Find the target is equal in the contiguous array 



8. 4Sum

Given an array A of N integers. You have to find whether a combination of four elements in the array whose sum is equal to a given value X exists or not.


Example 1:

Input:
N = 6
A[] = {1, 5, 1, 0, 6, 0}
X = 7
Output:
1

Explantion:
1, 5, 1, 0 are the four elements which makes sum 7.
```