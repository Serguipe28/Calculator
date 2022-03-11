package com.serguipe.Calculator.Controllers;


import com.serguipe.Calculator.Models.Operation;
import com.serguipe.Calculator.Service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OperatorController {

    @Autowired
    private OperatorService service;

    @GetMapping("/")
    public ModelAndView welcome(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("operation", new Operation());
        return modelAndView;
    }

    @PostMapping("/calc")
    public ModelAndView calc(Operation reqo){
        int result = service.calculate(reqo);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("result", result);
        modelAndView.addObject("operation", reqo);
        return modelAndView;
    }


}
