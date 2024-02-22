package srv;

import srv.calculator.CalculatorModel;
import srv.controller.Controller;
import srv.view.View;

public class Main {

    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUserInput();
    }
}