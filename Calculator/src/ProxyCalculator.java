public class ProxyCalculator implements Methods {

    private double a;
    private double b;
    private Calculator calculator;

    public ProxyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double div(double a, double b) {
        if(calculator == null){
            calculator = new Calculator(a, b);
        } calculator.div(a, b);
        return a/b;
    }
}

