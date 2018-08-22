package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    //this is a comment

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foooo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foooo", app.items[0].name);
    }

}
