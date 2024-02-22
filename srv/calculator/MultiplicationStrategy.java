package srv.calculator;

public class MultiplicationStrategy implements OperationStrategy {

    @Override
    public Complex performOperation(Complex num1, Complex num2) {
        double real = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginary = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new Complex(real, imaginary);
    }
}