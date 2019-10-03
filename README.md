# LeetCode Example Int to Roman
A simple solution to this problem is to continuously decrement num while equivalently incrementing the String containing the Roman Numerals
Each Roman numeral has a corresponding integer value. If you start with the largest you may remove its value from the integer while at the same time adding it to the end of your string. This approach works by considering not only individual Roman numerals as a number, but also the special case pairings (like IV, IX, XL, and so on).

This solution has a time complexity of O(n) (5 ms) and a space complexity of O(1) (36.9 MB)
