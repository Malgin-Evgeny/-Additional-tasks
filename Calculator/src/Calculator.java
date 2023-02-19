public class Calculator implements Methods {
    private double a;
    private double b;

    public Calculator() {}

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
        check();
    }


    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        double result = a / b;
        if (b == 0) {
            throw new ArithmeticException("Divisor cannot div by zero");
        }
        return result;
    }

    public void check() {
        System.out.println(a + " " + b);
    }
}
