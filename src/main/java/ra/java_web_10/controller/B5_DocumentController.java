package ra.java_web_10.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.java_web_10.model.B5_Doucument;

import java.util.Map;

@Controller
public class B5_DocumentController {
    @Autowired
    private Cloudinary cloudinary;

    @GetMapping("/documentForm")
    public String showForm(Model model) {
        model.addAttribute("document", new B5_Doucument());
        return "documentForm";
    }

    @PostMapping("/uploadDocument")
    public String uploadDocument(@ModelAttribute("document") B5_Doucument document,
                                 Model model) {
        try {
            Map uploadResult = cloudinary.uploader().upload(
                    document.getFile().getBytes(),
                    ObjectUtils.asMap(
                            "resource_type", "raw"
                    )
            );

            String fileUrl = (String) uploadResult.get("secure_url");
            model.addAttribute("fileUrl", fileUrl);
            model.addAttribute("message", "Upload thành công!");
        } catch (Exception e) {
            model.addAttribute("message", "Upload thất bại: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("title", document.getTitle());
        model.addAttribute("description", document.getDescription());

        return "documentResult";
    }
}
