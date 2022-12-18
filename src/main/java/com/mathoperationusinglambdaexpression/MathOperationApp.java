package com.mathoperationusinglambdaexpression;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
}

public class MathOperationApp {
    public static void main(String[] args) {
        IMathFunction add = Integer::sum;
        IMathFunction substract = (int a, int b) -> (a - b);
        IMathFunction multiply = (a , b) -> (a * b);
        IMathFunction divide = (int a, int b) -> (a / b);

        System.out.println("Addition is " + add.calculate(12, 15));
        System.out.println("Substraction is " + substract.calculate(25, 21));
        System.out.println("Multiplication is " + multiply.calculate(2, 8));
        System.out.println("Division is " + divide.calculate(24, 3));
    }
}
