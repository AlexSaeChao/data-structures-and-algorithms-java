# Queue

[//]: # (used chatGPT to gen this description and how to run test.)

## Description

The queue is a data structure that follows the First-In-First-Out (FIFO) principle, where elements are inserted at the back and removed from the front. It can be visualized as a line in which new elements are added to the end, and removal occurs from the front.

This repository contains a Java implementation of a generic queue class called `Queue`. The `Queue` class provides methods for enqueueing (adding) elements to the back of the queue, dequeuing (removing) elements from the front, peeking at the front element without removal, and checking if the queue is empty.

## How to Run the Test

To run the tests for the `Queue` class, make sure you have JUnit set up in your Java project.

1. Clone or download this repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., Eclipse, IntelliJ, or Visual Studio Code).
3. Navigate to the `QueueTest.java` file in the `src/test` directory.
4. Right-click on the `QueueTest.java` file and choose "Run As" or "Run Test" (depending on your IDE).

The test suite will be executed, and the results will be displayed in the test runner.

Ensure that the test methods cover various scenarios, such as enqueueing single and multiple values, dequeueing, peeking, checking the queue's emptiness, and handling exceptions when dequeueing or peeking on an empty queue.

Following these steps will help you validate the correctness and functionality of the `Queue` class implementation.

