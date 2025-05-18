package ra.java_web_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.java_web_10.model.B1_User;

@Controller

public class B1_UserController {
    @GetMapping("/user-form")
    public String showForm(Model model) {
        model.addAttribute("user", new B1_User());
        return "user-form";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute("user") B1_User user, Model model) {
        model.addAttribute("submittedUser", user);
        return "user-result";
    }
}
