package srv.view;

import java.util.Scanner;

import srv.calculator.Complex;

public class View {

    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
    }

    public Complex readComplexNumber() {
        System.out.print("Введите вещественную часть: ");
        double real = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imaginary = scanner.nextDouble();
        return new Complex(real, imaginary);
    }

    public void displayResult(Complex result) {
        System.out.println("Результат: " + result);
    }

    public void displayErrorMessage(String message) {
        System.out.println("Ошибка: " + message);
    }
}