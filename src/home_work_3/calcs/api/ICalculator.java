package home_work_3.calcs.api;

public interface ICalculator {
    /**
     *Интерфейс модулей
     */
    double addition(double firstNumber, double secondNumber);
    double subtraction(double firstNumber, double secondNumber);
    double multiplication(double firstNumber, double secondNumber);
    double division(double firstNumber, double secondNumber);
    double exponentiation(double firstNumber, int secondNumber);
    double module(double firstNumber);
    double squareRoot(double firstNumber);
}
