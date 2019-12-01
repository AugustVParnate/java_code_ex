import java.util.function.BiFunction;

public enum MathOperator {

    PLUS('+', Double::sum),
    MINUS('-', (a, b) -> a - b),
    MULTIPLY('*', (a, b) -> a * b),
    DIVIDE('/', (a, b) -> a / b);

    private final char symbolicRepresentation;
    public final BiFunction<Double, Double, Double> operation;

    MathOperator(char symbolicRepresentation, BiFunction<Double, Double, Double> operation) {
        this.symbolicRepresentation = symbolicRepresentation;
        this.operation = operation;
    }

    public Double performOperation(Double a, Double b) {
        return operation.apply(a, b);
    }

    public static MathOperator from(char symbolicRepresentation) {
        for (MathOperator operator : values()) {
            if (operator.symbolicRepresentation == symbolicRepresentation) {
                return operator;
            }
        }

        throw new IllegalArgumentException("Operator not found!");
    }
}
