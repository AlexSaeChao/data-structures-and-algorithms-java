# HashMap

[//]: # (used ChatGPT to gen this description and how to run the test.)

## Description

A hashmap is a data structure that stores key-value pairs. Keys are unique identifiers used to store values in the map. The primary purpose of a hashmap is to offer a method to store and retrieve data in nearly constant time O(1), irrespective of the size of the data. This efficiency is achieved by a hashing function which converts the key into an index in an array. If multiple keys map to the same index, collisions are resolved through various strategies, one common approach being the use of linked lists.

Code Challenge is written in `HashMapChallenges.java` at path `./dataStructures/lib/src/main/java/datastructures/hashmap/HashMapChallenges.java`

## How to Run the Test

To run the tests for the `HashMap` class, ensure you have JUnit integrated into your Java project.

1. Clone or download this repository onto your computer.
2. Open the project in your chosen Java IDE (e.g., Eclipse, IntelliJ, or Visual Studio Code).
3. Traverse to the `HashMapChallengesTest.java` file located in the `dataStructures/lib/src/test/java/datastructures/hashmap/HashMapChallengesTest.java` directory.
4. Right-click on the `HashMapChallengesTest.java` file and opt for "Run As" or "Run Test" (the exact wording might vary based on your IDE).