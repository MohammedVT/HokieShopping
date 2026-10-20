package hokieshopping;

import student.TestCase;

public class GroceryItemTest extends TestCase {
    private GroceryItem item;

    public void setUp() {
        item = new GroceryItem("Milk", "Dairy");
    }

    public void testGetName() {
        assertEquals("Milk", item.getName());
    }

    public void testGetCategory() {
        assertEquals("Dairy", item.getCategory());
    }

    public void testEqualsNormal() {
        GroceryItem sameItem = new GroceryItem("Milk", "Dairy");
        assertTrue(item.equals(sameItem));
        
        GroceryItem lowerCaseItem = new GroceryItem("milk", "dairy");
        assertTrue(item.equals(lowerCaseItem));
    }

    public void testEqualsBadInput() {
        GroceryItem differentName = new GroceryItem("Eggs", "Dairy");
        assertFalse(item.equals(differentName));

        GroceryItem differentCategory = new GroceryItem("Milk", "Produce");
        assertFalse(item.equals(differentCategory));

        assertFalse(item.equals(null));
        assertFalse(item.equals("A String Object"));
    }

    public void testToFileString() {
        assertEquals("Milk,Dairy", item.toFileString());
    }
}