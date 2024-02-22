package srv.calculator;

public class SubtractStrategy implements OperationStrategy {

    @Override
    public Complex performOperation(Complex num1, Complex num2) {
        double real = num1.getReal() - num2.getReal();
        double imaginary = num1.getImaginary() - num2.getImaginary();
        return new Complex(real, imaginary);
    }
}