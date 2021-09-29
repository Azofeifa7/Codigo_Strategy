package una.strategy;

public class Resta implements IOperacion{

    @Override
    public double operacion(double a, double b) {
        return a-b;
    }
}
