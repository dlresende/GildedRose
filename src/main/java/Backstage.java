public class Backstage extends Item {
    public Backstage() {
        super("Backstage passes to a TAFKAL80ETC concert", 15, 20);
    }

    @Override
    public void updateQuality() {
        increaseQuality();

        if (getSellIn() < 11) {
            increaseQuality();
        }

        if (getSellIn() < 6) {
            increaseQuality();
        }

        if (getSellIn() < 0) {
            dropQuality();
        }

        decreaseSellIn();
    }
}
