package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService implements CalculatorServiceInterface {


    public String calculator() {
        return "Добро пожаловать";
    }

    public String answerCalculator() {
        return "Добро пожаловать в калкулятор!";

    }

    public String calculatorPlus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + "+" + b + "=" + (a + b);
    }

    public String calculatorMinus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + "-" + b + "=" + (a - b);
    }

    public String calculatorMultiplay(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return (a + "*" + b + "=" + (a * b));
    }

    public String calculatorDivide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        if (a == 0 || b == 0) {
            return "на ноль делить нельзя";
        }
        return a + "/" + b + "=" + (a / b);

    }

}
