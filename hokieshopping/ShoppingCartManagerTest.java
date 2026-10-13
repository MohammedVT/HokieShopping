package hokieshopping;


import student.TestCase;

/**
 * Tests for the ShoppingCartManager covering normal and bad-input cases[cite: 2].
 */
public class ShoppingCartManagerTest {

    private ShoppingCartManager manager;

    @BeforeEach
    public void setUp() {
        manager = new ShoppingCartManager();
    }

    @Test
    public void testAddGroceryItemNormalCase() {
        // TODO: Call addGroceryItem("Apples", "Produce")[cite: 6]
        // TODO: Assert size increases to 1 and method returns true[cite: 6]
        
    }

    @Test
    public void testAddGroceryItemBadInputBlank() {
        // TODO: Call addGroceryItem(" ", "Produce")[cite: 6]
        // TODO: Assert returns false and size remains 0[cite: 6]
    }

    @Test
    public void testAddGroceryItemBadInputTooLong() {
        // TODO: Call addGroceryItem with a 65-character string[cite: 6]
        // TODO: Assert item is added, returns true, and name is truncated to 50 chars[cite: 6]
    }

    @Test
    public void testAddDormSupplyNormalCase() {
        // TODO: Call addDormSupply("Paper Towels", 14)[cite: 6]
        // TODO: Assert item is added and returns true[cite: 6]
    }

    @Test
    public void testAddDormSupplyBadInputNegativeCycle() {
        // TODO: Call addDormSupply("Paper Towels", -5)[cite: 6]
        // TODO: Assert returns false and chain size remains 0[cite: 6]
    }

    @Test
    public void testRemoveGroceryItemEmptyChain() {
        // TODO: Attempt to remove an item from an empty chain[cite: 6]
        // TODO: Assert it returns false and does not crash[cite: 2, 6]
    }
}