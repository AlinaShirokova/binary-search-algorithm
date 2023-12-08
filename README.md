# Binary search algorithm

## Problem description

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Constraints:

All the integers in nums are unique.
nums is sorted in ascending order.

## Solution
![b2](https://github.com/AlinaShirokova/binary-search-algorithm/assets/43037374/aef376e5-ffbb-4c15-8287-d377cea74e67)
(From https://leetcode.com/problems/binary-search/editorial/ )

## Algorithm

  Initialize the boundaries of the search space as left = 0 and right = nums.size - 1.
    If there are elements in the range [left, right], we find the middle index mid = (left + right) / 2 and compare the middle value nums[mid] with target:
        If nums[mid] = target, return mid.
        If nums[mid] < target, let left = mid + 1 and repeat step 2.
        If nums[mid] > target, let right = mid - 1 and repeat step 2.
    We finish the loop without finding target, return -1.

## Examples
#### Example 1:

```bash
Input:
nums = [-1,0,3,5,9,12]
target = 9
Output: 4

Explanation: 9 exists in nums and its index is 4
```


#### Example 2:
```bash
Input:
nums = [-1,0,3,5,9,12]
target = 2
Output: -1

Explanation: 2 does not exist in nums so return -1
```
