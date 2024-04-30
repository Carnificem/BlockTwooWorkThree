package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorServiceInterface {
    String calculator();
    String answerCalculator();
    String calculatorPlus(@RequestParam("num1") int a, @RequestParam("num2") int b);
    String calculatorMinus(@RequestParam("num1") int a, @RequestParam("num2") int b);
    String calculatorMultiplay(@RequestParam("num1") int a, @RequestParam("num2") int b);
    String calculatorDivide(@RequestParam("num1") int a, @RequestParam("num2") int b);
}
