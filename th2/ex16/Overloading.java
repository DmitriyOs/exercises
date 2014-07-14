//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.

import static net.mindview.util.Print.*;


/** My first test with documentation
 * @author Me
 * @version 0.1b
 */

/** class Tree
 */
class Tree {
    int height;
    Tree() {
        print("Planting a seedling");
        height = 0;
    }

    /** constructor
     * @param initialHeight tall of the Tree
     */
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }
    void info() {
        print("Tree is " + height + " feet tall");
    }

    /** overloaded method
     * @param s some string
     */
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}

/** class for testing
 */
public class Overloading {
    /** Entry point to class & application.
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
// Overloaded constructor: 
        new Tree();
    }
} /* Output: 
Creating new Tree that is 0 feet tall 
Tree is 0 feet tall 
overloaded method: Tree is 0 feet tall 
Creating new Tree that is 1 feet tall 
Tree is 1 feet tall 
overloaded method: Tree is 1 feet tall 
Creating new Tree that is 2 feet tall 
Tree is 2 feet tall 
overloaded method: Tree is 2 feet tall 
Creating new Tree that is 3 feet tall 
Tree is 3 feet tall 
overloaded method: Tree is 3 feet tall 
Creating new Tree that is 4 feet tall 
Tree is 4 feet tall 
overloaded method: Tree is 4 feet tall 
Planting a seedling 
*///:~ 