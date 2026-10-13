# HokieShopping
HokieShopping is a list-management application designed for college students who need to organize their grocery and dorm supply runs. 
Here is the complete `README.md` file formatted to meet all the rubric criteria for Deliverable 3. You can copy and paste this directly into your project.


# Project 2: Deliverable 3 Prototype + Tests

## Compilation and Execution

To compile and run the application and test suite:

1. Ensure the `student.TestCase` library is included in your project build path.
2. Compile the project files: `javac -d bin src/hokieshopping/*.java`
3. Run the test suite via your IDE's test runner (e.g., Eclipse or VS Code) or from the command line executing the `ShoppingCartManagerTest` class.



## Reflection

**What changed from your specification?**



**What changed in the LinkedChain?**


The provided `LinkedChain.java` was used completely unchanged. To allow `LinkedChain.remove()` and `LinkedChain.contains()` to search the structure without modifying the chain's internal nodes, I implemented custom `equals()` methods inside `GroceryItem` and `DormSupply`. This allowed the manager to pass a temporary "dummy object" to the chain, matching items based on their text properties rather than memory addresses.

**What happened to your unknowns?**


The primary unknown in the scope was how to safely remove an item from the middle of the linked structure without breaking the links. I figured this out by leveraging the generic `remove(T anEntry)` wrapper method combined with the custom case-insensitive `equals()` overrides. Integrating persistent storage remains an open unknown.

**What doesn't work yet?**


The application successfully runs on the MVP path. However, the persistent storage integration (`HokieShoppingStorage`) is not yet wired up to the `ShoppingCartManager`, meaning data does not persist between application sessions.

## Next Steps

**What is left to finish the MVP?**

1. Finalize the `HokieShoppingStorage` class to enable saving and loading the cart data.
2. Ensure edge cases around case-insensitive matching are uniformly applied across all new item additions.

**Which stretch goals will you attempt?**

* **Committed:** Persistent local storage via `HokieShoppingStorage` and category sorting (Produce, Snacks, Cleaning, etc.).
* **Dropped:** The local store connection feature and budgeting features are being dropped to ensure the core data structure mechanics and storage are robust.

**What new tests will you need?**


New tests are needed to cover the `HokieShoppingStorage` integration. Specifically, bad-input cases must be written to handle "file not found" exceptions and corrupted save data without crashing the application.

**Who does what?**

* **Michael Carnes (mcodez72):** Wrote LinkedChain wrapper ShoppingCartManager, dormsupply, groceryitem, and jUnit test for SCM
* **Mohammed Almahyawi (mohammeda24)**: Wrote HokieShoppingUI

## Attribution

| File | Author / Owner | Contribution Details & GenAI Usage |
| --- | --- | --- |
| `ShoppingCartManager.java` | Michael Carnes | Wrote the class structure and validation logic. Used GenAI to conceptualize the "dummy object" pattern for the `remove` and `contains` methods. |
| `DormSupply.java` | Michael Carnes | Wrote class. Authored custom `equals()` method for case-insensitive state matching. |
| `GroceryItem.java` | Michael Carnes | Wrote class. Authored custom `equals()` method for state matching. |
| `ShoppingCartManagerTest.java` | Michael Carnes | Wrote test cases following the spec plan. Used GenAI to assist in refactoring the test suite from JUnit 5 to the `student.TestCase` framework and to generate edge-case tests (e.g., empty collection removals).
| `HokieShoppingUI` | Mohammed Almahyawi | Wrote the UI class |

**GenAI Note:**


Generative AI (Google Gemini) was utilized as a thought partner to understand Object-Oriented memory principles (passing dummy objects to match via `.equals()`), evaluate Big-O time complexity for linear traversals, and format the JUnit test suite to align with the `student.TestCase` architecture. All generated test cases were reviewed to ensure they accurately targeted the application's actual validation logic.

Additionally, the helper methods in HokieShoppingUI were suggested by LLM (ChatGPT) to resolve an issue we had with having to call these method for start() method, but those methods weren't accessible from ShoppingCartManager. This solution was reviewed and approved by Mohammed Almahyawi (mohammeda24). 


TO DO
- remove redundant qeustions when removing item
- display prints items and info in cart, not just amount of items
- implement stetch goals
- fix remove method for dormsupply, only works for groceryitem
