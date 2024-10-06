# [Q1. Maximum and minimum of an array using minimum number of comparisons](https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/)

Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

#### Examples:
```
Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
Maximum element is: 35
``` 
#### Maximum and minimum of an array :
To solve the problem of finding the minimum and maximum elements in an array, you can follow these steps:

#### Step 1: Write functions to find the minimum (setmini) and maximum (setmaxi) values in the array.

#### Step 2: In the setmini function:
```
Initialize a variable (mini) to INT_MAX.
Iterate through the array, and if an element is smaller than the current mini, update mini to that element.
Return the final value of mini.
```
#### Step 3: In the setmaxi function:
```
Initialize a variable (maxi) to INT_MIN.
Iterate through the array, and if an element is larger than the current maxi, update maxi to that element.
Return the final value of maxi.
```
#### Step 4: In the main function:
```
Declare an array and its size.
Print the result ,Call the setminimum and setmaxi functions to find the minimum and maximum values.
```
