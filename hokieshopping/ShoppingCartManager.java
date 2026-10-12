/**
 * Intermediary handling logic, validation, and operations on the LinkedChain[cite: 6].
 */
public class ShoppingCartManager {
    public static final int MAX_NAME_LENGTH = 50;
    
    private LinkedChain<ShoppableItem> groceryCart;
    // private HokieShoppingStorage storage; // TODO: Stretch goal[cite: 6]

    public ShoppingCartManager() {
        // TODO: Instantiate the LinkedChain[cite: 6]
        
    }

    public boolean addGroceryItem(String name, String category) {
        // TODO: Validate input (reject null/blank, truncate >50 chars)[cite: 6]
        // TODO: Create GroceryItem and add to chain[cite: 6]
        return false;
    }

    public boolean addDormSupply(String name, int consumptionCycleDays) {
        // TODO: Validate inputs (reject null/blank, positive int for cycle)[cite: 6]
        // TODO: Create DormSupply and add to chain[cite: 6]
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

    public void clearCart() {
        // TODO: Implement clear functionality[cite: 6]
    }

    public int size() {
        // TODO: Return chain size[cite: 6]
        return 0;
    }

    public boolean isEmpty() {
        // TODO: Return if chain is empty[cite: 6]
        return false;
    }
}