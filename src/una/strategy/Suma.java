package una.strategy;

public class Suma implements IOperacion{

    @Override
    public double operacion(double a, double b) {
        return a+b;
    }
}
