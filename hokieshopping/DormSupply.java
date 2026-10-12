package hokieshopping;

public class DormSupply implements ShoppableItem {
    private String name;
    private int consumptionCycleDays;

    public DormSupply(String name, int consumptionCycleDays) 
    {
        this.name = name;
        this.consumptionCycleDays = consumptionCycleDays;
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
    public String toFileString() 
    {
        return this.name + "," + this.consumptionCycleDays;
    }

    @Override
    public String toString() {
        // TODO: Implement string representation
        return null;
    }
}