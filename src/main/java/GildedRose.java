import java.util.ArrayList;
import java.util.List;


public class GildedRose {

    private static List<Item> items = new ArrayList<Item>();

    public static void main(String[] args) {
        System.out.println("OMGHAI!");
        createItems();
        updateQuality();
    }

    public static List<Item> items() {
        return items;
    }

    static void createItems() {
        items = new ArrayList<Item>();
        items.add(new DexterityVest());
        items.add(new AgedBrie());
        items.add(new Mongoose());
        items.add(new Sulfuras());
        items.add(new Backstage());
        items.add(new ConjuredManaCake());
    }

    public static void updateQuality() {
        for (Item item : items) {
            item.updateQuality();
        }
    }
}