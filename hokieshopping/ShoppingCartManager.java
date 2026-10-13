package hokieshopping;

public class ShoppingCartManager {
    public static final int MAX_NAME_LENGTH = 50;
    
    private LinkedChain<ShoppableItem> groceryCart;
    // private HokieShoppingStorage storage; 
    // TODO: Stretch goal[cite: 6]

    public ShoppingCartManager() 
    {
        groceryCart = new LinkedChain<>();
        // TODO: Instantiate the LinkedChain[cite: 6]
        
        
    }

    public boolean addGroceryItem(String name, String category) 
    {
        // TODO: Validate input (reject null/blank, truncate >50 chars)[cite: 6]
        
        if (name != null && category != null && !name.isBlank())
        {
            if (name.length() > MAX_NAME_LENGTH)
            {
                name = name.substring(0, MAX_NAME_LENGTH);
            }
            
            GroceryItem item = new GroceryItem(name, category);
            groceryCart.add(item);
            return true;
            
        }
        // TODO: Create GroceryItem and add to chain[cite: 6]
        return false;
    }

    public boolean addDormSupply(String name, int consumptionCycleDays) {
        if (name != null && consumptionCycleDays > 0 && !name.isBlank())
        {
            if (name.length() > MAX_NAME_LENGTH)
            {
                name = name.substring(0, MAX_NAME_LENGTH);
            }

            DormSupply item = new DormSupply(name, consumptionCycleDays);
            groceryCart.add(item);
            return true;
        }
        return false;
    }

    public boolean removeGroceryItem(String name) {
        // TODO: Implement removal[cite: 6]
        return false;
    }

    public boolean removeDormSupply(String name) {
        // TODO: Implement removal[cite: 6]
        return false;
    }
    
    public boolean containsItem(ShoppableItem item) {
        // TODO: Implement contains check[cite: 6]
        return false;
    }

    public int size() 
    {
        return groceryCart.size();
    }

    public boolean isEmpty() 
    {
        return groceryCart.isEmpty();
    }

    public void clearCart() 
    {
        groceryCart.clear();
    }}