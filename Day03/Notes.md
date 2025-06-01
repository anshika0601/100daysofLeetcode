# Day 3: Find Smallest Letter Greater Than Target

🔗 **Problem Link**: [LeetCode #744 - Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)

---

##  Problem Statement:
You are given a sorted list of characters `letters` and a target character `target`. Return the smallest character in the list that is strictly greater than the target.

 The list is circular – meaning if `target` is greater than or equal to the last element, return the first element.

---

##  Approach: Binary Search

We perform binary search to find the first character greater than the target.

- If `letters[mid]` is less than or equal to `target`, move `start` right.
- Else, move `end` left.
- Finally, return `letters[start % letters.length]` to wrap around if needed.

---

##  Key Observations:
- Sorted array → use binary search: O(log n)
- Wrapping handled by `start % letters.length`
- We are essentially finding the first character greater than target

---

##  Time and Space Complexity:
- **Time Complexity**: O(log n)
- **Space Complexity**: O(1)

---

##  Example:

```txt
Input: letters = ['c','f','j'], target = 'd'
Output: 'f'

Input: letters = ['c','f','j'], target = 'j'
Output: 'c'  // because of wrapping
