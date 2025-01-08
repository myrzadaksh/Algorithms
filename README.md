# Java Algorithm Implementations

This repository contains implementations of various algorithms and data structures in Java. Each program demonstrates specific concepts and techniques, including searching, recursion, linked lists, and more. Below is an overview of the included files.

---

## Contents

1. [BinarySearch.java](#binarysearchjava)
2. [Fibonacci.java](#fibonaccijava)
3. [List.java](#listjava)
4. [Mandelbrot.java](#mandelbrotjava)
5. [TestSS.java](#testssjava)

---

## BinarySearch.java

This program implements a binary search algorithm to find the index of a specific key in a sorted array of strings.

How it works:

- It splits the array into two halves and compares the key with the middle element.
  
- If the key matches the middle element, it returns the index.
  
- If the key is smaller, it recursively searches the left half.

- If the key is larger, it recursively searches the right half.

- If the key is not found, it returns -1.
  
Example:

- Input: "Orwell"
  
- Input: "Orwell"
  
- Output: "Orwell is at position: 1"

## Fibonacci.java

This program generates the Fibonacci sequence up to the nth term using an iterative approach.

How it works:

- Reads the input n from the command line.

- Uses an array to store Fibonacci numbers.

- Iteratively calculates each term using the formula: F(n) = F(n-1) + F(n-2)

- Outputs the sequence and the final value.
  
Example:

- Input: 10
  
- Output: 1 2 3 5 8 13 21 34 55 89 The final value is = 89

  
