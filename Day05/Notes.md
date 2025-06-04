# Day 4: Search in Infinite Sorted Array

🔗 Concept: Binary Search with Infinite Array Simulation  
Topic: Binary Search

---

##  Problem Statement

You are given a sorted array that is considered to be **infinite**. You need to search for the **target value** in this array and return its 1-based index.

Since Java doesn't support infinite arrays, we simulate it with a wrapper class `InfiniteArray` that returns `Integer.MAX_VALUE` when accessing out-of-bound indexes.

---

##  Approach

1. Expand the Search Window:
   - Start with `start = 0`, `end = 1`.
   - Keep doubling `end` until `arr.get(end) >= target`.

2. Binary Search in the Window:
   - Perform a classic binary search between `start` and `end`.

3. Simulation of Infinity:
   - The `get()` method in `InfiniteArray` class returns `Integer.MAX_VALUE` if the index is out of range.

---

## Why this approach?

- Since the array is **infinitely long**, we cannot use `arr.length`.
- To handle this, we first determine a **suitable range** where the target might exist.
- Once the range is set (`s` to `e`), we apply **binary search**, which guarantees `O(log n)` efficiency.

---

##  Time and Space Complexity

- Time Complexity:  
  - Expanding range takes O(log p), where `p` is the index of the target.
  - Binary Search within that range also takes O(log p).  
  ➤ Total: O(log p)

- Space Complexity: O(1) (no extra data structures used)

---

##  Example

```java
Input: data = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170], target = 100
Output: 7  // 1-based index
