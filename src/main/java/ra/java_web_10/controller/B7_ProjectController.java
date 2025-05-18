package ra.java_web_10.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.java_web_10.model.B7_Project;

import java.io.IOException;
import java.util.Map;

@Controller
public class B7_ProjectController {
    @Autowired
    private Cloudinary cloudinary;

    @GetMapping("/projectForm")
    public String showForm(Model model) {
        model.addAttribute("project", new B7_Project());
        return "projectForm";
    }

    @PostMapping("/createProject")
    public String createProject(@ModelAttribute B7_Project project, Model model) {
        try {
            Map uploadResult = cloudinary.uploader().upload(
                    project.getFile().getBytes(),
                    ObjectUtils.asMap("resource_type", "raw")
            );

            String fileUrl = (String) uploadResult.get("secure_url");

            model.addAttribute("project", project);
            model.addAttribute("fileUrl", fileUrl);
            model.addAttribute("message", "Upload thành công!");
        } catch (IOException e) {
            model.addAttribute("message", "Lỗi khi upload: " + e.getMessage());
        }

        return "projectResult";
    }
}
