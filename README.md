# LeetCode - Algorithms
Repository for solving algorithms from the LeetCode website.
___
### (1) Two Sum - Easy
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
___
### (2) Add Two Numbers - Medium
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
___
### (3) Longest Substring Without Repeating Characters - Medium
Given a string s, find the length of the longest substring without duplicate characters.
___
### (4) Median of Two Sorted Arrays - Hard
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
___
### (5) Longest Palindromic Substring - Medium
Given a string s, return the longest palindromic substring in s.
___
### (6) Zigzag Conversion - Medium
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
___
### (7) Reverse Integer - Medium
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
___
### (8) String to Integer (atoi) - Medium
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

    Whitespace: Ignore any leading whitespace (" ").
    Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
    Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
    Rounding: If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.

Return the integer as the final result.
___
### (9) Palindrome Number - Easy
Given an integer x, return true if x is a palindrome, and false otherwise.
___
### (10) Regular Expression Matching - Hard
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

    '.' Matches any single character.
    '*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).
___
### (11) Container With Most Water - Medium
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the i^th line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
___
### (12) Integer To Roman - Medium
Seven different symbols represent Roman numerals with the following values:
I - 1; V - 5; X - 10; L - 50; C - 100; D - 500; M - 1000.
Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a
decimal place value into a Roman numeral has the following rules:<br><br>
(1) If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, 
append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.<br><br>
(2) If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, 
for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).<br><br>
(3) Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot
append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.<br><br>
Given an integer, convert it to a Roman numeral.
___
### (13) Roman To Integer - Easy
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.<br>
Given a roman numeral, convert it to an integer.
___
### (14) Longest Common Prefix - Easy
Write a function to find the longest common prefix string amongst an array of strings.<br>
If there is no common prefix, return an empty string "".
___
### (15) Three Sum - Medium
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
and nums[i] + nums[j] + nums[k] == 0.<br>
Notice that the solution set must not contain duplicate triplets.
___




