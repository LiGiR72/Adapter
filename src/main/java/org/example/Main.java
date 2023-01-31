package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator calc = new Calculator();
        Ints calculator = new IntsCalculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        System.out.println(calculator.mult(5, 15));
        System.out.println(calculator.pow(5, 2));
        System.out.println(calculator.sum(5, 15));
    }
}