public class Calculator implements Methods {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
        check();
    }

    @Override
    public double div(double a, double b) {
        double result = a/b;
        if (b == 0) {
            throw new ArithmeticException("Divisor cannot div by zero");
        }
        System.out.println(result);
        return result;
    }

    public void check(){
        System.out.println(a +" " +  b);
    }
}
