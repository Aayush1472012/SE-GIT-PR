import static org.junit.jupiter.api.Assertions.assertEquals;

class CupTest {
    @org.junit.jupiter.api.Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice", 82.2);
        assertEquals("Orange Juice", c.getLiquidType());
    }

    @org.junit.jupiter.api.Test
    void setLiquidType() {
        Cup c = new Cup("Orange Juice", 82.2);
        assertEquals(82.2, c.getPercentFull());
    }

    @org.junit.jupiter.api.Test
    void getPercentFull() {
        Cup c = new Cup("Orange Juice", 82.2);
        c.setLiquidType("Water");
        assertEquals("Water", c.getLiquidType());
    }

    @org.junit.jupiter.api.Test
    void setPercentFull() {
        Cup c = new Cup("Orange Juice", 85.2);
        c.setPercentFull(82.2);
        assertEquals(82.2, c.getPercentFull());
    }
}