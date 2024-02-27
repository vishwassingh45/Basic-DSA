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

9. Floor value in Sorted Array
     The floor of x is the largest element in the array which is smaller than or equal to x.
     
     Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5

Result: 4



10. Ceil in Sorted Array


The ceiling of x is the smallest element in the array greater than or equal to x.


     Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5

Result: 7




11. Find the Next Letter

Explanation:- arr=['a','c', 'f','h']
              Output:='h'

Note :- You don't return the value which is already in the array.


12. Search in a sorted infinite array
   example :- [1,2,3,4,5,6,7,8,9,10, ...... , infinite]
              target=7
              output:4(index)
              
              
13. Find the index of 1st 1 in an infinite Binary sorted array
    Example :- [0,0,0,1,1,1, ... , infinite]
     You have to return the index of first occurrence of 1 
     


14. Minimum difference in a sorted array.
    Note :- If target is present in the array then return the target
    
    Explanation:- You have an array and a target , you have to minus the target
    from each and every element of the array and find minimum difference.
    
    Example :- [1, 3, 8 , 10 , 15] target=12
              -[12,12,12 ,12 , 12]
             -------------------------
                 11 , 15, 4 ,2, 3
                 
                 Output:- 2(minimum difference)
                 
15. Find maximum in Bitonic Array.
   Note:- Bitonic array is that array where the element increase and decrease
        Example:- [1,3,8,12,4,2]
        
   Explanation :- Maximum in Bitonic array is element should be greater than its neighbours
                  arr[mid] should be greater than arr[mid-1]
                  arr[mid] should be greater than arr[mid+1]

             0 ,1 ,2 ,3
 Example :- [5,10,20,15]
         Output:- 2(index)
  
  
  16 . Search in Bitonic array.     
         
         
   17. Allocate minimum number of pages


You have N books, each with A[i] number of pages. M students need to be allocated contiguous books, with each student getting at least one book.
Out of all the permutations, the goal is to find the permutation where the sum of maximum number of pages in a book allotted to a student should be minimum, out of all possible permutations.

Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).



Example 1:

Input:
N = 4
A[] = {12,34,67,90}
M = 2
Output:113
Explanation:Allocation can be done in 
following ways:
{12} and {34, 67, 90} Maximum Pages = 191
{12, 34} and {67, 90} Maximum Pages = 157
{12, 34, 67} and {90} Maximum Pages =113.
Therefore, the minimum of these cases is 113,
which is selected as the output.




Input:
N = 3
A[] = {15,17,20}
M = 2
Output:32
Explanation: Allocation is done as
{15,17} and {20}



18.  Painter's Partition Problem

PROBLEM STATEMENT:-
 Given an array/list of length ‘n’, where the array/list represents the boards and each element of the given array/list represents the length of each board. Some ‘k’ numbers of painters are available to paint these boards. Consider that each unit of a board takes 1 unit of time to paint.
You are supposed to return the area of the minimum time to get this job done of painting all the ‘n’ boards under a constraint that any painter will only paint the continuous sections of boards.


Example :
Input: arr = [2, 1, 5, 6, 2, 3], k = 2

Output: 11

Explanation:
First painter can paint boards 1 to 3 in 8 units of time and the second painter can paint boards 4-6 in 11 units of time. Thus both painters will paint all the boards in max(8,11) = 11 units of time. It can be shown that all the boards can't be painted in less than 11 units of time.



19. Aggressive Cows



Problem statement
You are given an array 'arr' consisting of 'n' integers which denote the position of a stall.



You are also given an integer 'k' which denotes the number of aggressive cows.



You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible.



Print the maximum possible minimum distance.





Sample Input 1 :
5 2
4 2 1 3 6


Sample Output 2 :
5



20. The Painter's Partition Problem-II
Dilpreet wants to paint his dog's home that has n boards with different lengths. The length of ith board is given by arr[i] where arr[] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board. 

The problem is to find the minimum time to get this job done if all painters start together with the constraint that any painter will only paint continuous boards, say boards numbered {2,3,4} or only board {1} or nothing but not boards {2,4,5}.


Example 2:

Input:
n = 4
k = 2
arr[] = {10,20,30,40}
Output: 60
Explanation: The most optimal way to paint:
Painter 1 allocation : {10,20,30}
Painter 2 allocation : {40}
Job will be complete at time = 60


```