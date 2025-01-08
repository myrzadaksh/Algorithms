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

## List.java

This program defines a custom singly linked list with utility methods to manipulate the list.

Key Features:

- Add: Inserts a new value at the end of the list.
  
- Print: Displays the entire list in sequence.

- Remove Duplicates: Removes duplicate values using a HashSet.

- Reverse List: Reverses the order of the nodes in the list.

How it works:

- Builds a list from an array of integers.

- Removes duplicates and prints the modified list.

- Reverses the list and prints it again.

Example:

- Input: {1, 2, 3, 4, 5, 2, 3, 4, 8, 1}

- Output:

1 -> 2 -> 3 -> 4 -> 5 -> 2 -> 3 -> 4 -> 8 -> 1 -> 

1 -> 2 -> 3 -> 4 -> 5 -> 8 -> 

8 -> 5 -> 4 -> 3 -> 2 -> 1 ->

## Mandelbrot.java

This program visualizes the Mandelbrot set, a famous fractal, using complex numbers.

How it works:

- Takes input parameters for the center (xc, yc), size of the view, and resolution (N).

- Iterates to determine if a point belongs to the Mandelbrot set.

- Points inside the set are colored black, and points outside are colored white.

- Displays the result as a graphical image.

Example:

- Input: -0.5 0 2 32

- Output: Renders an image of the Mandelbrot set.

## TestSS.java

This program demonstrates a linear search algorithm and measures its performance.

How it works:

- Reads a list of words from the input.

- Randomly selects words and searches for them in the array using a linear search.

- Reports the time taken for the entire process.

Example:

- Input: Array of words and a key to search.

- Output: Keys not found and the total runtime.
