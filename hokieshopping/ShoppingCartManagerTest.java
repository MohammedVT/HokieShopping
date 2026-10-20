package hokieshopping;

import student.TestCase;

public class ShoppingCartManagerTest extends TestCase {
    
    private ShoppingCartManager manager;

    public void setUp() {
        // student.TestCase automatically runs this before each test method
        manager = new ShoppingCartManager();
    }

    // --- addGroceryItem Tests ---
    
    public void testAddGroceryItemNormal() {
        assertTrue(manager.addGroceryItem("Apples", "Produce"));
        assertEquals(1, manager.size());
        assertFalse(manager.isEmpty());
    }

    public void testAddGroceryItemBadInput() {
        assertFalse(manager.addGroceryItem(null, "Produce"));
        assertFalse(manager.addGroceryItem("", "Produce"));
        assertFalse(manager.addGroceryItem("Apples", null));
        assertEquals(0, manager.size());
    }

    public void testAddGroceryItemTruncation() {
        String longName = "A".repeat(60); // 60 character string
        assertTrue(manager.addGroceryItem(longName, "Produce"));
        
        String expectedTruncatedName = "A".repeat(50);
        assertTrue(manager.containsGroceryItem(expectedTruncatedName, "Produce"));
    }

    // --- addDormSupply Tests ---

    public void testAddDormSupplyNormal() {
        assertTrue(manager.addDormSupply("Paper Towels", 30));
        assertEquals(1, manager.size());
    }

    public void testAddDormSupplyBadInput() {
        assertFalse(manager.addDormSupply(null, 30));
        assertFalse(manager.addDormSupply("Paper Towels", 0));
        assertFalse(manager.addDormSupply("Paper Towels", -5));
    }

    // --- removeGroceryItem Tests ---

    public void testRemoveGroceryItemNormal() {
        manager.addGroceryItem("Apples", "Produce");
        assertTrue(manager.removeGroceryItem("Apples"));
        assertEquals(0, manager.size());
    }

    public void testRemoveGroceryItemBadInput() {
        manager.addGroceryItem("Apples", "Produce");
        assertFalse(manager.removeGroceryItem("Bananas"));
        assertFalse(manager.removeGroceryItem(""));
        assertFalse(manager.removeGroceryItem(null));
    }

    public void testRemoveFromEmptyCart() {
        assertFalse(manager.removeGroceryItem("Apples"));
    }

    // --- removeDormSupply Tests ---

    public void testRemoveDormSupplyNormal() {
        manager.addDormSupply("Soap", 60);
        assertTrue(manager.removeDormSupply("Soap"));
        assertEquals(0, manager.size());
    }

    public void testRemoveDormSupplyBadInput() {
        manager.addDormSupply("Soap", 60);
        assertFalse(manager.removeDormSupply("Towels"));
        assertFalse(manager.removeDormSupply(""));
        assertFalse(manager.removeDormSupply(null));
    }

    // --- containsGroceryItem Tests ---

    public void testContainsGroceryItem() {
        manager.addGroceryItem("Milk", "Dairy");
        assertTrue(manager.containsGroceryItem("Milk", "Dairy"));
        assertFalse(manager.containsGroceryItem("Eggs", "Dairy"));
    }

    // --- size and isEmpty Tests ---

    public void testSizeAndIsEmpty() {
        assertTrue(manager.isEmpty());
        assertEquals(0, manager.size());

        manager.addGroceryItem("Apples", "Produce");
        assertFalse(manager.isEmpty());
        assertEquals(1, manager.size());

        manager.addDormSupply("Soap", 60);
        assertEquals(2, manager.size());
    }

    // --- clearCart Tests ---

    public void testClearCart() {
        manager.addGroceryItem("Apples", "Produce");
        manager.addDormSupply("Soap", 60);
        manager.clearCart();
        
        assertTrue(manager.isEmpty());
        assertEquals(0, manager.size());
    }
}