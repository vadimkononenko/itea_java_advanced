package itea.task4.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Service {

    private final Map<Character, Function<Double[], Double>> item;


    public Service() {
        this.item = new HashMap<>();
        item.put('+', this::add);
        item.put('-', this::subtract);
        item.put('*', this::multiply);
        item.put('/', this::divide);
        item.put('s', this::square);
        item.put('^', this::pow);
        item.put('&', this::powAdvanced);
    }

    public Double calculate(char itemChar, double a, double b) {
        Double[] array = new Double[]{a, b};
        Function<Double[], Double> f = item.get(itemChar);
        return f.apply(array);
    }

    private Double add(Double[] array) {
        double a = array[0];
        double b = array[1];
        return a + b;
    }

    private Double subtract(Double[] array) {
        double a = array[0];
        double b = array[1];
        return a - b;
    }

    private Double multiply(Double[] array) {
        double a = array[0];
        double b = array[1];
        return a * b;
    }

    private Double divide(Double[] array) {
        double a = array[0];
        double b = array[1];
        return a / b;
    }

    private Double square(Double[] array) {
        double a = array[0];
        double b = array[1];
        return Math.pow(a, 1.0 * b);
    }

    private Double pow(Double[] array) {
        double a = array[0];
        double b = array[1];
        return Math.pow(a, b);
    }

    private Double powAdvanced(Double[] array) {
        double a = array[0];
        double b = array[1];
        double sum = ((a + b) / a) + 117;
        return Math.pow(sum, 2);
    }
}
