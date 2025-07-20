package com.company.vehicleservice.swagger;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerRedirectController {

    @GetMapping("/")
    public String home() {
        return "redirect:/swagger-ui/index.html";
    }

    @GetMapping("/swagger")
    public String swaggerUi() {
        return "redirect:/swagger-ui/index.html";
    }
}
