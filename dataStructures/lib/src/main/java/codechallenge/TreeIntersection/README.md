# Tree Intersection Challenge

## Description

In computer science, tree traversal (also known as tree search) refers to the process of visiting (checking and/or updating) each node in a tree data structure, exactly once. The `TreeIntersection` challenge implements a function to find common values in two binary trees, analogous to finding intersecting values in two sets.

The main task can be found within the `TreeIntersection.java` file, located at: `./dataStructures/lib/src/main/java/codechallenge/TreeIntersection/TreeIntersection.java`

---

## How to Run the Test

For executing the tests related to the `TreeIntersection` challenge:

1. Ensure your Java project has been properly set up with JUnit.
2. Download or clone this repository to your system.
3. Open the project using your Java IDE of choice (options include Eclipse, IntelliJ IDEA, Visual Studio Code, and others).
4. Navigate to the `TreeIntersectionTest.java` file, located here: `./dataStructures/lib/src/test/java/codeChallenge/TreeIntersection/TreeIntersectionTest.java`.
5. Upon right-clicking the `TreeIntersectionTest.java` file, select either "Run As" or "Run Test" based on your IDE's terminology.

---

## Test Descriptions

`testFindCommonValues`
- **Purpose:** Verify that common values between two trees are correctly identified.
- **Description:** Two trees with some overlapping values are compared. The result is matched against the known common values.

`testBothTreesEmpty`
- **Purpose:** Handle the scenario where both trees are empty.
- **Description:** Two empty trees are compared. The result should be an empty list.

`testOneTreeEmpty`
- **Purpose:** Handle the scenario where one tree is empty.
- **Description:** One tree with a single value and one empty tree are compared. The result should be an empty list.

`testNoCommonValues`
- **Purpose:** Ensure trees with no overlapping values return an empty list.
- **Description:** Two trees without any common values are compared. The result should be an empty list.

`testAllValuesCommon`
- **Purpose:** Ensure trees with all values in common are correctly identified.
- **Description:** Two identical trees are compared. The result should contain all tree values.

`testComplexTreesMultipleOverlaps`
- **Purpose:**  Handle complex trees with multiple overlaps.
- **Description:** Two complex trees with some overlapping values are compared. The result is matched against the known common values.

`testExampleOverlap`
- **Purpose:** Handle a more intricate tree structure with overlaps.
- **Description:** Two elaborate trees with several common values are compared. The result is matched against the known common values.

`testPreOrderTraversal`
- **Purpose:** Verify the pre-order traversal of a tree.
- **Description:** A tree is traversed in pre-order fashion, and the result is matched against the expected traversal order.

`testFindCommonValuesPreOrderBasicOverlap`
- **Purpose:** Validate the identification of common values using pre-order traversal for basic overlap.
- **Description:** Two trees with a basic overlap are compared using pre-order traversal. The result is matched against the known common values.

`testFindCommonValuesPreOrderNoOverlap`
- **Purpose:** Validate the identification of common values using pre-order traversal when there's no overlap.
- **Description:** Two trees without overlapping values are compared using pre-order traversal. The result should be an empty list.