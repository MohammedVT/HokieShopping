package hokieshopping;

import java.util.*;

/**
 * Handles all console input/output[cite: 6].
 */
public class HokieShoppingUI
{
    

    private Scanner scanner;
    private ShoppingCartManager manager;
    
    /**
     * constructor method that creats the user interface.
     *
     * @param manager the ShoppingCartManager used in the program
     */
    public HokieShoppingUI(ShoppingCartManager manager)
    {
        this.manager = manager;
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Runs the main program loop.
     */
    public void start()
    {
        boolean running = true;
        
        while (running)
        {
            displayMenu();
            
            String choice = scanner.nextLine();
            
            if (choice.equals("1"))
            {
                addGroceryItem();
            }
            else if (choice.equals("2"))
            {
                addDormSupply();
            }
            else if (choice.equals("3"))
            {
                removeGroceryItem();
            }
            else if (choice.equals("4"))
            {
                removeDormSupply();
            }
            else if (choice.equals("5"))
            {
                displayItems();
            }
            else if (choice.equals("6"))
            {
                manager.clearCart();
                System.out.println("Shopping list cleared.");
            }
            else if (choice.equals("7"))
            {
                running = false;
                System.out.println("Goodbye!");
            }
            else
            {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
    
    /**
     * Displays the main menu.
     */
    public void displayMenu()
    {
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
    
    /**
     * this displays information about the shopping list.
     */
    public void displayItems()
    {
        if (manager.isEmpty())
        {
            System.out.println("Shopping list is empty.");
        }
        else
        {
            System.out.println(
                "Items currently in shopping list: " + manager.size());
        }
    }
    
    /**
     * this is main method that starts the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        ShoppingCartManager manager = new ShoppingCartManager();
        HokieShoppingUI ui = new HokieShoppingUI(manager);
        
        ui.start();
    }
}