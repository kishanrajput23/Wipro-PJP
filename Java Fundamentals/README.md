# Language Basics

**📌1.** Write a Program that accepts two Strings as command line arguments and generate the output in a specific way as given below. 
- Example: If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai 
- [Note: It is mandatory to pass two arguments in command line] 

**📌2.** Write a Program to accept a String as a Command line argument and the program should print a Welcome message. 
- Example: 
- C:\> java Sample John 
- O/P Expected: Welcome John 

**📌3.** Write a Program to accept two integers through the command line argument and print the sum of the two numbers. 
- Example: C:\>java Sample  of the two numbers 
- Example: C:\>java Sample 10 20 O/P Expected: The sum of 10 and 20 is 30 "

# Flow Controls Assignment Questions

**📌1. (a)** Write a program to check if a given number is Positive, Negative, or Zero.

**📌1. (b)** Given two non negative int values, print true if they have the same last digit, such as with 27 & 57.
```
last digit(7, 17) --> true
last digit(6, 17) --> false
last digit(3, 113) --> true
```

**📌2.** Write a program to check if a given number is odd or even.

**📌3.** Write a program to check if the program has received command line arguments or not. If the program has not received the values then print "No Values", else print all the values in a single line separated by ,(comma).
```
Eg1) java Example
O/P: No values

Eg2) java Example Mumbai Bangalore
O/P: Mumbai, Bangalore

- [Note: You can use length property of an array to check its length
```

**📌4.** Initialize two character variables in a program and display the characters in alphabetical order.
```
Eg1) if first character is s and second is e
O/P: e,s

Eg2) if first character is a and second is e
O/P:a,e
```

**📌5.** Initialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number then print "Digit" and for other characters print "Special Character".

**📌6.** Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.
```
If the gender is 'Female' and age is between 1 and 58, then the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, then the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, then the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, then the percentage of interest is 10.5%.
```
 
**📌7.** Write a program to convert from upper case to lower case and vice versa of an alphabet and print the old character and new character as shown in example (Ex: a->A, M->m,).

**📌8.** Write a program to print the color name, based on color code. If color code in not valid then print "Invalid Code". (R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.)

**📌9.** Write a program to print month in words, based on input month in numbers
```
Example1:
       C:\>java Sample 12
       O/P Expected: December

Example2:
       C:\>java Sample 
       O/P Expected: Please enter the month in numbers

Example3:
       C:\>java Sample 15
       O/P Expected: Invalid month  
```

**📌10.** Write a program to print numbers from 1 to 10 in a single row with one tab space.  

**📌11.** Write a program to print even numbers between 23 and 57, each number should be printed in a separate row.  

**📌12.** Write a program to check if a given number is prime or not

**📌13.** Write a program to print prime numbers between 10 and 99.

**📌14.** Write a program to add all the values in a given number and print. Ex: 1234 --> 10

**📌15.** Write a program to print * in Floyds format.
```
Example : Input - 4
Output:
*
* *
* * *
* * * *
```

**📌16.** Write a program to reverse a given number and print
```
Example:
i/p : 12345
o/p : 54321
```

**📌17.** Write a program to find if the given number is palindrome or not
```
Example 1:
i/p : 4004
o/p : 4004 is palindrome

Example 2:
i/p : 1234
o/p : 1234 is not a palindrome
```

# Arrays Assignment Questions 

**📌1.** Write a program to initialize an integer array and print the sum and average of the array.

**📌2.** Write a program to initialize an integer array and find the maximum and minimum value of an array.

**📌3.** Write a program to initialize an integer array with values and check if a given number is present in the array or not. If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
```
Ex1) Array elements are {1,4,34,56,7} and the search element is 90 then the O/P : -1

Ex2) Array elements are {1,4,34,56,7} and the search element is 56 then the O/P : 4 
```

**📌4.** Initialize an integer array with ascii values and print the corresponding character values in a single row.

**📌5.** Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

**📌6.** Write a program to initialize an array and print them in a sorted order.

**📌7.** Write a program to remove the duplicate elements in an array and print new array.
```
Eg) Array Elements--> {12,34,12,45,67,89} 
O/P: 12,34,45,67,89
```

**📌8.** Write a program to print the sum of the elements of an array following the given below condition. If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum. 
```
Eg1) Array Elements - 10,3,6,1,2,7,9 
O/P: 22 [i.e 10+3+9] 

Eg2) Array Elements - 7,1,2,3,6 
O/P: 19 

Eg3) Array Elements - 1,6,4,7,9 
O/P: 10	
```

**📌9.** Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array. 
```
withoutTen([1, 10, 10, 2]) --> [1, 2, 0, 0] 

withoutTen([10, 2, 10]) --> [2, 0, 0] 

withoutTen([1, 99, 10]) --> [1, 99, 0]
```

**📌10.** Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
```
evenOdd({1, 0, 1, 0, 0, 1, 1}) → {0, 0, 0, 1, 1, 1, 1}

evenOdd({3, 3, 2}) → {2, 3, 3}

evenOdd({2, 2, 2}) → {2, 2, 2}
```

**📌11.** Write a program for Given an array of type int, print true if every element is 1 or 4.
```
only14([1, 4, 1, 4]) true

only14([1, 4, 2, 4]) - false

only14(01. 11) - true
```

**📌12.** Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
```
middleWay({1, 2, 3}, {4, 5, 6}) → {2, 5}

middleWay({7, 7, 7}, {3, 8, 0}) → {7, 8}

middleWay({5, 2, 9}, {1, 4, 5}) → {2, 4}
```

**📌13.** Write a program to reverse the elements of a given 2x2 array. Four Four integer numbers needs to be passed as Command Line arguments 

```
Example1:
     C:\>java Sample 1 2 3
     O/P Expected : Please enter 4 integer numbers

Example2:
     C:\>java Sample 1 2 3 4
     O/P Expected : 
     
  The given array is :
  1 2 
  3 4 

  The reverse of the array is :
  4 3 
  2 1
```
	
**📌14.** Write a program to find greatest number in a 3x3 array. The program is supposed to receive 9 integer numbers as command line arguments.

```
Example1:
     C:\>java Sample 1 2 3
     O/P Expected : Please enter 9 integer numbers

Example2:
     C:\>java Sample 1 23 45 55 121 222 56 77 89
     O/P Expected : 

The given array is :
1 23 45 
55 121 222 
56 77 89 

The biggest number in the given array is 222
```

# Project Description

![Screenshot (572)](https://user-images.githubusercontent.com/70385488/167264563-a06fd423-6a53-435f-9ae1-4954f31cf321.png)
![Screenshot (573)](https://user-images.githubusercontent.com/70385488/167264565-91dd0d2c-d0a7-45d8-a80c-22d222462c3c.png)
