# Key Value Data Structure

Programming Language used : Java

Build Tool : Gradle

### User can perform various operations.
1. Insert
2. Retrieve
3. Display Current State

### Design
1. Created class [KeyValueEntry](https://github.com/vsainiv/key-value-data-structure/blob/main/key-value-ds/src/main/java/com/datastructure/KeyValueEntry.java) to store key value pairs.
2. Class [KeyValueDS](https://github.com/vsainiv/key-value-data-structure/blob/main/key-value-ds/src/main/java/com/datastructure/KeyValueDS.java) is the class where put and get methods logic is written.
3. The class KeyValueDS contains KeyValueEntry array initial size kept as 16, If the size is equal to 16 we will double the current size.
4. The put method adds an entry of key-value pair into this array if there is already an entry with the given key we will replace the value with new value.
5. We will re-size array of KeyValueEntry if it reaches the max size currently available.
6. The get method returns the value corresponding to the provided key, if key is not present we will return null.
7. The keySet method returns the list of all the keys available.
8. Class [KeyValueDSTest](https://github.com/vsainiv/key-value-data-structure/blob/main/key-value-ds/src/test/java/com/datastructure/KeyValueDSTest.java) contains all the test cases.
 

### How to Run
1. Clone the project using git clone command.
2. Open the project in IDE.
3. Search for Class [DriverClass](https://github.com/vsainiv/key-value-data-structure/tree/main/key-value-ds/src/main/java/com/driver).
3. DriverClass is the main driver class which we will run, the user will see various options and can provide the input.
