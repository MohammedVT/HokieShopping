package hokieshopping;

public class GroceryItem implements ShoppableItem {
    private String name;
    private String category;

    public GroceryItem(String name, String category) 
    {
        this.name = name;
        this.category = category;
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
    public boolean equals(Object obj) 
    {
        // TODO: Implement case-insensitive matching[cite: 6]
        if (this == obj)
        {
            return true;
        }
        else if (obj != null)
        {
            if (this.getClass() == obj.getClass())
            {
                GroceryItem otherItem = (GroceryItem) obj;
                boolean namesEqual = this.name.equalsIgnoreCase(otherItem.getName());
                boolean catsEqual = this.category.equalsIgnoreCase(otherItem.getCategory());
                
                if (namesEqual && catsEqual)
                {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toFileString() 
    {
        return this.name + "," + this.category;
    }
    
    @Override
    public String toString() {
        // TODO: Implement string representation
        return null;
    }
}