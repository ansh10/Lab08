package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn'exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void deleteCity_removesExistingCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        list.deleteCity(calgary);

        assertFalse(list.hasCity(calgary));
    }
    @Test
    public void countCities_returnsSize() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());
        list.addCity(new City("Calgary", "AB"));
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(2, list.countCities());
    }


}