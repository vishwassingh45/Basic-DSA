```text

1. Find First and Last Position of Element in Sorted Array
    
    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.


Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]


2. Search Insert Position
    
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.

 
 
 Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


3. Sqrt(x)


   Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.



4. Cube root of a number


Given a number N, find the cube root of N.

Note: We need to print the floor value of the result.


Example 1:

Input:
N = 3
Output:
1
Explanation:
Cube root of 3 is 1.442 = 1
Example 2:

Input:
N = 8
Output:
2
Explanation:
Cube root of 8 is 2

5. Peak Index in a Mountain Array


   An array arr is a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.


Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1


6. Find Pivot element in an array
   Note:- Pivot element is a smallest element in an array.
 
Example :- Input:- arr[3,8,17,1]
            Output:- 4(index)



7. Search in Rotated Sorted Array


   There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.


   Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1



8.  Search In A Rotated Sorted Array II



 Problem statement
You are given a rotated sorted array 'a' of length 'n' and a 'key'. You need to determine if the 'key' exists in the array 'a'.



The given sorted array is rotated from an unknown index 'x'. Such that after rotation the array became [a[x], a[x+1]...., a[n-1], a[1]..., a[x-1]], (0-based indexing). For example, if the array is [1, 2, 3, 4, 5] and x = 2 then the rotated array will be [3, 4, 5, 1, 2, 3].



Return True if the 'key' is found in 'a'. Otherwise, return False.



Note: Array ‘a’ may contain duplicate elements.


Example:

Input: a = [6, 10, 1, 3, 5], key = 3

Output: True

Explanation: The array 'a' contains the 'key' = 3, so we return True.

9. Floor valuein Sorted Array
     The floor of x is the largest element in the array which is smaller than or equal to x.
     
     Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5

Result: 4



10. Ceil in Sorted Array


The ceiling of x is the smallest element in the array greater than or equal to x.


     Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5

Result: 7
```