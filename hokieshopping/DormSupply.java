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
                DormSupply otherItem = (DormSupply) obj;
                boolean namesEqual = this.name.equalsIgnoreCase(otherItem.getName());
                boolean consDays = this.consumptionCycleDays == otherItem.getConsumptionCycleDays();
                
                if (namesEqual && consDays)
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
        return this.name + "," + this.consumptionCycleDays;
    }

    @Override
    public String toString() {
        // TODO: Implement string representation
        return null;
    }
}
