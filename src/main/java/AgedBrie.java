public class AgedBrie extends Item {
    public AgedBrie() {
        super("Aged Brie", 2, 0);
    }

    @Override
    public void updateQuality() {
        increaseQuality();

        if (getSellIn() < 0) {
            increaseQuality();
        }

        decreaseSellIn();
    }
}
