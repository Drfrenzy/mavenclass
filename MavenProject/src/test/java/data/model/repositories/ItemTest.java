package data.model.repositories;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    private Item manager;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        manager = new Item("Rice", 0, "white Sack", 0);
    }
    @Test
    public void testSave(){
        Item item = new Item("Rice", 0, "white Sack", 0);
        manager.save(item);
        assertEquals(manager.getCount(), 1);
    }
}