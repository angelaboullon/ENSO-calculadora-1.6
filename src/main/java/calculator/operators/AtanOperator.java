package calculator.operators;

public class AtanOperator implements UnaryOperator {
    @Override
    public Double execute(Double num) {
        // La tangente inversa acepta cualquier número, no hay error de dominio
        return Math.toDegrees(Math.atan(num));
    }
}
