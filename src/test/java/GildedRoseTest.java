import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class GildedRoseTest {

	@Test
	public void should_update_quality() {
		GildedRose.main(null);

        assertThat(GildedRose.items().toString(), equalTo("[" +
                "Item{name='+5 Dexterity Vest', sellIn=9, quality=19}, " +
                "Item{name='Aged Brie', sellIn=1, quality=1}, " +
                "Item{name='Elixir of the Mongoose', sellIn=4, quality=6}, " +
                "Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}, " +
                "Item{name='Backstage passes to a TAFKAL80ETC concert', sellIn=14, quality=21}, " +
                "Item{name='Conjured Mana Cake', sellIn=2, quality=5}]"));
	}

    @Test
	public void should_update_quality_after_1000_days() {
        GildedRose.createItems();

        for(int i = 0; i < 1000; i++) {
		    GildedRose.updateQuality();
        }

        assertThat(GildedRose.items().toString(), equalTo("[" +
                "Item{name='+5 Dexterity Vest', sellIn=-990, quality=0}, " +
                "Item{name='Aged Brie', sellIn=-998, quality=50}, " +
                "Item{name='Elixir of the Mongoose', sellIn=-995, quality=0}, " +
                "Item{name='Sulfuras, Hand of Ragnaros', sellIn=0, quality=80}, " +
                "Item{name='Backstage passes to a TAFKAL80ETC concert', sellIn=-985, quality=0}, " +
                "Item{name='Conjured Mana Cake', sellIn=-997, quality=0}]"));
	}
}
