package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return calculatorService.answerCalculator();
    }

    @PostMapping(path = "/calculator/plus")
    public String calculatorPlus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.calculatorPlus(a, b);
    }

    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.calculatorMinus(a, b);
    }

    @GetMapping(path = "/calculator/multiplay")
    public String calculatorMultiplay(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.calculatorMultiplay(a, b);
    }

    @GetMapping(path = "/calculator/divide")
    public String calculatorDevide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.calculatorDivide(a, b);

    }

}

