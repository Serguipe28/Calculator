package com.serguipe.Calculator.Service;

import com.serguipe.Calculator.Models.Operation;
import org.springframework.stereotype.Service;

@Service
public class OperatorService {

    public int calculate(Operation reqo){
        int numero1 = reqo.getOperator1();
        int numero2 = reqo.getOperator2();
        int result = 0;
        switch (reqo.getOperator()){
            case "+":
                result = numero1 + numero2;
                break;
            case "-":
                result = numero1 -numero2;
                break;
            case "*":
                result = numero1 * numero2;
                break;
            case "/":
                result = numero1 / numero2;
                break;

        }
        return result;
    }
}
