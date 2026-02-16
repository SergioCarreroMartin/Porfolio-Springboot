package com.sergio.portfolioweb.portfolio.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sergio.portfolioweb.portfolio.models.Project;
import com.sergio.portfolioweb.portfolio.repositories.ProjectRepository;

import com.sergio.portfolioweb.portfolio.service.EmailService;



@Controller
public class MainController {

    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private EmailService emailService;

    @GetMapping({"","/"})
    public String getMethodName() {
        return "forward:/inicio";
    }

    @GetMapping("/inicio")
    public String iniPage(Model model) {
        model.addAttribute("title", "Sergio.Dev");
        return "views/iniPage";
    }

    @GetMapping("/projects")
    public String projectsPage(Model model) {
        List<Project> projects = projectRepository.findAll();
    
        model.addAttribute("title", "Proyectos");
        model.addAttribute("projects", projects);
        return "views/projects";
    }

    @GetMapping("/contact")
    public String contactPage(Model model){
        model.addAttribute("title", "Formulario Contacto");
        return "views/contact";
    }

    @PostMapping("/contact")
    public String receiveMail(@RequestParam String name, @RequestParam String email, @RequestParam String menssage, Model model){
        try {
            emailService.sendMail(name, email, menssage);
            model.addAttribute("exito", "Gracias "+name+ " tu mensaje se ha enviado correctamente.");
        } catch (Exception e) {
            model.addAttribute("error", "Hubo un problema al enviar el correo. Por favor, inténtelo de nuevo.");
        }
        
        return "views/contact";
    }

    @GetMapping("/error")
    public String pruebashtml(Model model){
        return "views/error";
    }
    
}
