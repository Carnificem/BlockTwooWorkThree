package pro.sky.skyprospringcalculator;

import org.springframework.boot.ansi.AnsiColor;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.awt.*;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
   private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping()
    public String calculator() {
        return ("Добро пожаловать в калькулятор");
    }

    @GetMapping(path = "/plus")
    public String calculatorPlus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + "+" + b + "=" + calculatorService.calculatorPlus(a, b);
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + "-" + b + "=" + calculatorService.calculatorMinus(a, b);
    }

    @GetMapping(path = "/multiplay")
    public String calculatorMultiplay(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + "*" + b + "=" + calculatorService.calculatorMultiplay(a, b);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        if (a == 0 || b == 0) {

            return ("На ноль делить нельзя");
        }
        return a + "/" + b + "=" + calculatorService.calculatorDivide(a, b);

    }
}

