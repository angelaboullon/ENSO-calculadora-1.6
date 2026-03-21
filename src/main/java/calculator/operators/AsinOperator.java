package calculator.operators;

public class AsinOperator implements UnaryOperator {
    @Override
    public Double execute(Double num) {
        // Dominio del arco seno: solo entre -1 y 1
        if (num < -1 || num > 1) {
            return Double.NaN;
        }
        return Math.toDegrees(Math.asin(num));
    }
}
