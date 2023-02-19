public class Main {
    public static void main(String[] args) {
        Methods calculator;
        boolean isProd = true;
        if (isProd) {
            calculator = new Calculator();
        } else {
            calculator = new ProxyCalculator(new Calculator());
        }
        System.out.println(calculator.add(12, 5));
        System.out.println(calculator.sub(12, 5));
        System.out.println(calculator.div(12, 5));
        System.out.println(calculator.mul(12, 5));

        //Methods methods = new ProxyCalculator(12,4);
        //methods.div(12,2);
    }
}