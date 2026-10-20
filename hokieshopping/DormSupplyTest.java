package hokieshopping;

import student.TestCase;

public class DormSupplyTest extends TestCase {
    private DormSupply supply;

    public void setUp() {
        supply = new DormSupply("Paper Towels", 30);
    }

    public void testGetName() {
        assertEquals("Paper Towels", supply.getName());
    }

    public void testGetConsumptionCycleDays() {
        assertEquals(30, supply.getConsumptionCycleDays());
    }

    public void testEqualsNormal() {
        DormSupply sameSupply = new DormSupply("Paper Towels", 30);
        assertTrue(supply.equals(sameSupply));
        
        DormSupply lowerCaseSupply = new DormSupply("paper towels", 30);
        assertTrue(supply.equals(lowerCaseSupply));
    }

    public void testEqualsBadInput() {
        DormSupply differentName = new DormSupply("Soap", 30);
        assertFalse(supply.equals(differentName));

        DormSupply differentCycle = new DormSupply("Paper Towels", 15);
        assertFalse(supply.equals(differentCycle));

        assertFalse(supply.equals(null));
        assertFalse(supply.equals("A String Object"));
    }

    public void testToFileString() {
        assertEquals("Paper Towels,30", supply.toFileString());
    }
}