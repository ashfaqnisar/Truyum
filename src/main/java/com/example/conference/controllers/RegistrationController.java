package com.example.conference.controllers;

import com.example.conference.models.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("registration") //Just for us to get the page.
    public String getRegistration(@ModelAttribute("registrationModel") Registration registration) {
        return "registration";
    }

    @PostMapping("registration") //When we submit the form in the registration page
    public String addRegistration(@ModelAttribute("registrationModel") Registration registration) {
        System.out.println("Registration :" + registration.getName());
//        return "registration"; //This will just allow the user to send the post
        return "redirect:registration"; //This will make the post and redirect back with the empty form.
    }

}
