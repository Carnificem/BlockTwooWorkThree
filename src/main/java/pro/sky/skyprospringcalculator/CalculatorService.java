package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {

    public int calculatorPlus(int a, int b) {
        return a + b;
    }

    public int calculatorMinus(int a, int b) {
        return a - b;
    }

    public int calculatorMultiplay(int a, int b) {
        return a * b;
    }

    public int calculatorDivide(int a, int b) {
        return a / b;


    }
}

