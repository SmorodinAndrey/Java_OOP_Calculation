package srv.calculator;

public interface OperationStrategy {
    Complex performOperation(Complex num1, Complex num2);
}