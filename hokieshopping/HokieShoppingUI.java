package hokieshopping;

import java.util.*;

/**
 * Handles all console input/output.
 */
public class HokieShoppingUI {
    private Scanner scanner;
    private ShoppingCartManager manager;
    
    public HokieShoppingUI(ShoppingCartManager manager) {
        this.manager = manager;
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        boolean running = true;
        while (running) {
            displayMenu();
            String choice = scanner.nextLine();
            
            if (choice.equals("1")) {
                addGroceryItem();
            } else if (choice.equals("2")) {
                addDormSupply();
            } else if (choice.equals("3")) {
                removeGroceryItem();
            } else if (choice.equals("4")) {
                removeDormSupply();
            } else if (choice.equals("5")) {
                displayItems();
            } else if (choice.equals("6")) {
                manager.clearCart();
                System.out.println("Shopping list cleared.");
            } else if (choice.equals("7")) {
                running = false;
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
    
    public void displayMenu() {
        System.out.println(
            "\n=== HokieShopping ===\n"
            + "1. Add grocery item\n"
            + "2. Add dorm supply\n"
            + "3. Remove grocery item\n"
            + "4. Remove dorm supply\n"
            + "5. View shopping list\n"
            + "6. Clear shopping list\n"
            + "7. Exit\n"
            + "Choose an option: "
        );
    }

    private void addGroceryItem() {
        System.out.print("Enter grocery name: ");
        String name = scanner.nextLine();
        System.out.print("Enter category (e.g., Produce, Snacks): ");
        String category = scanner.nextLine();
        
        if (manager.addGroceryItem(name, category)) {
            System.out.println(name + " added successfully.");
        } else {
            System.out.println("Failed to add item. Check that inputs are not blank.");
        }
    }

    private void addDormSupply() {
        System.out.print("Enter dorm supply name: ");
        String name = scanner.nextLine();
        System.out.print("Enter consumption cycle (in days): ");
        try {
            int days = Integer.parseInt(scanner.nextLine());
            if (manager.addDormSupply(name, days)) {
                System.out.println(name + " added successfully.");
            } else {
                System.out.println("Failed to add item. Ensure cycle is greater than 0 and name is not blank.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number for days.");
        }
    }

    private void removeGroceryItem() 
    {
        System.out.print("Enter grocery name to remove: ");
        String name = scanner.nextLine();
        
        if (manager.removeGroceryItem(name)) {
            System.out.println(name + " removed successfully.");
        } else {
            System.out.println(name + " not found in the cart.");
        }
    }

    private void removeDormSupply() 
    {
        System.out.print("Enter dorm supply name to remove: ");
        String name = scanner.nextLine();
        
        if (manager.removeDormSupply(name)) {
            System.out.println(name + " removed successfully.");
        } else {
            System.out.println(name + " not found in the cart.");
        }
    }
    
    public void displayItems() {
        if (manager.isEmpty()) {
            System.out.println("Shopping list is empty.");
        } else {
            System.out.println("Items currently in shopping list: " + manager.size());
            System.out.println(manager.toString());
        }
    }

    public static void main(String[] args) {
        ShoppingCartManager manager = new ShoppingCartManager();
        HokieShoppingUI ui = new HokieShoppingUI(manager);
        ui.start();
    }
}