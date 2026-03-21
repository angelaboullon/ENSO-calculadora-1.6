package calculator.operators;

public class AcosOperator implements UnaryOperator {
    @Override
    public Double execute(Double num) {
        // Dominio del arco coseno: solo entre -1 y 1
        if (num < -1 || num > 1) {
            return Double.NaN; // Devolver NaN hará que la pantalla muestre "Error"
        }
        // Calculamos y pasamos a grados obligatoriamente
        return Math.toDegrees(Math.acos(num));
    }
}
