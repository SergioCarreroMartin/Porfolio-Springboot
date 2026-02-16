package com.sergio.portfolioweb.portfolio.controller;

import org.springframework.boot.webmvc.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class CustomErrorController implements ErrorController{
    
    //Esta seccion necesita revision y continuar
    @RequestMapping("/error")
    public String handlerError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());
            if (statusCode == 404) {
                System.out.println("Error 404");
                return "redirect:/error";
            }
            
        }

        return "redirect:/projects";
    }
}
