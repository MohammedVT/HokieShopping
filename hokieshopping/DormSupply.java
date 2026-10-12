/**
 * Represents a recurring dorm essential[cite: 6].
 */
public class DormSupply implements ShoppableItem {
    private String name;
    private int consumptionCycleDays;

    public DormSupply(String name, int consumptionCycleDays) {
        // TODO: Initialize name and consumption cycle
    }

    @Override
    public String getName() 
    {
        return name;
    }

    public int getConsumptionCycleDays() {
        // TODO: Implement
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: Implement equivalence matching[cite: 6]
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