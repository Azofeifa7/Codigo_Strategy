package una.strategy;

public class Division implements IOperacion{

    @Override
    public double operacion(double a, double b) {
        return a/b;
    }
}
