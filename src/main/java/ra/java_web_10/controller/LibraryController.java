package ra.java_web_10.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ra.java_web_10.model.B9_Book;
import ra.java_web_10.model.Book;

import java.io.IOException;
import java.util.Map;

@Controller
public class LibraryController {

    @Autowired
    private Cloudinary cloudinary;

    @GetMapping("/bookForm")
    public String showForm(Model model) {
        model.addAttribute("book", new B9_Book());
        return "bookForm";
    }

    @PostMapping("/library/add")
    public String addBook(@ModelAttribute B9_Book book, Model model) {
        try {
            MultipartFile file = book.getFile();
            if (file != null && !file.isEmpty()) {
                Map uploadResult = cloudinary.uploader().upload(file.getBytes(),
                        ObjectUtils.asMap("resource_type", "raw"));
                model.addAttribute("fileUrl", uploadResult.get("secure_url"));
            }
            model.addAttribute("title", book.getTitle());
            model.addAttribute("author", book.getAuthor());
            model.addAttribute("description", book.getDescription());
            model.addAttribute("message", "Upload thành công!");
        } catch (IOException e) {
            model.addAttribute("message", "Upload thất bại: " + e.getMessage());
        }
        return "bookResult";
    }

}
