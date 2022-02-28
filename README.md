# TDD PHP

This sample project helps you to get started with the FizzBuzz TDD kata
# FizzBuzz

## Problem Description

Write a program that prints the numbers from 1 to 100. But for multiples of three print `Fizz` instead of the number and for the multiples of five print `Buzz`. For numbers which are multiples of both three and five print `FizzBuzz`.

Sample output:

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
... etc up to 100
```

## Rules

### First Rule

You can not write production code until you have written a failing unit test.

### Second Rule

You can not write more of an unit test than is sufficient to fail, and not compiling is a failing.

### Third Rule

You can not write more production code than is sufficient to pass the currently failing test.

## TDD loop

* **Red** : make a failing test case;
* **Green** : make the test pass;
* **Refactoring** : improve the design of your code
    * Duplication
    * Variables/Methods names not clear
    * Code hard to understand
    * etc.

![TDD Loop](./red-green-refactor.jpg)

