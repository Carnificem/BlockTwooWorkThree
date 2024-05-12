package pro.sky.skyprospringcalculator;

import org.springframework.boot.ansi.AnsiColor;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.awt.*;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String calculator() {
        return ("Добро пожаловать в калькулятор");
    }

    @GetMapping(path = "/plus")
    public String сalculatorPlus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        //return calculatorService.calculatorPlus();
        return a + "+" + b + "=" + (a + b);
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + "-" + b + "=" + (a - b);
    }
    @GetMapping(path = "/multiplay")
    public String calculatorMultiplay(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return (a + "*" + b + "=" + (a * b));
    }
    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        if (a == 0 || b == 0) {

            return ("На ноль делить нельзя");
        }
        return a + "/" + b + "=" + (a / b);

    }
}

