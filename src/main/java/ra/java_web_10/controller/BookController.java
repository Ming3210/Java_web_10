package ra.java_web_10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.java_web_10.model.Book;

@Controller
public class BookController {
    @GetMapping("/book")
    public String showBookForm(Model model) {
        Book book = new Book();

        model.addAttribute("book",book);
        return "book";
    }

    @PostMapping("/book-save")
    public String saveBook(@ModelAttribute("book") Book book) {
        System.out.println(book);
        return "book-success";
    }
}
