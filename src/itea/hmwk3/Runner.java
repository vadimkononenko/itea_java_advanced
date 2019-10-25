package itea.hmwk3;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        FlowerStore fs = new FlowerStore();
        List<Flowers> flowersF = fs.sell(2,4,5);

        for(Flowers f : flowersF){
            System.out.print(f + ",");
        }

        System.out.println();

        List<Flowers> flowersS = fs.sellSequence(2,4,5);
        for(Flowers f : flowersS){
            System.out.print(f + ",");
        }
    }
}
