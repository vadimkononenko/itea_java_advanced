package itea.hmwk3;

public class Rose extends Flowers {
    int price = 100;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Rose";
    }
}
