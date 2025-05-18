package ra.java_web_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.java_web_10.model.B2_Product;
@Controller
public class B2_ProductController {

    @GetMapping("/product-form")
    public String showProductForm(Model model) {
        model.addAttribute("product", new B2_Product());
        return "product-form";
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute("product") B2_Product product, Model model) {
        model.addAttribute("addedProduct", product);
        return "product-result";
    }
}
