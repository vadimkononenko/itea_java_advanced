package itea.task4.calculator;

import java.util.Arrays;

public class Service {
    public double calculate(double a, double b, char c) {
        Operations operations = Arrays.stream(Operations.values())
                .filter(f -> f.getOperation().equals(c))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
        return operations.calc(a, b);
    }
}
