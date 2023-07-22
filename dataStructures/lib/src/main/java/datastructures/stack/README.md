# Stack

[//]: # (used chatGPT to gen this description and how to run test.)

## Description

The stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle, where elements are added and removed from the same end called the "top." It can be visualized as a stack of plates, where new elements are pushed onto the top, and removal occurs from the top as well.

This repository contains a Java implementation of a generic stack class called `Stack`. The `Stack` class provides methods for pushing (adding) elements to the top of the stack, popping (removing) elements from the top, peeking at the top element without removal, and checking if the stack is empty.

## How to Run the Test

To run the tests for the `Stack` class, make sure you have JUnit set up in your Java project.

1. Clone or download this repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., Eclipse, IntelliJ, or Visual Studio Code).
3. Navigate to the `StackTest.java` file in the `src/test` directory.
4. Right-click on the `StackTest.java` file and choose "Run As" or "Run Test" (depending on your IDE).

The test suite will be executed, and the results will be displayed in the test runner.

Ensure that the test methods cover various scenarios, such as pushing single and multiple values, popping, peeking, checking the stack's emptiness, and handling exceptions when popping or peeking on an empty stack.

Following these steps will help you validate the correctness and functionality of the `Stack` class implementation.
