package com.mathoperationusinglambdaexpression;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
    static void printResult(int a, int b, String function, IMathFunction fobj) {
        System.out.println("Result of " + function + " is " + fobj.calculate(a, b));
    }
}

public class MathOperationApp {
    public static void main(String[] args) {
        IMathFunction add = Integer::sum;
        IMathFunction substract = (int a, int b) -> (a - b);
        IMathFunction multiply = (a , b) -> (a * b);
        IMathFunction divide = (int a, int b) -> (a / b);

        IMathFunction.printResult(12, 15, "Addition", add);
        IMathFunction.printResult(25, 21, "Substraction", substract);
        IMathFunction.printResult(2, 8, "Multiplication", multiply);
        IMathFunction.printResult(24, 8, "Division", divide);
    }
}
