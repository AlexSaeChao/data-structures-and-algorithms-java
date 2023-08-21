# Hashtable

[//]: # (used ChatGPT to gen this description and how to run the test.)

## Description

A hashtable is a data structure that stores key-value pairs. Keys are unique identifiers which are used to store values in the table. The idea behind a hashtable is to provide a way to store and retrieve data in constant time O(1) irrespective of the amount of data. The hashtable achieves this performance by using a hashing function which turns the key into an index in an array. If multiple keys produce the same index, collisions are handled through various methods, one of which is by using linked lists.

This repository contains a Java implementation of a generic hashtable class called `Hashtable`. The `Hashtable` class provides methods for setting key-value pairs in the hashtable, getting the value for a given key, checking if a specific key exists in the hashtable, and retrieving a list of all unique keys in the hashtable.

## How to Run the Test

To run the tests for the `Hashtable` class, ensure you have JUnit set up in your Java project.

1. Clone or download this repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., Eclipse, IntelliJ, or Visual Studio Code).
3. Navigate to the `HashtableTest.java` file in the `src/test/datastructures/hashTable` directory.
4. Right-click on the `HashtableTest.java` file and choose "Run As" or "Run Test" (depending on your IDE).d choose "Run As" or "Run Test" (depending on your IDE).