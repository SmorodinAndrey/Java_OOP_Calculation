package srv.calculator;

import srv.util.Logger;

public class CalculatorModel {

    private Complex num1;
    private Complex num2;

    public void setNum1(Complex num1) {
        this.num1 = num1;
    }

    public void setNum2(Complex num2) {
        this.num2 = num2;
    }

    public Complex calculateResult(OperationStrategy strategy) {
        if (num1 == null || num2 == null) {
            Logger.log("Ошибка: Отсутствуют комплексные числа для операции");
            throw new IllegalArgumentException("Комплексные числа не могут быть нулевыми");
        }

        Complex result = strategy.performOperation(num1, num2);
        Logger.log("Operation: " + strategy.getClass().getSimpleName() + " - Result: " + result);
        return result;
    }
}