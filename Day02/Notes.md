# Day 2: Longest Substring Without Repeating Characters

🔗 **Problem Link**: [LeetCode #3 - Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)



##  Problem Statement:
Given a string `s`, find the length of the longest substring without repeating characters.


##  Approach: Sliding Window with HashMap

We use a sliding window from `left` to `right`, and a `HashMap` to track the last index of each character.

### Algorithm:
- Move the `right` pointer forward.
- If the character already exists in the map:
  - Move `left` to `max(previous index + 1, left)`
- Update the character's index in the map.
- At each step, update the length of the longest substring.

---

##  Key Concepts:
- Sliding Window helps to manage a growing/shrinking range dynamically.
- HashMap keeps track of last seen character positions.
- Using `Math.max(map.get(ch) + 1, left)` avoids backward movement of `left`.

---

## Time and Space Complexity:
- Time Complexity: O(n)  
  Each character is visited at most twice.
- Space Complexity: O(min(n, 128))  
  128 for ASCII, or 26 for lowercase English, or n for Unicode.

---

##  What I Learned:
- Efficient string scanning with two pointers.
- Importance of handling repeated characters in substrings.
- Avoiding left pointer going backward.

---

##  Example:
text
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

