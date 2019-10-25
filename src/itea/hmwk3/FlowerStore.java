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
        List<Flowers> bunchOfFlowers = new ArrayList<>();
        int sum = countRose + countChamomile + countTulip;

        int iterR = countRose;
        int iterC = countChamomile;
        int iterT = countTulip;
        for (int i = 0; i < sum; i++) {

            if (iterR > 0 && iterC > 0 && iterT > 0) {
                bunchOfFlowers
                        .add(new Rose());
                iterR--;
                bunchOfFlowers
                        .add(new Chamomile());
                iterC--;
                bunchOfFlowers
                        .add(new Tulip());
                iterT--;
            } else if (iterR == 0 && iterC == 0 && iterT == 0) {
                break;
            } else if (iterR == 0 || iterC == 0 || iterT == 0) {
                //Flowers fFirst;
                Flowers fClass;
                int ii = i - 1;

                if (bunchOfFlowers.size() == 0) {
                    fFirst = getFirstItem(iterR, iterC, iterT);
                    if (fFirst != null) {
                        bunchOfFlowers
                                .add(fFirst);
                    }

                    if (fFirst instanceof Rose) {
                        iterR--;
                    } else if (fFirst instanceof Chamomile) {
                        iterC--;
                    } else if (fFirst instanceof Tulip) {
                        iterT--;
                    }
                }


                if (fFirst instanceof Rose && iterC > 0) {
                    bunchOfFlowers
                            .add(new Chamomile());
                    iterC--;
                } else if (fFirst instanceof Rose && iterC == 0) {
                    bunchOfFlowers
                            .add(new Tulip());
                    iterT--;
                }else if(fFirst instanceof Rose && iterT > 0 && iterC == 0){
                    bunchOfFlowers
                            .add(new Tulip());
                }
                else if (fFirst instanceof Chamomile && iterT > 0) {
                    bunchOfFlowers
                            .add(new Tulip());
                    iterT--;
                } else if (fFirst instanceof Tulip && iterR == 0 && iterC == 0) {
                    bunchOfFlowers
                            .add(new Tulip());
                    iterT--;
                }else if(fFirst instanceof Tulip && iterR == 0 && iterC > 0){
                    bunchOfFlowers
                            .add(new Chamomile());
                    iterC--;
                } else if (fFirst instanceof Tulip && iterR > 0 && iterC == 0) {
                    bunchOfFlowers
                            .add(new Rose());
                }


            }

        }
        return bunchOfFlowers;
    }

    public Flowers getClassFlower(Flowers flower) {

        if (flower instanceof Rose) {
            return new Rose();
        } else if (flower instanceof Chamomile) {
            return new Chamomile();
        } else if (flower instanceof Tulip) {
            return new Tulip();
        } else {
            return null;
        }
    }

    public Flowers getFirstItem(int iterR, int iterC, int iterT) {
        if (iterR > 0) {
            return new Rose();
        } else if (iterC > 0) {
            return new Chamomile();
        } else if (iterT > 0) {
            return new Tulip();
        } else {
            return null;
        }
    }
}
