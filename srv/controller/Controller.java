package srv.controller;

import java.util.Scanner;

import srv.calculator.AdditionStrategy;
import srv.calculator.CalculatorModel;
import srv.calculator.Complex;
import srv.calculator.DivisionStrategy;
import srv.calculator.MultiplicationStrategy;
import srv.calculator.OperationStrategy;
import srv.calculator.SubtractStrategy;
import srv.view.View;

public class Controller {

    private CalculatorModel model;
    private View view;
    private Scanner scanner;

    public Controller(CalculatorModel model, View view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void processUserInput() {
        view.displayMenu();
        int choice = scanner.nextInt();
        Complex num1 = view.readComplexNumber();
        Complex num2 = view.readComplexNumber();
        OperationStrategy strategy = null;

        switch (choice) {
            case 1:
                strategy = new AdditionStrategy();
                break;
            case 2:
                strategy = new SubtractStrategy();
                break;
            case 3:
                strategy = new MultiplicationStrategy();
                break;
            case 4:
                strategy = new DivisionStrategy();
                break;
            default:
                view.displayErrorMessage("Неверный выбор");
                return;
        }

        model.setNum1(num1);
        model.setNum2(num2);
        Complex result = model.calculateResult(strategy);
        view.displayResult(result);
    }
}