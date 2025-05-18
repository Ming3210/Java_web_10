package ra.java_web_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.java_web_10.model.B3_Account;

@Controller
public class B3_AccountController {
    @GetMapping("/register-form")
    public String showRegisterForm(Model model) {
        model.addAttribute("account", new B3_Account());
        return "register-form";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("account") B3_Account account, Model model) {
        model.addAttribute("registeredAccount", account);
        return "register-result";
    }
}
