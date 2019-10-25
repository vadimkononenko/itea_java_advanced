package itea.hmwk3;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {
    Flowers fFirst = new Flowers();

    public List<Flowers> sell(int countRose, int countChamomile, int countTulip) {
        List<Flowers> bunchOfFlowers = new ArrayList<>();
        int sum = countRose + countChamomile + countTulip;

        for (int i = 0; i < sum; i++) {
            if (i < countRose) {
                bunchOfFlowers.add(new Rose());
            } else if (i >= countRose && i < countChamomile + countRose) {
                bunchOfFlowers.add(new Chamomile());
            } else {
                bunchOfFlowers.add(new Tulip());
            }
        }

        return bunchOfFlowers;
    }

    public List<Flowers> sellSequence(int countRose, int countChamomile, int countTulip) {
        List<Flowers> bunchOfFlowers = new ArrayList<>(countRose+countChamomile+countTulip);
        int max = Math.max(countRose,countChamomile);
        max = Math.max(max,countTulip);

        for(int i = 0; i < max; i++){
            if(i < countRose){
                bunchOfFlowers.add(new Rose());
            }else if(i < countChamomile){
                bunchOfFlowers.add(new Chamomile());
            }else if(i < countTulip){
                bunchOfFlowers.add(new Tulip());
            }
        }

        return bunchOfFlowers;
    }
}
