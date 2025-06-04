# Day 5: Find First and Last Position of Element in Sorted Array

🔗 LeetCode Problem: [34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)  
Topic: Binary Search

---

##  Problem Statement

Given an array of integers `nums` sorted in ascending order, find the **starting and ending position** of a given target value.  
If the target is not found in the array, return `[-1, -1]`.

---

##  Approach

We perform two binary searches**:

1. First Occurrence:  
   - On finding the target, continue searching in the **left half** (`e = mid - 1`).

2. Last Occurrence:  
   - On finding the target, continue searching in the **right half** (`s = mid + 1`).

Both results are combined into an array and returned.

---

##  Why Binary Search Twice?

- A normal binary search returns *any one* index of the target.
- To get both ends (first and last), we must **separately check both halves** after finding the target once.

---

##  Code Summary

```java
public int[] searchRange(int[] nums, int target) {
    int l = search(nums, target, true);   // first occurrence
    int r = search(nums, target, false);  // last occurrence
    return new int[] { l, r };
}
