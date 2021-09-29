package una.strategy;

public class Multiplicacion implements IOperacion{

    @Override
    public double operacion(double a, double b) {
        return a*b;
    }
}
