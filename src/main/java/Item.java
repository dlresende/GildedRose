
public abstract class Item {
    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    public void updateQuality() {
        decreaseQuality();

        if (getSellIn() < 0) {
            decreaseQuality();
        }

        decreaseSellIn();
    }

    public void dropQuality() {
        setQuality(0);
    }

    public void decreaseSellIn() {
        setSellIn(getSellIn() - 1);
    }

    public void decreaseQuality() {
        if (getQuality() > 0) {
            setQuality(getQuality() - 1);
        }
    }

    public void increaseQuality() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
    }

    /* Generated getter and setter code */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", sellIn=" + sellIn +
                ", quality=" + quality +
                '}';
    }
}
