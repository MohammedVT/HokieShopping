/**
 * Represents a standard grocery product[cite: 6].
 */
public class GroceryItem implements ShoppableItem {
    private String name;
    private String category;

    public GroceryItem(String name, String category) {
        // TODO: Initialize name and category
    }

    @Override
    public String getName() 
    {
        return name;
    }

    public String getCategory() 
    {
        return category;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: Implement case-insensitive matching[cite: 6]
        return false;
    }

    @Override
    public String toFileString() {
        // TODO: Implement file formatting string
        return null;
    }
    
    @Override
    public String toString() {
        // TODO: Implement string representation
        return null;
    }
}