package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public  class CalculatorService implements CalculatorServiceInterface {


    public int calculatorPlus(int a, int b) {
        return (a + b);
    }

    public int calculatorMinus(int a, int b) {
        return (a - b);
    }

    public int calculatorMultiplay(int a, int b) {
        return (a * b);
    }

    public int calculatorDivide(int a, int b) {
        return (a / b);


        }

    @Override
    public int calculatorPlus() {
        return 0;
    }

    @Override
    public int calculatorMinus() {
        return 0;
    }

    @Override
    public int calculatorMultiplay() {
        return 0;
    }

    @Override
    public int calculatorDivide() {
        return 0;
    }
}

