package itea.task3;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        FlowerStore fs = new FlowerStore();
        List<Flowers> flowersF = fs.sell(2,4,5);

        flowersF.stream().map(f -> f + ",").forEach(System.out::print);

        System.out.println();

        List<Flowers> flowersS = fs.sellSequence(2,4,5);
        flowersS.stream().map(f -> f + ",").forEach(System.out::print);
    }
}
