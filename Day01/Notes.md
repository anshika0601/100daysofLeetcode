Day 1: Median of Two Sorted Arrays

🔗 Problem Link: [LeetCode 4](https://leetcode.com/problems/median-of-two-sorted-arrays/)

Topic: Binary Search, Arrays


Approach:
We use a binary search on the smaller array to find the correct partition such that all elements on the left are less than or equal to those on the right. This allows us to calculate the median in O(log(min(n1, n2))) time.



Key Concepts:
- Binary Search
- Partitioning two arrays
- Edge conditions using `Integer.MIN_VALUE` and `Integer.MAX_VALUE`

Time Complexity:
- O(log(min(n1, n2)))

Space Complexity:
- O(1)



What I Learned:
- Optimized binary search technique to solve median in log time.
- Using partition and edge cases for arrays of unequal size.
- Thought process behind reducing a seemingly complex problem to a simpler binary search problem.
