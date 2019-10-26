package itea.task3;

public class Chamomile extends Flowers{
    final StringBuilder name = new StringBuilder("Chamomile");
    int price = 70;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Chamomile";
    }
}
