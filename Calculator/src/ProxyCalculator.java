public class ProxyCalculator implements Methods {

    private Calculator calculator;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double add(double a, double b) {
        return calculator.add(a,b);
    }

    @Override
    public double sub(double a, double b) {
        return calculator.sub(a,b);
    }

    @Override
    public double mul(double a, double b) {
        double result = 0;
        for(int i = 0; i < a; i++) {
            result += b;
        }
        return result;
    }

    @Override
    public double div(double a, double b) {
        return a/b;
    }
}

